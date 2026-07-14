/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;


/**
 *
 * @author Axel-William
 */
public class Combo
{
    private int codigo;
    private String nombre;
    private Producto[] productos;
    private float precioPromocional;

    
    public Combo(){
    }

    public Combo(int codigo, String nombre, Producto[] productos, float precioPromocional) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.productos = productos;
        this.precioPromocional = precioPromocional;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public float getPrecioPromocional() {
        return precioPromocional;
    }

    public void setPrecioPromocional(float precioPromocional) {
        this.precioPromocional = precioPromocional;
    }
    
    
}
