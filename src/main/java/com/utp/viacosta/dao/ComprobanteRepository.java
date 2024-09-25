package com.utp.viacosta.dao;

import com.utp.viacosta.model.ComprobanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprobanteRepository extends JpaRepository<ComprobanteModel, Integer> {
}