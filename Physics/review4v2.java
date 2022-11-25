import java.util.ArrayList;

public class review4v2{
  public static double finalPositionRelativeToBaseOfLeftSpring(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    ArrayList<Double> compressions = new ArrayList<Double> ();
    ArrayList<Double> kes = new ArrayList<Double> ();              //Kinetic Energy values, fail over value added to array as well
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    compressions.add(compression);
    kes.add(ke);

    while (ke > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      compressions.add(compression);
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
      kes.add(ke);
    }

    System.out.println("Compression Array: "+compressions);
    System.out.println("\nKinetic Energy at contact with Spring Array: "+kes);
    System.out.println("The final value of the Kinetic Energy Array is supposed to negative!");

    System.out.println("\nIs it going left to right: "+ (kes.size() % 2 == 1) + "\n");
    double deltaD = ((0.5 * springConstant * compressions.get(compressions.size()-1) * compressions.get(compressions.size()-1))-(coefficientOfFriction * mass * gravity * compressions.get(compressions.size()-1))/(springConstant * mass * gravity));
    // for (int i = 0; i < kes.size(); i++) {
    //   if (i % 2 == 0) {
    //     System.out.println("\\");
    //   }
    //   else {
    //     System.out.println("/");
    //   }
    // }
     if (kes.size() % 2 == 1) {
       return deltaD + springLength;
     }
     else {
       return (distance - (deltaD + springLength));
     }
  }

  public static double totalDistanceTraveled(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    boolean direction = true;
    /*
    True corresponds with left to right;
    False corresponds with right to left;
    */
    double compression = initialCompression;
    double ke = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    ArrayList<Double> distanceTravelPerItem = new ArrayList<Double> ();
    ArrayList<Double> distanceTotal = new ArrayList<Double> ();
    ArrayList<Double> compressions = new ArrayList<Double> ();
    ArrayList<Double> kes = new ArrayList<Double> ();              //Kinetic Energy values, fail over value added to array as well
    compressions.add(compression);
    kes.add(ke);
    if (ke > 0) {
    distanceTravelPerItem.add(compression + distance - (2* springLength));
  }
    while (ke > 0 && compression > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      compressions.add(compression);
      distanceTravelPerItem.add(compression);
      ke = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
      kes.add(ke);
      distanceTravelPerItem.add(compression + distance - (2* springLength));
    }
    System.out.println("Compression Array: "+compressions);
    System.out.println("\nKinetic Energy at contact with Spring Array: "+kes);
    System.out.println("The final value of the Kinetic Energy Array is supposed to negative!");
    System.out.println("\nIs it going left to right: "+direction);
    double deltaD = ((0.5 * springConstant * compressions.get(compressions.size()-1) * compressions.get(compressions.size()-1))-(coefficientOfFriction * mass * gravity * compressions.get(compressions.size()-1))/(springConstant * mass * gravity));
    distanceTravelPerItem.set(distanceTravelPerItem.size()-1,deltaD+ springLength);
    System.out.println("\nDistance travel per item (either spring compress or spring expand) Array: "+distanceTravelPerItem);
    double distanceAdder = 0;
    for (int i = 0; i < distanceTravelPerItem.size(); i++) {
      distanceAdder += distanceTravelPerItem.get(i);
      distanceTotal.add(distanceAdder);
    }
    System.out.println("\nTotal Distance Array: "+distanceTotal+"\n");
    /*
    Spring expand includes travel of block beyond spring length toward the spring on the other side.
    */
    return distanceTotal.get(distanceTotal.size()-1);
  }

  public static ArrayList<Double> velocity(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression, double precision) {
    double gravity = 9.81;
    ArrayList<Double> compressions = new ArrayList<Double> ();
    ArrayList<Double> keAtSpringCollisions = new ArrayList<Double> ();              //Kinetic Energy values, fail over value added to array as well
    ArrayList<Double> keFull = new ArrayList<Double> ();
    //Velocity of block at every x distance up to the fail over point if fail over point is between units, it will put a 0 at the end of the array and not put a value after that.
    ArrayList<Double> velocity = new ArrayList<Double> ();
    //Based off of keFull so it will work the same way.
    double keAtSpringCollision = 0.5* springConstant * initialCompression * initialCompression - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    double compression = initialCompression;
    compressions.add(compression);
    keAtSpringCollisions.add(keAtSpringCollision);
    if (keAtSpringCollision > 0) {
      double counterFull = 0;
      double counterPartial = 0;
      while ((counterFull + precision) < initialCompression + distance - (2 * springLength)) { //I did it this way becuase it is easy. I know I could probably do a continuous counter where we don't reset the counter after each phase of the process.
        keFull.add(0.5* springConstant * counterPartial * counterPartial - (coefficientOfFriction * mass * gravity * counterFull));
        //System.out.println(0.5* springConstant * counterPartial * counterPartial - (coefficientOfFriction * mass * gravity * counterFull));
        //System.out.println(0.5* springConstant * counterPartial * counterPartial);
        //System.out.println(coefficientOfFriction * mass * gravity * counterFull);
        counterFull += precision;
        if ((counterPartial + precision) >= compression) {
          counterPartial += precision;
        }
      }
    }
    while (keAtSpringCollision > 0) {
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * keAtSpringCollision)))/ springConstant);
      compressions.add(compression);
      double counter = 0;
      while ((counter + precision) < compression) {
        keFull.add(keAtSpringCollision - (0.5 * springConstant * counter * counter) - (coefficientOfFriction * mass * gravity * counter));
        counter += precision;
      }
      //Stopped here. :< pain hell
      keAtSpringCollision = 0.5* springConstant * compression * compression - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
      keAtSpringCollisions.add(keAtSpringCollision);
      //fail rip -fix by getting rid the last set;
      double counterFull = 0;
      double counterPartial = 0;
      while ((counterFull + precision) < compression + distance - (2 * springLength)) { //I did it this way becuase it is easy. I know I could probably do a continuous counter where we don't reset the counter after each phase of the process.
        keFull.add(0.5* springConstant * counterPartial * counterPartial - (coefficientOfFriction * mass * gravity * counterFull));
        counterFull += precision;
        if (counterPartial + precision < compression) {
          counterPartial += precision;
        }
      }
    }
    //
    //System.out.println("Compression Array: "+compressions);
    //System.out.println("\nKinetic Energy at contact with Spring Array: "+keAtSpringCollisions);
    //System.out.println("The final value of the Kinetic Energy Array is supposed to negative!");
    //System.out.println("\nIs it going left to right: "+ (keAtSpringCollisions.size() % 2 == 1) + "\n");
    double deltaD = ((0.5 * springConstant * compressions.get(compressions.size()-1) * compressions.get(compressions.size()-1))-(coefficientOfFriction * mass * gravity * compressions.get(compressions.size()-1))/(springConstant * mass * gravity));
    double counterFull = 0;
    double counterPartial = 0;
    while ((counterFull + precision) < compression + deltaD) { //I did it this way becuase it is easy. I know I could probably do a continuous counter where we don't reset the counter after each phase of the process.
      keFull.add(0.5 * springConstant * counterPartial * counterPartial - (coefficientOfFriction * mass * gravity * counterFull));
      //System.out.println(0.5 * springConstant * counterPartial * counterPartial - (coefficientOfFriction * mass * gravity * counterFull));
      //System.out.println(0.5 * springConstant * counterPartial * counterPartial);
      //System.out.println(coefficientOfFriction * mass * gravity * counterFull);
      counterFull += precision;
      if (counterPartial + precision < compression) {
        counterPartial += precision;
      }
    }
    for (int i = 0; i < keFull.size(); i++) {
      velocity.add(Math.sqrt(keFull.get(i) * (1/mass) * 2));
    }
     return velocity;
  }

  public static void main(String[] args) {
    System.out.println(finalPositionRelativeToBaseOfLeftSpring(0.05,120.0,1.0,0.25,0.3,0.2));
    System.out.println(totalDistanceTraveled(0.05,120.0,1.0,0.25,0.3,0.2));
    System.out.println(velocity(0.05,120.0,1.0,0.25,0.3,0.2, 0.0005));
  }

}
