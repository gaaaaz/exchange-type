package com.exchange.type.controller.exchange;

import com.exchange.type.model.exchange.ExchangeTypeRequest;
import com.exchange.type.model.exchange.ExchangeTypeResponse;
import com.exchange.type.service.ExchangeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exchange")
public class ExchangeTypeController {

    @Autowired
    private ExchangeTypeService exchangeTypeService;

    @PostMapping("/type")
    public ExchangeTypeResponse exchangeCurrency(@RequestBody ExchangeTypeRequest request) {
        return exchangeTypeService.exchangeOriginToDestinationCurrency(request);
    }

}
