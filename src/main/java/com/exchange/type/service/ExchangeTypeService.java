package com.exchange.type.service;

import com.exchange.type.model.exchange.ExchangeTypeRequest;
import com.exchange.type.model.exchange.ExchangeTypeResponse;
import reactor.core.publisher.Mono;

public interface ExchangeTypeService {

    Mono<ExchangeTypeResponse> exchangeOriginToDestinationCurrency(ExchangeTypeRequest request);

}
