package com.anksit.expensetracker.rest.expense.daily.fetchall.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.rest.expense.daily.fetchall.ExpenseDailyFetchAllController;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseDailyFetchAllControllerImpl implements ExpenseDailyFetchAllController {

    private final ExpenseDailyService expenseDailyService;

    public ExpenseDailyFetchAllControllerImpl(ExpenseDailyService expenseDailyService) {
        this.expenseDailyService = expenseDailyService;
    }

    @Override
    public ResponseEntity<List<ExpenseDailyDTO>>fetchAll() {

        return ResponseEntity.ok(expenseDailyService.fetchAllDailyExpenses());

    }
}
