package com.projeto.MyFinances.Domain.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Accounts")
public class Bills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountName;
    private Date date;
    private String formPayment;
    private double paymentValue;
    private boolean situation;




}
