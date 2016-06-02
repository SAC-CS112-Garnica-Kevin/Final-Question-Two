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
public interface Engine 
{
    int SetAirSpeed(int airSpeedMPH);
    int SetAlimeter(int elevationPerMinute);
    void Fly(int totalMinutesInAir);
    int totalDistance();
    int totalAltitude();
    String Name();
}
