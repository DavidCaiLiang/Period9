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
      System.out.println("get/set - test");
      for (int i = 0; i < alist.size(); i++) {
        System.out.print(alist.get(i) + "_");
      }

      System.out.println("\n");
      for (int i = 0; i < blist.size(); i++) {
        System.out.print(blist.get(i) + "_");
      }

      System.out.println("\n");
      for (int i = 0; i < dlist.size(); i++) {
        System.out.print(dlist.get(i) + "_");
      }

      System.out.println("\n");
      for (int i = 0; i < clist.size(); i++) {
        System.out.print(clist.get(i) + "_");
      }
//-----------------------------------------------------//
      System.out.println("\n");
      for (int i = 0; i < blist.size();i++) {
        blist.set(i,"HI" + blist.get(i));
      }
      System.out.println(blist);

      System.out.println("\n");
      for (int i = 0; i < blist.size(); i++) {
        if (i == blist.size()-1) {
          blist.set(i,"NOPE!");
        }
        else {
          blist.set(i,blist.get(i+1));
        }
      }
      System.out.println(blist);

      System.out.println("\n");
      for (int i = 0; i < alist.size();i++) {
        alist.set(i, alist.get(i) + i);
      }
      System.out.println(alist);

      System.out.println(alist.set(-1,""));
      System.out.println(alist.get(-1));
      System.out.println(blist.set(-1,""));
      System.out.println(blist.get(-1));
      System.out.println(clist.set(-1,""));
      System.out.println(clist.get(-1));
      System.out.println(dlist.set(-1,""));
      System.out.println(dlist.get(-1));

      System.out.println(alist.set(6,""));
      System.out.println(alist.get(6));
      System.out.println(blist.set(11,""));
      System.out.println(blist.get(11));
      System.out.println(clist.set(11,""));
      System.out.println(clist.get(11));
      System.out.println(dlist.set(11,""));
      System.out.println(dlist.get(11));
//-----------------------------------------------------//
SuperArray elist = new SuperArray(4);
for (int i = 0; i < 10; i++) {
  System.out.print("elist add return: " + elist.add(i-1+""));
  System.out.println("|elist size: "+ elist.size());
  System.out.println(elist);
}
SuperArray flist = new SuperArray(4);
for (int i = 0; i < 10; i++) {
  System.out.print("flist add return: " + flist.add(dtest[i] +""));
  System.out.println("|flist size: "+ flist.size());
  System.out.println(flist);
}

    }
  }
