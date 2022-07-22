package com.company;

public class Unidad extends Producto
{
    private double precio;

    public Unidad(String nombre, double precio)
    {
        super(nombre);
        this.precio=precio;
    }
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public String mostrar()
    {
        return "Nombre " + nombre + "precio: " + precio;
    }
}
