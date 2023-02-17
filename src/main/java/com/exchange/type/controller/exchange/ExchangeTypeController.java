package com.exchange.type.controller.exchange;

import com.exchange.type.model.exchange.ExchangeTypeRequest;
import com.exchange.type.model.exchange.ExchangeTypeResponse;
import com.exchange.type.service.ExchangeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/exchange")
public class ExchangeTypeController {

    @Autowired
    private ExchangeTypeService exchangeTypeService;

    @PostMapping(value = "/type", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Mono<ResponseEntity<ExchangeTypeResponse>> exchangeCurrency(@RequestBody ExchangeTypeRequest request) {
        return exchangeTypeService.exchangeOriginToDestinationCurrency(request)
                .map(response -> ResponseEntity.ok(response))
                .defaultIfEmpty(ResponseEntity.badRequest().build())
                .onErrorReturn(ResponseEntity.internalServerError().build());
    }

}
