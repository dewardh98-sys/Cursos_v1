package com.example.cursos_v1.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "progreso")
@Data
public class Progreso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", referencedColumnName = "id")
    private Curso curso;

    @Column(name = "estado", length = 20)
    private String estado; // 'iniciado' o 'completado'

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_completado")
    private Date fechaCompletado;

    @Column(name = "insignia_url", length = 255)
    private String insigniaUrl;
}
