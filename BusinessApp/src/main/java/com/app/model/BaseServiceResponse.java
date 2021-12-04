package com.app.model;

import com.app.constants.ServiceStatus;

public class BaseServiceResponse {
	private ServiceStatus serviceStatus;
	private String error;
	
	public BaseServiceResponse(ServiceStatus serviceStatus, String error) {
		super();
		this.serviceStatus = serviceStatus;
		this.error = error;
	}
	public BaseServiceResponse() {
	}
	
	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}