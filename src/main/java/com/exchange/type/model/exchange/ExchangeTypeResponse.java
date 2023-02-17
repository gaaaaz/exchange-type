package com.exchange.type.model.exchange;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExchangeTypeResponse {

    private Double amount;
    private String originCurrency;
    private Double amountExchange;
    private String destinationCurrency;
    private Double exchangeType;

}
