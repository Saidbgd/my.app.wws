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
    @Column(columnDefinition = "boolean default false")
    private Boolean emailverificationStatus;
	

}
