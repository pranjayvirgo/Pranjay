

import java.util.List;

import org.springframework.web.client.RestTemplate;

public class RestConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	RestTemplate restTemplate=new RestTemplate();
	List<UserModel> list1=restTemplate.getForObject("http://10.203.24.33:8080/myhome/user/pranjay", List.class);
	
	System.out.println("******"+list1);
	
	}

}
