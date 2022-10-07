package com.example.listadecompras.modelo;

import java.util.ArrayList;

public class ListaDeCompras {
    //Patron de diseño singleton: solo un objeto listadecompras en memoria
    private static ListaDeCompras instancia = new ListaDeCompras();

    private ArrayList<Producto> listaDeCompras;


    //Constructor singleton
    private ListaDeCompras(){
        listaDeCompras = new ArrayList<>();
       // agregarProducto(new Producto("Pan", 2, "Kilos"));
    }

    //metodo para devolver la instancia
    public static ListaDeCompras getInstancia(){
        return instancia;
    }

    public void agregarProducto(Producto producto){        listaDeCompras.add(producto);
    }
    public Producto getProducto(int id){
        return listaDeCompras.get(id);
    }
    public ArrayList<Producto> getListaDeCompras(){
        return listaDeCompras;
    }

    public void eliminarComprados(){
        for(int i = 0; i < listaDeCompras.size(); i++){
            if(listaDeCompras.get(i).isEstado()==Producto.COMPRADO){
                listaDeCompras.remove(i);
                i--;
            }
        }
    }

}