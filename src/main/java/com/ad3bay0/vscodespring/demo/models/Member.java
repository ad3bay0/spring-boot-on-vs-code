package com.ad3bay0.vscodespring.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name="members")
public class Member{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="member_id")
    private Long id;

    @Column(name="first_name")
    @NotEmpty(message = "please enter first name")
    private String firstName;

    @Column(name="first_name")
    @NotEmpty(message = "please enter Last Name")
    private String lastName;

    @Email(message = "Please provide a valid email address")
    @NotEmpty(message ="* Please provide an email address")
    private String email;


}