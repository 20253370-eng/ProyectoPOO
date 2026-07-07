/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class Repartidor extends Empleado
{
    private boolean disponible;

    public Repartidor() {
    }

public Repartidor(String usuario, String password, String rol,
                  String nombres, String apellidos, int dni,
                  boolean disponible) {

    super(usuario, password, rol, nombres, apellidos, dni);
    this.disponible = disponible;
}

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void reportarIncidente() {
        System.out.println("Reportando incidente de ruta...");
    }


    public void registrarEntrega() {
        disponible = true;
        System.out.println("Entrega registrada.");
    }

}
