/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_assignment1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class OOP_Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        //MainForm mf = new MainForm();
        boolean loop = true;
        while(loop){
        System.out.println("Menu :\n1. Rectangle and Beam\n2. Circle and Cylinder\n3. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose: ");
        int choose = sc.nextInt();
            switch (choose) {
                case 1 ->                     {
                        System.out.print("Length : ");
                        double length = sc.nextDouble();
                        System.out.print("Width : ");
                        double width = sc.nextDouble();
                        System.out.print("Height : ");
                        double height = sc.nextDouble();
                        Beam beam = new Beam(length,width,height);
                        System.out.print("\n--Result--\n");
                        System.out.println("Rectangle Area : "+ beam.GetArea());
                        System.out.println("Rectangle Round : "+ beam.GetRound());
                        System.out.println("Beam Volume : "+ beam.GetVolume());
                        System.out.println("\n\n\n-------------------------------------\n\n");
                    }
                case 2 ->                     {
                        System.out.print("Radius : ");
                        double rad = sc.nextDouble();
                        System.out.print("Height : ");
                        double height = sc.nextDouble();
                        Cylinder cylinder = new Cylinder(rad, height);
                        System.out.print("\n--Result--\n");
                        System.out.println("Circle Circumference : "+ cylinder.GetRound());
                        System.out.println("Circle Area : "+ cylinder.GetArea());
                        System.out.println("Cylinder Volume : "+ cylinder.GetVolume());
                        System.out.println("\n\n\n-------------------------------------\n\n");
                    }
                case 3 ->{
                    loop=false;
                }
                default -> {
                    System.out.println("Wrong input! Please insert valid input");
                }
            }
    }
    }
}
