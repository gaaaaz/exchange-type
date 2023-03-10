package com.exchange.type.model.exchange;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeTypeRequest {

    private Double amount;
    private String originCurrency;
    private String destinationCurrency;

}
