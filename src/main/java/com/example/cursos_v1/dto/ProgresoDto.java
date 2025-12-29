package com.example.cursos_v1.dto;


import com.example.cursos_v1.Model.Curso;
import com.example.cursos_v1.Model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProgresoDto {

    private Integer id;

    private Usuario usuario;

    private Curso curso;

    private String estado;

    private Date fechaCompletado;

    private String insigniaUrl;
}

