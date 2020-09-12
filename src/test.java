import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String te = sc.next();
        System.out.println(solution(te));
    }
    static String solution(String new_id) {
        String temp = new_id.toLowerCase();
        temp= temp.replaceAll("[^a-z0-9-._]","");
        temp = temp.replaceAll("\\.{2,}",".");
        if (temp.charAt(0)=='.')
            temp = temp.substring(1);
        if(temp.isEmpty())
            temp = "a";
        if(temp.length()>=16) {
            temp = temp.substring(0, 15);
        }
            if (temp.charAt(temp.length()-1)=='.')
                temp=temp.substring(0,temp.length()-1);


        if(temp.length()<=2){

            char charT = temp.charAt(temp.length()-1);

            while(temp.length()<3){
                temp = temp + charT;
            }
        }

        return temp;

    }
}
/*
.toLowerCase()
     String temp = new_id;
        //String pt = "[a-z0-9]*$";
        Pattern pt = Pattern.compile("^[a-z0-9]*$");
        //temp= temp.replaceAll(pattern,"");
        String answer = "";
        Matcher matcher = pt.matcher(temp);
        //temp=temp.replaceAll(pt,"");
        //return result;
        while(matcher.find()){
            answer = matcher.replaceAll("");
        }
        boolean t = Pattern.matches("^[a-z]*$",new_id);


 */