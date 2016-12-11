/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task2;

import java.util.ArrayList;
import java.util.Collections;
import a6_task2.CompareY.*;

/**
 * This class 
 * @author VinayaSaiD
 */
public class A6_Task2 {

    /**
     * This class creates 100 points, add them to an ArrayList,
     * prints them before sorting and then again after sorting based on X-coordinate and then Y-coordinate
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Point> points = new ArrayList<Point> ();
        // create 100 points randomly
        int i;
        // to print the points before sorting
        for (i=0;i<100;i++)
        {   Point temppoint = new Point(randNumber(),randNumber());
            points.add(temppoint);
        }
        
        System.out.println("List of points before sorting it out");
        for (i=0;i<100;i++)
        {   Point temppoint = points.get(i);
            int x = temppoint.getxCoordinate();
            int y = temppoint.getyCoordinate();
            System.out.println("(" + x + ","+ y + ")");
        }
        System.out.println();
        
        // sorting the points based on the compareTo() method present in Point class.
        Collections.sort(points);
        
        // printing after sorting the points based on X-coordinate and if equal then on Y-Coordinate
        System.out.println("List of points after sorting it out based on X-Coordinate");
        for (i=0;i<100;i++)
        {   Point temppoint = points.get(i);
            int x = temppoint.getxCoordinate();
            int y = temppoint.getyCoordinate();
            System.out.println("(" + x + ","+ y + ")");
        }
        System.out.println();
        
        // sorting the points based on the compare() method in CompareY class
        Collections.sort(points, new CompareY());
        
        // printing after sorting the points based on Y-coordinate and if equal then on X-Coordinate
        System.out.println("List of points after sorting it out based on Y-Coordinate");
        for (i=0;i<100;i++)
        {   Point temppoint = points.get(i);
            int x = temppoint.getxCoordinate();
            int y = temppoint.getyCoordinate();
            System.out.println("(" + x + ","+ y + ")");
        }
    }
    
    // random number between 1 and 500 for x and y coordinates
    public static int randNumber()
    {   int start = 1;
        int end = 500;
        return (int) (start +  Math.round(Math.random() * (end - start)));
    }
    
}