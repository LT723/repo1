package com.sy.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sy.bean.Shdmx;
import com.sy.dao.ShdmxDao;
import com.sy.dao.ShdxxDao;
import com.sy.util.DButil;

@Repository
public class ShdmxDaoIml implements ShdmxDao{
	@Autowired
	private ShdxxDao shdxxDao;
	QueryRunner qr=new QueryRunner();
	@Override
	public List<Shdmx> queryAllShdmxs(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="select * from shdmx where rkzt=0 and reptid="+id;
		List<Map<String, Object>> mapShdmxs=qr.query(conn, sql, new MapListHandler());
		List<Shdmx> shdmxs=new ArrayList<>();
		for(int i=0;i<mapShdmxs.size();i++){
			Map<String, Object> map=mapShdmxs.get(i);
			Shdmx shdmx=new Shdmx();
			shdmx.setMxid((int) map.get("mxid"));
			shdmx.setShdxx(shdxxDao.getShdxxById((int) map.get("reptid")));
			shdmx.setPname((String) map.get("pname"));
			shdmx.setPtype((String) map.get("ptype"));
			shdmx.setPlannum((int) map.get("plannum"));
			shdmx.setRkzt((int) map.get("rkzt"));
			shdmxs.add(shdmx);
		}
		return shdmxs;
	}
	
	@Override
	public void update(Shdmx shdmx) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="update shdmx set incount=?,destorycount=?,rkzt=1 where mxid=?";
		qr.update(conn, sql,shdmx.getIncount(),shdmx.getDestorycount(),shdmx.getMxid());
	}

	@Override
	public void delete(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="delete from shdmx where reptid="+id;
		qr.update(conn, sql);
	}

}
