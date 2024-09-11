package com.utp.viacosta.service;

import com.utp.viacosta.model.UsuarioModelo;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<UsuarioModelo> findAll();
    Optional<UsuarioModelo> findById(Integer id);
    Optional<UsuarioModelo> findByCorreo(String usuario);
    UsuarioModelo save(UsuarioModelo usuario);
    void deleteById(Integer id);

}
