package com.banco.javier.BancoJavier.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TipoCambioFechaInicialMoneda", namespace = "http://www.banguat.gob.gt/variables/ws/")
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCambioRequest {

    @XmlElement(name = "fechainit", namespace = "http://www.banguat.gob.gt/variables/ws/")
    private String fecha;

    @XmlElement(name = "moneda", namespace = "http://www.banguat.gob.gt/variables/ws/")
    private int moneda;

    // Getters y setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMoneda() {
        return moneda;
    }

    public void setMoneda(int moneda) {
        this.moneda = moneda;
    }
}
