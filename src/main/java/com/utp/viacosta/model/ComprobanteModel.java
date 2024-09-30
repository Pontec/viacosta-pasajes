package com.utp.viacosta.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comprobantes")
public class ComprobanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comprobante")
    private Integer idComprobante;
    @Column (name = "tipo_comprobante")
    private String tipoComprobante;
    @Column (name = "numero_comprobante")
    private int numeroComprobante;
    @Column (name = "fecha_emision")
    private Time fechaEmision;

    @OneToMany(mappedBy = "comprobante")
    private List<DetalleEncomiendaModel> listDetalleEncomienda;

    @OneToMany(mappedBy = "comprobante")
    private List<DetalleBoletaModel> listDetalleBoleta;


}
