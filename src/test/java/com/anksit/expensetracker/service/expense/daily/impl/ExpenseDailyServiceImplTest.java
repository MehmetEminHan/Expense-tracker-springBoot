package com.anksit.expensetracker.service.expense.daily.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.repository.entity.ExpenseDailyEntity;
import com.anksit.expensetracker.repository.expenses.daily.ExpenseDailyRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class ExpenseDailyServiceImplTest {

    private ExpenseDailyServiceImpl expenseDailyService;

    @Mock
    private ExpenseDailyRepository expenseDailyRepository;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        expenseDailyService = new ExpenseDailyServiceImpl(expenseDailyRepository);
    }

    @Test
    void saveDailyExpenseTest() {
        ExpenseDailyDTO expenseDailyDTO = new ExpenseDailyDTO();
        expenseDailyService.saveDailyExpense(expenseDailyDTO);
        verify(expenseDailyRepository, times(1)).save(any());
    }

    @Test
    void fetchAllTest() {
        assertNotNull(expenseDailyService.fetchAllDailyExpenses());
    }

    @Test
    void fetchByIdTest() {

        Long id = 5L;
        Optional<ExpenseDailyEntity> optional = Optional.of(new ExpenseDailyEntity());
        when(expenseDailyRepository.findById(any())).thenReturn(optional);
        assertNotNull(expenseDailyService.fetchDailyExpense(id));

    }

    @Test
    void deleteByIdTest(){
        Long id = 4L;
        expenseDailyService.deleteDailyExpense(id);
        verify(expenseDailyRepository, times(1)).deleteById(any());
    }


}