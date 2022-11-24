import java.util.ArrayList;

public class PhysicsQuestion7{
  public static double ques7(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    boolean direction = true;
    /*
    T corresponds with left to right;
    F corresponds with right to left;
    */
    double compression = initialCompression;
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    ArrayList<Double> distanceTravelPerCycle = new ArrayList<Double> ();
    ArrayList<Double> compressions = new ArrayList<Double> ();
    ArrayList<Double> kes = new ArrayList<Double> ();
    compressions.add(compression);
    kes.add(ke);
    distanceTravelPerCycle.add(compression + distance - (2* springLength));
    while (ke > 0 && compression > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      compressions.add(compression);
      distanceTravelPerCycle.add(compression);
      if (direction) {
        direction = false;
      }
      else {
        direction = true;
      }
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
      kes.add(ke);
      distanceTravelPerCycle.add(compression + distance - (2* springLength));
    }
    System.out.println("Compression Array: "+compressions);
    System.out.println("Kinetic Energy at contact with Spring Array: "+kes);
    System.out.println("Is it going left to right: "+direction);
    double deltaD = ((0.5 * springConstant * compressions.get(compressions.size()-1) * compressions.get(compressions.size()-1))-(coefficientOfFriction * mass * gravity * compressions.get(compressions.size()-1))/(springConstant * mass * gravity));
    distanceTravelPerCycle.set(distanceTravelPerCycle.size()-1,deltaD+ springLength);
    System.out.println("Distance travel per item (either spring compress or spring expand) Array: "+distanceTravelPerCycle);
    /*
    Spring expand includes travel of block beyond spring length toward the spring on the other side.
    */
    if (direction) {
      return deltaD + springLength;
    }
    else {
      return (distance - (deltaD + springLength));
    }
  }

  public static void main(String[] args) {
    System.out.println(ques7(0.05,120.0,1.0,0.25,0.3,0.2));
  }
}
