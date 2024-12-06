package __labexp7;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.websocket.server.PathParam;

@RestController
public class CustomerController {
	
	List<Customer>c=new ArrayList<>();

	
	@GetMapping("/demo1")
	public int demo1() {
		return 339;
	}
	
	@GetMapping("/demo2")
	public double demo2() {
		return 339.0;
	}
	
	@GetMapping("/demo3")
	public String demo3() {
		return "<h6> My name is sushma! </h6>";
	}
	
	@GetMapping("/demo4")
	public String demo4() {
		String name = "KLEF";
		return "I study at " + name;
	}
	
	@GetMapping("/demo5/{id}")
	public int demo5(@PathVariable int id) {
		return id;
		
	}
	
	@GetMapping("/demo6/{a}/{b}")
	public String demo6(@PathVariable int a , @PathVariable int b) {
		return "Sum: " + (a+b);
	}
	
	@GetMapping("/demo7")
	public String demo7(@RequestParam String id) {
		return "ID:"+id;
	}
	
	@GetMapping("/demo8/{name}")
	public String demo8(@PathVariable String name) {
		return "Name : " + name;
	}
	
	@PostMapping("/addcustomer")
	public String demo9(@RequestBody Customer cus) {
		c.add(cus);
		return "Customer Added Successfully";
	}
	
	@GetMapping("/viewcustomer")
	public List<Customer> demo10(){
		return c;
	}
	

}
