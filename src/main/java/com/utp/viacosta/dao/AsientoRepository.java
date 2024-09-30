package com.utp.viacosta.dao;

import com.utp.viacosta.model.AsientoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AsientoRepository extends JpaRepository<AsientoModel, Integer> {

}
