package lsl.study2020.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/getZK")
    public String getZK(){
        return "SpringCloud with zookeeper:"+serverPort+" "+ UUID.randomUUID().toString();
    }
}
