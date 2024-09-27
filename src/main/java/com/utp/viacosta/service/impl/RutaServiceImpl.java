package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.RutaRepository;
import com.utp.viacosta.service.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RutaServiceImpl implements RutaService {
    @Autowired
    private RutaRepository rutaRepository;
}
