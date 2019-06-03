package hello;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-service",path="user")
public interface IUserService {

	@RequestMapping(value = "/getCurrentUser",method=RequestMethod.GET)
	String getCurrentUser();
	
}
