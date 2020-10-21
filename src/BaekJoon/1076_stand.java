import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Map<String,Integer> list = new HashMap<String,Integer>();

    list.put("black",0);
    list.put("brown",1);
    list.put("red",2);
    list.put("orange",3);
    list.put("yellow",4);
    list.put("green",5);
    list.put("blue",6);
    list.put("violet",7);
    list.put("grey",8);
    list.put("white",9);

    String first = sc.nextLine();
    String sec = sc.nextLine();
    String thi = sc.nextLine();

    int num = list.get(first)*10;
    int num2= list.get(sec);
    long temp= list.get(thi);
    System.out.println((num+num2) * (long)Math.pow(10, temp));

    
  }
}