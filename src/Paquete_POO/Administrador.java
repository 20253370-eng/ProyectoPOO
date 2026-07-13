/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author chung
 */
public class Administrador extends Empleado implements Reporte
{

    public Administrador() {
    }

    public Administrador(String usuario, String password, String rol, String nombres, String apellidos, int dni) {
        super(usuario, password, rol, nombres, apellidos, dni);
    }
    
        @Override
    public void generarReporte() {
        System.out.println("Generando reporte...");
    }


    public void registrarEmpleado() {
        System.out.println("Registrando empleado...");
    }


    public void modificarEmpleado() {
        System.out.println("Modificando empleado...");
    }


    public void eliminarEmpleado() {
        System.out.println("Eliminando empleado...");
    }


    public void registrarProducto() {
        System.out.println("Registrando producto...");
    }


    public void modificarProducto() {
        System.out.println("Modificando producto...");
    }


    public void eliminarProducto() {
        System.out.println("Eliminando producto...");
    }


    public void registrarCombo() {
        System.out.println("Registrando combo...");
    }


    public void modificarCombo() {
        System.out.println("Modificando combo...");
    }


    public void eliminarCombo() {
        System.out.println("Eliminando combo...");
    }
}
