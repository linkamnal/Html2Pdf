package com.linkam.html2pdf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/html2Pdf")
public class Html2PdfController {
	
	@RequestMapping(value={"test"})
	public String text(){
		System.out.println("******");
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		return "test";
	}

}
