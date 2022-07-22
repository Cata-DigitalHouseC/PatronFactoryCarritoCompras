package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito()
    {
        productos=new ArrayList<>();
    }

    public void agregarProductos(Producto producto){
        productos.add(producto);
    }

    public double precioTotal()
    {
        double total=0;
        for (Producto p:productos)
            total+=p.getPrecio();
        return total;
    }

    public String mostrar()
    {
        String nombreProductos="";
        for (Producto p:productos)
            nombreProductos+="\nProducto: "+p.getNombre()+" Precio "+p.getPrecio();
        return nombreProductos;
    }

}
