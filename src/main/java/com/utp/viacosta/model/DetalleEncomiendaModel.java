package com.utp.viacosta.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalle_encomienda")

public class DetalleEncomiendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer idDetalle;
    private String descripcion;
    private double peso;
    @Column(name = "metodo_pago")
    private int metodoPago;
    @Column(name = "precio_unitario")
    private int precioUnitario;
    private int subtotal;
    @Column(name = "Buses_id_bus")
    private int busesIdBus;

    @ManyToOne
    @JoinColumn(name = "id_comprobante")
    private ComprobanteModel comprobante;
}
