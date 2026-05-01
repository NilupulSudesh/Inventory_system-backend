package edu.Inventory_system.Odoo.service;

import edu.Inventory_system.Odoo.dto.ProductDTO;
import edu.Inventory_system.Odoo.dto.request.Response;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {

    Response saveProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response updateProduct(ProductDTO productDTO, MultipartFile imageFile);

    Response getAllProducts();

    Response getProductById(Long id);

    Response deleteProduct(Long id);

    Response searchProduct(String input);
}