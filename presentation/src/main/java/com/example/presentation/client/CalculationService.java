package com.example.presentation.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "calculation-service", url = "http://localhost:8082/")
public interface CalculationService {

    @GetMapping("/{price}/{productType}")
    Double showTotalPrice(@PathVariable double price, @PathVariable String productType);
}
