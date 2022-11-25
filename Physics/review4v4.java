public class review4v4{
  public static double finalPositionRelativeToBaseOfLeftSpring(double mass, double springConstant, double distance, double springLength, double coefficientOfFriction, double initialCompression) {
    double gravity = 9.81;
    boolean direction = true;
    /*
    true = Left-to-Right
    false = Right-to-Left
    */
    //KE as block hits right spring for the first time. This will change as the block hits each subsequent spring.
    double ke = (0.5* springConstant * initialCompression * initialCompression) - (coefficientOfFriction * mass * gravity * (initialCompression + distance - (2 * springLength)));
    //The maximum compression of the spring when the blocks hits it starting from 0.2, the initial compression.
    double compression = initialCompression;
    while (ke > 0) {
      //We find the compression of the spring, this accounts for friction loss.
      compression = (((-1 * coefficientOfFriction * mass * gravity) + Math.sqrt((coefficientOfFriction * coefficientOfFriction * mass * mass * gravity * gravity) + (2 * springConstant * ke)))/ springConstant);
      //After maximum compression we change the direction.
      direction = (!direction);
      //This accounts for the KE energy when the block hits the next spring given the compression of the current spring and friction and such.
      ke = (0.5* springConstant * compression * compression) - (coefficientOfFriction * mass * gravity * (compression + distance - (2 * springLength)));
    }
    //This is after the loop fails.
    //We find the travel of the block after leaving a spring for the last time.
    double deltaD = ((0.5 * springConstant * compression * compression)-(coefficientOfFriction * mass * gravity * compression)/(springConstant * mass * gravity));
    //If the block is going left to right, we add the length of the left spring and deltaD.
    //If the block is going right to left, we subtract the 1m from the length of the right spring and deltaD to get the absolute distance compared to the base of the left spring.
     if (direction) {
       return deltaD + springLength;
     }
     else {
       return (distance - (springLength + deltaD));
     }
  }
  public static void main(String[] args) {
    /*I am calling the method above with the following converted Units
    mass = 50g = 0.05g
    springConstant = 120N/m
    distance = 1.0m
    springLength = 25cm = 0.25m
    coefficientOfFriction = 0.30
    initialCompression = 20cm = 0.2m
    */
    System.out.println(finalPositionRelativeToBaseOfLeftSpring(0.05,120.0,1.0,0.25,0.3,0.2));
  }
 }
