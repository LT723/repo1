package com.sy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sy.bean.Shdmx;
import com.sy.bean.Shdxx;
import com.sy.service.ShdmxService;
import com.sy.service.ShdxxService;

@Controller
@RequestMapping("/shdxx")
public class ShdxxController {
	@Autowired
	private ShdxxService shdxxService;
	@Autowired
	private ShdmxService shdmxService;
	
	@RequestMapping("/queryAllShdxxs")
	public String queryAllShdxxs(Model model) throws Exception {
		List<Shdxx> shdxxs=this.shdxxService.queryAllShdxxs();
		model.addAttribute("shdxxs",shdxxs);
		return "shdList";
	}
	
	@RequestMapping("/toadd")
	public String toadd(int reptid,Model model) throws Exception {
		List<Shdmx> shdmxs=this.shdmxService.queryAllShdmxs(reptid);
		model.addAttribute("shdmxs",shdmxs);
		return "shdmxList";
	}
	
	@RequestMapping("/delete")
	public String delete(int reptid) throws Exception {
		this.shdmxService.delete(reptid);
		return "redirect:/shdxx/queryAllShdxxs";
	}
	
	@RequestMapping("/add")
	public String add(Shdmx shdmx) throws Exception {
		this.shdmxService.add(shdmx);
		return "redirect:/shdxx/queryAllShdxxs";
	}
	
	
}
