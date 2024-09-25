package com.utp.viacosta.dao;

import com.utp.viacosta.model.AsignacionBusRutaModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionBusRutaRepository extends JpaRepository<AsignacionBusRutaModelo, Long> {

}
