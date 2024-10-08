package com.example.atividade_marcio.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nome;
    String CEP;
    String nationality;
    String district;
    Integer number;
    String complement;
    String email;
    String phoneNumber;
    String linkedin;
}
