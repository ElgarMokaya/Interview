package com.example.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.example.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long>{

}
