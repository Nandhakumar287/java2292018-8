import java.io.*;
import java.util.*;
  public class Count{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number:");
      int a=sc.nextInt();
	    int b=(int)Math.ceil(Math.log10(a));
	    System.out.println("Count NUmber:"+b);
    }
  } 
