package Code_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
     static Scanner sc = new Scanner(System.in);
     static Scanner sc1 = new Scanner(System.in);
     
     static List<String> stringList = new ArrayList<>();
     static List<String> oddStringList = new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Please enter no.of Strings: ");
        int n = sc.nextInt();

        System.out.println("Please the enter the Strings: ");
        for (int i = 0; i < n; i++) {
            stringList.add(sc1.nextLine());
        }

        // fetching the strings

        for (String f : stringList) {
            
            if(f.length()%2 != 0){
                oddStringList.add(f);
            }
        }
  
        // identifying the odd string with max length

        String result = "Better Luck Next Time";

        if (oddStringList.size() > 0) {

            result = oddStringList.get(0);

            for (int i = 1; i < oddStringList.size(); i++) {
             
                if (oddStringList.get(i).length() > result.length()) {
                    result = oddStringList.get(i);
                }
            }
         
         }
       
         // printing the answer

       System.out.println(result);

        
    }
    
}
