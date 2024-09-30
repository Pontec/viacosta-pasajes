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
@Table(name = "tipo_asiento")
public class TipoAsientoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_asiento")
    private Integer idAsiento;
    private String nombre; //Falta agregar a la base de datos :(
    private String descripcion;
    @Column(name = "cargo_adicional")
    private double cargoExtra;
    @OneToMany(mappedBy = "tipoAsiento")
    private List<AsientoModel> asientos;
}
