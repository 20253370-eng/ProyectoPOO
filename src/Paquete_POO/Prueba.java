/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_POO;

/**
 *
 * @author crisv
 */
public class Prueba {
     public static void main(String[] args) {


        // ==========================
        // CREAR EMPLEADOS
        // ==========================

        Administrador admin = new Administrador(
                "admin",
                "1234",
                "Administrador",
                "Carlos",
                "Perez",
                111111
        );


        Cajero cajero = new Cajero(
                "cajero",
                "1234",
                "Cajero",
                "Luis",
                "Gomez",
                222222
        );


        Repartidor repartidor = new Repartidor(
                "repartidor",
                "1234",
                "Repartidor",
                "Pedro",
                "Diaz",
                333333,
                true
        );



        System.out.println("Empleados creados.");



        // ==========================
        // PROBAR LOGIN
        // ==========================

        if(cajero.login("cajero", "1234")){

            System.out.println("Login correcto");

        }else{

            System.out.println("Login incorrecto");
        }




        // ==========================
        // CLIENTE
        // ==========================

        Cliente cliente = new Cliente(
                "Av. Lima 123",
                999999999,
                "Juan",
                "Torres",
                444444
        );


        System.out.println("Cliente creado: "
                + cliente.getNombres());




        // ==========================
        // PRODUCTOS
        // ==========================

        Producto hamburguesa = new Producto(
                1,
                "Hamburguesa Clasica",
                "Hamburguesas",
                15.5f
        );


        Producto gaseosa = new Producto(
                2,
                "Inka Cola",
                "Bebidas",
                5f
        );



        Producto[] productosCombo = {
            hamburguesa,
            gaseosa
        };



        Combo combo = new Combo(
                1,
                "Combo Duo",
                productosCombo,
                18f
        );



        System.out.println("Productos creados.");




        // ==========================
        // PEDIDO
        // ==========================

Detalle_Pedido detalle1 = new Detalle_Pedido(
        hamburguesa,
        null,
        2
);


Detalle_Pedido detalle2 = new Detalle_Pedido(
        null,
        combo,
        1
);



Detalle_Pedido[] detallesPedido = {
    detalle1,
    detalle2
};



Pedido pedido = new Pedido(
        1,
        "Delivery",
        "En Cocina",
        cliente,
        null,
        detallesPedido,
        null
);




        // ==========================
        // GESTION PEDIDOS
        // ==========================


        GestionPedidos gestionPedidos = new GestionPedidos();



        gestionPedidos.crearPedido(pedido);



        gestionPedidos.asignarRepartidor(
                1,
                repartidor
        );



        gestionPedidos.actualizarEstado(
                1,
                "Enviado"
        );



        Factura factura = gestionPedidos.generarComprobante(1);



        System.out.println("Factura generada.");
        System.out.println("Subtotal: " + factura.getSubtotal());
        System.out.println("IGV: " + factura.getIgv());


        System.out.println("Total: "
                + factura.getTotal());

    }
}
