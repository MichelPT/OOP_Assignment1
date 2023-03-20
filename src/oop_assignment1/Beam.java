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
public class Beam extends Rectangle implements CalculateSpace{
    private double height;
    
    public Beam(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    
    
    public double getHeight()
    {
       return this.height; 
    }

    @Override
    public double GetVolume() {
        return GetArea()*getHeight();
    }
            
}
