package com.baiii.ssm.service;

import com.baiii.ssm.domain.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll() throws Exception;
}
