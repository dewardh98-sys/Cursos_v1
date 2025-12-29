package com.example.cursos_v1.Service.Impl;

import com.example.cursos_v1.Service.CursoService;
import com.example.cursos_v1.dto.CursoDto;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
public class CursoServiceImpl implements CursoService {



    @Override
    public Mono<List<CursoDto>> listarCurso(CursoDto request) {
        return null;
    }
}
