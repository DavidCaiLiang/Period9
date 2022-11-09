/*
How should we handle negative 0.0 compareTo 0.0 functionality.
How should we deal with -0.0 as a result for mutiply when we might expect 0.0.
What margin of error should be use like 0.0000001%.
*/
public class Lab06_Driver {
  public static void main(String[] args) {
    RealNumber test0 = new RealNumber(0.0);
    RealNumber test1 = new RealNumber(11.0);
    RealNumber test2 = new RealNumber(-5.0);
    RealNumber test3 = new RealNumber(-103.249);
    RealNumber test4 = new RealNumber(139.420);
    RealNumber test5 = new RealNumber(5.240849e10);
    RealNumber test6 = new RealNumber(1/7.0);
    RealNumber test7 = new RealNumber(-19/13.0);
    RealNumber test8 = new RealNumber(Math.sqrt(3.0));
    RealNumber test9 = new RealNumber(-1 * Math.sqrt(7.0));
    RealNumber test10 = new RealNumber(11.0);
    RealNumber test11 = new RealNumber(-103.249);
    RealNumber test12 = new RealNumber(139.420);
    RealNumber test13 = new RealNumber(5.240849e10);
    RealNumber test14 = new RealNumber(1/7.0);
    RealNumber test15 = new RealNumber(-19/17.0);
    RealNumber test16 = new RealNumber(Math.sqrt(5.0));
    RealNumber test17 = new RealNumber(-1 * Math.sqrt(11.0));
    RealNumber test18 = new RealNumber(-7.5932209e10);
    RealNumber test19 = new RealNumber(-7.5932209e-8);
    RealNumber test20 = new RealNumber(5.240849e-7);
    RealNumber test21 = new RealNumber(0.0);
    RealNumber test22 = new RealNumber(Math.PI);
    RealNumber test23 = new RealNumber(1/Math.PI);
    RealNumber test24 = new RealNumber(-1 * Math.E);
    RealNumber test25 = new RealNumber(-1/Math.E);
    RealNumber test26 = new RealNumber(-Math.PI/Math.E);
    RealNumber test27 = new RealNumber(-Math.E/Math.PI);
    //--------------------//
    boolean tester = true;
  RealNumber[] test = {test0,test1,test2,test3,test4,test5,test6,test7,test8,test9,test10,test11,test12,test13,test14,test15,test16,test17, test18, test19, test20, test21, test22, test23, test24, test25, test26, test27};
  for (int i = 0; i < test.length; i++) {
    for (int a = 0; a < test.length; a++) {
      Double x = test[i].getValue();
      Double y = test[a].getValue();
      if (x.compareTo(y) != test[i].compareTo(test[a])) {
        tester = false;
        System.out.println("Error: test"+i+".compareTo(test"+a+")");
        System.out.println("RealNumber");
        System.out.println(test[i].getValue());
        System.out.println(test[a].getValue());
        System.out.println("Double");
        System.out.println(x);
        System.out.println(y);
        System.out.println("Double compare: " +x.compareTo(y));
        System.out.println("RealNumber compare: "+test[i].compareTo(test[a]));
      }
    }
  }
    System.out.println("CompareTo (part 1) (real) - test: " + tester);
    //--------------------//
    //Some of the test below is randomly generated.
    tester = true;
    if (test1.compareTo(test4) != -1) {
      tester = false;
      System.out.println("Error: test1.compareTo(test4)");
    }
    if (test6.compareTo(test7) != 1) {
      tester = false;
      System.out.println("Error: test6.compareTo(test7)");
    }
    if (test15.compareTo(test19) != -1) {
      tester = false;
      System.out.println("Error: test15.compareTo(test19)");
    }
    if (test10.compareTo(test15) != 1) {
      tester = false;
      System.out.println("Error: test10.compareTo(test15)");
    }
    if (test14.compareTo(test17) != 1) {
      tester = false;
      System.out.println("Error: test14.compareTo(test17)");
    }
    if (test8.compareTo(test4) != -1) {
      tester = false;
      System.out.println("Error: test8.compareTo(test4)");
    }
    if (test16.compareTo(test9) != 1) {
      tester = false;
      System.out.println("Error: test16.compareTo(test9)");
    }
    if (test0.compareTo(test21) != 0) {
      tester = false;
      System.out.println("Error: test0.compareTo(test21)");
    }
    if (test1.compareTo(test10) != 0) {
      tester = false;
      System.out.println("Error: test1.compareTo(test10)");
    }
    if (test7.compareTo(test22) != -1) {
      tester = false;
      System.out.println("Error: test7.compareTo(test22)");
    }
    if (test0.compareTo(test19) != 1) {
      tester = false;
      System.out.println("Error: test0.compareTo(test18)");
    }
    if (test0.compareTo(test20) != -1) {
      tester = false;
      System.out.println("Error: test0.compareTo(test19)");
    }
    System.out.println("CompareTo (part 2) (real) - test: " + tester);
    System.out.println("\ntest19 expected: -7.5932209E-8");
    System.out.println("         test19: " + test19);
    System.out.println("   test19 value: " + test19.getValue());
    System.out.println("test17 expected: -3.3166247903553998...");
    System.out.println("         test17: " + test17);
    System.out.println("   test17 value: " + test17.getValue());
    System.out.println("test25 expected: -0.36787944117144232");
    System.out.println("         test25: " + test25);
    System.out.println("   test25 value: " + test25.getValue());
    //--------------------//
    tester = true;
    for (int i = 0; i < test.length; i++) {
      for (int a = 0; a < test.length; a++) {
        if (test[a].add(test[i]) != (test[a].getValue() + test[i].getValue())) {
          tester = false;
          System.out.println("Error: test"+i+".add(test"+a+")");
          System.out.println("test[a].getValue + test[i].getValue: " + (test[a].getValue() + test[i].getValue())) ;
          System.out.println("test[a].add(test[i]): "+ test[a].add(test[i]));
        }
      }
    }
    System.out.println("\nAdd (real) - test: " + tester);
    //--------------------//
    {
    System.out.println("\ntest19 + test1 expected: 10.999999924067791...");
    System.out.println("test19 + test1   actual: "+ test19.add(test1));
    System.out.println("test13 + test21 expected: 5.240849E10...");
    System.out.println("test13 + test21   actual: "+ test13.add(test21));
    System.out.println("test3 + test13 expected: 5.2408489896751E10... or 52,408,489,896.751...");
    System.out.println("test3 + test13   actual: "+ test3.add(test13));
    System.out.println("test15 + test5 expected: 5.240848999888235E10... or 52,408,489,998.88235...");
    System.out.println("test15 + test5   actual: "+ test15.add(test5));
    System.out.println("test3 + test2 expected: -108.249");
    System.out.println("test3 + test2   actual: "+ test3.add(test2));
    System.out.println("test10 + test0 expected: 11.0");
    System.out.println("test10 + test0   actual: "+ test10.add(test0));
    System.out.println("test13 + test21 expected: 5.240849E10");
    System.out.println("test13 + test21   actual: "+ test13.add(test21));
    System.out.println("test6 + test5 expected: 5.24084900001428571E10...");
    System.out.println("test6 + test5   actual: "+ test6.add(test5));
    System.out.println("test15 + test7 expected: -2.57918552036199...");
    System.out.println("test15 + test7   actual: "+ test15.add(test7));
    System.out.println("test3 + test0 expected: -103.249");
    System.out.println("test3 + test0   actual: "+ test3.add(test0));
    System.out.println("test22 + test25 expected: 2.7737132124...");
    System.out.println("test22 + test25   actual: "+ test22.add(test25));
    System.out.println("test23 + test24 expected: -2.399971942275...");
    System.out.println("test23 + test24   actual: "+ test23.add(test24));
    System.out.println("test6 + test24 expected: -2.5754246856019....");
    System.out.println("test6 + test24   actual: "+ test6.add(test24));
  }
    //--------------------//
    tester = true;
    for (int i = 0; i < test.length; i++) {
      for (int a = 0; a < test.length; a++) {
        if (test[a].multiply(test[i]) != (test[a].getValue() * test[i].getValue())) {
          tester = false;
          System.out.println("Error: test"+i+".mutiply(test"+a+")");
          System.out.println("test[a].getValue * test[i].getValue: " + (test[a].getValue() * test[i].getValue())) ;
          System.out.println("test[a].multiply(test[i]): "+ test[a].multiply(test[i]));
        }
      }
    }
    System.out.println("\nMultiply (real) - test: " + tester);
    //--------------------//
    {
    System.out.println("\ntest3 * test20 expected: -5.411124184E-5... or -0.00005411124184...");
    System.out.println("test3 * test20   actual: "+ test3.multiply(test20));
    System.out.println("test6 * test2 expected: -0.7142857142857...");
    System.out.println("test6 * test2   actual: "+ test6.multiply(test2));
    System.out.println("test8 * test16 expected: 3.872983346207...");
    System.out.println("test8 * test16   actual: "+ test8.multiply(test16));
    System.out.println("test0 * test11 expected: 0.0");
    System.out.println("test0 * test11   actual: "+ test0.multiply(test11));
    System.out.println("test9 * test15 expected: 2.9570161711898...");
    System.out.println("test9 * test15   actual: "+ test9.multiply(test15));
    System.out.println("test2 * test12 expected: -697.1");
    System.out.println("test2 * test12   actual: "+ test2.multiply(test12));
    System.out.println("test19 * test22 expected: -2.38548069965E-7...");
    System.out.println("test19 * test22   actual: "+ test19.multiply(test22));
    System.out.println("test5 * test22 expected: 1.64646127169734E11... or 164,646,127,169.734...");
    System.out.println("test5 * test22   actual: "+ test5.multiply(test22));
    System.out.println("test6 * test24 expected: -0.3883259754941...");
    System.out.println("test6 * test24   actual: "+ test6.multiply(test24));
    System.out.println("test0 * test16 expected: 0.0");
    System.out.println("test0 * test16   actual: "+ test0.multiply(test16));
    System.out.println("test4 * test6 expected: 19.917142857142857...");
    System.out.println("test4 * test6   actual: "+ test4.multiply(test6));
    System.out.println("test8 * test17 expected: -5.7445626465380...");
    System.out.println("test8 * test17   actual: "+ test8.multiply(test17));
    System.out.println("test22 * test25 expected: -1.1557273497909...");
    System.out.println("test22 * test25   actual: "+ test22.multiply(test25));
    System.out.println("test23 * test24 expected: -0.865255979432265...");
    System.out.println("test23 * test24   actual: "+ test23.multiply(test24));
  }
    //--------------------//
    RealNumber testNoZero0 = new RealNumber(11.0);
    RealNumber testNoZero1 = new RealNumber(-5.0);
    RealNumber testNoZero2 = new RealNumber(-103.249);
    RealNumber testNoZero3 = new RealNumber(139.420);
    RealNumber testNoZero4 = new RealNumber(5.240849e10);
    RealNumber testNoZero5 = new RealNumber(1/7.0);
    RealNumber testNoZero6 = new RealNumber(-19/13.0);
    RealNumber testNoZero7 = new RealNumber(Math.sqrt(3.0));
    RealNumber testNoZero8 = new RealNumber(-1 * Math.sqrt(7.0));
    RealNumber testNoZero9 = new RealNumber(11.0);
    RealNumber testNoZero10 = new RealNumber(-103.249);
    RealNumber testNoZero11 = new RealNumber(139.420);
    RealNumber testNoZero12 = new RealNumber(5.240849e10);
    RealNumber testNoZero13 = new RealNumber(1/7.0);
    RealNumber testNoZero14 = new RealNumber(-19/17.0);
    RealNumber testNoZero15 = new RealNumber(Math.sqrt(5.0));
    RealNumber testNoZero16 = new RealNumber(-1 * Math.sqrt(11.0));
    RealNumber testNoZero17 = new RealNumber(-7.5932209e10);
    RealNumber testNoZero18 = new RealNumber(-7.5932209e-8);
    RealNumber testNoZero19 = new RealNumber(5.240849e-7);
    RealNumber testNoZero20 = new RealNumber(Math.PI);
    RealNumber testNoZero21 = new RealNumber(1/Math.PI);
    RealNumber testNoZero22 = new RealNumber(-1 * Math.E);
    RealNumber testNoZero23 = new RealNumber(-1/Math.E);
    RealNumber testNoZero24 = new RealNumber(-Math.PI/Math.E);
    RealNumber testNoZero25 = new RealNumber(-Math.E/Math.PI);
   //--------------------//
    RealNumber[] testNoZero = {testNoZero0,testNoZero1,testNoZero2,testNoZero3,testNoZero4,testNoZero5,testNoZero6,testNoZero7,testNoZero8,testNoZero9, testNoZero10, testNoZero11,testNoZero12,testNoZero13,testNoZero14,testNoZero15,testNoZero16,testNoZero17,testNoZero18,testNoZero19,testNoZero20,testNoZero21,testNoZero22,testNoZero23,testNoZero24,testNoZero25};
    tester = true;
    for (int i = 0; i < testNoZero.length; i++) {
      for (int a = 0; a < testNoZero.length; a++) {
        if (testNoZero[a].divide(testNoZero[i]) != ((testNoZero[a].getValue()) / (testNoZero[i].getValue()))) {
          tester = false;
          System.out.println("Error: test"+i+".divide(test"+a+")");
          System.out.println("testNoZero[a].getValue / testNoZero[i].getValue: " + (test[a].getValue() / test[i].getValue())) ;
          System.out.println("testNoZero[a].divide(testNoZero[i]): "+ test[a].divide(test[i]));
        }
      }
    }
    System.out.println("\nDivide (real) - test: " + tester);
    //--------------------//
    {
    System.out.println("\ntestNoZero[11] / testNoZero[21] expected: 438.00084776348897...");
    System.out.println("testNoZero[11] / testNoZero[21]   actual: "+ testNoZero11.divide(testNoZero21));
    System.out.println("testNoZero[6] / testNoZero[15] expected: -0.653619870346...");
    System.out.println("testNoZero[6] / testNoZero[15]   actual: "+ testNoZero6.divide(testNoZero15));
    System.out.println("testNoZero[21] / testNoZero[23] expected: -0.8652559794...");
    System.out.println("testNoZero[21] / testNoZero[23]   actual: "+ testNoZero21.divide(testNoZero23));
    System.out.println("testNoZero[24] / testNoZero[1] expected: 0.23114546995818434...");
    System.out.println("testNoZero[24] / testNoZero[1]   actual: "+ testNoZero24.divide(testNoZero1));
    System.out.println("testNoZero[16] / testNoZero[4] expected: -6.3284112752636E-11...");
    System.out.println("testNoZero[16] / testNoZero[4]   actual: "+ testNoZero16.divide(testNoZero4));
    System.out.println("testNoZero[18] / testNoZero[0] expected: -6.902928090909E-9...");
    System.out.println("testNoZero[18] / testNoZero[0]   actual: "+ testNoZero18.divide(testNoZero0));
    System.out.println("testNoZero[12] / testNoZero[20] expected: 1.668214048696E10... or 16,682,140,486.96...");
    System.out.println("testNoZero[12] / testNoZero[20]   actual: "+ testNoZero12.divide(testNoZero20));
    System.out.println("testNoZero[3] / testNoZero[16] expected: -42.0367116610318...");
    System.out.println("testNoZero[3] / testNoZero[16]   actual: "+ testNoZero3.divide(testNoZero16));
    System.out.println("testNoZero[19] / testNoZero[14] expected: -4.6891806842105E-7...");
    System.out.println("testNoZero[19] / testNoZero[14]   actual: "+ testNoZero19.divide(testNoZero14));
    System.out.println("testNoZero[6] / testNoZero[16] expected: 0.44067042669...");
    System.out.println("testNoZero[6] / testNoZero[16]   actual: "+ testNoZero6.divide(testNoZero16));
    System.out.println("testNoZero[15] / testNoZero[7] expected: 1.2909944487358...");
    System.out.println("testNoZero[15] / testNoZero[7]   actual: "+ testNoZero15.divide(testNoZero7));
    System.out.println("test0 / testNoZero[7] expected: 0.0");
    System.out.println("test0 / testNoZero[7]   actual: "+ test0.divide(testNoZero7));
  }
    //--------------------//
    tester = true;
    for (int i = 0; i < test.length; i++) {
      for (int a = 0; a < test.length; a++) {
        if (test[a].subtract(test[i]) != (test[a].getValue() - test[i].getValue())) {
          tester = false;
          System.out.println("Error: test"+i+".subtract(test"+a+")");
          System.out.println("test[a].getValue - test[i].getValue: " + (test[a].getValue() - test[i].getValue())) ;
          System.out.println("test[a].subtract(test[i]): "+ test[a].subtract(test[i]));
        }
      }
    }
    System.out.println("\nSubtract (real) - test: " + tester);
    //--------------------//
    {
    System.out.println("\ntest3 - test20 expected: -103.2490005240849....");
    System.out.println("test3 - test20   actual: "+ test3.subtract(test20));
    System.out.println("test17 - test5 expected: -5.240849000331662479E10... or -52,408,490,003.31662479...");
    System.out.println("test17 - test5   actual: "+ test17.subtract(test5));
    System.out.println("test16 - test1 expected: -8.7639320225002103...");
    System.out.println("test16 - test1   actual: "+ test16.subtract(test1));
    System.out.println("test17 - test14 expected: -3.45948193321254....");
    System.out.println("test17 - test14   actual: "+ test17.subtract(test14));
    System.out.println("test1 - test14 expected: 10.85714285714...");
    System.out.println("test1 - test14   actual: "+ test1.subtract(test14));
    System.out.println("test12 - test22 expected: 136.27840734641...");
    System.out.println("test12 - test22   actual: "+ test12.subtract(test22));
    System.out.println("test18 - test16 expected: -7.5932209002236E10... or -75,932,209,002.236...");
    System.out.println("test18 - test16   actual: "+ test18.subtract(test16));
    System.out.println("test19 - test6 expected: -0.142857218789351857...");
    System.out.println("test19 - test6   actual: "+ test19.subtract(test6));
    System.out.println("test4 - test16 expected: 137.183932022500");
    System.out.println("test4 - test16   actual: "+ test4.subtract(test16));
    System.out.println("test12 - test27 expected: 140.285255979432...");
    System.out.println("test12 - test27   actual: "+ test12.subtract(test27));
    System.out.println("test13 - test18 expected: 1.28340699E11 or 128,340,699,000");
    System.out.println("test13 - test18   actual: "+ test13.subtract(test18));
  }
  //--------------------//
  RationalNumber rat0 = new RationalNumber(11,0);
  RationalNumber rat1 = new RationalNumber(0,11);
  RationalNumber rat2 = new RationalNumber(-7,0);
  RationalNumber rat3 = new RationalNumber(0,-7);
  RationalNumber rat4 = new RationalNumber(2,1);
  RationalNumber rat5 = new RationalNumber(1,2);
  RationalNumber rat6 = new RationalNumber(1,3);
  RationalNumber rat7 = new RationalNumber(2,4);
  RationalNumber rat8 = new RationalNumber(3,9);
  RationalNumber rat9 = new RationalNumber(6,2);
  RationalNumber rat10 = new RationalNumber(1,2);
  RationalNumber rat11 = new RationalNumber(1,4);
  RationalNumber rat12 = new RationalNumber(2,8);
  //--------------------//
  tester = true;
  if (!(rat0.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat0.toString()");
    System.out.println("rat0.toString() -> " + rat0.toString());
  }
  if (!(rat1.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat1.toString()");
    System.out.println("rat1.toString() -> " + rat1.toString());
  }
  if (!(rat2.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat2.toString()");
    System.out.println("rat2.toString() -> " + rat2.toString());
  }
  if (!(rat3.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat3.toString()");
    System.out.println("rat3.toString() -> " + rat3.toString());
  }
  if (!(rat4.toString().equals("2"))) {
    tester = false;
    System.out.println("Error - rat4.toString()");
    System.out.println("rat4.toString() -> " + rat4.toString());
  }
  if (!(rat5.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat5.toString()");
    System.out.println("rat5.toString() -> " + rat5.toString());
  }
  if (!(rat6.toString().equals("1/3"))) {
    tester = false;
    System.out.println("Error - rat6.toString()");
    System.out.println("rat6.toString() -> " + rat6.toString());
  }
  if (!(rat7.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat7.toString()");
    System.out.println("rat7.toString() -> " + rat7.toString());
  }
  if (!(rat8.toString().equals("1/3"))) {
    tester = false;
    System.out.println("Error - rat8.toString()");
    System.out.println("rat8.toString() -> " + rat8.toString());
  }
  if (!(rat9.toString().equals("3"))) {
    tester = false;
    System.out.println("Error - rat9.toString()");
    System.out.println("rat9.toString() -> " + rat9.toString());
  }
  if (!(rat10.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat10.toString()");
    System.out.println("rat10.toString() -> " + rat10.toString());
  }
  if (!(rat11.toString().equals("1/4"))) {
    tester = false;
    System.out.println("Error - rat11.toString()");
    System.out.println("rat11.toString() -> " + rat11.toString());
  }
  if (!(rat12.toString().equals("1/4"))) {
    tester = false;
    System.out.println("Error - rat12.toString()");
    System.out.println("rat12.toString() -> " + rat12.toString());
  }
  System.out.println("\n toString (rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (rat0.getNumerator() != 0) {
    tester = false;
    System.out.println("\nError - rat0.getNumerator()");
    System.out.println("rat0.getNumerator() -> " + rat0.getNumerator());
  }
  if (rat1.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat1.getNumerator()");
    System.out.println("rat1.getNumerator() -> " + rat1.getNumerator());
  }
  if (rat2.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat2.getNumerator()");
    System.out.println("rat2.getNumerator() -> " + rat2.getNumerator());
  }
  if (rat3.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat3.getNumerator()");
    System.out.println("rat3.getNumerator() -> " + rat3.getNumerator());
  }
  if (rat4.getNumerator() != 2) {
    tester = false;
    System.out.println("Error - rat4.getNumerator()");
    System.out.println("rat4.getNumerator() -> " + rat4.getNumerator());
  }
  if (rat5.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat5.getNumerator()");
    System.out.println("rat5.getNumerator() -> " + rat5.getNumerator());
  }
  if (rat6.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat6.getNumerator()");
    System.out.println("rat6.getNumerator() -> " + rat6.getNumerator());
  }
  if (rat7.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat7.getNumerator()");
    System.out.println("rat7.getNumerator() -> " + rat7.getNumerator());
  }
  if (rat8.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat8.getNumerator()");
    System.out.println("rat8.getNumerator() -> " + rat8.getNumerator());
  }
  if (rat9.getNumerator() != 3) {
    tester = false;
    System.out.println("Error - rat9.getNumerator()");
    System.out.println("rat9.getNumerator() -> " + rat9.getNumerator());
  }
  if (rat10.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat10.getNumerator()");
    System.out.println("rat10.getNumerator() -> " + rat10.getNumerator());
  }
  if (rat11.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat11.getNumerator()");
    System.out.println("rat11.getNumerator() -> " + rat11.getNumerator());
  }
  if (rat12.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat12.getNumerator()");
    System.out.println("rat12.getNumerator() -> " + rat12.getNumerator());
  }
  System.out.println("\n getNumerator (rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (rat0.getDenominator() != 1) {
    tester = false;
    System.out.println("\nError - rat0.getNumerator()");
    System.out.println("rat0.getDenominator() -> " + rat0.getDenominator());
  }
  if (rat1.getDenominator() != 11) {
    tester = false;
    System.out.println("Error - rat1.getDenominator()");
    System.out.println("rat1.getDenominator() -> " + rat1.getDenominator());
  }
  if (rat2.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat2.getDenominator()");
    System.out.println("rat2.getDenominator() -> " + rat2.getDenominator());
  }
  if (rat3.getDenominator() != -7) {
    tester = false;
    System.out.println("Error - rat3.getDenominator()");
    System.out.println("rat3.getDenominator() -> " + rat3.getDenominator());
  }
  if (rat4.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat4.getDenominator()");
    System.out.println("rat4.getDenominator() -> " + rat4.getDenominator());
  }
  if (rat5.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat5.getDenominator()");
    System.out.println("rat5.getDenominator() -> " + rat5.getDenominator());
  }
  if (rat6.getDenominator() != 3) {
    tester = false;
    System.out.println("Error - rat6.getDenominator()");
    System.out.println("rat6.getDenominator() -> " + rat6.getDenominator());
  }
  if (rat7.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat7.getDenominator()");
    System.out.println("rat7.getDenominator() -> " + rat7.getDenominator());
  }
  if (rat8.getDenominator() != 3) {
    tester = false;
    System.out.println("Error - rat8.getDenominator()");
    System.out.println("rat8.getDenominator() -> " + rat8.getDenominator());
  }
  if (rat9.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat9.getDenominator()");
    System.out.println("rat9.getDenominator() -> " + rat9.getDenominator());
  }
  if (rat10.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat10.getDenominator()");
    System.out.println("rat10.getDenominator() -> " + rat10.getDenominator());
  }
  if (rat11.getDenominator() != 4) {
    tester = false;
    System.out.println("Error - rat11.getDenominator()");
    System.out.println("rat11.getDenominator() -> " + rat11.getDenominator());
  }
  if (rat12.getDenominator() != 4) {
    tester = false;
    System.out.println("Error - rat12.getDenominator()");
    System.out.println("rat12.getDenominator() -> " + rat12.getDenominator());
  }
  System.out.println("\n getDenominator (rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (rat0.getValue() != 0) {
    tester = false;
    System.out.println("Error - rat0.getValue()");
    System.out.println("rat0.getValue() -> " + rat0.getValue());
  }
  if (rat1.getValue() != 0) {
    tester = false;
    System.out.println("Error - rat1.getValue()");
    System.out.println("rat1.getValue() -> " + rat1.getValue());
  }
  if (rat2.getValue() != 0) {
    tester = false;
    System.out.println("Error - rat2.getValue()");
    System.out.println("rat2.getValue() -> " + rat2.getValue());
  }
  if (rat3.getValue() != 0) {
    tester = false;
    System.out.println("Error - rat3.getValue()");
    System.out.println("rat3.getValue() -> " + rat3.getValue());
  }
  if (rat4.getValue() != 2) {
    tester = false;
    System.out.println("Error - rat4.getValue()");
    System.out.println("rat4.getValue() -> " + rat4.getValue());
  }
  if (rat5.getValue() != 0.5) {
    tester = false;
    System.out.println("Error - rat5.getValue()");
    System.out.println("rat5.getValue() -> " + rat5.getValue());
  }
  if (rat7.getValue() != 0.5) {
    tester = false;
    System.out.println("Error - rat7.getValue()");
    System.out.println("rat7.getValue() -> " + rat7.getValue());
  }
  if (rat6.getValue() != (1/3.0)) {
    tester = false;
    System.out.println("Error - rat6.getValue()");
    System.out.println("rat6.getValue() -> " + rat6.getValue());
  }
  if (rat8.getValue() != (3/9.0)) {
    tester = false;
    System.out.println("Error - rat8.getValue()");
    System.out.println("rat8.getValue() -> " + rat8.getValue());
  }
  if (rat9.getValue() != 3.0) {
    tester = false;
    System.out.println("Error - rat9.getValue()");
    System.out.println("rat9.getValue() -> " + rat9.getValue());
  }
  if (rat10.getValue() != 0.5) {
    tester = false;
    System.out.println("Error - rat10.getValue()");
    System.out.println("rat10.getValue() -> " + rat10.getValue());
  }
  if (rat11.getValue() != 0.25) {
    tester = false;
    System.out.println("Error - rat11.getValue()");
    System.out.println("rat11.getValue() -> " + rat11.getValue());
  }
  if (rat12.getValue() != 0.25) {
    tester = false;
    System.out.println("Error - rat12.getValue()");
    System.out.println("rat12.getValue() -> " + rat12.getValue());
  }
  System.out.println("\n getValue(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(rat0.equals(rat1))) {
    tester = false;
    System.out.println("Error - rat0.equals(rat1)");
    System.out.println("rat0.toString() ->" + rat0.toString());
    System.out.println("rat1.toString() ->" + rat1.toString());
  }
  if (!(rat1.equals(rat2))) {
    tester = false;
    System.out.println("Error - rat1.equals(rat2)");
    System.out.println("rat1.toString() ->" + rat1.toString());
    System.out.println("rat2.toString() ->" + rat2.toString());
  }
  if (!(rat2.equals(rat3))) {
    tester = false;
    System.out.println("Error - rat2.equals(rat3)");
    System.out.println("rat2.toString() ->" + rat2.toString());
    System.out.println("rat3.toString() ->" + rat3.toString());
  }
  if (rat3.equals(rat4)) {
    tester = false;
    System.out.println("Error - rat2.equals(rat3)");
    System.out.println("rat2.toString() ->" + rat2.toString());
    System.out.println("rat3.toString() ->" + rat3.toString());
  }
  if (rat3.equals(rat4)) {
    tester = false;
    System.out.println("Error - rat2.equals(rat3)");
    System.out.println("rat2.toString() ->" + rat2.toString());
    System.out.println("rat3.toString() ->" + rat3.toString());
  }
  if (!(rat5.equals(rat7))) {
    tester = false;
    System.out.println("Error - rat5.equals(rat7)");
    System.out.println("rat5.toString() ->" + rat5.toString());
    System.out.println("rat7.toString() ->" + rat7.toString());
  }
  if (!(rat6.equals(rat8))) {
    tester = false;
    System.out.println("Error - rat6.equals(rat8)");
    System.out.println("rat6.toString() ->" + rat6.toString());
    System.out.println("rat8.toString() ->" + rat8.toString());
  }
  if (!(rat5.equals(rat10))) {
    tester = false;
    System.out.println("Error - rat5.equals(rat10)");
    System.out.println("rat5.toString() ->" + rat5.toString());
    System.out.println("rat10.toString() ->" + rat10.toString());
  }
  if (!(rat11.equals(rat12))) {
    tester = false;
    System.out.println("Error - rat11.equals(rat12)");
    System.out.println("rat11.toString() ->" + rat11.toString());
    System.out.println("rat12.toString() ->" + rat12.toString());
  }
  if (rat10.equals(rat11)) {
    tester = false;
    System.out.println("Error - rat10.equals(rat11)");
    System.out.println("rat10.toString() ->" + rat10.toString());
    System.out.println("rat11.toString() ->" + rat11.toString());
  }
  if (rat9.equals(rat10)) {
    tester = false;
    System.out.println("Error - rat9.equals(rat10)");
    System.out.println("rat9.toString() ->" + rat9.toString());
    System.out.println("rat10.toString() ->" + rat10.toString());
  }
  if (rat8.equals(rat9)) {
    tester = false;
    System.out.println("Error - rat8.equals(rat9)");
    System.out.println("rat8.toString() ->" + rat8.toString());
    System.out.println("rat9.toString() ->" + rat9.toString());
  }
  if (rat7.equals(rat8)) {
    tester = false;
    System.out.println("Error - rat7.equals(rat8)");
    System.out.println("rat7.toString() ->" + rat7.toString());
    System.out.println("rat8.toString() ->" + rat8.toString());
  }
  System.out.println("\n equals(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(((rat0.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Orginal: "+rat0);
    System.out.println("Reciprocal: "+rat0.reciprocal());
  }
  if (!(((rat1.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Orginal: "+rat1);
    System.out.println("Reciprocal: "+rat1.reciprocal());
  }
  if (!(((rat2.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Orginal: "+rat2);
    System.out.println("Reciprocal: "+rat2.reciprocal());
  }
  if (!(((rat3.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Orginal: "+rat3);
    System.out.println("Reciprocal: "+rat3.reciprocal());
  }
  if (!(((rat4.reciprocal()).toString()).equals("1/2"))) {
    tester = false;
    System.out.println("Orginal: "+rat4);
    System.out.println("Reciprocal: "+rat4.reciprocal());
  }
  if (!(((rat5.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Orginal: "+rat5);
    System.out.println("Reciprocal: "+rat5.reciprocal());
  }
  if (!(((rat6.reciprocal()).toString()).equals("3"))) {
    tester = false;
    System.out.println("Orginal: "+rat6);
    System.out.println("Reciprocal: "+rat6.reciprocal());
  }
  if (!(((rat7.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Orginal: "+rat7);
    System.out.println("Reciprocal: "+rat7.reciprocal());
  }
  if (!(((rat8.reciprocal()).toString()).equals("3"))) {
    tester = false;
    System.out.println("Orginal: "+rat8);
    System.out.println("Reciprocal: "+rat8.reciprocal());
  }
  if (!(((rat9.reciprocal()).toString()).equals("1/3"))) {
    tester = false;
    System.out.println("Orginal: "+rat9);
    System.out.println("Reciprocal: "+rat9.reciprocal());
  }
  if (!(((rat10.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Orginal: "+rat10);
    System.out.println("Reciprocal: "+rat10.reciprocal());
  }
  if (!(((rat11.reciprocal()).toString()).equals("4"))) {
    tester = false;
    System.out.println("Orginal: "+rat11);
    System.out.println("Reciprocal: "+rat11.reciprocal());
  }
  if (!(((rat12.reciprocal()).toString()).equals("4"))) {
    tester = false;
    System.out.println("Orginal: "+rat12);
    System.out.println("Reciprocal: "+rat12.reciprocal());
  }
  System.out.println("\n Reciprocal(rational) - Test: "+tester);
  tester = true;
  if (RationalNumber.gcd(2,4) != 2) {
    tester = false;
    System.out.println("Num 1: 2");
    System.out.println("Num 2: 2");
  }
  if (RationalNumber.gcd(11,1) != 1) {
    tester = false;
    System.out.println("Num 1: 11");
    System.out.println("Num 2: 1");
  }
  if (RationalNumber.gcd(17,13) != 1) {
    tester = false;
    System.out.println("Num 1: 17");
    System.out.println("Num 2: 13");
  }
  if (RationalNumber.gcd(100,10) != 10) {
    tester = false;
    System.out.println("Num 1: 100");
    System.out.println("Num 2: 10");
  }
  if (RationalNumber.gcd(512,16) != 16) {
    tester = false;
    System.out.println("Num 1: 512");
    System.out.println("Num 2: 16");
  }
  if (RationalNumber.gcd(100,15) != 5) {
    tester = false;
    System.out.println("Num 1: 100");
    System.out.println("Num 2: 15");
  }
  System.out.println("\n gcf(rational) - Test: "+tester);




}

}
