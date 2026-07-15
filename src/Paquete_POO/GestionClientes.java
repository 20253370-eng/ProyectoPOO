/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author Axel-William
 */
public class GestionClientes {

    private Cliente[] listaClientes;
    private int cantClientes;


    public GestionClientes(){

        listaClientes = new Cliente[100];
        cantClientes = 0;
    }



    public void registrarCliente(Cliente cli){

        if(cantClientes < listaClientes.length){

            listaClientes[cantClientes] = cli;
            cantClientes++;

            System.out.println("Cliente registrado correctamente.");

        }else{

            System.out.println("No hay espacio para clientes.");
        }
    }



    public Cliente buscarCliente(int dni){

        for(int i = 0; i < cantClientes; i++){

            if(listaClientes[i].getDni() == dni){

                return listaClientes[i];
            }
        }

        return null;
    }



    public boolean modificarCliente(int dni, String nombres, String apellidos,
                                   String direccion, int telefono){

        for(int i = 0; i < cantClientes; i++){

            if(listaClientes[i].getDni() == dni){

                listaClientes[i].setNombres(nombres);
                listaClientes[i].setApellidos(apellidos);
                listaClientes[i].setDireccion(direccion);
                listaClientes[i].setTelefono(telefono);

                return true;
            }
        }

        return false;
    }



    public boolean eliminarCliente(int dni){

        for(int i = 0; i < cantClientes; i++){

            if(listaClientes[i].getDni() == dni){

                listaClientes[i] = listaClientes[cantClientes-1];
                listaClientes[cantClientes-1] = null;
                cantClientes--;

                return true;
            }
        }

        return false;
    }
    public Cliente[] getListaClientes(){

    return listaClientes;
}


public int getCantClientes(){

    return cantClientes;
}
}
    
