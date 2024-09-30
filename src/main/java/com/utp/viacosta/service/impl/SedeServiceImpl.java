package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.SedesRepository;
import com.utp.viacosta.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SedeServiceImpl implements SedeService {
    @Autowired
    private SedesRepository sedeRepository;
}
