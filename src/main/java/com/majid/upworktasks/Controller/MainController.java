package com.majid.upworktasks.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
   
    /**
     * @return
     */
    // when we call /my-api on browser so you will get same data as you given in your api..!  
    @GetMapping("/my-api")
    public String about(){
		RestTemplate restTemplate = new RestTemplate();
        String url = "https://taaskserver.herokuapp.com/api/user/getAllUsers";
        String result = restTemplate.getForObject(url, String.class);

        // This will print in console screen..!
        System.out.println(result);

        return result;
    }

}
