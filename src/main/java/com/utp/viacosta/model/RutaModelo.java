package com.utp.viacosta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rutas")
public class RutaModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta")
    private Long idRuta;
    private String origen;
    private String destino;
    private String duracion;
    @OneToMany(mappedBy = "rutaAsignada")
    private List<AsignacionBusRutaModelo> asignaciones;
}
