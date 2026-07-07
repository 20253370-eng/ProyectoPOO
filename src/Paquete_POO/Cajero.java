/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class Cajero extends Empleado
{

    public Cajero() {
    }

    public Cajero(String usuario, String password, String rol, String nombres, String apellidos, int dni) {
        super(usuario, password, rol, nombres, apellidos, dni);
    }

    public void registrarCliente() {
        System.out.println("Registrando cliente...");
    }


    public void modificarCliente() {
        System.out.println("Modificando cliente...");
    }


    public void eliminarCliente() {
        System.out.println("Eliminando cliente...");
    }


    public void crearPedido() {
        System.out.println("Creando pedido...");
    }


    public void registrarEntrega() {
        System.out.println("Registrando entrega...");
    }

    
}
