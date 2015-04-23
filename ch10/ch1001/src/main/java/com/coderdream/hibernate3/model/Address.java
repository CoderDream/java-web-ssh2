package com.coderdream.hibernate3.model;

/**
 * Address entity.
 * 
 * @author MyEclipse Persistence Tools
 */
public class Address implements java.io.Serializable {

	/**  */
    private static final long serialVersionUID = -7968310041729364066L;
    private int addressId;
	private String addressName;

	// Property accessors

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return this.addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
}