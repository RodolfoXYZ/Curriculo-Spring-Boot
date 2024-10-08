package com.example.atividade_marcio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atividade_marcio.models.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Integer> {
}
