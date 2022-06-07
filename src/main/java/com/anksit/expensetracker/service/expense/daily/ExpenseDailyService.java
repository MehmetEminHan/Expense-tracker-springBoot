package com.anksit.expensetracker.service.expense.daily;

import com.anksit.expensetracker.model.ExpenseDailyDTO;

import java.util.List;
import java.util.Optional;

public interface ExpenseDailyService {

    List<ExpenseDailyDTO> fetchAllDailyExpenses();

    ExpenseDailyDTO fetchDailyExpense(Long id);

    void saveDailyExpense(ExpenseDailyDTO expenseDailyDTO);

    void deleteDailyExpense(Long id);

    List<ExpenseDailyDTO> fetchAllDailyExpensesByPagination(int pagination);

}
