package com.dgn.enumdemo.model;

import com.dgn.enumdemo.enums.Gender;
import com.dgn.enumdemo.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "T_ACCOUNT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
