package com.example.atividade_marcio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.atividade_marcio.models.Curriculo;
import com.example.atividade_marcio.repositories.CurriculoRepository;

@Service
public class CurriculoService {

    @Autowired
    CurriculoRepository repository;
    
    public List<Curriculo> getAll(){
        return repository.findAll();
    }
    public void insertACurriculum(Curriculo c){
        repository.save(c);
    }
    public void deleteCurriculum(int id){
        repository.deleteById(id);
    }
}
