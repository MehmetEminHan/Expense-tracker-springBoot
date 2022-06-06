package com.anksit.expensetracker.rest.expense.daily.fetchallbypagination.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.rest.expense.daily.fetchallbypagination.ExpenseDailyFetchAllByPaginationController;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ExpenseDailyFetchAllByPaginationControllerImpl implements ExpenseDailyFetchAllByPaginationController {

    private ExpenseDailyService expenseDailyService;

    public ExpenseDailyFetchAllByPaginationControllerImpl(ExpenseDailyService expenseDailyService) {
        this.expenseDailyService = expenseDailyService;
    }

    @Override
    public ResponseEntity<List<ExpenseDailyDTO>> fetchAllByPagination(Integer page) {

        return ResponseEntity.ok(expenseDailyService.fetchAllDailyExpensesByPagination(page));

    }

}
