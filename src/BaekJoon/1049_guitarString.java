import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
    int brands = sc.nextInt();
    int []many = new int[brands];
    int []one = new int[brands];
    int min = Integer.MAX_VALUE;

    for (int i=0; i<brands; i++){
      many[i]= sc.nextInt();
      one[i]= sc.nextInt();
    }
    
    Arrays.sort(many);
    Arrays.sort(one);  

    min = Math.min(((num/6)+1)*many[0],num*one[0]);
    min = Math.min(min,((num/6))*many[0]+(num%6)*one[0] );

    System.out.println(min);
    
	}
}