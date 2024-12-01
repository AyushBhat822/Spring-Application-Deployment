package com.example.repository;

import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @SuppressWarnings("deprecation")
	public List<Product> getProducts(String param) {
        String procedureCall = "{call getEquip(?)}";
        
        return jdbcTemplate.query(procedureCall, new Object[]{param}, this::mapRowToProduct);
    }

    private Product mapRowToProduct(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductMaster(rs.getString(1));
        product.setProductName(rs.getString(2));
        product.setPrice(rs.getDouble(3));
        product.setDescription(rs.getString(4));   
        product.setRate(rs.getDouble(5));
        product.setReview(rs.getString(6));
        return product;
    }
}
