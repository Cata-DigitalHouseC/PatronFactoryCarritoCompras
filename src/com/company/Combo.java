package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto
{
    private double descuento;
    private List<Producto> productos;

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento=descuento;
        productos=new ArrayList<>();
    }

    @Override
    public double getPrecio() {
        double total=0;
        for(Producto p:productos)
            total+=p.getPrecio();
        total=total-total/100*descuento;
        return total;
    }

    public void agregarProducto(Producto producto)
    {
        productos.add(producto);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String mostrar() {
        /*String aux="";
        for(Producto p:productos)
            aux+=p.mostrar()+"\n";
        aux+="Precio total "+getPrecio();
        return aux;*/
        return "Nombre: "+getNombre()+" Precio: "+getPrecio();
    }
}
