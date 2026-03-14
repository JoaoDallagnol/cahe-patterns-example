package com.patterns.cache.controller;

import com.patterns.cache.dto.ProductResponse;
import com.patterns.cache.service.CacheAsideProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class CacheAsideProductController {

    private final CacheAsideProductService service;

    public ResponseEntity<ProductResponse> getProductById(@PathVariable Long id) {
        ProductResponse response = service.getById(id);
        return ResponseEntity.ok(response);
    }

    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        List<ProductResponse> response = service.getAll();
        return ResponseEntity.ok(response);
    }
}
