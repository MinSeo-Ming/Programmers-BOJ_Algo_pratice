import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
    String tt = sc.nextLine();
    ArrayList<Integer>cd = new ArrayList<>();
    String temp = sc.nextLine();
    String []temps = temp.split(" ");
    for (int i = 0; i<temps.length; i++){
      int n = Integer.parseInt(temps[i]);
      cd.add(n);
    }
    Collections.sort(cd);
    int fir = cd.get(0);
    int end = cd.get(cd.size()-1);
    System.out.println(fir*end);
    
	}
}