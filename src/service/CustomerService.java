package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private static final CustomerService instance = new CustomerService();
	
	private Map<String, Customer> customers;
	
	private CustomerService() {
		customers = new HashMap<String, Customer>();
		System.out.println("In CustomerService Constructor");
	}
	
	public static CustomerService getInstance() {
		return instance;
	}

	public Boolean addCustomer(Customer customer) {
		Customer rawCustomer = findCustomer(customer.getId());
		
		if(rawCustomer == null) { //동일한 아이디를 갖는 객체가 없음
			customers.put(customer.getId(), customer);
			return true; //register successfully.
		}
		else { //동일한 아이디를 갖는 객체가 존재함. 등록 불가.
			return false;
		}
		
		
	}
	
	public Customer findCustomer(String id) {
		if(id != null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}

	public Customer login(String id, String password) {
		Customer customer = findCustomer(id);
	
		if(customer != null) {
			if( password.equals(customer.getPassword())  ) {
				System.out.println("login success");
				return customer;
			}
					
			else {
				System.out.println("login failed");
				return null;
			}
		}	
		return null;
	}
}
