package com.example.cursos_v1.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoDto {

    private Integer id;

    private String nombre;

    private String modulo;

    private String descripcion;

}
