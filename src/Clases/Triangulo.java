/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author Ramir
 */
public class Triangulo extends Forma {
        double base,altura,lado1,lado2;

    public Triangulo(double base, double altura, double lado1, double lado2, Color color) {
        super(color);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double area(){
        return base*altura/2;
    }
    public double périmetro(){
        return base+lado1+lado2;
    }
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public Color getColor() {
        return color;
    }

}
