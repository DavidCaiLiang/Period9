import java.util.ArrayList;

public class review4v3{
  public static double finalPositionRelativeToBaseOfLeftSpring(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    boolean direction = true;
    double ke = (0.5* springConstant * initialCompression * initialCompression) - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    while (ke > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      direction = (!direction);
      ke = (0.5* springConstant * compression * compression) - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
    }
    double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
     if (direction) {
       return deltaD + springLength - compression;
     }
     else {
       return (distance - (springLength - compression + deltaD));
     }
  }

  public static String DirectionFinal(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    boolean direction = true;
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    while (ke > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      direction = (!direction);
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
    }
    double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
     if (direction) {
       return "Left to Right";
     }
     else {
       return "Right to Left";
     }
  }

  public static ArrayList<Double> keAtSpringCollisions(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    ArrayList<Double> kes = new ArrayList<Double> ();              //Kinetic Energy values, fail over value added to array as well
    double gravity = 9.81;
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    kes.add(ke);
    while (ke > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
      kes.add(ke);
    }
    return kes;
  }

  public static ArrayList<Double> SpringCompression(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    ArrayList<Double> compressions = new ArrayList<Double> ();
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    compressions.add(compression);
    while (ke > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      compressions.add(compression);
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
    }
    return compressions;
  }

public static ArrayList<Double> distanceTraveledPerNode(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
  double gravity = 9.81;
  double compression = initialCompression;
  double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
  ArrayList<Double> distanceTravelPerItem = new ArrayList<Double> ();
  if (ke > 0) {
  distanceTravelPerItem.add(compression + distance - (2* springLength));
}
while (ke > 0 && compression > 0) {
  compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
  distanceTravelPerItem.add(compression);
  ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
  distanceTravelPerItem.add(compression + distance - (2* springLength));
}
double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
distanceTravelPerItem.set(distanceTravelPerItem.size()-1,deltaD+ springLength);
return distanceTravelPerItem;
}

public static ArrayList<Double> totalDistanceTraveled(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
  double gravity = 9.81;
  double compression = initialCompression;
  double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
  double distances = 0;
  double failOver = 0;
  ArrayList<Double> totalDistance = new ArrayList<Double> ();
  if (ke > 0) {
    distances += compression + distance - (2* springLength);
  totalDistance.add(distance);
}
while (ke > 0 && compression > 0) {
  compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
  distances += compression;
  totalDistance.add(distances);
  ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
  failOver = compression + distance - (2* springLength);
  distances += compression + distance - (2* springLength);
totalDistance.add(distances);
}
double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
distances -= failOver;
distances += deltaD;
totalDistance.add(distances);
return totalDistance;
}

public static double finalDistance(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
  double gravity = 9.81;
  double compression = initialCompression;
  double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
  double distances = 0;
  double failOver = 0;
  if (ke > 0) {
    distances += compression + distance - (2* springLength);
}
System.out.println(distances);
while (ke > 0 && compression > 0) {
  compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
  distances += compression;
  System.out.println(distances);
  ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
  failOver = compression + distance - (2* springLength);
  distances += compression + distance - (2* springLength);
  System.out.println(distances);
}
double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
distances -= failOver;
distances += (deltaD + compression);
return distances;
}

  public static ArrayList<Double> velocity(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression, double precision) {
    double gravity = 9.81;
    double keAtSpringCollision = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    ArrayList<Double> velocity = new ArrayList<Double> ();
    return velocity;
  }

 public static void main(String[] args) {
   //System.out.println(finalDistance(0.05,120.0,1.0,0.25,0.3,0.2));
   System.out.println(finalPositionRelativeToBaseOfLeftSpring(0.05,120.0,1.0,0.25,0.3,0.2));
 }


}
