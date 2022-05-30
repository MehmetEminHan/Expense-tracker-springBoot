package com.anksit.expensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseDailyDTO {

    private Long id;
    private Double expense;
    private LocalDateTime expenseDate;
    private String expenseNote;
    private String expenseCategory;
    private Long userId;

}
