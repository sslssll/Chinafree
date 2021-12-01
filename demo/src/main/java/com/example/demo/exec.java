package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/la")
public class exec extends exec1{

   @Autowired
    private f2 f2;
    exec(){
        setService(f2);
    }

    @GetMapping("/la")
     String lala(@RequestParam("name")String name){
        return f2.ff2()+f2.toString()+name;
    }

}
