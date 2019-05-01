package org.product.service.login;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doLogin")
public class SpringRestController {
 @RequestMapping(value = "/{userName}/{password}", method = RequestMethod.GET)
 public String doLogin(@PathVariable String userName,@PathVariable String password) {

	 
	 
	 String defaultUserName= "root";
		String defaultUserPassword= "root";
		String result;
		
		if(userName.equals(defaultUserName) && password.equals(defaultUserPassword))
		{
			result = "Hello, "+userName+"! Login Successful" ;
		}
		else
		{
			result = "Invalid Username or Password!" ;
		}
		
		
 
  return result;
 }
}