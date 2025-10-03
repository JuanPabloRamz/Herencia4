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
public class TrianguloEquilatero extends Triangulo{
        public TrianguloEquilatero(double base, double altura, double lado1, double lado2, Color color) {
        super(base, altura, lado1, lado2, color);
    }

    @Override
    public double périmetro() {
        return this.lado1*3; 
    }

    @Override
    public double area() {
        return (Math.pow(this.lado1, 2)*Math.sqrt(3))/4; 
    }

}
