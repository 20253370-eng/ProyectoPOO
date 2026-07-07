/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class GestionMenu 
{
    
    private Producto[] listaProductos;
    private int cantProductos;

    private Combo[] listaCombos;
    private int cantCombos;

        public GestionMenu() {

        listaProductos = new Producto[100];
        cantProductos = 0;

        listaCombos = new Combo[50];
        cantCombos = 0;
    }



    public void registrarProducto(Producto prod) {

        if(cantProductos < listaProductos.length){

            listaProductos[cantProductos] = prod;
            cantProductos++;

            System.out.println("Producto registrado correctamente.");

        }else{

            System.out.println("No hay espacio para productos.");
        }
    }



    public void modificarProducto(int codigo) {

        for(int i = 0; i < cantProductos; i++){

            if(listaProductos[i].getCodigo() == codigo){

                System.out.println("Producto encontrado para modificar.");

                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }



    public void eliminarProducto(int codigo) {

        for(int i = 0; i < cantProductos; i++){

            if(listaProductos[i].getCodigo() == codigo){

                listaProductos[i] = listaProductos[cantProductos-1];
                cantProductos--;

                System.out.println("Producto eliminado.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }



    public Producto buscarProducto(int codigo) {

        for(int i = 0; i < cantProductos; i++){

            if(listaProductos[i].getCodigo() == codigo){

                return listaProductos[i];
            }
        }

        return null;
    }





    public void registrarCombo(Combo combo) {

        if(cantCombos < listaCombos.length){

            listaCombos[cantCombos] = combo;
            cantCombos++;

            System.out.println("Combo registrado correctamente.");

        }else{

            System.out.println("No hay espacio para combos.");
        }
    }



    public void modificarCombo(int codigo) {

        for(int i = 0; i < cantCombos; i++){

            if(listaCombos[i].getCodigo() == codigo){

                System.out.println("Combo encontrado para modificar.");

                return;
            }
        }

        System.out.println("Combo no encontrado.");
    }




    public void eliminarCombo(int codigo) {

        for(int i = 0; i < cantCombos; i++){

            if(listaCombos[i].getCodigo() == codigo){

                listaCombos[i] = listaCombos[cantCombos-1];
                cantCombos--;

                System.out.println("Combo eliminado.");
                return;
            }
        }

        System.out.println("Combo no encontrado.");
    }




    public Combo buscarCombo(int codigo) {

        for(int i = 0; i < cantCombos; i++){

            if(listaCombos[i].getCodigo() == codigo){

                return listaCombos[i];
            }
        }

        return null;
    }

}
