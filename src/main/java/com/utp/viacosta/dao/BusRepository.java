package com.utp.viacosta.dao;

import com.utp.viacosta.model.BusModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusRepository extends JpaRepository<BusModelo, Long> {

}
