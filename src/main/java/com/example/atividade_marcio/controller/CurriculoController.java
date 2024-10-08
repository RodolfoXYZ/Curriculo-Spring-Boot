package com.example.atividade_marcio.controller;
import org.springframework.web.bind.annotation.RestController;
import com.example.atividade_marcio.models.Curriculo;
import com.example.atividade_marcio.services.CurriculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CurriculoController {
    @Autowired
    CurriculoService service;


    @PostMapping("/create")
    public int insert(@RequestBody Curriculo entity) {
        try{
            service.insertACurriculum(entity);
            return 1;
        }
        catch(Exception e){
            return 0;
        }
    }
    @GetMapping("/getAll")
    public List<Curriculo> select() {
        
            return service.getAll();
        
    }
    
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int id) {
        try{
            service.deleteCurriculum(id);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    
}
