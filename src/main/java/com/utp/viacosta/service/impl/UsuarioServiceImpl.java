package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.UsuarioRepository;
import com.utp.viacosta.model.UsuarioModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModelo> findAll() {
        return usuarioRepository.findAll();
    }

    public UsuarioModelo findById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public UsuarioModelo findByCorreo(String usuario) {
        return usuarioRepository.findByCorreo(usuario);
    }

    public UsuarioModelo save(UsuarioModelo usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteById(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
