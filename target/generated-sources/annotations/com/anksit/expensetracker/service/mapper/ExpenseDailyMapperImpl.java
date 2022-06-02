package com.anksit.expensetracker.service.mapper;

import com.anksit.expensetracker.model.ExpenseDailyDTO;
import com.anksit.expensetracker.repository.entity.ExpenseDailyEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-02T14:18:41-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class ExpenseDailyMapperImpl extends ExpenseDailyMapper {

    @Override
    public ExpenseDailyDTO mapToExpenseDailyDto(ExpenseDailyEntity expenseDailyEntity) {
        if ( expenseDailyEntity == null ) {
            return null;
        }

        ExpenseDailyDTO expenseDailyDTO = new ExpenseDailyDTO();

        expenseDailyDTO.setId( expenseDailyEntity.getId() );
        expenseDailyDTO.setExpense( expenseDailyEntity.getExpense() );
        expenseDailyDTO.setExpenseDate( expenseDailyEntity.getExpenseDate() );
        expenseDailyDTO.setExpenseNote( expenseDailyEntity.getExpenseNote() );
        expenseDailyDTO.setExpenseCategory( expenseDailyEntity.getExpenseCategory() );
        expenseDailyDTO.setUserId( expenseDailyEntity.getUserId() );

        return expenseDailyDTO;
    }

    @Override
    public List<ExpenseDailyDTO> mapToExpenseDailyDtoList(Iterable<ExpenseDailyEntity> expenseDailyEntityList) {
        if ( expenseDailyEntityList == null ) {
            return null;
        }

        List<ExpenseDailyDTO> list = new ArrayList<ExpenseDailyDTO>();
        for ( ExpenseDailyEntity expenseDailyEntity : expenseDailyEntityList ) {
            list.add( mapToExpenseDailyDto( expenseDailyEntity ) );
        }

        return list;
    }

    @Override
    public ExpenseDailyEntity mapToExpenseDailyEntity(ExpenseDailyDTO expenseDailyDTO) {
        if ( expenseDailyDTO == null ) {
            return null;
        }

        ExpenseDailyEntity expenseDailyEntity = new ExpenseDailyEntity();

        expenseDailyEntity.setId( expenseDailyDTO.getId() );
        expenseDailyEntity.setExpense( expenseDailyDTO.getExpense() );
        expenseDailyEntity.setExpenseDate( expenseDailyDTO.getExpenseDate() );
        expenseDailyEntity.setExpenseNote( expenseDailyDTO.getExpenseNote() );
        expenseDailyEntity.setExpenseCategory( expenseDailyDTO.getExpenseCategory() );
        expenseDailyEntity.setUserId( expenseDailyDTO.getUserId() );

        return expenseDailyEntity;
    }
}
