package activity5;

public class VehicleFrame implements Chassis {
  String vehicleFrameType;

  public VehicleFrame() {
    vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public Chassis getChassisType() {
    return this;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString() {
    return "Chassis         :  " + chassis +"\n"+
           "VehicleFrame    :  " + vehicleFrameType;


  }
}
