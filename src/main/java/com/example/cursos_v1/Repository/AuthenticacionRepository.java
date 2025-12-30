package com.example.cursos_v1.Repository;

import com.example.cursos_v1.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthenticacionRepository {

    // Este metodo es el que usa el AuthServiceImpl para buscar al usuario
    Optional<Usuario> findByUsername(String username);
}
