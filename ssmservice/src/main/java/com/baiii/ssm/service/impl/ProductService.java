package com.baiii.ssm.service.impl;

import com.baiii.ssm.dao.IProductDao;
import com.baiii.ssm.domain.Product;
import com.baiii.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductDao productDao;

    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }
}
