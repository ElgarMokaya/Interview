package com.example.example.services;

import java.util.List;

import com.example.example.model.Transaction;

public interface TransactionService {
	
	List<Transaction> getAllTransactions();
	Transaction getTransactionById(Long id);
	Transaction createTransaction(Transaction transaction);

}
