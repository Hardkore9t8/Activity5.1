package activity5;



public class VehicleChassis implements Chassis  {

  /** Create a String named chassisName instance variable use the interface constant as the default String value*/
  public String chassisName;

  /**A public default constructor*/
  public VehicleChassis(){
    this.chassisName = chassis;
  }
  /** overloaded constructor with the following value: A String with a parameter value of chassisName
  Set the chassisName instance variable in both,*/

  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

 /** A public method named getChassisType that doesn't have a formal parameter and that returns an instance
 of the interface Chassis (hint that would be a copy of this class).*/

  public Chassis getChassisType(){
    return this;
  }

  /**• A public method setChassisType that takes a String parameter vehicleChassis and that returns a void. It
   should set the instance variable chassisName*/
  public void setChassisType(String vehicleChassis){
    chassisName = vehicleChassis;
  }
  /** A public toString method that returns the following:
  Chassis Name : Chassis*/
  public String toString(){
    return "Chassis Name : "+ chassisName;
  }

}
