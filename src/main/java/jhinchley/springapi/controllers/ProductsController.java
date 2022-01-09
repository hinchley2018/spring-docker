package jhinchley.springapi.controllers;

//java stuffs
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//spring DI
import org.springframework.beans.factory.annotation.Autowired;

//http helpers
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


//rest annotations
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//application packages
import jhinchley.springapi.models.Product;
import jhinchley.springapi.repositories.ProductsRepository;

@RestController
@RequestMapping("/api")
public class ProductsController {
    //DI
    @Autowired
    ProductsRepository productsRepository;

    // GET /products
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<Product>();
        Iterable<Product> iterableProducts = productsRepository.findAll();
        iterableProducts.forEach(products::add);
        return products;
    }
}