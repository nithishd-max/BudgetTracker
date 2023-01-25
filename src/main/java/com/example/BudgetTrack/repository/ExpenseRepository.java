package com.example.BudgetTrack.repository;

import com.example.BudgetTrack.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ExpenseRepository extends MongoRepository<Expense,Integer> {
}
