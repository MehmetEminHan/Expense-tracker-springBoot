package com.anksit.expensetracker.rest.expense.daily.fetchall;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@CrossOrigin
@RequestMapping("/v0/ExpenseTracker/Daily")
public interface ExpenseDailyFetchAllController {

    @GetMapping("/fetchAll")
    ResponseEntity<List<ExpenseDailyDTO>> fetchAll();



}
