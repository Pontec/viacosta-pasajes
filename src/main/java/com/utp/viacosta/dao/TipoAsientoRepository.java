package com.utp.viacosta.dao;

import com.utp.viacosta.model.TipoAsientoModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TipoAsientoRepository extends JpaRepository<TipoAsientoModelo, Long> {

}
