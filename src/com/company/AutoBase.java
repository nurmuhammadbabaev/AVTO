package com.company;
import java.util.Scanner;

public class AutoBase {
    private int id;
    private String busName;
    private String driverName;
    private String state;

    public AutoBase() {
    }

    public AutoBase(int id, String busName, String driverName, String state) {
        this.id = id;
        this.busName = busName;
        this.driverName = driverName;
        this.state=state;

    }

    public int getId() {
        return id;
    }

    public String getBusName() {
        return busName;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
@Override
    public String toString() {

        return  id + " |" + busName + "\t|" + driverName +"\t|"+state;
    }

    public String changeDriver() {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.next();

    return   s ;
    }
    public String  startDriving() {

        return   state="Route" ;
    }

    public String  startRepair() {

        return   state="Repair" ;
    }
    public String backToBase(){

   return state="On Base"; }
}
