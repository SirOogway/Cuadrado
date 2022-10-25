package com.innova.cuadrado;

class Cuadrado {
    //Atributos
    private double lado;

    //Constructores
    public Cuadrado() {
        this.lado = 0.1;
    }//fin const

    public Cuadrado(double lado) {
        this.setLado(lado);
    }//fin const

    public boolean setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
            return true;
        }
        return false;
    }//fin set metod

    public double getLado() {
        return this.lado;
    }//fin get metod

    public double area() {
        return this.lado * this.lado;
    }//fin area metod

    public double perimetro() {
        return this.lado * 4;
    }//fin perimetro metod
}
