package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.setNombre("Caballo");
        animal1.setGenero("M");


        Animal animal2 = new Animal();
        animal2.setNombre("Cebra");
        animal2.setGenero("F");


        animal2.encontrarPareja(animal1); //Un animal consigue pareja


        Familia familia = new Familia(animal2,animal1);


        familia.tenerHijo("Cebrallo");


        familia.imprimirFamilia();




    }
}