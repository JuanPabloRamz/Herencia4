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
public class Circulo extends Forma {
     double radio;

    public Circulo(double radio, Color color) {
        super(color);
        this.radio = radio;
    }
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    public double périmetro(){
        return (Math.PI*2)*radio;
    }

    public double getradio() {
        return radio;
    }

    public Color getColor() {
        return color;
    }
}
