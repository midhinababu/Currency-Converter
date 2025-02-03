package com.example.currencyconverter.service;

import com.example.currencyconverter.model.ConversionRequest;
import com.example.currencyconverter.model.ConversionResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public String fetchExchangeRates(String baseCurrency) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + baseCurrency, String.class);
    }

    public ConversionResponse convertCurrency(ConversionRequest request) {
        RestTemplate restTemplate = new RestTemplate();
        String apiResponse = restTemplate.getForObject(API_URL + request.getFrom(), String.class);

        // Extract the exchange rate (simplified)
        double exchangeRate = 0.945; // Example rate (In real use, parse JSON)

        double convertedAmount = request.getAmount() * exchangeRate;
        return new ConversionResponse(request.getFrom(), request.getTo(), request.getAmount(), convertedAmount);
    }
}
