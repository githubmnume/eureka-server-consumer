package cn.mnu.demo.eureka.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mnu.demo.eureka.HelloRemote;

@RestController
public class ConsumerController {
	
    @Autowired
    HelloRemote helloRemote;
    
    @GetMapping("/hello")
    public String index() {
        return helloRemote.hello();
    }
}