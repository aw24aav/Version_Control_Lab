/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.versioncontrol;

/**
 *
 * @author AWhit
 */
public class Complex {
    static double real;
    static double imaginary;
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;  
    }
    
    public Complex(double real) {
        this.real = real; 
    }
    
    public static double getRealPart() {
        return real;
    }
    
    public static double getImaginaryPart() {
        return imaginary;
    }
}
