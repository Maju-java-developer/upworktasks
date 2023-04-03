package com.majid.upworktasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UpworktasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpworktasksApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();
        String url = "https://taaskserver.herokuapp.com/api/user/getAllUsers";
        String result = restTemplate.getForObject(url, String.class);
        System.out.println(result);

	}

}
