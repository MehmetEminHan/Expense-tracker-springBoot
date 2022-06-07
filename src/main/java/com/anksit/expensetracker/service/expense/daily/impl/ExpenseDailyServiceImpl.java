package com.anksit.expensetracker.service.expense.daily.impl;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.repository.expenses.daily.ExpenseDailyRepository;
import com.anksit.expensetracker.service.expense.daily.ExpenseDailyService;
import com.anksit.expensetracker.service.mapper.ExpenseDailyMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Math.ceil;
import static java.lang.Math.max;

@Service
public class ExpenseDailyServiceImpl implements ExpenseDailyService {


    private final ExpenseDailyRepository expenseDailyRepository;
    private ExpenseDailyMapper mapper = ExpenseDailyMapper.INSTANCE;

    public ExpenseDailyServiceImpl(final ExpenseDailyRepository expenseDailyRepository) {
        this.expenseDailyRepository = expenseDailyRepository;
    }


    @Override
    public List<ExpenseDailyDTO> fetchAllDailyExpenses() {

        return mapper.mapToExpenseDailyDtoList(expenseDailyRepository.findAll());

    }

    @Override
    public ExpenseDailyDTO fetchDailyExpense(Long id) {

        return mapper.mapToExpenseDailyDto(expenseDailyRepository.findById(id).get());

    }

    @Override
    public void saveDailyExpense(ExpenseDailyDTO expenseDailyDTO) {

        expenseDailyRepository.save(mapper.mapToExpenseDailyEntity(expenseDailyDTO));

    }

    @Override
    public void deleteDailyExpense(Long id) {

        expenseDailyRepository.deleteById(id);

    }

    @Override
    public List<ExpenseDailyDTO> fetchAllDailyExpensesByPagination(int pagination) {

        Double maxPageNumber = ceil(mapper.mapToExpenseDailyDtoList(expenseDailyRepository.findAll()).stream().count() / 10.0);
        return (pagination < maxPageNumber )  ? fetchAllDailyExpensesByCriteria(pagination) : fetchAllDailyExpensesByCriteria((int) (maxPageNumber - 1));

    }

    private List<ExpenseDailyDTO> fetchAllDailyExpensesByCriteria(int pagination){

        return mapper.mapToExpenseDailyDtoList(expenseDailyRepository.fetchAllDailyExpensesByPagination(PageRequest.of(pagination, 10)));

    }

}
