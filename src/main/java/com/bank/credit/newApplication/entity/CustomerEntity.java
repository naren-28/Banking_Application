package com.bank.credit.newApplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name="CUS_CUSTOMER")
public class CustomerEntity {
	
	@Id
    @SequenceGenerator(name = "CusCustomer" , sequenceName = "CUS_CUSTOMER_ID_SEQ")
    @GeneratedValue(generator = "CusCustomer")
    private Long id;
	
	@Column(name="NAME",length=100, nullable = false)
    private String name;

    @Column(name="SURNAME",length=100, nullable = false)
    private String surname;

    @Column(name="IDENTITY_NO",nullable = false,unique = true)
    private Long identityNo;

}
