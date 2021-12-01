package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class exec1 {

    @Autowired
    private f1 f1;

   void setService(f1 f1){
       this.f1 = f1;
   }

   @GetMapping("/lala")
     String lala1(@RequestParam("name")String name){
        return f1.ff1()+f1.toString()+name;
    }

}
