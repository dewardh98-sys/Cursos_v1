package com.example.cursos_v1.Service.Impl;

import com.example.cursos_v1.Model.Curso;
import com.example.cursos_v1.Repository.CursoRepository;
import com.example.cursos_v1.Service.CursoService;
import com.example.cursos_v1.dto.CursoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class CursoServiceImpl implements CursoService {

   @Autowired
    private CursoRepository cursoRepository;

    @Override
    public Mono<List<CursoDto>> listarCurso(CursoDto request) {
        List<Curso> cursosList = cursoRepository.findAll();
        List<CursoDto> listadeCursos = cursosList.stream()
                .map(curso -> CursoDto.builder()
                        .id(curso.getId())
                        .modulo(curso.getModulo())
                        .nombre(curso.getNombre())
                        .descripcion(curso.getDescripcion())
                        .build()).toList();

        return Mono.just(listadeCursos);
    }
}
