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
public class Rectangle implements CalculateFlatField {
    private double length;
    private double width;
    
    public Rectangle(double length, double width)
    {
        this.length= length;
        this.width = width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    @Override
    public double GetRound(){
        return 2*(width+length);
    }
    
    @Override
    public double GetArea(){
        return width*length;
    }
}
