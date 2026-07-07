/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class GestionPedidos 
{
    private Pedido[] listaPedidos;
    private int cantPedidos;

    private float recargos;



    public GestionPedidos() {

        listaPedidos = new Pedido[100];
        cantPedidos = 0;
        recargos = 0;
    }



    public void crearPedido(Pedido ped) {

        if(cantPedidos < listaPedidos.length){

            listaPedidos[cantPedidos] = ped;
            cantPedidos++;

            System.out.println("Pedido creado correctamente.");

        }else{

            System.out.println("No hay espacio para pedidos.");
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

            Factura factura = new Factura();

            factura.setSubtotal(0);

            factura.calcularIGV();

            ped.setFactura(factura);

            return factura;
        }


        return null;
    }

}
