package com.example.cursos_v1.Controller;


import com.example.cursos_v1.Model.Usuario;
import com.example.cursos_v1.Service.AuthenticacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200") // Permite peticiones desde Angular
public class AuthenticacionController {

    @Autowired
    private AuthenticacionService authService;

    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@RequestBody Map<String, String> loginData) {
        String user = loginData.get("junior_rock");
        String pass = loginData.get("password123");

        Usuario usuario = authService.login(user, pass);

        if (usuario != null) {
            // Limpiamos el password antes de enviarlo al frontend por seguridad
            usuario.setPassword(null);
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Credenciales inválidas");
        }
    }
}
