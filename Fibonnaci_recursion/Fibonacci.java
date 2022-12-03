import java.util.Scanner;
public class Fibonacci {
    public  static int fib(int x) {
        if(x<=1)return x; return fib(x-1)+fib(x-2);        
    }
    public static void main(String [] args){
        Scanner sacn=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers you want to show up:: ");
        int num=sacn.nextInt();
        sacn.close();
        System.out.print("The Numbers is : ");
        for(int i=0;i<num;i++){
            
            System.out.print(fib(i)+" "); 
        } 
    }

}
