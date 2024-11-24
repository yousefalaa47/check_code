package check_code;

import java .util.* ;

public class Check_code {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int res = 0 ;
       int x = input.nextInt();
       int y = input.nextInt();
       String s = input.next();
           
        if (s.length() == x+y+1 && s.substring(x, x+1).equals("-") && isNumeric(s.substring(0, x)) && isNumeric(s.substring(x+1,s.length()))) {
            System.out.println("Yes");                                  
        }
        else
            System.out.println("No");

    }
    public static boolean isNumeric(String strNum) { 
        if (strNum == null) 
            return false; 

        try {
            long L = Long.parseLong(strNum);
            if(L<0)
                return false;
        }
        catch (NumberFormatException nfe) {
            return false; 
        } 
        return true;
    }
}
