package com.utp.viacosta.service.impl;

import com.utp.viacosta.dao.EmpleadoRepository;
import com.utp.viacosta.model.EmpleadoModel;
import com.utp.viacosta.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class EmpresaServiceImpl {
    @Service
    public class EmpresaService implements EmpleadoService {

        @Autowired
        private EmpleadoRepository empleadoRepository;

        @Override
        public List<EmpleadoModel> findAll() {
            return empleadoRepository.findAll();
        }

        @Override
        public Optional<EmpleadoModel> findById(Integer id) {
            return empleadoRepository.findById(id);
        }

        @Override
        public EmpleadoModel findByCorreo(String usuario) {
            return empleadoRepository.findByCorreo(usuario);
        }

        @Override
        public EmpleadoModel save(EmpleadoModel empleado) {
            return empleadoRepository.save(empleado);
        }

        @Override
        public void deleteById(Integer id) {
            empleadoRepository.deleteById(id);
        }


    }
}
