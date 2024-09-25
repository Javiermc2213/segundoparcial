package com.banco.javier.BancoJavier.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "TipoCambioFechaInicialMonedaResponse", namespace = "http://www.banguat.gob.gt/variables/ws/")
@XmlAccessorType(XmlAccessType.FIELD)
public class TipoCambioResponse {

    @XmlElement(name = "Vars", namespace = "http://www.banguat.gob.gt/variables/ws/")
    private Vars vars;

    public Vars getVars() {
        return vars;
    }

    public void setVars(Vars vars) {
        this.vars = vars;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Vars {
        @XmlElement(name = "Var", namespace = "http://www.banguat.gob.gt/variables/ws/")
        private List<Var> varList;

        public List<Var> getVarList() {
            return varList;
        }

        public void setVarList(List<Var> varList) {
            this.varList = varList;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Var {
            private int moneda;
            private String fecha;
            private float venta;
            private float compra;

            // Getters y setters
            public int getMoneda() {
                return moneda;
            }

            public void setMoneda(int moneda) {
                this.moneda = moneda;
            }

            public String getFecha() {
                return fecha;
            }

            public void setFecha(String fecha) {
                this.fecha = fecha;
            }

            public float getVenta() {
                return venta;
            }

            public void setVenta(float venta) {
                this.venta = venta;
            }

            public float getCompra() {
                return compra;
            }

            public void setCompra(float compra) {
                this.compra = compra;
            }
        }
    }
}
