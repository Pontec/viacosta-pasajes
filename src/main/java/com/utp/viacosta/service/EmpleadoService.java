package com.utp.viacosta.service;

import com.utp.viacosta.model.EmpleadoModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmpleadoService {
    List<EmpleadoModel> findAll();
    Optional<EmpleadoModel> findById(Integer id);
    EmpleadoModel findByCorreo(String usuario);
    EmpleadoModel save(EmpleadoModel empleado);
    void deleteById(Integer id);

}
