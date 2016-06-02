/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Kevin
 */
public class Airplane implements Engine
{
    
    private int totalSpeed;
    private int totalAlimeter;
    private int totalMinutesInAir; 
    private int totalDistance; 
    private int totalAltitude;
    
    @Override
    public int totalDistance()
    {
        totalDistance += totalSpeed;
        return totalDistance; 
    }
    
    @Override 
    public int totalAltitude()
    {
        totalAltitude += totalAlimeter;
        return totalAltitude; 
    }
            
    @Override
    public int SetAirSpeed(int airSpeedMPH)
    {
        
        totalSpeed = (airSpeedMPH/60) * (totalMinutesInAir);
        return totalSpeed;
    }
    
    @Override 
    public int SetAlimeter(int elevationPerMinute)
    {
        totalAlimeter = elevationPerMinute * totalMinutesInAir;
        return totalAlimeter;
    }
    
    @Override 
    public void Fly(int totalMinutesInAir)
    {
        this. totalMinutesInAir = totalMinutesInAir; 
        
    }
    
    @Override
    public String Name()
    {
        String name = " the Plane ";
        return name; 
    }
}
