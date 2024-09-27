package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.DetalleBoletaRepository;
import com.utp.viacosta.service.DetalleBoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleBoletaServiceImpl implements DetalleBoletaService {
    @Autowired
    private DetalleBoletaRepository detalleBoletaRepository;
}
