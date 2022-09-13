package kr.co.wonder;

import java.text.DateFormat;


import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller

public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/adminhome",method=RequestMethod.GET)
	public String adminhome() {
		
		return "admin/adminhome";
	}
	@RequestMapping(value="/productadd",method=RequestMethod.GET)
	public String productadd() {
		
		return "admin/productadd";
	}
	@RequestMapping(value="/productlist",method=RequestMethod.GET)
	public String productlist() {
		
		return "admin/productlist";
	}
	@RequestMapping(value="/memsearch",method=RequestMethod.GET)
	public String memsearch() {
		
		return "admin/memsearch";
	}
	@RequestMapping(value="/ratingedit",method=RequestMethod.GET)
	public String ratingedit() {
		
		return "admin/ratingedit";
	}
	@RequestMapping(value="/auctionsearch",method=RequestMethod.GET)
	public String auctionsearch() {
		
		return "admin/auctionsearch";
	}
	
	@RequestMapping(value="/reportlist",method=RequestMethod.GET)
	public String reportlist() {
		
		return "admin/reportlist";
	}
	@RequestMapping(value="/noticeadd",method=RequestMethod.GET)
	public String noticeadd() {
		
		return "admin/noticeadd";
	}
	@RequestMapping(value="/noticeedit",method=RequestMethod.GET)
	public String noticeedit() {
		
		return "admin/noticeedit";
	}
	@RequestMapping(value="/inquiry",method=RequestMethod.GET)
	public String inquiry() {
		
		return "admin/inquiry";
	}
	@RequestMapping(value="/inquiryanswer",method=RequestMethod.GET)
	public String inquiryanswer() {
		
		return "admin/inquiryanswer";
	}
	@RequestMapping(value="/productupdate",method=RequestMethod.GET)
	public String productupdate() {
		
		return "admin/adminhome";
	}
}
