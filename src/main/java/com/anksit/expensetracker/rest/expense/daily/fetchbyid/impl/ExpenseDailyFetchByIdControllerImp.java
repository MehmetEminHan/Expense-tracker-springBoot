package com.anksit.expensetracker.rest.expense.daily.fetchbyid.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.rest.expense.daily.fetchbyid.ExpenseDailyFetchByIdController;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseDailyFetchByIdControllerImp implements ExpenseDailyFetchByIdController {

    private final ExpenseDailyService expenseDailyService;

    public ExpenseDailyFetchByIdControllerImp(ExpenseDailyService expenseDailyService) {
        this.expenseDailyService = expenseDailyService;
    }


    @Override
    public ResponseEntity<ExpenseDailyDTO> fetchById( Long id) {
        return ResponseEntity.ok(expenseDailyService.fetchDailyExpense(id));
    }
}
