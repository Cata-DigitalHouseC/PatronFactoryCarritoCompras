package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Producto p1=new Unidad("Hamburguesa",20000);
        Producto p2=new Unidad("Papas fritas",7000);
        Producto c1=new Combo("Cajita Feliz",20);
        ((Combo)c1).agregarProducto(p1);
        ((Combo)c1).agregarProducto(p2);
        Carrito carrito = new Carrito();
        carrito.agregarProductos(p1);
        carrito.agregarProductos(p2);
        carrito.agregarProductos(c1);
        System.out.println(carrito.mostrar());
    }
}
