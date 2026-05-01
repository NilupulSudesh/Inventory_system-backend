package edu.Inventory_system.Odoo.service;

import edu.Inventory_system.Odoo.dto.SupplierDTO;
import edu.Inventory_system.Odoo.dto.request.Response;

public interface SupplierService {


    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);
}
