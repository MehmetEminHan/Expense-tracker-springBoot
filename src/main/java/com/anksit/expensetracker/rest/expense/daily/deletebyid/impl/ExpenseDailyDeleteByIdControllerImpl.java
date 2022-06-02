package com.anksit.expensetracker.rest.expense.daily.deletebyid.impl;

import com.anksit.expensetracker.rest.expense.daily.deletebyid.ExpenseDailyDeleteByIdController;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExpenseDailyDeleteByIdControllerImpl implements ExpenseDailyDeleteByIdController {

    private final ExpenseDailyService expenseDailyService;


    public ExpenseDailyDeleteByIdControllerImpl(ExpenseDailyService expenseDailyService) {
        this.expenseDailyService = expenseDailyService;
    }


    @Override
    public ResponseEntity<String> deleteDailyExpense(Long id) {

        expenseDailyService.deleteDailyExpense(id);
        return new ResponseEntity<>("ID: "+id+" has been deleted!", HttpStatus.OK);

    }
}
