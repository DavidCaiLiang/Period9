public class Driver{
  public static void main(String[] args) {
      Recursion.printNoDoubleLetterWords(0,new char[]{'!','@'});
      Recursion.printNoDoubleLetterWords(0,new char[]{'^','b','c','$','#','A','1','2'});
      Recursion.printAllWords(0);
      Recursion.printAllWords(1);
      Recursion.printAllWords(2);
      Recursion.printAllWords(3);
      Recursion.printAllWords(4);
      Recursion.printNoDoubleLetterWords(4,new char[]{'!','@','1','e'});
      Recursion.printNoDoubleLetterWords(10,new char[]{'!','@'});
      Recursion.printNoDoubleLetterWords(7,new char[]{'!','@'});
      Recursion.printNoDoubleLetterWords(8,new char[]{'!','@','1','q'});
      Recursion.printNoDoubleLetterWords(1,new char[]{'!','@','a'});
      Recursion.printNoDoubleLetterWords(3,new char[]{'^','b','c','$','#'});
      Recursion.printNoDoubleLetterWords(3,new char[]{'^','b','c','$','#','A','1','2'});
      Recursion.printNoDoubleLetterWords(5,new char[]{'^','b','c','$','#','A','1','2'});
      Recursion.printNoDoubleLetterWords(2,new char[]{'!','@','a'});
      // for (int i = 0; i < 5; i++) {
      //   Recursion.printAllWords(i);
      // }
  //     char[] set = {'a','q','1','$',')','2','&','#',':',';','I','J','H'};
  //     for (int i = 2; i < set.length; i++) {
  //       char[] subset = genr(set,i);
  //       for (int a = 0; a < 6; a++) {
  //         Recursion.printNoDoubleLetterWords(a,subset);
  //       }
  //     }
  }

  public static char[] genr(char[] set, int a) {
    char[] subset = new char[set.length];
    for (int i = 0; i <= a; i++) {
      subset[i] = set[i];
    }
    return subset;
  }

}
