package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements IUserService {

	@RequestMapping(value = "/user/getCurrentUser",method=RequestMethod.GET)
	@Override
	public String getCurrentUser() {
		return "getCurrentUser  ==> Hello World";
	}

}
