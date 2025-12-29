package com.example.cursos_v1.Repository;


import com.example.cursos_v1.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository  extends JpaRepository<Curso,Integer> {

    List<Curso> listarCurso(String modulo);

}
