package com.sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sy.bean.Shdxx;
import com.sy.dao.ShdxxDao;
import com.sy.service.ShdxxService;

@Service
public class ShdxxServiceImpl implements ShdxxService{
	@Autowired
	private ShdxxDao ShdxxDao;
	
	@Override
	public List<Shdxx> queryAllShdxxs() throws Exception {
		return this.ShdxxDao.queryAllShdxxs();
	}

}
