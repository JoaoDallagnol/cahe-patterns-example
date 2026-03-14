package com.patterns.cache.controller;

import com.patterns.cache.dto.ProductResponse;
import com.patterns.cache.service.ReadThroughProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ReadThroughProductController {

    private final ReadThroughProductService service;

    @GetMapping("/products/{id}/read-through")
    public ResponseEntity<ProductResponse> getProductReadThrough(@PathVariable Long id) {
        ProductResponse response = service.getProductReadThrough(id);
        return ResponseEntity.ok(response);
    }
}
