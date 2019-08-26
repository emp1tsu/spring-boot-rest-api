package com.example.springbootrestapi.controller;
import lombok.Builder;
import lombok.Getter;
import com.example.springbootrestapi.domain.Currency;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}