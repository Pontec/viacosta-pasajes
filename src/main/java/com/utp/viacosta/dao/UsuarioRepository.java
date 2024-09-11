package com.utp.viacosta.dao;

import com.utp.viacosta.model.UsuarioModelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModelo, Integer> {
    UsuarioModelo findByCorreo(String usuario);
}
