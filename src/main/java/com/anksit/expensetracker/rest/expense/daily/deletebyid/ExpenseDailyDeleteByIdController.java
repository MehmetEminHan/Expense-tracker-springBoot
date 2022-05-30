package com.anksit.expensetracker.rest.expense.daily.deletebyid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v0/ExpenseTracker/Daily")
public interface ExpenseDailyDeleteByIdController {

   /* @GetMapping("/deleteById")
    ResponseEntity<String> deleteDailyExpense(@RequestParam(name = "id") Long id); */


    @GetMapping("/deleteById/{id}")
    ResponseEntity<String> deleteDailyExpense(@PathVariable("id") Long id);

}
