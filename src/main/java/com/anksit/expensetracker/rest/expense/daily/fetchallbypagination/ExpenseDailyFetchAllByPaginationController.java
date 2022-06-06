package com.anksit.expensetracker.rest.expense.daily.fetchallbypagination;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/v0/ExpenseTracker/Daily")
public interface ExpenseDailyFetchAllByPaginationController {

    @GetMapping("/fetchAll/{page}")
    ResponseEntity<List<ExpenseDailyDTO>> fetchAllByPagination(@PathVariable(name = "page") Integer page);

}
