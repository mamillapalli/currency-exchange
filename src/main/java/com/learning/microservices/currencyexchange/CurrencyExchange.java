package com.learning.microservices.currencyexchange;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name="CURRENCY_EXCHANGE")
public class CurrencyExchange {
    @Id
    @GeneratedValue
    private long id;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal exchangeValue;
    private int port;


    public CurrencyExchange(long id, String fromCurrency, String toCurrency, BigDecimal exchangeValue, int port) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeValue = exchangeValue;
        this.port = port;
    }

    @Override
    public String toString() {
        return "CurrencyExchange{" +
                "id=" + id +
                ", fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", exchangeValue=" + exchangeValue +
                '}';
    }


    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public BigDecimal getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(BigDecimal exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public CurrencyExchange(long id, String fromCurrency, String toCurrency, BigDecimal exchangeValue) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeValue = exchangeValue;
    }

    public CurrencyExchange() {
    }
}
