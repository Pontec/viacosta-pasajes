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
@Table(name = "asientos")
public class AsientoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asiento")
    private Integer idAsiento;
    @Column(name = "id_bus")
    private int idBus;
    @Column(name = "numero_asiento")
    private int numeroAsiento;
    private String estado;
    private double precio; //Falta agregar a la base de datos :(
    @Column(name = "id_tipo_asiento")
    private int idTipoAsiento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_asiento" , insertable = false, updatable = false)
    private TipoAsientoModel tipoAsiento;

    @ManyToOne
    @JoinColumn(name = "id_bus" , insertable = false, updatable = false)
    private BusModel bus;

    @OneToMany(mappedBy = "asiento")
    private List<DetalleBoletaModel> detalleBoletas;
}
