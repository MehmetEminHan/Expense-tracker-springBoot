package com.anksit.expensetracker.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "dailyexpense")
@Entity
public class ExpenseDailyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "expense")
    private Double expense;

    @Column(name = "expensedate")
    private LocalDateTime expenseDate;

    @Column(name = "expensenote")
    private String expenseNote;

    @Column(name = "expensecategory")
    private String expenseCategory;

    @Column(name = "userid")
    private Long userId;


}
