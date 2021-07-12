package com.nunes.sistemadeponto.controller;


import com.nunes.sistemadeponto.model.JornadaTrabalho;
import com.nunes.sistemadeponto.service.JornadaTrabalhoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    //@Autowired
    JornadaTrabalho jornadaTrabalho;
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaTrabalho(){
        return jornadaTrabalhoService.findAll();
    }
}
