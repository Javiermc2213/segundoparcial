package com.banco.javier.BancoJavier.dto;

public class CambioDTO {
    private String fecha;
    private String moneda;
    private double venta;
    private double compra;

    // Constructor, getters y setters
    public CambioDTO(String fecha, String moneda, double venta, double compra) {
        this.fecha = fecha;
        this.moneda = moneda;
        this.venta = venta;
        this.compra = compra;
    }

    // Getters y setters
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }

    public double getVenta() { return venta; }
    public void setVenta(double venta) { this.venta = venta; }

    public double getCompra() { return compra; }
    public void setCompra(double compra) { this.compra = compra; }
}
