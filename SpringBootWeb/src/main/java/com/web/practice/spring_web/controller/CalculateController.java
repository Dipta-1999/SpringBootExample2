package com.web.practice.spring_web.controller;

import java.io.File;
import java.util.Arrays;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.practice.spring_web.Calculating;
import com.web.practice.spring_web.Calculation;
import com.web.practice.spring_web.SpringBootWebApplication;

import groovyjarjarantlr.collections.List;

@Controller
public class CalculateController {
	
	@RequestMapping("/")
	
	public String home()
	{
		//model.addAttribute("Calculations", new Calculation());
		//File index = new File("index.html");
		return "index.jsp";
	}
	@RequestMapping("add")
	public String Add(HttpServletRequest req)
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int num3=i+j;
		HttpSession session=req.getSession();
		session.setAttribute("num3", num3);
		return "result_add.jsp";
	}
	@RequestMapping("subtract")
	public String Subtract(@RequestParam("num3") int i,@RequestParam("num4") int j, HttpSession session)
	{
		Calculating sub=new Calculating();
		int num5=0;
		num5=sub.Substract(i,j);
		session.setAttribute("num5", num5);
		return "result_subtract.jsp";
	}
	@RequestMapping("multiply")
	public String Multiply(@RequestParam("num5") int i,@RequestParam("num6") int j, HttpSession session)
	{
		Calculating mul=new Calculating();
		int num7=0;
		num7=mul.Multiply(i,j);
		session.setAttribute("num7", num7);
		return "result_multiply.jsp";
	}
	@RequestMapping("divide")
	public String Divide(@RequestParam("num7") double i,@RequestParam("num8") double j, HttpSession session)
	{
		Calculating dev=new Calculating();
		double num9=0.0;
		num9=dev.Devide(i,j);
		session.setAttribute("num9", num9);
		return "result_divide.jsp";
	}
	
}
