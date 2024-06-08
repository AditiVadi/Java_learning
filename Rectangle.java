import java.util.*;
class area{
int length;
int breadth;
area(int l, int b)
{
length = l;
breadth = b;
}
public int returnarea()
{
return length * breadth;
}}
public class Rectangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int l,b;
System.out.print("Enter the length of the rectangle:");
l=sc.nextInt();
System.out.print("Enter the breadth of the rectangle:");
b=sc.nextInt();
area a=new area(l,b);
System.out.println("Area is:" +a.returnarea());
System.out.println("ADITI VADI-21DCS132");
}
}
