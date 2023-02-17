package com.exchange.type.service;

import com.exchange.type.model.exchange.ExchangeTypeRequest;
import com.exchange.type.model.exchange.ExchangeTypeResponse;

public interface ExchangeTypeService {

    ExchangeTypeResponse exchangeOriginToDestinationCurrency(ExchangeTypeRequest request);

}
