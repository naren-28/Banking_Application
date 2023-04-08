package com.bank.credit.newApplication.entity;

import com.bank.credit.newApplication.Dto.Account;
import com.bank.credit.newApplication.Dto.CustomerDto;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
/*import com.spring.bank.api.model.base.BaseUser;
import com.spring.bank.api.model.dto.CustomerDto;*/
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Entity
@Table(name = "CUSTOMER")
@EntityListeners(AuditingEntityListener.class)
public class Customer /* extends BaseUser */ {
	private static final Logger LOGGER = LoggerFactory.getLogger(Customer.class);

	/*
	 * @Id
	 * 
	 * @GenericGenerator(name = "customer_generator", strategy = "increment")
	 * 
	 * @GeneratedValue(generator = "customer_generator")
	 */
	
	@Id
    @SequenceGenerator(name = "customer" , sequenceName = "CUS_CUSTOMER_ID_SEQ")
    @GeneratedValue(generator = "customer")
	private Long id;

	/*
	 * @JsonBackReference
	 * 
	 * @ToString.Exclude
	 * 
	 * @OneToOne(cascade = { CascadeType.ALL, }, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "account_id") private Account account;
	 */

	/* Converter Function for DTo Object */
	@Column(name="FIRSTNAME",length=100, nullable = false)
	private String firstName;
	@Column(name="LASTNAME",length=100, nullable = false)
    private String lastName;
	@Column(name="PHONENUMBER",length=100, nullable = false)
	private String phoneNumber;
	//private String title;
    //private String email;
    
    
	/*
	 * public static Customer fromDto(CustomerDto dto) { Customer converted = new
	 * Customer(); BeanUtils.copyProperties(dto, converted); return converted;
	 * 
	 * }
	 */

}
