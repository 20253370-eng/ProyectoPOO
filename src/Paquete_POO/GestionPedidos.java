/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author Axel-William
 */
public class GestionPedidos 
{
    private Pedido[] listaPedidos;
    private int ultimoNumero;
    private int cantPedidos;

    private float recargos;



    public GestionPedidos() {

        listaPedidos = new Pedido[100];
        cantPedidos = 0;
        recargos = 0;
        ultimoNumero = 0;
    }

    public int generarNumeroPedido(){

        ultimoNumero++;

        return ultimoNumero;
    }

public boolean crearPedido(Pedido ped){

    if(cantPedidos < listaPedidos.length){

        listaPedidos[cantPedidos] = ped;
        cantPedidos++;

        return true;

    }else{

        return false;
    }
}




    public Pedido buscarPedido(int numero){

        for(int i = 0; i < cantPedidos; i++){

            if(listaPedidos[i].getNumero() == numero){

                return listaPedidos[i];
            }
        }

        return null;
    }




    public void asignarRepartidor(int numero, Repartidor rep){

        Pedido ped = buscarPedido(numero);

        if(ped != null){

            ped.setRepartidor(rep);
            rep.setDisponible(false);

            System.out.println("Repartidor asignado.");

        }else{

            System.out.println("Pedido no encontrado.");
        }
    }





    public void actualizarEstado(int numero, String estado){

        Pedido ped = buscarPedido(numero);

        if(ped != null){

            ped.setEstado(estado);

            System.out.println("Estado actualizado.");

        }else{

            System.out.println("Pedido no encontrado.");
        }
    }

    public void agregarRecargoRuta(int numero, float monto){

        Pedido ped = buscarPedido(numero);

        if(ped != null){

            recargos += monto;

            System.out.println("Recargo agregado.");

        }else{

            System.out.println("Pedido no encontrado.");
        }
    }





public Factura generarComprobante(int numero){

    Pedido ped = buscarPedido(numero);

    if(ped != null){

        float subtotal = 0;


        if(ped.getDetalles() != null){

            for(Detalle_Pedido d : ped.getDetalles()){

                if(d != null){


                    if(d.getProducto() != null){

                        subtotal += d.getProducto().getPrecioBase()
                                * d.getCantidad();

                    }


                    if(d.getCombo() != null){

                        subtotal += d.getCombo().getPrecioPromocional()
                                * d.getCantidad();

                    }

                }

            }

        }


        subtotal += recargos;


        Factura factura = new Factura();

        factura.setNumero(numero);
        factura.setSubtotal(subtotal);

        factura.calcularIGV();


        ped.setFactura(factura);


        return factura;

    }


    return null;
}

public Pedido[] getListaPedidos(){

    return listaPedidos;
}


public int getCantPedidos(){

    return cantPedidos;
}

}
