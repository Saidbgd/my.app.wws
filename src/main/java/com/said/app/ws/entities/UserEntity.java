package com.said.app.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity (name = "users")
public class UserEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -991857261588576921L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false)
    private String userId;
    
    @Column(nullable = false,length = 50)
    private String fisrtName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false,length = 120)
    private String email;
    @Column(nullable = false)
    private String encryptedPassword;
    @Column(nullable = true)
    private String emailVerificationToken;
    @Column(nullable = false)
    private Boolean emailverificationStatus=false;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailverificationStatus() {
		return emailverificationStatus;
	}
	public void setEmailverificationStatus(Boolean emailverificationStatus) {
		this.emailverificationStatus = emailverificationStatus;
	}
	

}
