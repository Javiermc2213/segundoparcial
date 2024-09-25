package com.banco.javier.BancoJavier.controller;

import com.banco.javier.BancoJavier.dto.TipoCambioResponse;
import com.banco.javier.BancoJavier.service.SOAPClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SOAPController {

    @Autowired
    private SOAPClientService soapClientService;

    @GetMapping("/soap/cambio")
    public TipoCambioResponse obtenerTipoCambio(@RequestParam String fecha, @RequestParam int moneda) {
        return soapClientService.obtenerTipoCambio(fecha, moneda);
    }
}
