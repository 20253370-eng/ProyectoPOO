/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author Axel-William
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



public boolean modificarProducto(int codigo, String nombre, String categoria, float precioBase){

    for(int i = 0; i < cantProductos; i++){

        if(listaProductos[i].getCodigo() == codigo){

            listaProductos[i].setNombre(nombre);
            listaProductos[i].setCategoria(categoria);
            listaProductos[i].setPrecioBase(precioBase);

            return true;
        }
    }

    return false;
}



public boolean eliminarProducto(int codigo){

    for(int i = 0; i < cantProductos; i++){

        if(listaProductos   [i].getCodigo() == codigo){

            listaProductos[i] = listaProductos[cantProductos - 1];
            listaProductos[cantProductos - 1] = null;
            cantProductos--;

            return true;
        }
    }

    return false;
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



public boolean modificarCombo(int codigo, String nombre, Producto[] productos, float precioPromocional){

    for(int i = 0; i < cantCombos; i++){

        if(listaCombos[i].getCodigo() == codigo){

            listaCombos[i].setNombre(nombre);
            listaCombos[i].setProductos(productos);
            listaCombos[i].setPrecioPromocional(precioPromocional);

            return true;
        }
    }

    return false;
}




public boolean eliminarCombo(int codigo){

    for(int i = 0; i < cantCombos; i++){

        if(listaCombos[i].getCodigo() == codigo){

            listaCombos[i] = listaCombos[cantCombos - 1];
            listaCombos[cantCombos - 1] = null;
            cantCombos--;

            return true;
        }
    }

    return false;
}




    public Combo buscarCombo(int codigo) {

        for(int i = 0; i < cantCombos; i++){

            if(listaCombos[i].getCodigo() == codigo){

                return listaCombos[i];
            }
        }

        return null;
    }
    
public Producto[] getListaProductos(){

    return listaProductos;
}


public int getCantProductos(){

    return cantProductos;
}



public Combo[] getListaCombos(){

    return listaCombos;
}


public int getCantCombos(){

    return cantCombos;
}

}
