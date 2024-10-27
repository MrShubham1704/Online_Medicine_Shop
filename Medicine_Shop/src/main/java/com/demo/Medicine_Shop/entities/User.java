package com.demo.Medicine_Shop.entities;

//import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;

@Entity
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserId", length = 10)
	private Integer userId;
	@Column(name = "Name", length = 50)
	private String userName;
	@Column(name = "Phone", length = 25)
	private String userphone;
	@Column(name = "Mail", length = 25)
	private String usermail;
	@Column(name = "Address", length = 25)
	
//	@OneToOne()
//	private List<Order>ordId;
	
	private String useraddress;
	public Integer getUsertId() {
		return userId;
	}
	public void setUsertId(Integer usertId) {
		this.userId = usertId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
	 public User( String userName, String userphone, String usermail, String useraddress) {
		super();
//		this.userId = usertId;
		this.userName = userName;
		this.userphone = userphone;
		this.usermail = usermail;
		this.useraddress = useraddress;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [usertId=" + userId + ", userName=" + userName + ", userphone=" + userphone + ", usermail="
				+ usermail + ", useraddress=" + useraddress + "]";
	}
	
	
}
