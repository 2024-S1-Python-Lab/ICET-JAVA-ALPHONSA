import java.util.Scanner;
public class Search
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array:");
int size=sc.nextInt();
int array []=new int[size];
System.out.println("Enter the elements of array:");
for (int i=0;i<size;i++)
{
System.out.print("Enter element"+(i+1)+":");
array[i] = sc.nextInt();
}
System.out.print("Enter the element to search:");
int searchElement=sc.nextInt();
Boolean found=false;
for (int i=0;i<size;i++)
{
if(array[i]==searchElement)
{
found=true;
System.out.println("Enter found at index"+i);
break;
}
}
if(!found)
System.out.println("Elememt not found in the array.");
}
}

