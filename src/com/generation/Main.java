package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;
import com.generation.person.Person;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria();
        Person person = new Person();
        person.setName("Paulina Avila");
        person.setAge(28);
        person.setId("Paulina");

        System.out.println(person.getName());
        person.mostrarName();
        System.out.println(person.getAge());
        person.mostrarAge();
        System.out.println(person.getId());
        person.mostrarId();



   /*     CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.setNombre("Paulina Avila");
            cuenta.setClave("ABC-1234");
            cuenta.setSaldo(10000000);

        System.out.println(cuenta.getNombre());
        cuenta.mostrarSaldo();


*/

	// los paquetes son como carpetas por proyecto
        //si tengo dos clases iguales podrías crear dos paquetes para que no choquen esas clases
    //MODIFICADORES DE ACCESO

   /*  Animal animal = new Animal();
     animal.nombre="Iguana";*/

    /*Persona persona = new Persona();
    persona.nombre = "Paulina";
    persona.edad = 28;*/



    }
}
