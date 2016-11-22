package com.linkam.html2pdf.controller;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.linkam.utils.pdf.PdfUtil;


@Controller
@RequestMapping(value="/html2Pdf")
public class Html2PdfController {
	
	@RequestMapping(value={"/test"})
	public String text(){
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		return "test";
	}
	
	@RequestMapping(value={"/createpdf"})
	public String createPdf(HttpServletRequest request,HttpServletResponse response){
		PdfUtil pdf = new PdfUtil();
		StringBuffer address = request.getRequestURL();//获取请求的地址
		String url = address.substring(0,address.lastIndexOf("/") + 1);//截取请求根地址
		url = url+"test";
		try {
			pdf.createPdfDownload(new URL(url), request,response, "生成的PDF文件");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
