package activity5;

import activity5.Chassis;
import activity5.Engine;
import activity5.ExteriorFeature;
import activity5.Feature;
import activity5.InteriorFeature;
import activity5.Vehicle;
import java.util.Date;

public class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car() {
    super();
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

  ExteriorFeature getExteriorFeatures(){
    ExteriorFeature exteriorFeature = new ExteriorFeature();
    return exteriorFeature;}

  InteriorFeature getInteriorFeatures(){
    InteriorFeature interiorFeature = new InteriorFeature();
    return interiorFeature;}
}
