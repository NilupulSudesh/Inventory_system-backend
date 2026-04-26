package edu.Inventory_system.Odoo.service;


import edu.Inventory_system.Odoo.dto.UserDTO;
import edu.Inventory_system.Odoo.dto.request.LoginRequest;
import edu.Inventory_system.Odoo.dto.request.RegisterRequest;
import edu.Inventory_system.Odoo.dto.request.Response;
import edu.Inventory_system.Odoo.entity.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}