public class ArrayListMod_Driver {
public static void main(String[] args) {
  NoNullArrayList<Integer>ints = new NoNullArrayList<Integer>();
  NoNullArrayList<Double>doubles = new NoNullArrayList<Double>();
  NoNullArrayList<String>string = new NoNullArrayList<String>();
//Section 1
{
  //Test 1A
  try {
  for (int i = 0; i < 200; i++) {
      ints.add(i);
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
    ints.add(i);
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
  ints.add(i);
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

//----------------------//
//Test 2A
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

//Test1D/1E
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
//----------------------//
//Test3 Prep
ints.clear();
for (int i = 0; i < 20; i++) {
ints.add(i);
}
//Test3A/3B
try {
for (int i = 0; i < 20; i++) {
  if (i != 0 && i % 6 == 0) {
    ints.set(i, null);
  }
  else {
    ints.set(i, 100);
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
    ints.set(i, 200);
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
}
//Section 2
//Test 1A
try {
for (int i = 0; i < 200; i++) {
  doubles.add(i * 2.0);
}
System.out.println("test 4A: Pass");
}
catch(IllegalArgumentException e) {
System.out.println("test 4A: Fail");
}

//Test1B/1C
doubles.clear();
try {
for (int i = 0; i < 200; i++) {
if (i != 0 && i % 10 == 0) {
doubles.add(null);
}
else {
doubles.add(i * 2.0);
}
}
System.out.println("test 1B: Fail");
}
catch(IllegalArgumentException e) {
System.out.println("test 1B: Pass");
}
}
}
