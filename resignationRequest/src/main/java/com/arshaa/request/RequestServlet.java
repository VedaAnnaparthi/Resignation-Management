package com.arshaa.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String exitReason = request.getParameter("exitReason");
		String description = request.getParameter("description");
		String reasonType = request.getParameter("reasonType");
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		

		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setContentType("application/json");

		ResignationRequest resignationRequest = new ResignationRequest(exitReason, description, reasonType,employeeId);

		ResignationRequestDao dao = new ResignationRequestDao();
		String result = dao.raiseResignationRequest(resignationRequest, employeeId);

		Response userResponse = new Response();
		userResponse.setMessage(result);
		userResponse.setStatus(true);

		PrintWriter writer = response.getWriter();
		writer.print(userResponse);

	}
}
