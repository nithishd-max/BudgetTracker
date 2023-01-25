package com.example.BudgetTrack.controller;

import com.example.BudgetTrack.model.Expense;
import com.example.BudgetTrack.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;
    @GetMapping("/findAllExpenses")
    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }
    @PostMapping("/saveExpense")
    public String saveExpense(@RequestBody Expense expense){
        expenseRepository.save(expense);
        return "Expense with id "+expense.getId()+" successfully added";
    }
    @GetMapping("/findExpenseById")
    public Optional<Expense> getExpenseById(@PathVariable int id){
        return  expenseRepository.findById(id);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable int id){
        expenseRepository.deleteById(id);
        return "Expense with"+id+"successfully deleted";
    }
}
