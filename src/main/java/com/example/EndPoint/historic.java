package com.example.EndPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class historic {
    @GetMapping("/historic")
    public String historic(){
        return  " V době středověku se mezi dvěma královstvími rozpoutala zuřivá válka. " +
                " Hrdinní rytíři bojovali v bitvách a odvážní vůdcové vedli své vojsko k vítězství. " +
                " Nicméně za zdmi hradu se rodila zakázaná láska mezi dcerou jednoho krále a synem druhého. " +
                " Jejich romance byla plná nebezpečí, tajemství a obětí. " +
                " Nakonec byli nuceni utéct, aby spolu mohli být. " +
                " Jejich příběh zůstal jako legenda v dějinách, která připomíná sílu lásky v časech krutosti.";
    }
}
