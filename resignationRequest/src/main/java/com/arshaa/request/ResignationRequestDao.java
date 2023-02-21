package com.arshaa.request;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResignationRequestDao {

	private static Connection connection() {
		return DB_Connection.getConnection();
	}

	public String raiseResignationRequest(ResignationRequest resignationRequest, int employeeId) {
		Employee employee = null;
		String response = "Resignation request raised succesfully";
		String employeeSql = "select * from employee where employeeId=?";
		String requestSql = "insert into resignation_request(exitReason, description, reasonType, employeeId) values(?,?,?,?)";
		try (Connection connection = connection()) {
			try (PreparedStatement ps1 = connection.prepareStatement(employeeSql)) {

				ps1.setInt(1, employeeId);
				ResultSet rs = ps1.executeQuery();
				while (rs.next()) {
					employee = new Employee();
					employee.setId(rs.getInt("employeeId"));
					employee.setName(rs.getString("name"));
					employee.setEmail(rs.getString("emailId"));
					employee.setAddress(rs.getString("address"));
					employee.setPhone(rs.getLong("contactNumber"));
	 				employee.setDesignation(rs.getString("designation"));
				}
			}
			try (PreparedStatement ps2 = connection.prepareStatement(requestSql)) {
				ps2.setString(1, resignationRequest.getExitReason());
				ps2.setString(2, resignationRequest.getDescription());
				ps2.setString(3, resignationRequest.getReasonType());
				ps2.setInt(4, employee.getEmployeeId());
				ps2.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			response = "Cannot raise the resignation request";
		}
		return response;
	}
}
