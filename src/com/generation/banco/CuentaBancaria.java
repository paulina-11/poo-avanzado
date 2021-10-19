package com.generation.banco;

public class CuentaBancaria {
    //Privados
    private String nombre;
    private String clave;
    private float saldo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
//obtengo el valor a través del metodo
    //metodos GET
    //encapsular es poner los metodos en privado y poner gat y set
    //GET devuelve los datos

  /* public String getNombre(){
     return this.nombre;
   }

    public String getClave(){
        return this.clave;
    }
    public float getSaldo(){
        return this.saldo;
    }

    //metodos SET

    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
    public void setSaldo(float saldo){
       if (saldo <0){
           this.saldo = 0;
       } else{
           this.saldo = saldo;
       }

   */


    public void mostrarSaldo() {
        System.out.println(this.saldo);



    }
}
