/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class GestionEmpleados 
{
    private Empleado[] listaEmpleados;
    private int cantEmpleados;

    public GestionEmpleados() {
        listaEmpleados = new Empleado[100];
        cantEmpleados = 0;
    }
    
    public void registrarEmpleado(Empleado emp) {

        if(cantEmpleados < listaEmpleados.length){

            listaEmpleados[cantEmpleados] = emp;
            cantEmpleados++;

            System.out.println("Empleado registrado correctamente.");

        }else{

            System.out.println("No hay espacio disponible.");
        }
    }
    
    
     public void modificarEmpleado(int dni) {

        for(int i = 0; i < cantEmpleados; i++){

            if(listaEmpleados[i].getDni() == dni){

                System.out.println("Empleado encontrado para modificar.");

                return;
            }
        }

        System.out.println("Empleado no encontrado.");
    }
     
     public void eliminarEmpleado(int dni) {

        for(int i = 0; i < cantEmpleados; i++){

            if(listaEmpleados[i].getDni() == dni){

                listaEmpleados[i] = listaEmpleados[cantEmpleados-1];
                cantEmpleados--;

                System.out.println("Empleado eliminado.");
                return;
            }
        }

        System.out.println("Empleado no encontrado.");
    }



    public Empleado buscarEmpleado(int dni) {

        for(int i = 0; i < cantEmpleados; i++){

            if(listaEmpleados[i].getDni() == dni){

                return listaEmpleados[i];
            }
        }

        return null;
    }



    public Empleado validarLogin(String usuario, String password){

        for(int i = 0; i < cantEmpleados; i++){

            if(listaEmpleados[i].login(usuario, password)){

                return listaEmpleados[i];
            }
        }

        return null;
    }
    
}
