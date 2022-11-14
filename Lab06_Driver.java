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
    RealNumber test28 = new RealNumber(0.5);
    RealNumber test29 = new RealNumber(-0.5);
    RealNumber test30 = new RealNumber(2);
    RealNumber test31 = new RealNumber(-2);
    RealNumber test32 = new RealNumber(1/3.0);
    RealNumber test33 = new RealNumber(-1/3.0);
    RealNumber test34 = new RealNumber(3);
    RealNumber test35 = new RealNumber(-3);
    RealNumber test36 = new RealNumber(-7);
    RealNumber test37 = new RealNumber(7);
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
      System.out.println("test4 * test6 expected: 19.9171428571428571...");
      System.out.println("test4 * test6   actual: "+ test4.multiply(test6));
      System.out.println("test8 * test17 expected: -5.7445626465380...");
      System.out.println("test8 * test17   actual: "+ test8.multiply(test17));
      System.out.println("test22 * test25 expected: -1.1557273497909...");
      System.out.println("test22 * test25   actual: "+ test22.multiply(test25));
      System.out.println("test23 * test24 expected: -0.865255979432265...");
      System.out.println("test23 * test24   actual: "+ test23.multiply(test24));
      System.out.println("test23 * -0.0 expected: 0.0");
      System.out.println("test23 * -0.0   actual: "+ test23.multiply(new RealNumber(-0.0)));
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
      System.out.println("testNoZero[16] / testNoZero[4] expected: -6.3314112752636E-11...");
      System.out.println("testNoZero[16] / testNoZero[4]   actual: "+ testNoZero16.divide(testNoZero4));
      System.out.println("testNoZero[18] / testNoZero[0] expected: -6.902931090909E-9...");
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
      System.out.println("test1 - test14 expected: 10.85714315714...");
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
      System.out.println("test13 - test18 expected: 1.31340699E11 or 131,340,699,000");
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
  RationalNumber rat13 = new RationalNumber(-18,14);
  RationalNumber rat14 = new RationalNumber(-18,7);
  RationalNumber rat15 = new RationalNumber(18,-14);
  RationalNumber rat16 = new RationalNumber(18,-7);
  RationalNumber rat17= new RationalNumber(-18,-7);
  RationalNumber rat18= new RationalNumber(-81,-18);
  RationalNumber rat19= new RationalNumber(81,-18);
  RationalNumber rat20= new RationalNumber(-81,18);
  RationalNumber rat21= new RationalNumber(81,18);
  RationalNumber rat22 = new RationalNumber(100000,1200000000);
  RationalNumber rat23 = new RationalNumber(-0,1);
  RationalNumber rat24 = new RationalNumber(165,-300);
  RationalNumber rat25 = new RationalNumber(-165,300);
  RationalNumber rat26 = new RationalNumber(0,-55);
  RationalNumber rat27 = new RationalNumber(0,55);
  RationalNumber rat28 = new RationalNumber(55,0);
  RationalNumber rat29 = new RationalNumber(55,-0);
  RationalNumber rat30 = new RationalNumber(-55,0);
  RationalNumber rat31 = new RationalNumber(-55,-0);
  RationalNumber rat38 = new RationalNumber(-0,55);
  RationalNumber rat32 = new RationalNumber(1200000000,100000);
  RationalNumber rat33 = new RationalNumber(111,17);
  RationalNumber rat34 = new RationalNumber(119,17);
  RationalNumber rat35 = new RationalNumber(115,20);
  RationalNumber rat36 = new RationalNumber(20,-115);
  RationalNumber rat37 = new RationalNumber(-20,115);
  RationalNumber rat39 = new RationalNumber(-14,7);
  RationalNumber rat40 = new RationalNumber(-100,5);
  RationalNumber rat41 = new RationalNumber(-100,10);
  RationalNumber rat42 = new RationalNumber(-24,6);
  RationalNumber rat43 = new RationalNumber(-24,8);
  RationalNumber rat44 = new RationalNumber(-30,60);
  RationalNumber rat45 = new RationalNumber(-20,60);
  //--------------------//
  tester = true;
  if (!(rat0.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat0.toString()");
    System.out.println("rat0.toString() -> " + rat0);
  }
  if (!(rat1.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat1.toString()");
    System.out.println("rat1.toString() -> " + rat1);
  }
  if (!(rat2.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat2.toString()");
    System.out.println("rat2.toString() -> " + rat2);
  }
  if (!(rat3.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat3.toString()");
    System.out.println("rat3.toString() -> " + rat3);
  }
  if (!(rat4.toString().equals("2"))) {
    tester = false;
    System.out.println("Error - rat4.toString()");
    System.out.println("rat4.toString() -> " + rat4);
  }
  if (!(rat5.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat5.toString()");
    System.out.println("rat5.toString() -> " + rat5);
  }
  if (!(rat6.toString().equals("1/3"))) {
    tester = false;
    System.out.println("Error - rat6.toString()");
    System.out.println("rat6.toString() -> " + rat6);
  }
  if (!(rat7.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat7.toString()");
    System.out.println("rat7.toString() -> " + rat7);
  }
  if (!(rat8.toString().equals("1/3"))) {
    tester = false;
    System.out.println("Error - rat8.toString()");
    System.out.println("rat8.toString() -> " + rat8);
  }
  if (!(rat9.toString().equals("3"))) {
    tester = false;
    System.out.println("Error - rat9.toString()");
    System.out.println("rat9.toString() -> " + rat9);
  }
  if (!(rat10.toString().equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat10.toString()");
    System.out.println("rat10.toString() -> " + rat10);
  }
  if (!(rat11.toString().equals("1/4"))) {
    tester = false;
    System.out.println("Error - rat11.toString()");
    System.out.println("rat11.toString() -> " + rat11);
  }
  if (!(rat12.toString().equals("1/4"))) {
    tester = false;
    System.out.println("Error - rat12.toString()");
    System.out.println("rat12.toString() -> " + rat12);
  }
  if (!(rat13.toString().equals("-9/7"))) {
    tester = false;
    System.out.println("Error - rat13.toString()");
    System.out.println("rat13.toString() -> " + rat13);
  }
  if (!(rat14.toString().equals("-18/7"))) {
    tester = false;
    System.out.println("Error - rat14.toString()");
    System.out.println("rat14.toString() -> " + rat14);
  }
  if (!(rat15.toString().equals("-9/7"))) {
    tester = false;
    System.out.println("Error - rat15.toString()");
    System.out.println("rat15.toString() -> " + rat15);
  }
  if (!(rat16.toString().equals("-18/7"))) {
    tester = false;
    System.out.println("Error - rat16.toString()");
    System.out.println("rat16.toString() -> " + rat16);
  }
  if (!(rat17.toString().equals("18/7"))) {
    tester = false;
    System.out.println("Error - rat17.toString()");
    System.out.println("rat17.toString() -> " + rat17);
  }
  if (!(rat18.toString().equals("9/2"))) {
    tester = false;
    System.out.println("Error - rat18.toString()");
    System.out.println("rat18.toString() -> " + rat18);
  }
  if (!(rat19.toString().equals("-9/2"))) {
    tester = false;
    System.out.println("Error - rat19.toString()");
    System.out.println("rat19.toString() -> " + rat19);
  }
  if (!(rat20.toString().equals("-9/2"))) {
    tester = false;
    System.out.println("Error - rat20.toString()");
    System.out.println("rat20.toString() -> " + rat20);
  }
  if (!(rat21.toString().equals("9/2"))) {
    tester = false;
    System.out.println("Error - rat21.toString()");
    System.out.println("rat21.toString() -> " + rat21);
  }
  if (!(rat22.toString().equals("1/12000"))) {
    tester = false;
    System.out.println("Error - rat22.toString()");
    System.out.println("rat22.toString() -> " + rat22);
  }
  if (!(rat23.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat23.toString()");
    System.out.println("rat23.toString() -> " + rat23);
  }
  if (!(rat24.toString().equals("-11/20"))) {
    tester = false;
    System.out.println("Error - rat24.toString()");
    System.out.println("rat24.toString() -> " + rat24);
  }
  if (!(rat25.toString().equals("-11/20"))) {
    tester = false;
    System.out.println("Error - rat25.toString()");
    System.out.println("rat25.toString() -> " + rat25);
  }
  if (!(rat26.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat26.toString()");
    System.out.println("rat26.toString() -> " + rat26);
  }
  if (!(rat27.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat27.toString()");
    System.out.println("rat27.toString() -> " + rat27);
  }
  if (!(rat28.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat28.toString()");
    System.out.println("rat28.toString() -> " + rat28);
  }
  if (!(rat29.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat29.toString()");
    System.out.println("rat29.toString() -> " + rat29);
  }
  if (!(rat30.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat30.toString()");
    System.out.println("rat30.toString() -> " + rat30);
  }
  if (!(rat31.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat31.toString()");
    System.out.println("rat31 -> " + rat31);
  }
  if (!(rat32.toString().equals("12000"))) {
    tester = false;
    System.out.println("Error - rat32.toString()");
    System.out.println("rat32 -> " + rat32);
  }
  if (!(rat33.toString().equals("111/17"))) {
    tester = false;
    System.out.println("Error - rat33.toString()");
    System.out.println("rat33 -> " + rat33);
  }
  if (!(rat34.toString().equals("7"))) {
    tester = false;
    System.out.println("Error - rat34.toString()");
    System.out.println("rat34 -> " + rat34);
  }
  if (!(rat35.toString().equals("23/4"))) {
    tester = false;
    System.out.println("Error - rat35.toString()");
    System.out.println("rat35 -> " + rat35);
  }
  if (!(rat36.toString().equals("-4/23"))) {
    tester = false;
    System.out.println("Error - rat36.toString()");
    System.out.println("rat36 -> " + rat36);
  }
  if (!(rat37.toString().equals("-4/23"))) {
    tester = false;
    System.out.println("Error - rat37.toString()");
    System.out.println("rat37 -> " + rat37);
  }
  if (!(rat38.toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat38.toString()");
    System.out.println("rat38 -> " + rat38);
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
  if (rat13.getNumerator() != -9) {
    tester = false;
    System.out.println("Error - rat13.getNumerator()");
    System.out.println("rat13.getNumerator() -> " + rat13.getNumerator());
  }
  if (rat14.getNumerator() != -18) {
    tester = false;
    System.out.println("Error - rat14.getNumerator()");
    System.out.println("rat14.getNumerator() -> " + rat14.getNumerator());
  }
  if (rat15.getNumerator() != -9) {
    tester = false;
    System.out.println("Error - rat15.getNumerator()");
    System.out.println("rat15.getNumerator() -> " + rat15.getNumerator());
  }
  if (rat16.getNumerator() != -18) {
    tester = false;
    System.out.println("Error - rat16.getNumerator()");
    System.out.println("rat16.getNumerator() -> " + rat16.getNumerator());
  }
  if (rat17.getNumerator() != 18) {
    tester = false;
    System.out.println("Error - rat17.getNumerator()");
    System.out.println("rat17.getNumerator() -> " + rat17.getNumerator());
  }
  if (rat18.getNumerator() != 9) {
    tester = false;
    System.out.println("Error - rat18.getNumerator()");
    System.out.println("rat18.getNumerator() -> " + rat18.getNumerator());
  }
  if (rat19.getNumerator() != -9) {
    tester = false;
    System.out.println("Error - rat19.getNumerator()");
    System.out.println("rat19.getNumerator() -> " + rat19.getNumerator());
  }
  if (rat20.getNumerator() != -9) {
    tester = false;
    System.out.println("Error - rat20.getNumerator()");
    System.out.println("rat20.getNumerator() -> " + rat20.getNumerator());
  }
  if (rat21.getNumerator() != 9) {
    tester = false;
    System.out.println("Error - rat21.getNumerator()");
    System.out.println("rat21.getNumerator() -> " + rat21.getNumerator());
  }
  if (rat22.getNumerator() != 1) {
    tester = false;
    System.out.println("Error - rat22.getNumerator()");
    System.out.println("rat22.getNumerator() -> " + rat22.getNumerator());
  }
  if (rat23.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat23.getNumerator()");
    System.out.println("rat23.getNumerator() -> " + rat23.getNumerator());
  }
  if (rat24.getNumerator() != -11) {
    tester = false;
    System.out.println("Error - rat24.getNumerator()");
    System.out.println("rat24.getNumerator() -> " + rat24.getNumerator());
  }
  if (rat25.getNumerator() != -11) {
    tester = false;
    System.out.println("Error - rat25.getNumerator()");
    System.out.println("rat25.getNumerator() -> " + rat25.getNumerator());
  }
  if (rat26.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat26.getNumerator()");
    System.out.println("rat26.getNumerator() -> " + rat26.getNumerator());
  }
  if (rat27.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat27.getNumerator()");
    System.out.println("rat27.getNumerator() -> " + rat27.getNumerator());
  }
  if (rat31.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat31.getNumerator()");
    System.out.println("rat31.getNumerator() -> " + rat31.getNumerator());
  }
  if (rat29.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat29.getNumerator()");
    System.out.println("rat29.getNumerator() -> " + rat29.getNumerator());
  }
  if (rat30.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat30.getNumerator()");
    System.out.println("rat30.getNumerator() -> " + rat30.getNumerator());
  }
  if (rat31.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat31.getNumerator()");
    System.out.println("rat31.getNumerator() -> " + rat31.getNumerator());
  }
  if (rat32.getNumerator() != 12000) {
    tester = false;
    System.out.println("Error - rat32.getNumerator()");
    System.out.println("rat32.getNumerator() -> " + rat32.getNumerator());
  }
  if (rat33.getNumerator() != 111) {
    tester = false;
    System.out.println("Error - rat33.getNumerator()");
    System.out.println("rat33.getNumerator() -> " + rat33.getNumerator());
  }
  if (rat34.getNumerator() != 7) {
    tester = false;
    System.out.println("Error - rat34.getNumerator()");
    System.out.println("rat34.getNumerator() -> " + rat34.getNumerator());
  }
  if (rat35.getNumerator() != 23) {
    tester = false;
    System.out.println("Error - rat35.getNumerator()");
    System.out.println("rat35.getNumerator() -> " + rat35.getNumerator());
  }
  if (rat36.getNumerator() != -4) {
    tester = false;
    System.out.println("Error - rat36.getNumerator()");
    System.out.println("rat36.getNumerator() -> " + rat36.getNumerator());
  }
  if (rat37.getNumerator() != -4) {
    tester = false;
    System.out.println("Error - rat37.getNumerator()");
    System.out.println("rat37.getNumerator() -> " + rat37.getNumerator());
  }
  if (rat38.getNumerator() != 0) {
    tester = false;
    System.out.println("Error - rat38.getNumerator()");
    System.out.println("rat38.getNumerator() -> " + rat38.getNumerator());
  }
  System.out.println("\n getNumerator (rational) - Test: "+tester);
//   //--------------------//
  tester = true;
  if (rat0.getDenominator() != 1) {
    tester = false;
    System.out.println("\nError - rat0.getDenominator()");
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
  if (rat3.getDenominator() != 7) {
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
  if (rat13.getDenominator() != 7) {
    tester = false;
    System.out.println("Error - rat13.getDenominator()");
    System.out.println("rat13.getDenominator() -> " + rat13.getDenominator());
  }
  if (rat14.getDenominator() != 7) {
    tester = false;
    System.out.println("Error - rat14.getDenominator()");
    System.out.println("rat14.getDenominator() -> " + rat14.getDenominator());
  }
  if (rat15.getDenominator() != 7) {
    tester = false;
    System.out.println("Error - rat15.getDenominator()");
    System.out.println("rat15.getDenominator() -> " + rat15.getDenominator());
  }
  if (rat16.getDenominator() != 7) {
    tester = false;
    System.out.println("Error - rat16.getDenominator()");
    System.out.println("rat16.getDenominator() -> " + rat16.getDenominator());
  }
  if (rat17.getDenominator() != 7) {
    tester = false;
    System.out.println("Error - rat17.getDenominator()");
    System.out.println("rat17.getDenominator() -> " + rat17.getDenominator());
  }
  if (rat18.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat18.getDenominator()");
    System.out.println("rat18.getDenominator() -> " + rat18.getDenominator());
  }
  if (rat19.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat19.getDenominator()");
    System.out.println("rat19.getDenominator() -> " + rat19.getDenominator());
  }
  if (rat20.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat20.getDenominator()");
    System.out.println("rat20.getDenominator() -> " + rat20.getDenominator());
  }
  if (rat21.getDenominator() != 2) {
    tester = false;
    System.out.println("Error - rat21.getDenominator()");
    System.out.println("rat21.getDenominator() -> " + rat21.getDenominator());
  }
  if (rat22.getDenominator() != 12000) {
    tester = false;
    System.out.println("Error - rat22.getDenominator()");
    System.out.println("rat22.getDenominator() -> " + rat22.getDenominator());
  }
  if (rat23.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat23.getDenominator()");
    System.out.println("rat23.getDenominator() -> " + rat23.getDenominator());
  }
  if (rat24.getDenominator() != 20) {
    tester = false;
    System.out.println("Error - rat24.getDenominator()");
    System.out.println("rat24.getDenominator() -> " + rat24.getDenominator());
  }
  if (rat25.getDenominator() != 20) {
    tester = false;
    System.out.println("Error - rat25.getDenominator()");
    System.out.println("rat25.getDenominator() -> " + rat25.getDenominator());
  }
  if (rat26.getDenominator() != 55) {
    tester = false;
    System.out.println("Error - rat26.getDenominator()");
    System.out.println("rat26.getDenominator() -> " + rat26.getDenominator());
  }
  if (rat27.getDenominator() != 55) {
    tester = false;
    System.out.println("Error - rat27.getDenominator()");
    System.out.println("rat27.getDenominator() -> " + rat27.getDenominator());
  }
  if (rat28.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat28.getDenominator()");
    System.out.println("rat28.getDenominator() -> " + rat28.getDenominator());
  }
  if (rat29.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat29.getDenominator()");
    System.out.println("rat29.getDenominator() -> " + rat29.getDenominator());
  }
  if (rat30.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat30.getDenominator()");
    System.out.println("rat30.getDenominator() -> " + rat30.getDenominator());
  }
  if (rat31.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat31.getDenominator()");
    System.out.println("rat31.getDenominator() -> " + rat31.getDenominator());
  }
  if (rat38.getDenominator() != 55) {
    tester = false;
    System.out.println("Error - rat38.getDenominator()");
    System.out.println("rat38.getDenominator() -> " + rat38.getDenominator());
  }
  if (rat32.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat32.getDenominator()");
    System.out.println("rat32.getDenominator() -> " + rat32.getDenominator());
  }
  if (rat33.getDenominator() != 17) {
    tester = false;
    System.out.println("Error - rat33.getDenominator()");
    System.out.println("rat33.getDenominator() -> " + rat33.getDenominator());
  }
  if (rat34.getDenominator() != 1) {
    tester = false;
    System.out.println("Error - rat34.getDenominator()");
    System.out.println("rat34.getDenominator() -> " + rat34.getDenominator());
  }
  if (rat35.getDenominator() != 4) {
    tester = false;
    System.out.println("Error - rat35.getDenominator()");
    System.out.println("rat35.getDenominator() -> " + rat35.getDenominator());
  }
  if (rat36.getDenominator() != 23) {
    tester = false;
    System.out.println("Error - rat36.getDenominator()");
    System.out.println("rat36.getDenominator() -> " + rat36.getDenominator());
  }
  if (rat37.getDenominator() != 23) {
    tester = false;
    System.out.println("Error - rat37.getDenominator()");
    System.out.println("rat37.getDenominator() -> " + rat37.getDenominator());
  }
   System.out.println("\n getDenominator (rational) - Test: "+tester);
//   //--------------------//
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
  if (rat8.getValue() != (1/3.0)) {
    tester = false;
    System.out.println("Error - rat8.getValue()");
    System.out.println("rat8.getValue() -> " + rat8.getValue());
  }
  if (rat9.getValue() != 3) {
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
  if (rat13.getValue() != (-18/14.0)) {
    tester = false;
    System.out.println("Error - rat13.getValue()");
    System.out.println("rat13.getValue() -> " + rat13.getValue());
  }
  if (rat14.getValue() != (-18/7.0)) {
    tester = false;
    System.out.println("Error - rat14.getValue()");
    System.out.println("rat14.getValue() -> " + rat14.getValue());
  }
  if (rat15.getValue() != (18/-14.0)) {
    tester = false;
    System.out.println("Error - rat15.getValue()");
    System.out.println("rat15.getValue() -> " + rat15.getValue());
  }
  if (rat16.getValue() != (18/-7.0)) {
    tester = false;
    System.out.println("Error - rat16.getValue()");
    System.out.println("rat16.getValue() -> " + rat16.getValue());
  }
  if (rat17.getValue() != (-18/-7.0)) {
    tester = false;
    System.out.println("Error - rat17.getValue()");
    System.out.println("rat17.getValue() -> " + rat17.getValue());
  }
  if (rat18.getValue() != (-81/-18.0)) {
    tester = false;
    System.out.println("Error - rat18.getValue()");
    System.out.println("rat18.getValue() -> " + rat18.getValue());
  }
  if (rat19.getValue() != (81/-18.0)) {
    tester = false;
    System.out.println("Error - rat19.getValue()");
    System.out.println("rat19.getValue() -> " + rat19.getValue());
  }
  if (rat20.getValue() != (-81/18.0)) {
    tester = false;
    System.out.println("Error - rat20.getValue()");
    System.out.println("rat20.getValue() -> " + rat20.getValue());
  }
  if (rat21.getValue() != (81/18.0)) {
    tester = false;
    System.out.println("Error - rat21.getValue()");
    System.out.println("rat21.getValue() -> " + rat21.getValue());
  }
  if (rat22.getValue() != (100000/1200000000.0)) {
    tester = false;
    System.out.println("Error - rat22.getValue()");
    System.out.println("rat22.getValue() -> " + rat22.getValue());
  }
  if (rat23.getValue() != (-0/1.0)) {
    tester = false;
    System.out.println("Error - rat23.getValue()");
    System.out.println("rat23.getValue() -> " + rat23.getValue());
  }
  if (rat24.getValue() != (165/-300.0)) {
    tester = false;
    System.out.println("Error - rat24.getValue()");
    System.out.println("rat24.getValue() -> " + rat24.getValue());
  }
  if (rat25.getValue() != (-165/300.0)) {
    tester = false;
    System.out.println("Error - rat25.getValue()");
    System.out.println("rat25.getValue() -> " + rat25.getValue());
  }
  if (rat26.getValue() != (0/-55.0)) {
    tester = false;
    System.out.println("Error - rat26.getValue()");
    System.out.println("rat26.getValue() -> " + rat26.getValue());
  }
  if (rat27.getValue() != (0/55.0)) {
    tester = false;
    System.out.println("Error - rat27.getValue()");
    System.out.println("rat27.getValue() -> " + rat27.getValue());
  }
  if (rat28.getValue() != 0.0) {
    tester = false;
    System.out.println("Error - rat28.getValue()");
    System.out.println("rat28.getValue() -> " + rat28.getValue());
  }
  if (rat29.getValue() != 0.0) {
    tester = false;
    System.out.println("Error - rat29.getValue()");
    System.out.println("rat29.getValue() -> " + rat29.getValue());
  }
  if (rat30.getValue() != 0.0) {
    tester = false;
    System.out.println("Error - rat30.getValue()");
    System.out.println("rat30.getValue() -> " + rat30.getValue());
  }
  if (rat31.getValue() != 0.0) {
    tester = false;
    System.out.println("Error - rat31.getValue()");
    System.out.println("rat31.getValue() -> " + rat31.getValue());
  }
  if (rat38.getValue() != 0.0) {
    tester = false;
    System.out.println("Error - rat38.getValue()");
    System.out.println("rat38.getValue() -> " + rat38.getValue());
  }
  if (rat32.getValue() != 12000) {
    tester = false;
    System.out.println("Error - rat32.getValue()");
    System.out.println("rat32.getValue() -> " + rat32.getValue());
  }
  if (rat33.getValue() != (111/17.0)) {
    tester = false;
    System.out.println("Error - rat33.getValue()");
    System.out.println("rat33.getValue() -> " + rat33.getValue());
  }
  if (rat34.getValue() != 7) {
    tester = false;
    System.out.println("Error - rat34.getValue()");
    System.out.println("rat34.getValue() -> " + rat34.getValue());
  }
  if (rat35.getValue() != 5.75) {
    tester = false;
    System.out.println("Error - rat35.getValue()");
    System.out.println("rat35.getValue() -> " + rat35.getValue());
  }
  if (rat36.getValue() != (20/-115.0)) {
    tester = false;
    System.out.println("Error - rat36.getValue()");
    System.out.println("rat36.getValue() -> " + rat36.getValue());
  }
  if (rat37.getValue() != (-20/115.0)) {
    tester = false;
    System.out.println("Error - rat37.getValue()");
    System.out.println("rat37.getValue() -> " + rat37.getValue());
  }
  System.out.println("\n getValue(rational) - Test: "+tester);

//   //--------------------//
  tester = true;
  if (rat0.equals(rat1)) {
    tester = false;
    System.out.println("Error - rat0.equals(rat1)");
    System.out.println("rat0 -> " + rat0);
    System.out.println("rat1 -> " + rat1);
  }
  if (rat1.equals(rat2)) {
    tester = false;
    System.out.println("Error - rat1.equals(rat2)");
    System.out.println("rat1 -> " + rat1);
    System.out.println("rat2 -> " + rat2);
  }
  if (rat2.equals(rat3)) {
    tester = false;
    System.out.println("Error - rat2.equals(rat3)");
    System.out.println("rat2 -> " + rat2);
    System.out.println("rat3 -> " + rat3);
  }
  if (rat2.equals(rat4)) {
    tester = false;
    System.out.println("Error - rat2.equals(rat4)");
    System.out.println("rat2 -> " + rat2);
    System.out.println("rat4 -> " + rat3);
  }
  if (rat3.equals(rat4)) {
    tester = false;
    System.out.println("Error - rat3.equals(rat4)");
    System.out.println("rat3 -> " + rat2);
    System.out.println("rat4 -> " + rat3);
  }
  if (!(rat5.equals(rat7))) {
    tester = false;
    System.out.println("Error - rat5.equals(rat7)");
    System.out.println("rat5 -> " + rat5);
    System.out.println("rat7 -> " + rat7);
  }
  if (!(rat6.equals(rat8))) {
    tester = false;
    System.out.println("Error - rat6.equals(rat8)");
    System.out.println("rat6 -> " + rat6);
    System.out.println("rat8 -> " + rat8);
  }
  if (!(rat5.equals(rat10))) {
    tester = false;
    System.out.println("Error - rat5.equals(rat10)");
    System.out.println("rat5 -> " + rat5);
    System.out.println("rat10 -> " + rat10);
  }
  if (!(rat11.equals(rat12))) {
    tester = false;
    System.out.println("Error - rat11.equals(rat12)");
    System.out.println("rat11 -> " + rat11);
    System.out.println("rat12 -> " + rat12);
  }
  if (rat10.equals(rat11)) {
    tester = false;
    System.out.println("Error - rat10.equals(rat11)");
    System.out.println("rat10 -> " + rat10);
    System.out.println("rat11 -> " + rat11);
  }
  if (rat9.equals(rat10)) {
    tester = false;
    System.out.println("Error - rat9.equals(rat10)");
    System.out.println("rat9 -> " + rat9);
    System.out.println("rat10 -> " + rat10);
  }
  if (rat8.equals(rat9)) {
    tester = false;
    System.out.println("Error - rat8.equals(rat9)");
    System.out.println("rat8 -> " + rat8);
    System.out.println("rat9 -> " + rat9);
  }
  if (rat7.equals(rat8)) {
    tester = false;
    System.out.println("Error - rat7.equals(rat8)");
    System.out.println("rat7 -> " + rat7);
    System.out.println("rat8 -> " + rat8);
  }
  if (!(rat24.equals(rat25))) {
    tester = false;
    System.out.println("Error - rat24.equals(rat25)");
    System.out.println("rat24 -> " + rat24);
    System.out.println("rat24 -> " + rat25);
  }
  if (!(rat26.equals(rat27))) {
    tester = false;
    System.out.println("Error - rat26.equals(rat27)");
    System.out.println("rat26 -> " + rat26);
    System.out.println("rat27 -> " + rat27);
  }
  if (!(rat32.equals(rat22.reciprocal()))) {
    tester = false;
    System.out.println("Error - rat32.equals(rat22.reciprocal())");
    System.out.println("rat32 -> " + rat32);
    System.out.println("(rat22.reciprocal()) ->" + (rat22.reciprocal()));
  }
  if (rat25.equals(rat26)) {
    tester = false;
    System.out.println("Error - rat25.equals(rat26)");
    System.out.println("rat25 -> " + rat25);
    System.out.println("rat26 -> " + rat26);
  }
  if (rat13.equals(rat3)) {
    tester = false;
    System.out.println("Error - rat13.equals(rat3)");
    System.out.println("rat13 -> " + rat13);
    System.out.println("rat3 -> " + rat3);
  }
  if (!(rat36.equals(rat37))) {
    tester = false;
    System.out.println("Error - rat36.equals(rat37)");
    System.out.println("rat36 -> " + rat36);
    System.out.println("rat37 -> " + rat37);
  }
  if (rat13.equals(rat14)) {
    tester = false;
    System.out.println("Error - rat13.equals(rat14)");
    System.out.println("rat13 -> " + rat13);
    System.out.println("rat14 -> " + rat14);
  }
  if (!(rat13.equals(rat15))) {
    tester = false;
    System.out.println("Error - rat13.equals(rat15)");
    System.out.println("rat13 -> " + rat13);
    System.out.println("rat15 -> " + rat15);
  }
  if (rat14.equals(rat15)) {
    tester = false;
    System.out.println("Error - rat14.equals(rat15)");
    System.out.println("rat14 -> " + rat14);
    System.out.println("rat15 -> " + rat15);
  }
  if (rat15.equals(rat16)) {
    tester = false;
    System.out.println("Error - rat15.equals(rat16)");
    System.out.println("rat15 -> " + rat15);
    System.out.println("rat16 -> " + rat16);
  }
  if (rat16.equals(rat13)) {
    tester = false;
    System.out.println("Error - rat16.equals(rat13)");
    System.out.println("rat16 -> " + rat16);
    System.out.println("rat13 -> " + rat13);
  }
  if (!(rat11.equals(rat11))) {
    tester = false;
    System.out.println("Error - rat11.equals(rat11)");
    System.out.println("rat11 -> " + rat11);
  }
  if (!(rat13.equals(rat13))) {
    tester = false;
    System.out.println("Error - rat13.equals(rat13)");
    System.out.println("rat13 -> " + rat13);
  }
  if (!(rat23.equals(rat23))) {
    tester = false;
    System.out.println("Error - rat23.equals(rat23)");
    System.out.println("rat23 -> " + rat23);
  }
  System.out.println("\n equals(rational) (Part 1) - Test: "+tester);
  //--------------------//
  RationalNumber[] rats = {rat0,rat1,rat2,rat3,rat4,rat5,rat6,rat7,rat8,rat9,rat10,rat11,rat12,rat13,rat14,rat15,rat16,rat13,rat18,rat19,rat20,rat21,rat22,rat23,rat24,rat25,rat26,rat27,rat28,rat29,rat30,rat31,rat32,rat33,rat34,rat35,rat36,rat37};
  //--------------------//
  tester = true;
  for (int i = 0; i < rats.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      if (rats[i].equals(rats[a]) != ((rats[i].getNumerator() == rats[a].getNumerator()) && (rats[i].getDenominator() == rats[a].getDenominator()))) {
        tester = false;
        System.out.println(rats[i]);
        System.out.println(rats[a]);
        System.out.println("Expected Output: " + ((rats[i].getNumerator() == rats[a].getNumerator()) && (rats[i].getDenominator() == rats[a].getDenominator())));
        System.out.println("Actual Output: " + rats[i].equals(rats[a]));
      }
    }
  }
  System.out.println("\n equals(rational) (Part 2) - Test: "+tester);
  //--------------------//
  tester = true;
  for (int i = 0; i < rats.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      if (rats[i].equals(rats[a].reciprocal()) != ((rats[i].getNumerator() == (rats[a].reciprocal()).getNumerator()) && (rats[i].getDenominator() == (rats[a].reciprocal()).getDenominator()))) {
        tester = false;
        System.out.println("i: "+rats[i]);
        System.out.println("a: "+rats[a]);
        System.out.println("a reciprocal: "+(rats[a].reciprocal()));
        System.out.println("Expected Output: " + ((rats[i].getNumerator() == (rats[a].reciprocal()).getNumerator()) && (rats[i].getDenominator() == (rats[a].reciprocal()).getDenominator())));
        System.out.println("Actual Output: " + rats[i].equals(rats[a]));
      }
    }
  }
  System.out.println("\n equals(rational) with reciprocal  - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(((rat0.reciprocal()).toString()).equals("0"))) {
      tester = false;
      System.out.println("Error - rat0.reciprocal()");
      System.out.println("Orginal: "+rat0);
      System.out.println("Reciprocal: "+rat0.reciprocal());
    }
  if (!(((rat1.reciprocal()).toString()).equals("0"))) {
      tester = false;
      System.out.println("Error - rat1.reciprocal()");
      System.out.println("Orginal: "+rat1);
      System.out.println("Reciprocal: "+rat1.reciprocal());
    }
  if (!(((rat2.reciprocal()).toString()).equals("0"))) {
      tester = false;
      System.out.println("Error - rat2.reciprocal()");
      System.out.println("Orginal: "+rat2);
      System.out.println("Reciprocal: "+rat2.reciprocal());
    }
  if (!(((rat3.reciprocal()).toString()).equals("0"))) {
      tester = false;
      System.out.println("Error - rat3.reciprocal()");
      System.out.println("Orginal: "+rat3);
      System.out.println("Reciprocal: "+rat3.reciprocal());
    }
  if (!(((rat4.reciprocal()).toString()).equals("1/2"))) {
    tester = false;
    System.out.println("Error - rat4.reciprocal()");
    System.out.println("Orginal: "+rat4);
    System.out.println("Reciprocal: "+rat4.reciprocal());
  }
  if (!(((rat5.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Error - rat5.reciprocal()");
    System.out.println("Orginal: "+rat5);
    System.out.println("Reciprocal: "+rat5.reciprocal());
  }
  if (!(((rat6.reciprocal()).toString()).equals("3"))) {
    tester = false;
    System.out.println("Error - rat6.reciprocal()");
    System.out.println("Orginal: "+rat6);
    System.out.println("Reciprocal: "+rat6.reciprocal());
  }
  if (!(((rat7.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Error - rat7.reciprocal()");
    System.out.println("Orginal: "+rat7);
    System.out.println("Reciprocal: "+rat7.reciprocal());
  }
  if (!(((rat8.reciprocal()).toString()).equals("3"))) {
    tester = false;
    System.out.println("Error - rat8.reciprocal()");
    System.out.println("Orginal: "+rat8);
    System.out.println("Reciprocal: "+rat8.reciprocal());
  }
  if (!(((rat9.reciprocal()).toString()).equals("1/3"))) {
    tester = false;
    System.out.println("Error - rat9.reciprocal()");
    System.out.println("Orginal: "+rat9);
    System.out.println("Reciprocal: "+rat9.reciprocal());
  }
  if (!(((rat10.reciprocal()).toString()).equals("2"))) {
    tester = false;
    System.out.println("Error - rat10.reciprocal()");
    System.out.println("Orginal: "+rat10);
    System.out.println("Reciprocal: "+rat10.reciprocal());
  }
  if (!(((rat11.reciprocal()).toString()).equals("4"))) {
    tester = false;
    System.out.println("Error - rat11.reciprocal()");
    System.out.println("Orginal: "+rat11);
    System.out.println("Reciprocal: "+rat11.reciprocal());
  }
  if (!(((rat12.reciprocal()).toString()).equals("4"))) {
    tester = false;
    System.out.println("Error - rat12.reciprocal()");
    System.out.println("Orginal: "+rat12);
    System.out.println("Reciprocal: "+rat12.reciprocal());
  }
  if (!(((rat13.reciprocal()).toString()).equals("-7/9"))) {
    tester = false;
    System.out.println("Error - rat13.reciprocal()");
    System.out.println("Orginal: "+rat13);
    System.out.println("Reciprocal: "+rat13.reciprocal());
  }
  if (!(((rat14.reciprocal()).toString()).equals("-7/18"))) {
    tester = false;
    System.out.println("Error - rat14.reciprocal()");
    System.out.println("Orginal: "+rat14);
    System.out.println("Reciprocal: "+rat14.reciprocal());
  }
  if (!(((rat15.reciprocal()).toString()).equals("-7/9"))) {
    tester = false;
    System.out.println("Error - rat15.reciprocal()");
    System.out.println("Orginal: "+rat15);
    System.out.println("Reciprocal: "+rat15.reciprocal());
  }
  if (!(((rat16.reciprocal()).toString()).equals("-7/18"))) {
    tester = false;
    System.out.println("Error - rat16.reciprocal()");
    System.out.println("Orginal: "+rat16);
    System.out.println("Reciprocal: "+rat16.reciprocal());
  }
  if (!(((rat17.reciprocal()).toString()).equals("7/18"))) {
    tester = false;
    System.out.println("Error - rat17.reciprocal()");
    System.out.println("Orginal: "+rat17);
    System.out.println("Reciprocal: "+rat17.reciprocal());
  }
  if (!(((rat18.reciprocal()).toString()).equals("2/9"))) {
    tester = false;
    System.out.println("Error - rat18.reciprocal()");
    System.out.println("Orginal: "+rat18);
    System.out.println("Reciprocal: "+rat18.reciprocal());
  }
  if (!(((rat19.reciprocal()).toString()).equals("-2/9"))) {
    tester = false;
    System.out.println("Error - rat19.reciprocal()");
    System.out.println("Orginal: "+rat19);
    System.out.println("Reciprocal: "+rat19.reciprocal());
  }
  if (!(((rat20.reciprocal()).toString()).equals("-2/9"))) {
    tester = false;
    System.out.println("Error - rat20.reciprocal()");
    System.out.println("Orginal: "+rat20);
    System.out.println("Reciprocal: "+rat20.reciprocal());
  }
  if (!(((rat21.reciprocal()).toString()).equals("2/9"))) {
    tester = false;
    System.out.println("Error - rat21.reciprocal()");
    System.out.println("Orginal: "+rat21);
    System.out.println("Reciprocal: "+rat21.reciprocal());
  }
  if (!(((rat22.reciprocal()).toString()).equals("12000"))) {
    tester = false;
    System.out.println("Error - rat22.reciprocal()");
    System.out.println("Orginal: "+rat22);
    System.out.println("Reciprocal: "+rat22.reciprocal());
  }
  if (!(((rat23.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat23.reciprocal()");
    System.out.println("Orginal: "+rat23);
    System.out.println("Reciprocal: "+rat23.reciprocal());
  }
  if (!(((rat24.reciprocal()).toString()).equals("-20/11"))) {
    tester = false;
    System.out.println("Error - rat24.reciprocal()");
    System.out.println("Orginal: "+rat24);
    System.out.println("Reciprocal: "+rat24.reciprocal());
  }
  if (!(((rat25.reciprocal()).toString()).equals("-20/11"))) {
    tester = false;
    System.out.println("Error - rat25.reciprocal()");
    System.out.println("Orginal: "+rat25);
    System.out.println("Reciprocal: "+rat25.reciprocal());
  }
  if (!(((rat26.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat26.reciprocal()");
    System.out.println("Orginal: "+rat26);
    System.out.println("Reciprocal: "+rat26.reciprocal());
  }
  if (!(((rat27.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat27.reciprocal()");
    System.out.println("Orginal: "+rat27);
    System.out.println("Reciprocal: "+rat27.reciprocal());
  }
  if (!(((rat28.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat28.reciprocal()");
    System.out.println("Orginal: "+rat28);
    System.out.println("Reciprocal: "+rat28.reciprocal());
  }
  if (!(((rat29.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat29.reciprocal()");
    System.out.println("Orginal: "+rat29);
    System.out.println("Reciprocal: "+rat29.reciprocal());
  }
  if (!(((rat30.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat30.reciprocal()");
    System.out.println("Orginal: "+rat30);
    System.out.println("Reciprocal: "+rat30.reciprocal());
  }
  if (!(((rat31.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat31.reciprocal()");
    System.out.println("Orginal: "+rat31);
    System.out.println("Reciprocal: "+rat31.reciprocal());
  }
  if (!(((rat38.reciprocal()).toString()).equals("0"))) {
    tester = false;
    System.out.println("Error - rat38.reciprocal()");
    System.out.println("Orginal: "+rat38);
    System.out.println("Reciprocal: "+rat38.reciprocal());
  }
  if (!(((rat32.reciprocal()).toString()).equals("1/12000"))) {
    tester = false;
    System.out.println("Error - rat32.reciprocal()");
    System.out.println("Orginal: "+rat32);
    System.out.println("Reciprocal: "+rat32.reciprocal());
  }
  if (!(((rat33.reciprocal()).toString()).equals("17/111"))) {
    tester = false;
    System.out.println("Error - rat33.reciprocal()");
    System.out.println("Orginal: "+rat33);
    System.out.println("Reciprocal: "+rat33.reciprocal());
  }
  if (!(((rat34.reciprocal()).toString()).equals("1/7"))) {
    tester = false;
    System.out.println("Error - rat34.reciprocal()");
    System.out.println("Orginal: "+rat34);
    System.out.println("Reciprocal: "+rat34.reciprocal());
  }
  if (!(((rat35.reciprocal()).toString()).equals("4/23"))) {
    tester = false;
    System.out.println("Error - rat35.reciprocal()");
    System.out.println("Orginal: "+rat35);
    System.out.println("Reciprocal: "+rat35.reciprocal());
  }
  if (!(((rat36.reciprocal()).toString()).equals("-23/4"))) {
    tester = false;
    System.out.println("Error - rat36.reciprocal()");
    System.out.println("Orginal: "+rat36);
    System.out.println("Reciprocal: "+rat36.reciprocal());
  }
  if (!(((rat37.reciprocal()).toString()).equals("-23/4"))) {
    tester = false;
    System.out.println("Error - rat37.reciprocal()");
    System.out.println("Orginal: "+rat37);
    System.out.println("Reciprocal: "+rat37.reciprocal());
  }
  System.out.println("\n Reciprocal(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (RationalNumber.gcd(2,4) != 2) {
    tester = false;
    System.out.println("Num 1: 2");
    System.out.println("Num 2: 4");
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
  if (RationalNumber.gcd(-81,18) != 9) {
    tester = false;
    System.out.println("Num 1: -81");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(-81, 23) != 1) {
    tester = false;
    System.out.println("Num 1: -81");
    System.out.println("Num 2: 23");
  }
  if (RationalNumber.gcd(0,18) != 1) {
    tester = false;
    System.out.println("Num 1: 0");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(-11,18) != 1) {
    tester = false;
    System.out.println("Num 1: -11");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(-24,18) != 6) {
    tester = false;
    System.out.println("Num 1: -24");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(-300,18) != 6) {
    tester = false;
    System.out.println("Num 1: -300");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(-0,18) != 1) {
    tester = false;
    System.out.println("Num 1: -0");
    System.out.println("Num 2: 18");
  }
  if (RationalNumber.gcd(81,-18) != 9) {
    tester = false;
    System.out.println("Num 1: 81");
    System.out.println("Num 2: -18");
  }
  if (RationalNumber.gcd(-81,-18) != 9) {
    tester = false;
    System.out.println("Num 1: -81");
    System.out.println("Num 2: -18");
  }
  if (RationalNumber.gcd(-81,0) != 1) {
    tester = false;
    System.out.println("Num 1: -81");
    System.out.println("Num 2: 0");
  }
  System.out.println("\n gcf(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(rat0.multiply(rat3).multiply(rat1).multiply(rat2).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat0.multiply(rat3).mutiply(rat1).multiply(rat2)");
    System.out.println("Output: " + rat0.multiply(rat3).multiply(rat1).multiply(rat2));
  }
  if (rat4.multiply(rat5).multiply(rat6).multiply(rat9).getValue() != 1) {
    tester = false;
    System.out.println("Error - rat4.multiply(rat5).multiply(rat6).multiply(rat9)");
    System.out.println("Output: " + rat4.multiply(rat5).multiply(rat6).multiply(rat9));
  }
  if (!(rat34.multiply(rat10).multiply(rat11).multiply(rat12).toString().equals("7/32"))) {
    tester = false;
    System.out.println("Error - rat34.multiply(rat10).multiply(rat11).multiply(rat12)");
    System.out.println("Output: " + rat34.multiply(rat10).multiply(rat11).multiply(rat12));
  }
  if (!(rat42.multiply(rat43).multiply(rat41).multiply(rat40).multiply(rat22).multiply(rat39).toString().equals("-2/5"))) {
    tester = false;
    System.out.println("Error - rat42.multiply(rat43).multiply(rat41).mutiply(rat40).mutiply(rat22).multiply(39)");
    System.out.println("Output: "+rat42.multiply(rat43).multiply(rat41).multiply(rat40).multiply(rat22).multiply(rat39));
  }
  if (!(rat32.multiply(rat44).multiply(rat45).multiply(rat12).multiply(rat8).multiply(rat43).toString().equals("-500"))) {
    tester = false;
    System.out.println("Error - rat32.multiply(rat44).multiply(rat45).multiply(rat12).multiply(rat8).multiply(rat43)");
    System.out.println("Output: "+ rat32.multiply(rat44).multiply(rat45).multiply(rat12).multiply(rat8).multiply(rat43));
  }
  if (!(rat1.multiply(rat32).multiply(rat21).multiply(rat14).multiply(rat19).multiply(rat43).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat1.multiply(rat32).multiply(rat21).multiply(rat14).multiply(rat19).multiply(rat43)");
    System.out.println("Output: "+ rat1.multiply(rat32).multiply(rat21).multiply(rat14).multiply(rat19).multiply(rat43));
  }
  if(!(rat45.multiply(rat44).multiply(rat43).multiply(rat42).multiply(rat41).multiply(rat40).multiply(rat9).toString().equals("1200"))){
    tester = false;
    System.out.println("Error - rat45.multiply(rat44).multiply(rat43).multiply(rat42).multiply(rat41).multiply(rat40).multiply(rat9)");
    System.out.println("Output: "+ rat45.multiply(rat44).multiply(rat43).multiply(rat42).multiply(rat41).multiply(rat40).multiply(rat9));
  }
  if (!(rat33.multiply(rat18).multiply(rat10).multiply(rat19).multiply(rat34).multiply(rat8).toString().equals("-20979/136"))) {
    tester = false;
    System.out.println("Error - rat33.multiply(rat18).multiply(rat10).multiply(rat19).multiply(rat34).multiply(rat8)");
    System.out.println("Output: "+rat33.multiply(rat18).multiply(rat10).multiply(rat19).multiply(rat34).multiply(rat8)
    );
  }
  if (!(rat6.multiply(rat13).multiply(rat42).multiply(rat7).multiply(rat0).multiply(rat41).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat6.multiply(rat13).multiply(rat42).multiply(rat7).multiply(rat0).multiply(rat41)");
    System.out.println("Output: "+rat6.multiply(rat13).multiply(rat42).multiply(rat7).multiply(rat41).multiply(rat0));
  }
  if(!(rat34.multiply(rat36).multiply(rat28).multiply(rat14).multiply(rat31).multiply(rat43).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat34.multiply(rat36).multiply(rat28).multiply(rat14).multiply(rat31).multiply(rat43)");
    System.out.println("Output: "+rat34.multiply(rat36).multiply(rat28).multiply(rat14).multiply(rat31).multiply(rat43));
  }
  if(!(rat12.multiply(rat44).multiply(rat33).multiply(rat34).multiply(rat14).multiply(rat43).toString().equals("-2997/68"))) {
    tester = false;
    System.out.println("Error - rat12.multiply(rat44).multiply(rat33).multiply(rat34).multiply(rat14).multiply(rat43)");
    System.out.println("Output: "+rat12.multiply(rat44).multiply(rat33).multiply(rat34).multiply(rat14).multiply(rat43));
  }
  if(!(rat13.multiply(rat28).multiply(rat4).multiply(rat7).multiply(rat8).multiply(rat10).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat13.multiply(rat28).multiply(rat4).multiply(rat7).multiply(rat8).multiply(rat10)");
    System.out.println("Output: "+rat13.multiply(rat28).multiply(rat4).multiply(rat7).multiply(rat8).multiply(rat10));
  }
   System.out.println("\n mutiply(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if(!(rat4.divide(rat5).toString().equals("4"))) {
    tester = false;
    System.out.println("Error - rat4.divide(rat5)");
    System.out.println("Output: "+ rat4.divide(rat5));
  }
  if (!(rat7.divide(rat7).toString().equals("1"))) {
    tester = false;
    System.out.println("Error - rat7.divide(rat7)");
    System.out.println("Output: "+rat7.divide(rat7));
  }
  if (!(rat4.divide(rat5).divide(rat6).divide(rat7).divide(rat8).divide(rat9).toString().equals("24"))) {
    tester = false;
    System.out.println("Error - rat4.divide(rat5).divide(rat6).divide(rat7).divide(rat8).divide(rat9)");
    System.out.println("Output: "+rat4.divide(rat5).divide(rat6).divide(rat7).divide(rat8).divide(rat9));
  }
  if (!(rat0.divide(rat1).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat0.divide(rat1)");
    System.out.println("Output: "+rat0.divide(rat1));
  }
  if (!(rat2.divide(rat5).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat2.divide(rat5)");
    System.out.println("Output: "+rat2.divide(rat5));
  }
  if (!(rat5.divide(rat2).toString().equals("0"))) {
    tester = false;
    System.out.println("Error - rat5.divide(rat2)");
    System.out.println("Output: "+ rat5.divide(rat2));
  }
  if (!(rat32.divide(rat39).divide(rat40).divide(rat41).toString().equals("-30"))) {
  tester = false;
  System.out.println("Error - rat32.divide(rat39).divide(rat40).divide(rat41)");
  System.out.println("Output: "+rat32.divide(rat39).divide(rat40).divide(rat41));
  }
  if (!(rat32.divide(rat39).divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9).toString().equals("5/3"))) {
  tester = false;
  System.out.println("Error - rat32.divide(rat39).divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9)");
  System.out.println("Output: "+rat32.divide(rat39).divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9));
  }
  if (!(rat32.divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9).toString().equals("-10/3"))) {
  tester = false;
  System.out.println("Error - rat32.divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9)");
  System.out.println("Output: "+rat32.divide(rat40).divide(rat41).divide(rat42).divide(rat43).divide(rat44).divide(rat9));
  }
  if (!(rat7).divide(rat8).divide(rat9).divide(rat10).divide(rat11).divide(rat12).divide(rat44).toString().equals("-1/8"))
  System.out.println("\n divide(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(rat0.add(rat1).add(rat2).add(rat3).add(rat4).add(rat5).add(rat6).add(rat7).toString().equals("10/3"))) {
    tester = false;
    System.out.println("Error - rat0.add(rat1).add(rat2).add(rat3).add(rat4).add(rat5).add(rat6).add(rat7)");
    System.out.println("Output: "+ rat0.add(rat1).add(rat2).add(rat3));
  }
  if (!(rat8.add(rat9).add(rat10).add(rat11).add(rat12).add(rat13).add(rat14).toString().equals("10/21"))) {
    tester = false;
    System.out.println("Error - rat8.add(rat9).add(rat10).add(rat11).add(rat12).add(rat13).add(rat14).add(rat15)");
    System.out.println("Output: "+rat8.add(rat9).add(rat10).add(rat11).add(rat12).add(rat13).add(rat14).add(rat15));
  }
  if (!(rat15.add(rat16).add(rat17).add(rat18).add(rat19).add(rat20).add(rat21).toString().equals("-9/7"))) {
    tester = false;
    System.out.println("Error - rat15.add(rat16).add(rat17).add(rat18).add(rat19).add(rat20).add(rat21)");
    System.out.println("Output: "+rat15.add(rat16).add(rat17).add(rat18).add(rat19).add(rat20).add(rat21));
  }
  if (!(rat22.add(rat23).add(rat24).add(rat25).add(rat26).add(rat27).add(rat28).add(rat29).toString().equals("-13199/12000"))) {
    tester = false;
    System.out.println("Error - rat22.add(rat23).add(rat24).add(rat25).add(rat26).add(rat27).add(rat28).add(rat29)");
    System.out.println("Output: "+ rat22.add(rat23).add(rat24).add(rat25).add(rat26).add(rat27).add(rat28).add(rat29));
  }
  if (!(rat30.add(rat31).add(rat32).add(rat33).add(rat34).add(rat35).add(rat36).add(rat37).toString().equals("18797609/1564"))) {
    tester = false;
    System.out.println("Error - rat30.add(rat31).add(rat32).add(rat33).add(rat34).add(rat35).add(rat36).add(rat37)");
    System.out.println("Output: "+rat30.add(rat31).add(rat32).add(rat33).add(rat34).add(rat35).add(rat36).add(rat37));
  }
  if (!(rat38.add(rat39).add(rat40).add(rat41).add(rat42).add(rat43).add(rat44).add(rat45).toString().equals("-239/6"))) {
    tester = false;
    System.out.println("Error - rat38.add(rat39).add(rat40).add(rat41).add(rat42).add(rat43).add(rat44).add(rat45)");
    System.out.println("Output: "+rat38.add(rat39).add(rat40).add(rat41).add(rat42).add(rat43).add(rat44).add(rat45));
  }
  System.out.println("\n add(rational) - Test: "+tester);
  //--------------------//
  tester = true;
  if (!(rat0.subtract(rat1).subtract(rat2).subtract(rat3).subtract(rat4).subtract(rat5).subtract(rat6).subtract(rat7).toString().equals("-10/3"))) {
    tester = false;
    System.out.println("Error - rat0.subtract(rat1).subtract(rat2).subtract(rat3).subtract(rat4).subtract(rat5).subtract(rat6).subtract(rat7)");
    System.out.println("Output: "+ rat0.subtract(rat1).subtract(rat2).subtract(rat3));
  }
  if (!(rat8.subtract(rat9).subtract(rat10).subtract(rat11).subtract(rat12).subtract(rat13).subtract(rat14).subtract(rat15).toString().equals("31/21"))) {
    tester = false;
    System.out.println("Error - rat8.subtract(rat9).subtract(rat10).subtract(rat11).subtract(rat12).subtract(rat13).subtract(rat14).subtract(rat15)");
    System.out.println("Output: "+rat8.subtract(rat9).subtract(rat10).subtract(rat11).subtract(rat12).subtract(rat13).subtract(rat14).subtract(rat15));
  }
  if (!(rat15.subtract(rat16).subtract(rat17).subtract(rat18).subtract(rat19).subtract(rat20).subtract(rat21).toString().equals("-9/7"))) {
    tester = false;
    System.out.println("Error - rat15.subtract(rat16).subtract(rat17).subtract(rat18).subtract(rat19).subtract(rat20).subtract(rat21)");
    System.out.println("Output: "+rat15.subtract(rat16).subtract(rat17).subtract(rat18).subtract(rat19).subtract(rat20).subtract(rat21));
  }
  if (!(rat22.subtract(rat23).subtract(rat24).subtract(rat25).subtract(rat26).subtract(rat27).subtract(rat28).subtract(rat29).toString().equals("13201/12000"))) {
    tester = false;
    System.out.println("Error - rat22.subtract(rat23).subtract(rat24).subtract(rat25).subtract(rat26).subtract(rat27).subtract(rat28).subtract(rat29)");
    System.out.println("Output: "+ rat22.subtract(rat23).subtract(rat24).subtract(rat25).subtract(rat26).subtract(rat27).subtract(rat28).subtract(rat29));
  }
  if (!(rat30.subtract(rat31).subtract(rat32).subtract(rat33).subtract(rat34).subtract(rat35).subtract(rat36).subtract(rat37).toString().equals("-18797609/1564"))) {
    tester = false;
    System.out.println("Error - rat30.subtract(rat31).subtract(rat32).subtract(rat33).subtract(rat34).subtract(rat35).subtract(rat36).subtract(rat37)");
    System.out.println("Output: "+rat30.subtract(rat31).subtract(rat32).subtract(rat33).subtract(rat34).subtract(rat35).subtract(rat36).subtract(rat37));
  }
  if (!(rat38.subtract(rat39).subtract(rat40).subtract(rat41).subtract(rat42).subtract(rat43).subtract(rat44).subtract(rat45).toString().equals("239/6"))) {
    tester = false;
    System.out.println("Error - rat38.subtract(rat39).subtract(rat40).subtract(rat41).subtract(rat42).subtract(rat43).subtract(rat44).subtract(rat45)");
    System.out.println("Output: "+rat38.subtract(rat39).subtract(rat40).subtract(rat41).subtract(rat42).subtract(rat43).subtract(rat44).subtract(rat45));
  }
  System.out.println("\n subtract(rational) - Test: "+tester);
 //--------------------//
 System.out.println("\n compareTo(rational - real) (Part 1) - Tests");
 System.out.println("test1.compareTo(rat11) Expected: 1");
 System.out.println("test1.compareTo(rat11)   Actual: "+test1.compareTo(rat11));
 System.out.println("test10.compareTo(rat9) Expected: 1");
 System.out.println("test10.compareTo(rat9)   Actual: "+test10.compareTo(rat9));
 System.out.println("test1.compareTo(rat13) Expected: 1");
 System.out.println("test1.compareTo(rat13)   Actual: "+test1.compareTo(rat13));
 System.out.println("test5.compareTo(rat18) Expected: 1");
 System.out.println("test5.compareTo(rat18)   Actual: "+test5.compareTo(rat18));
 System.out.println("test12.compareTo(rat18) Expected: 1");
 System.out.println("test12.compareTo(rat18)   Actual: "+test12.compareTo(rat18));
 System.out.println("test10.compareTo(rat32) Expected: -1");
 System.out.println("test10.compareTo(rat32)   Actual: "+test10.compareTo(rat32));
 System.out.println("test0.compareTo(rat0) Expected: 0");
 System.out.println("test0.compareTo(rat0)   Actual: "+test0.compareTo(rat0));
 System.out.println("test21.compareTo(rat3) Expected: 0");
 System.out.println("test21.compareTo(rat3)   Actual: "+test21.compareTo(rat3));
 System.out.println("test10.compareTo(rat9) Expected: 1");
 System.out.println("test10.compareTo(rat9)   Actual: "+test10.compareTo(rat9));
 System.out.println("test37.compareTo(rat34) Expected: 0");
 System.out.println("test37.compareTo(rat34)   Actual: "+test37.compareTo(rat34));
 System.out.println("test30.compareTo(rat4) Expected: 0");
 System.out.println("test30.compareTo(rat4)   Actual: "+test30.compareTo(rat4));
 System.out.println("test9.compareTo(rat6) Expected: -1");
 System.out.println("test9.compareTo(rat6)   Actual: "+test9.compareTo(rat6));
 System.out.println("test19.compareTo(rat34) Expected: -1");
 System.out.println("test19.compareTo(rat34)   Actual: "+test19.compareTo(rat34));
 System.out.println("test26.compareTo(rat45) Expected: -1");
 System.out.println("test26.compareTo(rat45)   Actual: "+test26.compareTo(rat45));
 System.out.println("test18.compareTo(rat22) Expected: -1");
 System.out.println("test18.compareTo(rat22)   Actual: "+test18.compareTo(rat22));
 System.out.println("test36.compareTo(rat43) Expected: -1");
 System.out.println("test36.compareTo(rat43)   Actual: "+test36.compareTo(rat43));
 System.out.println("test28.compareTo(rat10) Expected: 0");
 System.out.println("test28.compareTo(rat10)   Actual: "+test28.compareTo(rat10));
   //--------------------//
 System.out.println("rat10.compareTo(test28) Expected: 0");
 System.out.println("rat10.compareTo(test28)   Actual: "+rat10.compareTo(test28));
 System.out.println("rat43.compareTo(test36) Expected: 1");
 System.out.println("rat43.compareTo(test36)   Actual: "+rat43.compareTo(test36));
 System.out.println("rat22.compareTo(test18) Expected: 1");
 System.out.println("rat22.compareTo(test18)   Actual: "+rat22.compareTo(test18));
 System.out.println("rat45.compareTo(test26) Expected: 1");
 System.out.println("rat45.compareTo(test26)   Actual: "+rat45.compareTo(test26));
 System.out.println("rat9.compareTo(test10) Expected: -1");
 System.out.println("rat9.compareTo(test10)   Actual: "+rat9.compareTo(test10));
 System.out.println("rat34.compareTo(test37) Expected: 0");
 System.out.println("rat34.compareTo(test37)   Actual: "+rat34.compareTo(test37));
 System.out.println("rat4.compareTo(test30) Expected: 0");
 System.out.println("rat4.compareTo(test30)   Actual: "+rat4.compareTo(test30));
 System.out.println("rat11.compareTo(test1) Expected: -1");
 System.out.println("rat11.compareTo(test1)   Actual: "+rat11.compareTo(test1));
 System.out.println("rat9.compareTo(test10) Expected: -1");
 System.out.println("rat9.compareTo(test10)   Actual: "+rat9.compareTo(test10));
 System.out.println("rat13.compareTo(test1) Expected: -1");
 System.out.println("rat13.compareTo(test1)   Actual: "+rat13.compareTo(test1));
 System.out.println("rat18.compareTo(test5) Expected: -1");
 System.out.println("rat18.compareTo(test5)   Actual: "+rat18.compareTo(test5));
  //--------------------//
  tester = true;
  for (int i = 0; i < test.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      Double x = test[i].getValue();
      Double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
      if (test[i].compareTo(rats[a]) != x.compareTo(y)) {
        tester = false;
        System.out.println("Error - CompareTo(real-rational)");
        System.out.println("Real: " + test[i]);
        System.out.println("Rational: " + rats[a]);
      }
    }
  }
  System.out.println("\n compareTo(rational - real) (Part 2) - Test: "+ tester);
  //--------------------//
  tester = true;
  for (int i = 0; i < test.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      Double x = test[i].getValue();
      Double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
      if (rats[a].compareTo(test[i]) != y.compareTo(x)) {
        tester = false;
        System.out.println("Error - CompareTo(real-rational)");
        System.out.println("Real: " + test[i]);
        System.out.println("Rational: " + rats[a]);
      }
    }
  }
  System.out.println("\n compareTo(rational - real) (Part 3) - Test: "+ tester);
  //--------------------//
  System.out.println("\n multiply(rational - real) (Part 1) - Tests");
  System.out.println("test14.multiply(rat4) Expected: 0.2857142857...");
  System.out.println("test14.multiply(rat4)   Actual: "+test14.multiply(rat4));
  System.out.println("test17.multiply(rat18) Expected: -14.924811556599299...");
  System.out.println("test17.multiply(rat18)   Actual: "+test17.multiply(rat18));
  System.out.println("test23.multiply(rat12) Expected: 0.07957747154594766788...");
  System.out.println("test23.multiply(rat12)   Actual: "+test23.multiply(rat12));
  System.out.println("test19.multiply(rat10) Expected: -3.79661045e-8");
  System.out.println("test19.multiply(rat10)   Actual: "+test19.multiply(rat10));
  System.out.println("test22.multiply(rat16) Expected: -8.078381109230...");
  System.out.println("test22.multiply(rat16)   Actual: "+test22.multiply(rat16));
  //--------------------//
  System.out.println("rat4.multiply(test14) Expected: 0.2857142857...");
  System.out.println("rat4.multiply(test14)   Actual: "+rat4.multiply(test14));
  System.out.println("rat18.multiply(test17) Expected: -14.924811556599299...");
  System.out.println("rat18.multiply(test17)   Actual: "+rat18.multiply(test17));
  System.out.println("rat12.multiply(test23) Expected: 0.07957747154594766788...");
  System.out.println("rat12.multiply(test23)   Actual: "+rat12.multiply(test23));
  System.out.println("rat10.multiply(test19) Expected: -3.79661045e-8");
  System.out.println("rat10.multiply(test19)   Actual: "+rat10.multiply(test19));
  System.out.println("rat16.multiply(test22) Expected: -8.078381109230...");
  System.out.println("rat16.multiply(test22)   Actual: "+rat16.multiply(test22));
  //--------------------//
  tester = true;
  for (int i = 0; i < test.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      double x = test[i].getValue();
      double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
      if (test[i].multiply(rats[a]) != (x * y)) {
        tester = false;
        System.out.println("Error - multiply(real-rational)");
        System.out.println("Real: " + test[i]);
        System.out.println("Rational: " + rats[a]);
      }
    }
  }
  System.out.println("\n multiply(rational - real) (Part 2) - Test: "+ tester);
  //--------------------//
  tester = true;
  for (int i = 0; i < test.length; i++) {
    for (int a = 0; a < rats.length; a++) {
      double x = test[i].getValue();
      double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
      if (rats[a].multiply(test[i]) != (y * x)) {
        tester = false;
        System.out.println("Error - multiply(real-rational)");
        System.out.println("Real: " + test[i]);
        System.out.println("Rational: " + rats[a]);
      }
    }
  }
  System.out.println("\n multiply(rational - real) (Part 3) - Test: "+ tester);
   //--------------------//
   System.out.println("\n divide(rational - real) (Part 1)- Tests");
   System.out.println("rat0/test22 Expected: 0.0");
   System.out.println("rat0/test22 Actual: "+ rat0.divide(test22));
   System.out.println("test21/rat11 Expected: 0.0");
   System.out.println("test21/rat11 Actual: "+ test21.divide(rat11));
   System.out.println("test0/rat32 Expected: 0.0");
   System.out.println("test0/rat32 Actual: "+ test0.divide(rat32));
   System.out.println("rat1/test19 Expected: 0.0");
   System.out.println("rat1/test19 Actual: "+ rat1.divide(test19));
   System.out.println("rat4/test28 Expected: 4.0");
   System.out.println("rat4/test28 Actual: "+ rat4.divide(test28));
   System.out.println("test35/rat12 Expected: -12.0");
   System.out.println("test35/rat12 Actual: "+ test35.divide(rat12));
   //--------------------//
   RationalNumber[] ratsNoZero = {rat4,rat5,rat6,rat7,rat8,rat9,rat10,rat11,rat12,rat13,rat14,rat15,rat16,rat17,rat18,rat19,rat20,rat21,rat22,rat24,rat25,rat32,rat33,rat34,rat35,rat36,rat37,rat39,rat40,rat41,rat42,rat43,rat44,rat45};
   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < ratsNoZero.length; a++) {
       double x = test[i].getValue();
       double y = ratsNoZero[a].getNumerator() / (ratsNoZero[a].getDenominator() * 1.0);
       if (test[i].divide(ratsNoZero[a]) != (x / y)) {
         tester = false;
         System.out.println("Error - divide(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n add(rational - real) (Part 2) - Test: "+ tester);
   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < ratsNoZero.length; a++) {
       double x = test[i].getValue();
       double y = ratsNoZero[a].getNumerator() / (ratsNoZero[a].getDenominator() * 1.0);
       if (ratsNoZero[a].divide(test[i]) != (y / x)) {
         tester = false;
         System.out.println("Error - divide(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n add(rational - real) (Part 3) - Test: "+ tester);
   //--------------------//
   System.out.println("\n add(rational - real) - Tests");
   System.out.println("rat0.add(test0) Expected: 0.0");
   System.out.println("Expected: "+rat0.add(test0));
   System.out.println("rat10.add(test31) Expected: -1.5");
   System.out.println("Expected: "+rat10.add(test31));

   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < rats.length; a++) {
       double x = test[i].getValue();
       double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
       if (test[i].add(rats[a]) != (x + y)) {
         tester = false;
         System.out.println("Error - add(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n add(rational - real) (Part 2) - Test: "+ tester);
   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < rats.length; a++) {
       double x = test[i].getValue();
       double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
       if (rats[a].add(test[i]) != (y + x)) {
         tester = false;
         System.out.println("Error - add(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n add(rational - real) (Part 3) - Test: "+ tester);
   //--------------------//
   System.out.println("\n subtract(rational - real) - Tests");

   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < rats.length; a++) {
       double x = test[i].getValue();
       double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
       if (test[i].subtract(rats[a]) != (x - y)) {
         tester = false;
         System.out.println("Error - subtract(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n subtract(rational - real) (Part 2) - Test: "+ tester);
   //--------------------//
   tester = true;
   for (int i = 0; i < test.length; i++) {
     for (int a = 0; a < rats.length; a++) {
       double x = test[i].getValue();
       double y = rats[a].getNumerator() / (rats[a].getDenominator() * 1.0);
       if (rats[a].subtract(test[i]) != (y - x)) {
         tester = false;
         System.out.println("Error - subtract(real-rational)");
         System.out.println("Real: " + test[i]);
         System.out.println("Rational: " + rats[a]);
       }
     }
   }
   System.out.println("\n subtract(rational - real) (Part 3) - Test: "+ tester);

   RealNumber set0 = new RationalNumber(1,3);
   RealNumber set1 = new RationalNumber(1,3);
   RationalNumber qd0 = new RationalNumber(1,2);
   System.out.println(set0);
   System.out.println(set1);
   System.out.println(qd0.divide(set0));
   System.out.println(qd0.add(set0));
   System.out.println(qd0.subtract(set0));
   System.out.println(qd0.multiply(set0));
   System.out.println(qd0);
}
}
