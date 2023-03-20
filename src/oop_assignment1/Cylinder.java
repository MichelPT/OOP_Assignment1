/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_assignment1;

import oop_assignment1.Interfaces.CalculateSpace;

/**
 *
 * @author ASUS
 */
public class Cylinder extends Circle implements CalculateSpace{
    
    private double height;
    
    public Cylinder(double r, double height) {
        super(r);
        this.height = height;
    }
    
    public double getHeight()
    {
        return height;
    }

    @Override
    public double GetVolume() {
        return GetArea()*height;
    }
    
}
