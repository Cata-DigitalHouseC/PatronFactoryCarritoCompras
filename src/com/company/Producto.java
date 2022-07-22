package com.company;

public abstract class Producto
{
    protected String nombre;

    public Producto(String nombre) {this.nombre=nombre;}
    public abstract double getPrecio();
    public abstract String getNombre();
    public abstract  String mostrar();
}
