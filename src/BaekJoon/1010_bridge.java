import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int repeat;
		repeat = sc.nextInt();
		
		for (int i =0; i< repeat; i++){
			int fir= sc.nextInt();
			int sec= sc.nextInt();
			System.out.println(combi(sec,fir));
		}
    sc.close();
		
	}
	
	public static int combi(int n,int r){
		if( n==r || r==0) return 1;
		else return combi(n-1,r-1)+combi(n-1,r);
	}
}