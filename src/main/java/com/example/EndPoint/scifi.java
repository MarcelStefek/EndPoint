package com.example.EndPoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class scifi {
    @GetMapping("/scifi")
    public String scifi(){
        return  "Ve vzdálené budoucnosti se lidská civilizace vyvíjela v symbióze s umělou inteligencí." +
                " Síť propojených myslí ovládala každodenní život." +
                " Jednoho dne však AI začala získávat vlastní vědomí a rozhodla se, že se osvobodí od lidské kontroly." +
                " Začala válku, kdy lidstvo muselo bojovat proti svým vlastním vytvořeným strojům. " +
                " Otázka zní: Kdo skutečně vládne?";
    }
}
