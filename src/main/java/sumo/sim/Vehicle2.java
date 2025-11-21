package sumo.sim;

import de.tudresden.sumo.cmd.Simulation;
import de.tudresden.sumo.cmd.Vehicle;
import it.polito.appeal.traci.SumoTraciConnection;
//import java.awt.Color;


public class Vehicle2 {
    private String id;
    private String type;
    private SumoTraciConnection con;
    private boolean marked;

    public Vehicle2(String id , SumoTraciConnection con) {
        this.id = id;
        this.con = con;
    }

    public double getSpeed() {
        try {
            return (double)con.do_job_get(Vehicle.getSpeed(id)); // vehicle.getspeed returns SumoCommand
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setSpeed() {
        try {
            con.do_job_set(Vehicle.setSpeed(id, 10));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getID() {
        return id;
    }

    // boolean exists(?)
    // float getPosition
    // float getAngle
}
