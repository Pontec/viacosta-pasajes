package com.utp.viacosta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "asientos")
public class AsientoModelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asiento")
    private Long idAsiento;
    @Column(name = "id_bus")
    private Long idBus;
    @Column(name = "numero_asiento")
    private int numeroAsiento;
    private String estado;
    private double precio; //Falta agregar a la base de datos :(
    @Column(name = "id_tipo_asiento")
    private Long idTipoAsiento;
    @ManyToOne
    @JoinColumn(name = "id_tipo_asiento" , insertable = false, updatable = false)
    private TipoAsientoModelo tipoAsiento;
    @ManyToOne
    @JoinColumn(name = "id_bus" , insertable = false, updatable = false)
    private BusModelo bus;
}
