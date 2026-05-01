package edu.Inventory_system.Odoo.service;

import edu.Inventory_system.Odoo.dto.CategoryDTO;
import edu.Inventory_system.Odoo.dto.request.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
