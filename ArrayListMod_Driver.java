public class ArrayListMod_Driver {
  public static void main(String[] args) {
    boolean test = true;
    NoNullArrayList<Integer>ints = new NoNullArrayList<Integer>();
    NoNullArrayList<Double>doubles = new NoNullArrayList<Double>();
    NoNullArrayList<String>strings = new NoNullArrayList<String>();
  //Section 1
  {
    //Test 1A
    try {
    for (int i = 0; i < 200; i++) {
        if(!ints.add(i)) {
          test = false;
        }
      }
      System.out.println("test 1A: Pass");
  }
  catch(IllegalArgumentException e) {
    System.out.println("test 1A: Fail");
  }

  //Test1B/1C
  ints.clear();
  try {
  for (int i = 0; i < 200; i++) {
    if (i != 0 && i % 10 == 0) {
      ints.add(null);
    }
    else {
      if(!ints.add(i)) {
        test = false;
      }
    }
  }
    System.out.println("test 1B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 1B: Pass");
  }
  if (ints.toString().equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]")) {
  System.out.println("test 1C: Pass");
  }
  else {
  System.out.println("test1C: Fail");
  System.out.println("test1C.toString: "+ints);
  }

  //Test1D/1E
  ints.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
    ints.add(null);
  }
  else {
    if(!ints.add(i)) {
      test = false;
    }
  }
  }
  System.out.println("test 1D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 1D: Pass");
  }
  if (ints.toString().equals("[0, 1, 2, 3, 4, 5]")) {
  System.out.println("test 1E: Pass");
  }
  else {
  System.out.println("test1E: Fail");
  System.out.println("test1E.toString: "+ints);
  }

  if (test) {
  System.out.println("test 1G: Pass");
  }
  else {
  System.out.println("test 1G: Fail");
  }

  //-------------------------------------------------//
  //Test 2A
  ints.clear();
  try {
  for (int i = 0; i < 200; i++) {
    ints.add(0, i);
  }
  System.out.println("test 2A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 2A: Fail");
  }

  //Test2B/2C
  ints.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
  ints.add(0, null);
  }
  else {
  ints.add(0, i);
  }
  }
  System.out.println("test 2B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 2B: Pass");
  }
  if (ints.toString().equals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]")) {
  System.out.println("test 2C: Pass");
  }
  else {
  System.out.println("test2C: Fail");
  System.out.println("test2C.toString: "+ints);
  }

  //Test2D/2E
  ints.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
  ints.add(0, null);
  }
  else {
  ints.add(0, i);
  }
  }
  System.out.println("test 2D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 2D: Pass");
  }
  if (ints.toString().equals("[5, 4, 3, 2, 1, 0]")) {
  System.out.println("test 2E: Pass");
  }
  else {
  System.out.println("test2E: Fail");
  System.out.println("test2E.toString: "+ints);
  }
  //-------------------------------------------------//
  //Test3 Prep
  test = true;
  ints.clear();
  for (int i = 0; i < 20; i++) {
  if(!ints.add(i)) {
    test = false;
  }
  }
  //Test3A/3B
  try {
  for (int i = 0; i < 20; i++) {
    if (i != 0 && i % 6 == 0) {
      ints.set(i, null);
    }
    else {
      if(ints.set(i, 100) != i) {
        test = false;
      }
    }
  }
  System.out.println("test 3A: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 3A: Pass");
  }
  if (ints.toString().equals("[100, 100, 100, 100, 100, 100, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]")) {
  System.out.println("test 3B: Pass");
  }
  else {
  System.out.println("test 3B: Fail");
  System.out.println("test3B.toString: " + ints);
  }
  //Test3C/3D
  try {
  for (int i = 0; i < 20; i++) {
    if (i != 0 && i % 4 == 0) {
      ints.set(i, null);
    }
    else {
      if (ints.set(i, 200) != 100) {
        test = false;
      }
    }
  }
  System.out.println("test 3C: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 3C: Pass");
  }
  if (ints.toString().equals("[200, 200, 200, 200, 100, 100, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]")) {
  System.out.println("test 3D: Pass");
  }
  else {
  System.out.println("test 3D: Fail");
  System.out.println("test3D.toString: " + ints);
  }
  if (test) {
  System.out.println("Test 3E: Pass");
  }
  else {
  System.out.println("Test 3E: Fail");
  }
  }
  //<--> <--> <--> <--> <--> <--> <--> <--> <--> <-->//
  //Section 2
  {
  //Test 4A
  test = true;
  try {
  for (int i = 0; i < 200; i++) {
    if (!doubles.add(i * 2.0)) {
      test = false;
    }
  }
  System.out.println("test 4A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 4A: Fail");
  }

  //Test4B/4C
  doubles.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
  doubles.add(null);
  }
  else {
  if(!doubles.add(i * 2.0)) {
    test = false;
  }
  }
  }
  System.out.println("test 4B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 4B: Pass");
  }
  if (doubles.toString().equals("[0.0, 2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0]")) {
  System.out.println("test 4C: Pass");
  }
  else {
  System.out.println("test4C: Fail");
  System.out.println("test4C.toString: "+doubles);
  }

  //Test4D/4E
  doubles.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
  doubles.add(null);
  }
  else {
  if(!doubles.add(i * 2.0)) {
  test = false;
  }
  }
  }
  System.out.println("test 4D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 4D: Pass");
  }
  if (doubles.toString().equals("[0.0, 2.0, 4.0, 6.0, 8.0, 10.0]")) {
  System.out.println("test 4E: Pass");
  }
  else {
  System.out.println("test4E: Fail");
  System.out.println("test4E.toString: "+doubles);
  }
  if (test) {
  System.out.println("test4F: Pass");
  }
  else {
  System.out.println("test4F: Fail");
  }

  //-------------------------------------------------//
  //Test 5A
  doubles.clear();
  try {
  for (int i = 0; i < 200; i++) {
  doubles.add(0, i * 2.0);
  }
  System.out.println("test 5A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 5A: Fail");
  }

  //Test5B/5C
  doubles.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
  doubles.add(0, null);
  }
  else {
  doubles.add(0, i * 2.0);
  }
  }
  System.out.println("test 5B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 5B: Pass");
  }
  if (doubles.toString().equals("[18.0, 16.0, 14.0, 12.0, 10.0, 8.0, 6.0, 4.0, 2.0, 0.0]")) {
  System.out.println("test 5C: Pass");
  }
  else {
  System.out.println("test5C: Fail");
  System.out.println("test5C.toString: "+doubles);
  }

  //Test5D/5E
  doubles.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
  doubles.add(0, null);
  }
  else {
  doubles.add(0, i * 2.0);
  }
  }
  System.out.println("test 5D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 5D: Pass");
  }
  if (doubles.toString().equals("[10.0, 8.0, 6.0, 4.0, 2.0, 0.0]")) {
  System.out.println("test 5E: Pass");
  }
  else {
  System.out.println("test5E: Fail");
  System.out.println("test5E.toString: "+ doubles);
  }
  //-------------------------------------------------//
  //Test6 Prep
  test = true;
  doubles.clear();
  for (int i = 0; i < 20; i++) {
  if (!doubles.add(i * 2.0)) {
  test = false;
  }
  }
  //Test6A/6B
  try {
  for (int i = 0; i < 20; i++) {
  if (i != 0 && i % 6 == 0) {
  doubles.set(i, null);
  }
  else {
  if(doubles.set(i, 100.0) != i * 2.0) {
    test = false;
  }
  }
  }
  System.out.println("test 6A: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 6A: Pass");
  }
  if (doubles.toString().equals("[100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0, 36.0, 38.0]")) {
  System.out.println("test 6B: Pass");
  }
  else {
  System.out.println("test 6B: Fail");
  System.out.println("test6B.toString: " + doubles);
  }
  //Test6C/6D
  try {
  for (int i = 0; i < 20; i++) {
  if (i != 0 && i % 4 == 0) {
  doubles.set(i, null);
  }
  else {
  if(doubles.set(i, 200.0) != 100.0) {
    test = false;
  }
  }
  }
  System.out.println("test 6C: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 6C: Pass");
  }
  if (doubles.toString().equals("[200.0, 200.0, 200.0, 200.0, 100.0, 100.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0, 36.0, 38.0]")) {
  System.out.println("test 6D: Pass");
  }
  else {
  System.out.println("test 6D: Fail");
  System.out.println("test6D.toString: " + doubles);
  }
  if (test) {
  System.out.println("test 6E: Pass");
  }
  else {
  System.out.println("test 6F: Fail");
  }
  }
  //<--> <--> <--> <--> <--> <--> <--> <--> <--> <-->//
  //Section 3
  {
  //Test 7A
  try {
  for (int i = 0; i < 200; i++) {
    strings.add(i + "tom");
  }
  System.out.println("test 7A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 7A: Fail");
  }

  //Test7B/7C
  strings.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
  strings.add(null);
  }
  else {
  strings.add(i + "tom");
  }
  }
  System.out.println("test 7B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 7B: Pass");
  }
  if (strings.toString().equals("[0tom, 1tom, 2tom, 3tom, 4tom, 5tom, 6tom, 7tom, 8tom, 9tom]")) {
  System.out.println("test 7C: Pass");
  }
  else {
  System.out.println("test7C: Fail");
  System.out.println("test7C.toString: "+strings);
  }

  //Test7D/7E
  strings.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
  strings.add(null);
  }
  else {
  strings.add(i + "tom");
  }
  }
  System.out.println("test 7D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 7D: Pass");
  }
  if (strings.toString().equals("[0tom, 1tom, 2tom, 3tom, 4tom, 5tom]")) {
  System.out.println("test 7E: Pass");
  }
  else {
  System.out.println("test7E: Fail");
  System.out.println("test7E.toString: "+ strings);
  }

  //-------------------------------------------------//
  //Test 8A
  strings.clear();
  try {
  for (int i = 0; i < 200; i++) {
  strings.add(0, i + "tom");
  }
  System.out.println("test 8A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 8A: Fail");
  }

  //Test8B/8C
  strings.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
  strings.add(0, null);
  }
  else {
  strings.add(0, i + "tom");
  }
  }
  System.out.println("test 8B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 8B: Pass");
  }
  if (strings.toString().equals("[9tom, 8tom, 7tom, 6tom, 5tom, 4tom, 3tom, 2tom, 1tom, 0tom]")) {
  System.out.println("test 8C: Pass");
  }
  else {
  System.out.println("test8C: Fail");
  System.out.println("test8C.toString: "+strings);
  }

  //Test8D/8E
  strings.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 6 == 0) {
  strings.add(0, null);
  }
  else {
  strings.add(0, i + "tom");
  }
  }
  System.out.println("test 8D: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("test 8D: Pass");
  }
  if (strings.toString().equals("[5tom, 4tom, 3tom, 2tom, 1tom, 0tom]")) {
  System.out.println("test 8E: Pass");
  }
  else {
  System.out.println("test8E: Fail");
  System.out.println("test8E.toString: "+ strings);
  }
  // // //----------------------//
  //Test9 Prep
  strings.clear();
  for (int i = 0; i < 20; i++) {
  strings.add(i + "tom");
  }
  //Test9A/9B
  try {
  for (int i = 0; i < 20; i++) {
  if (i != 0 && i % 6 == 0) {
  strings.set(i, null);
  }
  else {
  strings.set(i, "jimmy");
  }
  }
  System.out.println("test 9A: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 9A: Pass");
  }
  if (strings.toString().equals("[jimmy, jimmy, jimmy, jimmy, jimmy, jimmy, 6tom, 7tom, 8tom, 9tom, 10tom, 11tom, 12tom, 13tom, 14tom, 15tom, 16tom, 17tom, 18tom, 19tom]")) {
  System.out.println("test 9B: Pass");
  }
  else {
  System.out.println("test 9B: Fail");
  System.out.println("test9B.toString: " + strings);
  }
  //Test9C/9D
  try {
  for (int i = 0; i < 20; i++) {
  if (i != 0 && i % 4 == 0) {
  strings.set(i, null);
  }
  else {
  strings.set(i, "dylan");
  }
  }
  System.out.println("test 9C: Fail");
  }
  catch (IllegalArgumentException e) {
  System.out.println("test 9C: Pass");
  }
  if (strings.toString().equals("[dylan, dylan, dylan, dylan, jimmy, jimmy, 6tom, 7tom, 8tom, 9tom, 10tom, 11tom, 12tom, 13tom, 14tom, 15tom, 16tom, 17tom, 18tom, 19tom]")) {
  System.out.println("test 9D: Pass");
  }
  else {
  System.out.println("test 9D: Fail");
  System.out.println("test9D.toString: " + strings);
  }
  }
  OrderedArrayList<Integer>orderedInts = new OrderedArrayList<Integer>();
  OrderedArrayList<Double>ordereddoubles = new OrderedArrayList<Double>();
  OrderedArrayList<String>orderedstrings = new OrderedArrayList<String>();
  //<--> <--> <--> <--> <--> <--> <--> <--> <--> <-->//
  //Section 4
  {
  //Ordered1A
  try {
  for (int i = 0; i < 200; i++) {
    orderedInts.add(i);
  }
  System.out.println("Ordered 1A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 1A: Fail");
  }
  //Ordered1B/1C
  orderedInts.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
    orderedInts.add(null);
  }
  else {
    orderedInts.add(i);
  }
  }
  System.out.println("Ordered 1B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 1B: Pass");
  }
  if (orderedInts.toString().equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]")) {
  System.out.println("Ordered 1C: Pass");
  }
  else {
  System.out.println("Ordered 1C: Fail");
  System.out.println("Ordered1C.toString: "+orderedInts);
  }
  //Ordered1D/1E
  orderedInts.clear();
  try {
  for (int i = 0; i < 20; i++) {
  if (i % 3 == 0) {
    orderedInts.add(i);
  }
  else if (i % 3 == 1) {
    orderedInts.add(i * 2);
  }
  else {
    orderedInts.add(i *3);
  }
  }
  System.out.println("Ordered 1D: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 1D: Fail");
  }
  if (orderedInts.toString().equals("[0, 2, 3, 6, 6, 8, 9, 12, 14, 15, 15, 18, 20, 24, 26, 32, 33, 38, 42, 51]")) {
  System.out.println("Ordered 1E: Pass");
  }
  else {
  System.out.println("Ordered 1E: Fail");
  System.out.println("Ordered1E.toString: "+orderedInts);
  }
  //Ordered1F/1G
  orderedInts.clear();
  try {
  for (int i = 0; i < 32; i++) {
  if (i == 27) {
    orderedInts.add(null);
  }
  if (i % 2 == 0) {
    orderedInts.add(i);
  }
  else {
    orderedInts.add(2*i -1);
  }
  }
  System.out.println("Ordered 1F: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 1F: Pass");
  }
  if (orderedInts.toString().equals("[0, 1, 2, 4, 5, 6, 8, 9, 10, 12, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 33, 37, 41, 45, 49]")) {
  System.out.println("Ordered 1G: Pass");
  }
  else {
  System.out.println("Ordered 1G: Fail");
  System.out.println("Ordered1G.toString: "+orderedInts);
  }
  //Ordered1H/1I
  orderedInts.clear();
  try {
  for (int i = 0; i < 32; i++) {
  if (i == 27) {
    orderedInts.add(null);
  }
  if (i % 2 == 0) {
    orderedInts.add(i);
  }
  else {
    orderedInts.add(2*i);
  }
  }
  System.out.println("Ordered 1H: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 1H: Pass");
  }
  if (orderedInts.toString().equals("[0, 2, 2, 4, 6, 6, 8, 10, 10, 12, 14, 14, 16, 18, 18, 20, 22, 22, 24, 26, 26, 30, 34, 38, 42, 46, 50]")) {
  System.out.println("Ordered 1I: Pass");
  }
  else {
  System.out.println("Ordered 1I: Fail");
  System.out.println("Ordered1I.toString: "+orderedInts);
  }
  //-------------------------------------------------//
  //Ordered2A
  try {
  for (int i = 0; i < 200; i++) {
    orderedInts.add(0, i * 2);
  }
  System.out.println("Ordered 2A: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 2A: Fail");
  }
  //Ordered2B/2C
  orderedInts.clear();
  try {
  for (int i = 0; i < 200; i++) {
  if (i != 0 && i % 10 == 0) {
    orderedInts.add(0, null);
  }
  else {
    orderedInts.add(0, i * 2);
  }
  }
  System.out.println("Ordered 2B: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 2B: Pass");
  }
  if (orderedInts.toString().equals("[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]")) {
  System.out.println("Ordered 2C: Pass");
  }
  else {
  System.out.println("Ordered 2C: Fail");
  System.out.println("Ordered2C.toString: "+orderedInts);
  }

  //Ordered2D/2E
  orderedInts.clear();
  try {
  for (int i = 0; i < 20; i++) {
  if (i % 3 == 0) {
    orderedInts.add(0, i);
  }
  else if (i % 3 == 1) {
    orderedInts.add(0, i * 2);
  }
  else {
    orderedInts.add(0, i *3);
  }
  }
  System.out.println("Ordered 2D: Pass");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 2D: Fail");
  }
  if (orderedInts.toString().equals("[0, 2, 3, 6, 6, 8, 9, 12, 14, 15, 15, 18, 20, 24, 26, 32, 33, 38, 42, 51]")) {
  System.out.println("Ordered 2E: Pass");
  }
  else {
  System.out.println("Ordered 2E: Fail");
  System.out.println("Ordered2E.toString: "+orderedInts);
  }
  //Ordered2F/2G
  orderedInts.clear();
  try {
  for (int i = 0; i < 32; i++) {
  if (i == 27) {
    orderedInts.add(null);
  }
  if (i % 2 == 0) {
    orderedInts.add(0, i * 1);
  }
  else {
    orderedInts.add(0, 2*i -1);
  }
  }
  System.out.println("Ordered 2F: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 2F: Pass");
  }
  if (orderedInts.toString().equals("[0, 1, 2, 4, 5, 6, 8, 9, 10, 12, 13, 14, 16, 17, 18, 20, 21, 22, 24, 25, 26, 29, 33, 37, 41, 45, 49]")) {
  System.out.println("Ordered 2G: Pass");
  }
  else {
  System.out.println("Ordered 2G: Fail");
  System.out.println("Ordered2G.toString: "+orderedInts);
  }
  //Ordered2H/2I
  orderedInts.clear();
  try {
  for (int i = 0; i < 32; i++) {
  if (i == 27) {
    orderedInts.add(0, null);
  }
  if (i % 2 == 0) {
    orderedInts.add(0, i * 1);
  }
  else {
    orderedInts.add(0, 2*i);
  }
  }
  System.out.println("Ordered 2H: Fail");
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 2H: Pass");
  }
  if (orderedInts.toString().equals("[0, 2, 2, 4, 6, 6, 8, 10, 10, 12, 14, 14, 16, 18, 18, 20, 22, 22, 24, 26, 26, 30, 34, 38, 42, 46, 50]")) {
  System.out.println("Ordered 2I: Pass");
  }
  else {
  System.out.println("Ordered 2I: Fail");
  System.out.println("Ordered2I.toString: "+orderedInts);
  }
  //-------------------------------------------------//
  //Ordered3

  orderedInts.clear();
  for (int i = 0; i < 20; i++) {
  orderedInts.add(2*i);
  }
  if (!(orderedInts.toString().equals("[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38]"))) {
  test = false;
  }
  try {
  orderedInts.set(7,23);
  if (!(orderedInts.toString().equals("[0, 2, 4, 6, 8, 10, 12, 16, 18, 20, 22, 23, 24, 26, 28, 30, 32, 34, 36, 38]"))) {
  test = false;
  }
  }
  catch(IllegalArgumentException e) {
  System.out.println("Ordered 3: Fail");
  }
  if (test) {
  System.out.println("Ordered 3: Pass");
  }
  else {
  System.out.println("Ordered 3: Fail");
  }



  }
  //Section5
  }
  }
