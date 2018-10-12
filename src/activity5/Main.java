package activity5;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        //• Write a static main method that creates two objects, one with the default constructor and the other with the
//  constructor with parameters. Give sample data for the parameters.
        VehicleChassis myChassis = new VehicleChassis();
        VehicleChassis yourChassis = new VehicleChassis("cn");
        VehicleFrame myFrame = new VehicleFrame();
        VehicleFrame myFrame1 = new VehicleFrame("Ladder Frame");
        ManufacturedEngine myEngine = new ManufacturedEngine();
        ManufacturedEngine myEngine1 = new ManufacturedEngine("Honda", new Date(), "H-Series","H23A1",4,
                "88 AKI","2WD: Two-Wheel");
        InteriorFeature myInterior = new InteriorFeature();
        InteriorFeature myInterior1 = new InteriorFeature("Climate Control");
        ExteriorFeature myExterior = new ExteriorFeature();
        ExteriorFeature myExterior1 = new ExteriorFeature("Fog Lamps");
        Vehicle myVehicle = new Vehicle();
     // System.out.println(myChassis.toString());
      //System.out.println(yourChassis.toString());
     // System.out.println(myFrame.toString());
      System.out.println(myFrame1.getChassisType());
        System.out.println();
      System.out.println(myEngine);
        System.out.println();
        System.out.println(myEngine1.toString());
        System.out.println();
        System.out.println(myInterior.toString());
        System.out.println(myInterior1.toString());
        System.out.println();
        System.out.println(myExterior.toString());
        System.out.println(myExterior1.toString());
        System.out.println();
        System.out.println(myVehicle.toString());

    }
  public static void testVehicle() {
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"), "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", 4, "88 AKI", "2WD: Two-Wheel Drive"));
    System.out.println(v2);
  }
}
