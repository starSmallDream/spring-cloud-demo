package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloEurekaClientApplication.class, args);
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hello World  hi";
	}

}
