package com.anksit.expensetracker.rest.expense.daily.fetchbyid;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v0/ExpenseTracker/Daily")
public interface ExpenseDailyFetchByIdController {

    @GetMapping("/fetchById/{id}")
    ResponseEntity<ExpenseDailyDTO> fetchById(@PathVariable("id") Long id);

}
