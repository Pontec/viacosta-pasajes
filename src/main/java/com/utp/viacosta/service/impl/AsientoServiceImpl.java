package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.AsientoRepository;
import com.utp.viacosta.service.AsientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsientoServiceImpl implements AsientoService {
    @Autowired
    private AsientoRepository asientoRepository;
}
