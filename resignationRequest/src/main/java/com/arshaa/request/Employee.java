package com.arshaa.request;

public class Employee {

	private int employeeId;
	private String name;
	private String emailId;
	private String address;
	private long contactNumber;
	private String designation;
	private ResignationRequest resignationRequest;

	public Employee() {
	}

	public Employee(int employeeId, String name, String emailId, String address, long contactNumber, String designation,
			ResignationRequest resignationRequest) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.emailId = emailId;
		this.address = address;
		this.contactNumber = contactNumber;
		this.designation = designation;
		this.resignationRequest = resignationRequest;
	}

	public String getAddress() {
		return address;
	}

	public String getDesignation() {
		return designation;
	}

	public String getEmailId() {
		return emailId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public ResignationRequest getResignationRequest() {
		return resignationRequest;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmail(String emailId) {
		this.emailId = emailId;
	}

	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setRequest(ResignationRequest resignationRequest) {
		this.resignationRequest = resignationRequest;
	}

}
