package com.sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.bean.Shdmx;
import com.sy.dao.ShdmxDao;
import com.sy.dao.ShdxxDao;
import com.sy.service.ShdmxService;

@Service
public class ShdmxServiceImpl implements ShdmxService{
	@Autowired
	private ShdmxDao shdmxDao;
	@Autowired
	private ShdxxDao shdxxDao;
	
	@Override
	public List<Shdmx> queryAllShdmxs(int id) throws Exception {
		return this.shdmxDao.queryAllShdmxs(id);
	}

	@Override
	public void add(Shdmx shdmx) throws Exception {
		this.shdmxDao.update(shdmx);
		List<Shdmx> shdmxs=this.shdmxDao.queryAllShdmxs(shdmx.getShdxx().getReptid());
		if (shdmxs.size()>0) {
			this.shdxxDao.update1(shdmx.getShdxx().getReptid());
		}else {
			this.shdxxDao.update2(shdmx.getShdxx().getReptid());
		}
	}

	@Override
	public void delete(int id) throws Exception {
		this.shdxxDao.delete(id);
		this.shdmxDao.delete(id);
	}

}
