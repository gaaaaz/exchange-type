package com.exchange.type.service.impl;

import com.exchange.type.model.exchange.ExchangeTypeRequest;
import com.exchange.type.model.exchange.ExchangeTypeResponse;
import com.exchange.type.service.ExchangeTypeService;
import com.exchange.type.util.Currency;
import com.exchange.type.util.Discount;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ExchangeTypeServiceImpl implements ExchangeTypeService {

    @Override
    public Mono<ExchangeTypeResponse> exchangeOriginToDestinationCurrency(ExchangeTypeRequest request) {

        String currencyExchange = request.getOriginCurrency() + request.getDestinationCurrency();
        Double exchangeType = Currency.valueOf(currencyExchange).getValue();
        String[] currencies = Currency.valueOf(currencyExchange).getDescription().split("-");

        Double amountExchange = 0.0;
        Double rateDiscount = Discount.valueOf(request.getClientInfo().getDiscountLevel()).getValue();
        if(request.getClientInfo().isRecurrentUser()){
            amountExchange = request.getAmount() * (exchangeType + rateDiscount);
        } else {
            amountExchange = request.getAmount() * exchangeType;
        }

        ExchangeTypeResponse response = ExchangeTypeResponse.builder()
                .amount(request.getAmount())
                .amountExchange(amountExchange)
                .originCurrency(currencies[0])
                .destinationCurrency(currencies[1])
                .exchangeType(exchangeType)
                .discountRate(request.getClientInfo().isRecurrentUser() == false ? null : rateDiscount)
                .build();

        return Mono.just(response);
    }
}
