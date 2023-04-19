package com.hedima.presentacion;

import com.hedima.modelo.Empleado;
import com.hedima.modelo.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empleado e1= new Gerente("Juan Lopez", 5_000, LocalDate.of(1972, 2, 10), "Ventas");
        System.out.println("Desde la variable de referencia de emplado solo se ve los atributos de empleado" + e1.getfNacimiento());
        Gerente g1= (Gerente) e1;
        System.out.println("Desde la variable de referencia de Gerente se ven todos los datos" +g1.getDepartamento());
        System.out.println(e1.mostrarInfo());
        System.out.println(g1.mostrarInfo());



    }
}