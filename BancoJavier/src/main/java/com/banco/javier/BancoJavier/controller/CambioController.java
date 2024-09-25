package com.banco.javier.BancoJavier.controller;

import com.banco.javier.BancoJavier.dto.CambioDTO;
import com.banco.javier.BancoJavier.service.CambioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CambioController {

    @Autowired
    private CambioService cambioService;

    @GetMapping("/cambio")
    public CambioDTO obtenerCambio() {
        return cambioService.obtenerCambio();
    }
}
