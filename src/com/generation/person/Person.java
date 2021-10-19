package com.generation.person;

public class Person {

    //atributos
    private String name;
    private int age;
    private String id;


    //GET

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public String getId(){
        return this.id;
    }

    //metodos SET

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setId(String id){
       this.id = id;
        }


    public void mostrarName() {
        System.out.println(this.name);
    }
    public void mostrarAge() {
        System.out.println(this.age);
    }
    public void mostrarId() {
        System.out.println(this.id);
    }
}
