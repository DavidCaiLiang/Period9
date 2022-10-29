public class SuperArray-David-Driver{
  public static void main(String args[]){
    SuperArray alist = new SuperArray();
    System.out.println(alist);
    System.out.println("alist size: "+ alist.size());

    System.out.print("alist add return: "+ alist.add("Mario"));
    System.out.println("|alist size: "+ alist.size());
    System.out.println(alist);

    System.out.print("alist add return: "+ alist.add("Samus"));
    System.out.println("|alist size: "+ alist.size());
    System.out.println(alist);

    System.out.print("alist add return: "+ alist.add("Ash"));
    System.out.println("|alist size: "+ alist.size());
    System.out.println(alist);

    System.out.print("alist add return: "+ alist.add("Link"));
    System.out.println("|alist size: "+ alist.size());
    System.out.println(alist);

    System.out.print("alist add return: "+ alist.add("Kirby"));
    System.out.println("|alist size: "+ alist.size());
    System.out.println(alist);
//-----------------------------------------------------//
    SuperArray blist = new SuperArray();
    for (int i = 0; i < 23; i++) {
      System.out.print("blist add return: " + blist.add(i-1+""));
      System.out.println("|blist size: "+ blist.size());
      System.out.println(blist);
    }
//-----------------------------------------------------//
    //The follow random strings was created with https://catonmat.net/tools/generate-random-ascii with some manual adjustments.
      String[] ctest = {
        "\n",
        "myo/k{@M,Zy4;69[T\\'`\n",
        "UlJ[dL?3UHWs.NhnAZs5\n",
        "RR;Q79kq> T)O$f(U}w\n",
        "<f=?.WxEb;|V`T0GsYNNF\n",
        "Ah`E+R\tlgYo]},8P2hGvC\n",
        "-|Q0fr^z&+{opk%ZwZ>J\n",
        "262%K*2{T(]OC7t\t?nw\n",
        ")p\\$\tqna>Veytjw=p#I>j%\n",
        "gX3l>kG\\x\'5npK}dN\"%9A\n",
        "+FKxTP=\fP&GKQ>W2L[i\n",
        "{p<Xa:#7.<v|E\"A\\*G7k\n",
        "V8tVQSB@<ZsNF9L.L` A\n",
        "\n",
        "`Kc:G&LKfUWf HRPkq7{\n",
        "U(hx^qnwx\tdJp!K1R9PkJ\n",
        "dftB(SpnC,vNxld^vqm8\n",
        "gu\\8[^jn#-2)%>\f`KyDd$\n",
        "7vz^QHO]\r4$\bZ!nNhLF'tf\n",
        "'kd`L.-?\tYgXfz+m;K3it\n",
        "L]`[Ul@3Tf%+vPs$Fy?s\n",
        "\n",
        "fZ).<Kq8{*P)Z :Kz,nA\n",
        "IV!w\"`;^>nSy0+JeGJ>9l\n",
        "3n2-H)/t5=>~&\"ouSN^U\n",
        "*,CdcH?`_?>9U|F o)fU\n"};

        SuperArray clist = new SuperArray();
        for (int i = 0; i < ctest.length; i++) {
          System.out.print("clist add return: " + clist.add(ctest[i] +""));
          System.out.println("|clist size: "+ clist.size());
          System.out.println(clist);
        }
//-----------------------------------------------------//
      String[] dtest = {
        "Shaon",
        "Anabella",
        "Zameen",
        "Kevin",
        "John",
        "Fishan",
        "Shwetiana",
        "Jonathan",
        "Theodore",
        "Clemens",
        "Mikayla",
        "Tracy",
        "Eric",
        "Dongni",
        "Taamim",
        "Baron",
        "Gaven",
        "Justin",
        "Calvin",
        "Amber",
        "Randy",
        "Jayden",
        "Stanley",
        "Maya",
        "Sherlyn",
        "Zhi",
        "Mason",
        "Jiayu",
        "Jason",
        "Raymond",
        "Kevin"
      };
      SuperArray dlist = new SuperArray();
      for (int i = 0; i < dtest.length; i++) {
        System.out.print("dlist add return: " + dlist.add(dtest[i] +""));
        System.out.println("|dlist size: "+ dlist.size());
        System.out.println(dlist);
      }
//-----------------------------------------------------//
System.out.println("\n");
for (int i = 0; i < alist.size();i++) {
  System.out.println(alist.set(i, alist.get(i) + i));
}
System.out.println(alist);

for (int i = -2; i < 35; i++) {
  System.out.println(alist.set(i,alist.get(i)));
  System.out.println(alist.get(i));
}
for (int i = -2; i < 35; i++) {
  System.out.println(blist.set(i,blist.get(i)));
  System.out.println(blist.get(i));
}
for (int i = -2; i < 35; i++) {
  System.out.println(clist.set(i,clist.get(i)));
  System.out.println(clist.get(i));
}
//-----------------------------------------------------//
SuperArray elist = new SuperArray(4);
for (int i = 0; i < 12; i++) {
System.out.print("elist add return: " + elist.add(i-1+""));
System.out.println("|elist size: "+ elist.size());
System.out.println(elist);
}
SuperArray flist = new SuperArray(4);
for (int i = 0; i < 12; i++) {
System.out.print("flist add return: " + flist.add(dtest[i] +""));
System.out.println("|flist size: "+ flist.size());
System.out.println(flist);
}

//-----------------------------------------------------//
System.out.println("alist removed (Pos0): "+ alist.remove(0));
System.out.println("alist new size: "+ alist.size());
System.out.println(alist);

System.out.println("blist removed (Pos1): "+ blist.remove(1));
System.out.println("blist new size: "+ blist.size());
System.out.println(blist);

System.out.println("dlist removed (Pos2): "+ dlist.remove(2));
System.out.println("dlist new size: "+ dlist.size());
System.out.println(dlist);
//-----------------------------------------------------//
SuperArray hlist = new SuperArray();
System.out.println(hlist);
hlist.add("");
hlist.add("");
hlist.add("");
hlist.add("");
hlist.add("-");
hlist.add("-");
hlist.add(".");
System.out.println(hlist);
SuperArray ilist = new SuperArray();
for (int i = 0; i < 51; i++) {
System.out.print("ilist add return: " + ilist.add(i+""));
System.out.println("|ilist size: "+ ilist.size());
System.out.println(ilist);
}
System.out.println(dlist.size());
System.out.println(dlist.indexOf("Zameen2"));
System.out.println(dlist.lastIndexOf("Zameen2"));
System.out.println(dlist.indexOf("Jonathan7"));
System.out.println(dlist.lastIndexOf("Jonathan7"));
System.out.println(dlist.indexOf("Calvin18"));
System.out.println(dlist.lastIndexOf("Calvin18"));
System.out.println(dlist.indexOf("Shaon0"));
System.out.println(dlist.lastIndexOf("Shaon0"));
System.out.println(dlist.lastIndexOf("a"));
System.out.println(dlist.indexOf("a"));

for (int i = 55; i>-3;i--) {
System.out.println(ilist.remove(i));
System.out.println(ilist);
}

System.out.println(dlist.remove("Zameen2"));
System.out.println(dlist);
System.out.println(dlist.remove("Zameen2"));
System.out.println(dlist);
System.out.println(dlist.remove("Zameen2"));
System.out.println(dlist);
System.out.println(dlist.remove("Calvin18"));
System.out.println(dlist);
System.out.println(dlist.remove("Calvin18"));
System.out.println(dlist);
System.out.println(dlist.remove("Calvin18"));
System.out.println(dlist);

SuperArray jlist = new SuperArray();
System.out.println(jlist);
System.out.println(jlist.size());
jlist.add(0,"lol1");
System.out.println(jlist);
jlist.add(-1,"lol2");
System.out.println(jlist);
jlist.add(1,"lol3");
System.out.println(jlist);
jlist.add(0,"lol4");
System.out.println(jlist);
jlist.add(2,"lol5");
System.out.println(jlist);
jlist.add(4,"lol6");
System.out.println(jlist);
jlist.add(3,"lol7");
System.out.println(jlist);
jlist.add(7,"lol8");
System.out.println(jlist);
jlist.add(6,"lol9");
System.out.println(jlist);
jlist.add(8,"lol10");
System.out.println(jlist);
jlist.add(5,"lol11");
System.out.println(jlist);
jlist.add(8,"lol12");
System.out.println(jlist);
System.out.println(jlist.remove("lol2"));
System.out.println(jlist);
System.out.println(jlist.remove("lol3"));
System.out.println(jlist);
System.out.println(jlist.remove(4));
System.out.println(jlist.remove(-1));
System.out.println(jlist.remove(10));
System.out.println(jlist.add("lol13"));
System.out.println(jlist);
}
}
