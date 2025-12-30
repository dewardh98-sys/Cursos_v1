package com.example.cursos_v1.Controller;

import com.example.cursos_v1.Service.CursoService;
import com.example.cursos_v1.dto.CursoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@Slf4j
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping(value = "/cursos/listarCurso")
    public Mono<List<CursoDto>> listar(CursoDto request) {

        return cursoService.listarCurso(request);
    }

}
