package com.Behnamvosoogh.rest_demo.model;

public class CloudVendor {


	private String vendoreId;
	private String vendoreName;
	private String vendoreAddress;
	private String vendorerPoneNumber;
	public CloudVendor(String vendoreId, String vendoreName, String vendoreAddress, String vendorerPoneNumber) {
		super();
		this.vendoreId = vendoreId;
		this.vendoreName = vendoreName;
		this.vendoreAddress = vendoreAddress;
		this.vendorerPoneNumber = vendorerPoneNumber;
	}
	public CloudVendor() {
		super();
	}
	public String getVendoreId() {
		return vendoreId;
	}
	public void setVendoreId(String vendoreId) {
		this.vendoreId = vendoreId;
	}
	public String getVendoreName() {
		return vendoreName;
	}
	public void setVendoreName(String vendoreName) {
		this.vendoreName = vendoreName;
	}
	public String getVendoreAddress() {
		return vendoreAddress;
	}
	public void setVendoreAddress(String vendoreAddress) {
		this.vendoreAddress = vendoreAddress;
	}
	public String getVendorerPoneNumber() {
		return vendorerPoneNumber;
	}
	public void setVendorerPoneNumber(String vendorerPoneNumber) {
		this.vendorerPoneNumber = vendorerPoneNumber;
	}

	

}
