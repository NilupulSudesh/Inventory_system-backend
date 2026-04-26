package edu.Inventory_system.Odoo.repository;


import edu.Inventory_system.Odoo.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}