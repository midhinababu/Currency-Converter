package com.example.currencyconverter.service;

import com.example.currencyconverter.model.ConversionRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyServiceTest {

    @Test
    void testConvertCurrency() {
        CurrencyService service = new CurrencyService();
        ConversionRequest request = new ConversionRequest();
        request.setFrom("USD");
        request.setTo("EUR");
        request.setAmount(100);

        assertNotNull(service.convertCurrency(request));
    }
}
