package jhinchley.springapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jhinchley.springapi.models.Product;

@Repository
public interface ProductsRepository extends CrudRepository <Product, Long> {

}