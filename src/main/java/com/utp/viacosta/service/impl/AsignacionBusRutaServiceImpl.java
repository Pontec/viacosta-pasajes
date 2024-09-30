package com.utp.viacosta.service.impl;


import com.utp.viacosta.dao.AsignacionBusRutaRepository;
import com.utp.viacosta.service.AsignacionBusRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignacionBusRutaServiceImpl implements AsignacionBusRutaService {
    @Autowired
    private AsignacionBusRutaRepository asignacionBusRutaRepository;
}
