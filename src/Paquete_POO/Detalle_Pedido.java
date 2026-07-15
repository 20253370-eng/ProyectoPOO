/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author Axel-William
 */
public class Detalle_Pedido {
    private Producto producto;
    private Combo combo;
    private int cantidad;


    public Detalle_Pedido(){
    }


    public Detalle_Pedido(Producto producto, Combo combo, int cantidad){

        this.producto = producto;
        this.combo = combo;
        this.cantidad = cantidad;
    }


    public Producto getProducto(){
        return producto;
    }


    public Combo getCombo(){
        return combo;
    }


    public int getCantidad(){
        return cantidad;
    }


    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
