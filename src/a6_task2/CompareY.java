/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6_task2;

import java.util.Comparator;

/**
 * This class is used to compare 2 points, it implements Comparator and hence overrides compare method from it
 * to check for Y-Coordinate first and then if they are equal check for X-Coordinate
 * @author VinayaSaiD
 */
public class CompareY implements Comparator<Point>{
    
    @Override
    public int compare(Point o1, Point o2) {
        // checking if the points are present
        if ((o1 == null) || (o2 == null))
        {   throw new IllegalArgumentException();
        }
        //Checking for Y-coordiante first
        if (o1.getyCoordinate() > o2.getyCoordinate())
            {   return 1;
            }
        else if (o1.getyCoordinate() < o2.getyCoordinate())
        {   return -1;
        }
        //if Y-coordiante are same then checking for X-coordinate
        else if (o1.getyCoordinate() == o2.getyCoordinate())
        {   if (o1.getxCoordinate() > o2.getxCoordinate())
            {   return 1;
            }
            else if (o1.getxCoordinate() < o2.getxCoordinate())
            {   return -1;
            }
            else if (o1.getxCoordinate() == o2.getxCoordinate())
            {   return 0;
            }
        }
        return 2;
    }
}
