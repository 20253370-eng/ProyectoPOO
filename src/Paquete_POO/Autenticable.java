/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public interface Autenticable 
{
    public boolean login(String usuario, String password);

    public void logout();

}
