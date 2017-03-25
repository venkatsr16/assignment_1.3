import java.util.*;
import java.lang.*;
import java.io.*;

class ass3
{
public static void main(String[] args)
{
//int a,b;
System.out.println("Enter the two numbers that needs to be swapped");
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
//a = 5;
//b = 10;
System.out.println("Before Swapping");
System.out.println("Value of A : " + a);
System.out.println("Value of B : " + b);
a = a + b;
b = a - b;
a = a - b;
System.out.println("After Swapping");
System.out.println("Value of A : " + a);
System.out.println("Value of B : " + b);
}
}