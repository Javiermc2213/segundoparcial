package com.banco.javier.BancoJavier.controller;

import com.banco.javier.BancoJavier.service.CambioService;
import com.banco.javier.BancoJavier.dto.CambioDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CambioControllerTest {

    @Autowired
    private CambioService cambioService;

    @Test
    public void testObtenerCambio() {
        // Prueba que el servicio devuelva un DTO válido
        CambioDTO cambio = cambioService.obtenerCambio();

        // Verifica que el objeto no es nulo
        assertNotNull(cambio);

        // Verifica los valores esperados
        assertEquals("24/09/2024", cambio.getFecha());
        assertEquals("02", cambio.getMoneda());
        assertEquals(7.8, cambio.getVenta());
        assertEquals(7.6, cambio.getCompra());
    }
}
