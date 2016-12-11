/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task2;

/**
 * This class is used to define a point, it implements Comparable, to compare two points based on their X-coordinate first 
 * and if equal then on their Y-Coordinate, it also has the getter and setter methods for the private variables and a constructor
 * @author VinayaSaiD
 */
public class Point implements Comparable{
    
    private int yCoordinate;
    private int xCoordinate;

    //default constructor
    public Point()
    {
    }
    
    public Point(int yCoordinate, int xCoordinate) {
        this.yCoordinate = yCoordinate;
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }
    
    @Override
    public int compareTo(Object point) 
    {   // checking if the point is present
        if (point == null)
        {   throw new IllegalArgumentException();
        }
        
        // cheking if the Object is a Point only
        if (point instanceof Point)
        {   // Down casting the Object reference into a Point reference
            Point tempPoint = (Point) point;
            //Checking for X-coordiante first
            if (xCoordinate > tempPoint.xCoordinate)
            {   return 1;
            }
            else if (xCoordinate < tempPoint.xCoordinate)
            {   return -1;
            }
            //if X-coordiante are same then checking for Y-coordinate
            else if (xCoordinate == tempPoint.xCoordinate)
            {   if (yCoordinate > tempPoint.yCoordinate)
                {   return 1;
                }
                else if (yCoordinate < tempPoint.yCoordinate)
                {   return -1;
                }
                else if (yCoordinate == tempPoint.yCoordinate)
                {   return 0;
                }
            }
        }
        else
        {   
            System.out.println("Cannot compare non Point object with a Point Object");
        }
        return 1;
    }
    
    @Override
    public boolean equals(Object point) {
    if (point instanceof Point) {
        // point is a Point; cast and compare it
        Point other = (Point) point;
        return xCoordinate == other.xCoordinate && yCoordinate == other.yCoordinate;
    } else {
        // point is not a Point; cannot be equal
        return false;
    }
}   
    
    @Override
    public String toString() {
        return "Point= ( " + xCoordinate + "," + yCoordinate  +" )";
    }
    
}