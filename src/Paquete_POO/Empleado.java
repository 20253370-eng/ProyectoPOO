/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class Empleado extends Persona implements Autenticable
{
    private String usuario, password, rol;

    public Empleado() {
    }


    public Empleado(String usuario, String password, String rol, String nombres, String apellidos, int dni) {
        super(nombres, apellidos, dni);
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
@Override
public boolean login(String usuario, String password) {
    return this.usuario.equals(usuario)
            && this.password.equals(password);
}

@Override
public void logout() {
    System.out.println("Sesión cerrada.");
}
}
