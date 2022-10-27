package com.nhom12shop.main.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts implements Serializable {
    private static final long serialVersionUID = -7942548727688752775L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    @Size(max = 50, message = "username must be less than 20 characters")
    private String username;

    @Column(name = "fullname")
    @Size(max = 50, message = "fullname must be less than 50 characters")
    private String fullname;

    @Column(name = "hashPassword")
    private String hashPassword;

    @Column(name = "email")
    @Email(message = "Email không hợp lệ")
    private String email;

    @Column(name = "createdDate")
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "imgUrl")
    private String imgUrl;

    @Column(name = "resetPasswordToken")
    private String resetPassword;

    @Column(name = "verificationCode")
    private String verificationCode;

    @Column(name = "isEnabled")
    private Boolean isEnabled;

    @Column(name = "isDeleted")
    private Boolean isDeleted;

    @Column(name = "auth_provider")
    private String authProvider;

    @ManyToOne
    @JoinColumn(name = "roleId", referencedColumnName = "id")
    @JsonIgnoreProperties(value = {"application", "hibernateLazyInitializer"})
    private Roles role;

}
