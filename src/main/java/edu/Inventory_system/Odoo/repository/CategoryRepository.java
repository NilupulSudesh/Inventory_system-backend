package edu.Inventory_system.Odoo.repository;


import edu.Inventory_system.Odoo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}