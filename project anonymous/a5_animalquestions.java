public class a4_20questions {
  public static void rating() {
      int random = (int) (Math.random()*3 + 1);
      Scanner scan = new Scanner(System.in);
    System.out.println("\n"+"How would you rate this game (1-5)?");
    int rating = scan.nextInt();
    if (rating == 1) {
      if (random == 1) {
        System.out.println("You must be mistaken.");
      }
      if (random == 2) {
        System.out.println("How dare you rate me so low!");
      }
      if (random == 3) {
        System.out.println("You are special in all the wrong ways.");
      }
    }
      if (rating == 2) {
        if (random == 1) {
          System.out.println("Play me again and I'll change your mind about me.");
        }
        if (random == 2) {
          System.out.println("What will it take to impress you?");
        }
        if (random == 3) {
          System.out.println("You finished the game. It couldn't be that bad.");
        }
      }
        if (rating == 3) {
          if (random == 1) {
            System.out.println("I am better than ordinary.");
          }
          if (random == 2) {
            System.out.println("Wait, are you calling orginary?");
          }
          if (random == 3) {
            System.out.println("You must have stronger feeling about me than that...");
          }
        }
          if (rating == 4) {
            if (random == 1) {
              System.out.println("Play me again, you'll love me even more!");
            }
            if (random == 2) {
              System.out.println("Nice!...╯︿╰");
            }
            if (random == 3) {
              System.out.println("Lets go...yay.");
            }
          }
            if (rating == 5) {
              if (random == 1) {
                System.out.println("OMG! YAY! ^_~");
              }
              if (random == 2) {
                System.out.println("You are the best! ^_____^");
              }
              if (random == 3) {
                System.out.println("You made the right decision, YAY!!! OwO");
              }
            }
}
public static void game() {

}
public static void main(String[] args) {

}
