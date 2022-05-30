package com.anksit.expensetracker.rest.expense.daily.save.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.rest.expense.daily.save.ExpenseDailySaveController;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseDailySaveControllerImpl implements ExpenseDailySaveController {

    private final ExpenseDailyService expenseDailyService;

    public ExpenseDailySaveControllerImpl(ExpenseDailyService expenseDailyService) {
        this.expenseDailyService = expenseDailyService;
    }

    @Override
    public ResponseEntity<String> save(ExpenseDailyDTO expenseDailyDTO) {
        expenseDailyService.saveDailyExpense(expenseDailyDTO);
        return ResponseEntity.ok("Successful");
    }
}
