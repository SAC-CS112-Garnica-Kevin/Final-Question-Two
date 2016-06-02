/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Final {

    
    public static void main(String[] args) 
    {
        int speedOfFlight = 0; 
        int heightPerMinute = 0;
        int totalDistance; 
        int totalheight; 
        
        Scanner scan = new Scanner(System.in); 
        
        Engine[]  About = new Engine [5];
        
        Jetplane Jet = new Jetplane();
        Bird Birdy = new Bird();
        Airplane Plane = new Airplane();
        Superman Man = new Superman();
        Missile Rocket = new Missile();
        
        About [0] = Birdy;
        About [1] = Plane;
        About [2] = Man;
        About [3] = Rocket; 
        About [4] = Jet; 
        
        for (int index = 0; index <=5; index++)
            {
                for (int minutesInFlight = 0; minutesInFlight < 30; minutesInFlight += 5)
                {
                    if (index == 0)
                    {
                        speedOfFlight = 10;
                        heightPerMinute = 3;
                    }
                    else if (index == 1)
                    {
                        speedOfFlight = 450;
                        heightPerMinute = 50;
                    }
                    else if (index == 2)
                    {
                        speedOfFlight = 3500;
                        heightPerMinute = 500;
                    }
                    else if (index == 3)
                    {
                        speedOfFlight = 2500;
                        heightPerMinute = 800;
                    }
                    else if (index == 4)
                    {
                        speedOfFlight = 1000;
                        heightPerMinute = 120;
                    }
                    About[index].Fly(minutesInFlight);
                    About[index].SetAirSpeed(speedOfFlight);
                    About[index].SetAlimeter(heightPerMinute); 
                    totalDistance = About[index].totalDistance();
                    totalheight =About[index].totalAltitude(); 
                    
                    System.out.println("In " + minutesInFlight + " minutes," + About[index].Name() + "has traveled " + totalDistance 
                                                +  " Miles and reached a height of " + totalheight + " ft.");
  
                    System.out.println(" ");
                }

            }
    }
    
}
