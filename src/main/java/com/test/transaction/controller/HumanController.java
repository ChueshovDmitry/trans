package com.test.transaction.controller;


import com.test.transaction.service.AbstractHumanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/human")

@AllArgsConstructor
public class HumanController {
    private final AbstractHumanService abstractHumanService;


    @GetMapping
    public void save(){
        abstractHumanService.saveHuman();
    }

}
