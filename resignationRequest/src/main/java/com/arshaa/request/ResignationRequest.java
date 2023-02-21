package com.arshaa.request;

public class ResignationRequest {

	private int resignationRequestid;
	private String exitReason;
	private String description;
	private String reasonType;
	private int employeeId;

	public ResignationRequest() {
	}

	public int getResignationRequestid() {
		return resignationRequestid;
	}

	public void setResignationRequestid(int resignationRequestid) {
		this.resignationRequestid = resignationRequestid;
	}

	public String getExitReason() {
		return exitReason;
	}

	public void setExitReason(String exitReason) {
		this.exitReason = exitReason;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReasonType() {
		return reasonType;
	}

	public void setReasonType(String reasonType) {
		this.reasonType = reasonType;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public ResignationRequest( String exitReason, String description, String reasonType,
			int employeeId) {
		super();
		this.resignationRequestid = resignationRequestid;
		this.exitReason = exitReason;
		this.description = description;
		this.reasonType = reasonType;
		this.employeeId = employeeId;
	}

	
}
