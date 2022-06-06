package com.anksit.expensetracker.repository.expenses.daily;

import com.anksit.expensetracker.repository.entity.ExpenseDailyEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpenseDailyRepository extends CrudRepository<ExpenseDailyEntity, Long> {

    @Query("SELECT x FROM ExpenseDailyEntity x ORDER BY x.id ASC")
    List<ExpenseDailyEntity> fetchAllDailyExpensesByPagination(Pageable pageable);


}
