/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class Pedido 
{
     private int numero;
    private String tipoEntrega;
    private String estado;

    private Cliente cliente;
    private Repartidor repartidor;

    private Producto[] productos;
    private Combo[] combos;

    private Factura factura;
    
    public Pedido() {
    }



    public Pedido(int numero, String tipoEntrega, String estado,
                  Cliente cliente, Repartidor repartidor,
                  Producto[] productos, Combo[] combos,
                  Factura factura) {

        this.numero = numero;
        this.tipoEntrega = tipoEntrega;
        this.estado = estado;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.productos = productos;
        this.combos = combos;
        this.factura = factura;
    }



    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getTipoEntrega() {
        return tipoEntrega;
    }


    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }



    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }



    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public Repartidor getRepartidor() {
        return repartidor;
    }


    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }



    public Producto[] getProductos() {
        return productos;
    }


    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }



    public Combo[] getCombos() {
        return combos;
    }


    public void setCombos(Combo[] combos) {
        this.combos = combos;
    }



    public Factura getFactura() {
        return factura;
    }


    public void setFactura(Factura factura) {
        this.factura = factura;
    }

}
