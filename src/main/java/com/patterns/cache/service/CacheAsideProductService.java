package com.patterns.cache.service;

import com.patterns.cache.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CacheAsideProductService {

    private final ProductService productService;

    public ProductResponse getById(Long id) {
        // try get from cache
        // if not exists in cache
        // get from database
        // save to cache
        // return result
        return null;
    }

    public List<ProductResponse> getAll() {
        return null;
    }
}
