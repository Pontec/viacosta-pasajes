package com.utp.viacosta.service.impl;


import com.utp.viacosta.dao.BusRepository;
import com.utp.viacosta.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
}
