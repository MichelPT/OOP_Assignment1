/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_assignment1;

import oop_assignment1.Interfaces.CalculateFlatField;

/**
 *
 * @author ASUS
 */
public class Circle implements CalculateFlatField {
    final private double pi;
    private double r;
    public Circle(double r)
    {
        this.r = r;
        this.pi = Math.PI;
    }
    
    public double getPI()
    {
        return this.pi;
    }
    
    public double getR()
    {
        return this.r;
    }
    
    @Override
    public double GetRound()
    {
        return 2*pi*r;
    }
    
    @Override
    public double GetArea()
    {
        return getPI()*getR()*getR();
    }
    
}
