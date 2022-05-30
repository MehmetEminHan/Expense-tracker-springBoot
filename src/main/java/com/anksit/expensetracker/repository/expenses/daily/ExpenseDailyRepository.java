package com.anksit.expensetracker.repository.expenses.daily;

import com.anksit.expensetracker.repository.entity.ExpenseDailyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseDailyRepository extends CrudRepository<ExpenseDailyEntity, Long> {
}
