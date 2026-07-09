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
    
    
public boolean modificarEmpleado(int dni, String nombres, String apellidos, String usuario, String password, String rol){

    for(int i = 0; i < cantEmpleados; i++){

        if(listaEmpleados[i].getDni() == dni){

            listaEmpleados[i].setNombres(nombres);
            listaEmpleados[i].setApellidos(apellidos);
            listaEmpleados[i].setUsuario(usuario);
            listaEmpleados[i].setPassword(password);
            listaEmpleados[i].setRol(rol);

            return true;
        }
    }

    return false;
}
public boolean eliminarEmpleado(int dni) {

    for(int i = 0; i < cantEmpleados; i++){

        if(listaEmpleados[i].getDni() == dni){

            listaEmpleados[i] = listaEmpleados[cantEmpleados - 1];
            listaEmpleados[cantEmpleados - 1] = null;
            cantEmpleados--;

            return true;
        }
    }

    return false;
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
