package com.mika.demo.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {
    @Autowired
    CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency-converter")
    public CurrencyServiceConfiguration getCurrencyInfo() {
        return configuration;
    }
}
