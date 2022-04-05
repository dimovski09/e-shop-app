package mk.ukim.finki.eshop.service;

import mk.ukim.finki.eshop.model.Product;
import mk.ukim.finki.eshop.model.dto.ProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> findAll();
    Optional<Product> findById(Long id);
    Optional<Product> findByName(String name);
    Optional<Product> save(String name, Double price, Integer quality,
                           Long categoryId, Long manufacturerID);
    Optional<Product> save(ProductDto productDto);

    Optional<Product> edit(Long id, ProductDto productDto);

    void deleteById(Long id);
}
