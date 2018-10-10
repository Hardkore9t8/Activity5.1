package activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private  String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /** public default constructor with no formal parameters and initialize all instance variables with generic
  literal values*/
  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "85 AKI";
    this.engineCylinders = 0;
    this.driveTrain = "2wD: Two-Wheel Drives";
  }
  /**overloaded constructor with values for all of the variables defined above*/
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, int engineCylinders, String engineType,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public String toString() {
    return
        "Engine Manufacturer   :" + engineManufacturer + "\n" +
        "Engine Manufactured   :" + engineManufacturedDate + "\n"+
        "Engine Make           :" + engineMake + "\n" +
        "Engine Model          :" + engineModel + "\n"+
        "Engine Type           :" + engineType + "\n"+
        "Engine Cylinders      :" + engineCylinders +"\n"+
        "Drive  Train          :" + driveTrain ;
  }
}
