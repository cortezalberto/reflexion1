package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArticuloCreateDto  {
    private String denominacion;
    protected Double precioVenta;
    protected String descripcion;
    protected boolean habilitado = true;
    protected String codigo;

// este es un método propio de la clase
    private void saludo() {
        System.out.println("Hola soy Coca cola " + denominacion);
    }



}
