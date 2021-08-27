package com.learning.microservices.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping(path = "/currencyexchange/from/{fromcurrency}/to/{tocurrency}")
    public CurrencyExchange getCurrencyExchange(@PathVariable(name="fromcurrency") String fromCurrency,@PathVariable(name = "tocurrency") String toCurrency)
    {
        String port = environment.getProperty("local.server.port");
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
        if(currencyExchange==null) throw new RuntimeException("Exchange Value for " + fromCurrency + " to " + toCurrency + " is not found ");
        currencyExchange.setPort(Integer.valueOf(port));
        return currencyExchange;
       //return new CurrencyExchange(1000l, fromCurrency, toCurrency, BigDecimal.valueOf(65l),Integer.valueOf(port));

    }
}
