package com.credit.creditweb.payment.controller;


import com.credit.creditweb.dto.CreditInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PaymentController {



    @GetMapping("/")
    public String init(Model model) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CreditInfo> response =
                restTemplate.exchange("http://localhost:8081/creditInfo/1234-4567-1234",HttpMethod.GET,null, CreditInfo.class);

        CreditInfo creditInfo= response.getBody();

        model.addAttribute("creditInfo", creditInfo);


        return "index";
    }
}
