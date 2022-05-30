package com.anksit.expensetracker.rest.expense.daily.save;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v0/ExpenseTracker/Daily")
public interface ExpenseDailySaveController {

    @PostMapping("/save")
    ResponseEntity<String> save(@RequestBody ExpenseDailyDTO expenseDailyDTO);
}
