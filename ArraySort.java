import java.util.*;
class ArraySort{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter size of array: ");
int size=s.nextInt();
String[] a=new String[size];
System.out.println("\nEnter Elemenets of Array: ");
for(int i=0;i<size;i++){
a[i]=s.next();
}
System.out.println("\n\nChoose an option from the below\n1.Sorting using built-in Function\n2.Sorting using user-defined Function\n");
System.out.print("\nEnter your option: ");
int opt=s.nextInt();
switch(opt){
case 1:Arrays.sort(a);
       break;
case 2:for(int i = 0; i<size; i++){  
       for (int j = i+1; j<size; j++){  
       if(a[i].compareTo(a[j])>0){  
              String temp = a[i];  
              a[i] = a[j];  
              a[j] = temp;  
           }
           } 
           }
         break;
default:System.out.println("\nEnter a valid option");
}
System.out.println("\n\nSorted Array: ");
for(int i=0;i<size;i++)
{
System.out.println(a[i]);
}
}
}
