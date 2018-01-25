public class Thing {
    public static void main (String[]args) {
        int value= 135;
        int zero= 0;
        int even= 0;
        int odd= 0;
        while (value > 0) 
             if ((value%10)==0) 
               zero++;
             else if (value%2==0) 
               even++;
            else  
               odd++;
        value /= 10;
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
    }}

