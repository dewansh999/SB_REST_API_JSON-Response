package in.expedia.rest;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import in.expedia.binding.Customer;

@RestController
public class CustomerRestController {
	@DeleteMapping("/customer/{cid}")
	public String deleteCustomer(@PathVariable Integer cid) {

		// db logic
		return "customer Deleted";
	}

	@PutMapping("/customer")
	public String updateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		// db logic
		return "customer Updated";
	}

	@PostMapping("/customer")
	public String addCustomer(@RequestBody Customer c) {
		System.out.println(c);
		// db logic
		return "customer Added";
	}

	@GetMapping("/customer")
	public Customer getCustomer() {

		// Get it from DB
		Customer c = new Customer(1, "john", "john@gmail.com");

		return c;
	}

	@GetMapping("/customers")
	public List<Customer> getCustomers() {

		Customer c1 = new Customer(1, "john1", "1john@gmail.com");
		Customer c2 = new Customer(2, "john2", "2john@gmail.com");
		Customer c3 = new Customer(3, "john3", "3john@gmail.com");
		List<Customer> customers = Arrays.asList(c1, c2, c3);

		return customers;
	}

}
