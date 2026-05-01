package edu.Inventory_system.Odoo.service;

import edu.Inventory_system.Odoo.dto.request.Response;
import edu.Inventory_system.Odoo.dto.request.TransactionRequest;
import edu.Inventory_system.Odoo.enums.TransactionStatus;

public interface TransactionService {

    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
