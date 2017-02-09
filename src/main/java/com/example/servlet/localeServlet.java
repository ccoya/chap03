package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/locale") // URL Mapping
public class localeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>LocaleServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>로케일 리스트</h1>");
		out.println("<strong> 현재 시간: " + new Date() + "</strong>");
		out.println("<strong> 합계: " + (1 + 2 + 3) + "</strong>");
		
		out.println("</body>");
		
		
		out.println("<html>");
		
		
	}
	
}
