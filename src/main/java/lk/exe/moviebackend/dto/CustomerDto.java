package lk.exe.moviebackend.dto;

import java.io.Serializable;

public final class CustomerDto implements Serializable {
	private int cid;
	private String name;
	private String email;
	private String phoneNo;
	
	public CustomerDto() {}
	
	public CustomerDto(int cid, String name, String email, String phoneNo) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "CustomerDto [cid=" + cid + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}

	
	
}
