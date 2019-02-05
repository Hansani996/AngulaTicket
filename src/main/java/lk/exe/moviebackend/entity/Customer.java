package lk.exe.moviebackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cid;
	private String name;
	private String email;
	private String phoneNo;
	
	public Customer() {}
	
	public Customer(int cid, String name, String email, String phoneNo) {
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
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
}
