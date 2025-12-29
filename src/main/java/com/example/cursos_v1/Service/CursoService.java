package com.example.cursos_v1.Service;

import com.example.cursos_v1.dto.CursoDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public interface CursoService {

    Mono<List<CursoDto>> listarCurso(CursoDto request);



}