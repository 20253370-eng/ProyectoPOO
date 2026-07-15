/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author Axel-William
 */
public class Factura 
{
    
    private int numero;
    private float subtotal;
    private float igv;
    private float total;  
    
    public Factura(){
    }

    public Factura(int numero, float subtotal, float igv, float total) {
        this.numero = numero;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void calcularIGV() {
        igv = subtotal * 0.18f;
        total = subtotal + igv;
    }
}
