package com.anksit.expensetracker.service.mapper;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.repository.entity.ExpenseDailyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public abstract class ExpenseDailyMapper {

    public static ExpenseDailyMapper INSTANCE = Mappers.getMapper(ExpenseDailyMapper.class);
    public abstract ExpenseDailyDTO mapToExpenseDailyDto(ExpenseDailyEntity expenseDailyEntity);

    public abstract List<ExpenseDailyDTO> mapToExpenseDailyDtoList(Iterable<ExpenseDailyEntity> expenseDailyEntityList);

    public abstract ExpenseDailyEntity mapToExpenseDailyEntity(ExpenseDailyDTO expenseDailyDTO);
}
