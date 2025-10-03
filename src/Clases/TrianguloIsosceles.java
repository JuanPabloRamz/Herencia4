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
public class TrianguloIsosceles extends Triangulo {
    public TrianguloIsosceles(double base, double altura, double ladosiguales, Color color) {
        super(base, altura, ladosiguales, ladosiguales, color);
    }

    @Override
    public double périmetro() {
        return this.lado1*2+base;
    }

    @Override
    public double area() {
        return base*altura/2;
    }
}
