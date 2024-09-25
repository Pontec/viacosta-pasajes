package com.utp.viacosta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalle_boleta")

public class BoletaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer idDetalle;
    private String descripcion;
    @Column(name = "fecha_viaje")
    private Time fechaViaje;
    @Column(name = "hora_viaje")
    private Timestamp horaViaje;
    @Column(name = "metodo_pago")
    private String metodoPago;
    @Column(name = "precio_unitario")
    private double precioUnitario;
    private double subtotal;
    private int comprobante;
    private int asiento;
    private int compra;


}
