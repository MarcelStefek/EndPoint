package com.example.EndPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class romantic {
    @GetMapping("/romantic")
    public String romantic(){
        return  " V bouřlivém městském ruchu se setkali dva cizinci. " +
                " Jejich oči se setkaly a svět se zpomalil. " +
                " Jemný dotyk rukou způsobil elektrizující vlnu emocí." +
                " Mezi nimi se vytvořil neodolatelný magnetický tah. " +
                " Vzájemné porozumění a nevyslovená slova přišly s každým setkáním. " +
                " V jejich příběhu se vytvářela chemie, která neznala hranic. " +
                " Láska kvetla v jediném okamžiku, který změnil jejich životy navždy.";
    }
}
