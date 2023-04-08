package com.bank.credit.newApplication.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.credit.newApplication.Dto.CusCustomerDto;
import com.bank.credit.newApplication.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {

	
	private CustomerService customerService;
	
	@GetMapping("/hello")
	public String welcome() {
		return "Welcome to RestTemplate Example.";
	}
	
	
	
	  public List<CusCustomerDto> getAllCustomerList(){
		  //TODO : return properly 
		  return null;
	  }
	 
	
	
	
	
	/*
	 * @Operation( tags = "Customer Controller", summary = "All Customers",
	 * description = "Gets all customers." )
	 */
    /*@GetMapping
    public ResponseEntity<List<CusCustomerDto>> findAllCustomers(){

        List<CusCustomerDto> cusCustomerDtoList = cusCustomerService.findAllCustomers();

        return ResponseEntity.ok(RestResponse.of(cusCustomerDtoList));
    }
*/	
	

}
