package com.example.cursos_v1.Service.Impl;


import com.example.cursos_v1.Model.Usuario;
import com.example.cursos_v1.Repository.AuthenticacionRepository;
import com.example.cursos_v1.Service.AuthenticacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticacionServiceImpl implements AuthenticacionService {

    @Autowired
    private AuthenticacionRepository usuarioRepository;

    @Override
    public Usuario login(String username, String password) {
        Optional<Usuario> userOpt = usuarioRepository.findByUsername(username);

        if (userOpt.isPresent()) {
            Usuario user = userOpt.get();
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return userOpt.get();
    }
}
