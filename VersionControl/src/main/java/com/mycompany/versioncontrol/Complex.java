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
    double real;
    double imaginary;
    
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;  
    }
    
    public Complex(double real) {
        this.real = real; 
    }
    
    public double getRealPart() {
        return real;
    }
    
    public double getImaginaryPart() {
        return imaginary;
    }
    
    public Complex add(Complex other) {
        double new_real = real += other.real;
        double new_imaginary = imaginary += other.imaginary;
        Complex new_complex = new Complex(new_real, new_imaginary);
        return new_complex;
    }
}
