package com.utp.viacosta.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comprobantes")


public class ComprobanteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "tipo_comprobante")
    private String tipoComprobante;
    @Column (name = "numero_comprobante")
    private int numeroComproobante;
    @Column (name = "fecha_emision")
    private Time fechaEmision;
}
