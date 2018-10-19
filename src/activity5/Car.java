package activity5;

import activity5.Chassis;
import activity5.Engine;
import activity5.ExteriorFeature;
import activity5.Feature;
import activity5.InteriorFeature;
import activity5.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
    Feature[] feat = {new InteriorFeature("no interior features"), new ExteriorFeature("no exterior features")};
    this.feature = feat;
  }

  public Car(Feature[] feature, int carAxle) {
    this.feature = feature;
    this.carAxle = carAxle; //
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, Engine vehicleEngine, Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;

  }

  public String getExteriorFeatures(){
    String output = "";
    ArrayList<Feature> exFeature = new ArrayList<>();
    for(Feature F: feature)
      if (F instanceof ExteriorFeature){
        exFeature.add(F);
      }
    for (int i = 0; i< exFeature.size(); i++)
    output += exFeature.get(i).getFeature();

    return output;}

    public String  getInteriorFeatures(){
    String output = "";
    ArrayList<Feature> inFeature = new ArrayList<>();
    for(Feature F: feature)
      if (F instanceof InteriorFeature){
        inFeature.add(F);
      }
    for (int i = 0; i< inFeature.size(); i++)
      output += inFeature.get(i).getFeature();

    return output;}

  @Override
  public String toString() {
    return super.toString() + "\n" +
        "Car{" +
        "feature=" + getExteriorFeatures() + getInteriorFeatures() +
        ", carAxle=" + carAxle;
  }


  public static void main(String[] args){
    Car car1 = new Car();

    System.out.println(car1);
  }
}
