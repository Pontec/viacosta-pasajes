package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.ClienteRepository;
import com.utp.viacosta.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
}
