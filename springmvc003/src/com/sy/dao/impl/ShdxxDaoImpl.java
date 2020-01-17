package com.sy.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import com.sy.bean.Shdxx;
import com.sy.dao.ShdxxDao;
import com.sy.util.DButil;

@Repository
public class ShdxxDaoImpl implements ShdxxDao{
	QueryRunner qr=new QueryRunner();
	
	@Override
	public List<Shdxx> queryAllShdxxs() throws Exception {
		Connection conn=DButil.getConnection();
		String sql="select * from shdxx";
		List<Shdxx> shdxxs=qr.query(conn, sql, new BeanListHandler<Shdxx>(Shdxx.class));
		return shdxxs;
	}

	@Override
	public Shdxx getShdxxById(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="select * from shdxx where reptid="+id;
		Shdxx shdxx=qr.query(conn, sql, new BeanHandler<Shdxx>(Shdxx.class));
		return shdxx;
	}

	@Override
	public void update1(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="update shdxx set restatus=1 where reptid="+id;
		qr.update(conn, sql);
	}

	@Override
	public void update2(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="update shdxx set restatus=2 where reptid="+id;
		qr.update(conn, sql);
	}

	@Override
	public void delete(int id) throws Exception {
		Connection conn=DButil.getConnection();
		String sql="delete from shdxx where reptid="+id;
		qr.update(conn, sql);
	}

}
