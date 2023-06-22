import java.util.*;
class Product{
int pcode,price;
String pname;
Product(int pcode, String pname, int price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}
}

class Products{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("\nEnter product code: ");
int pcode=s.nextInt();
System.out.print("\nEnter product name: ");
String pname=s.next();
System.out.print("\nEnter product price: ");
int price=s.nextInt();
Product[] ps=new Product[3];
ps[0]=new Product(pcode,pname,price);
ps[1]=new Product(130,"Oreo",55);
ps[2]=new Product(131,"DF",35); 
int min=ps[0].price;
for(Product p:ps){
if(p.price<min){
min=p.price;}}
System.out.print("\n\nProduct Details:\n----------------\n\n");
System.out.print("Product_code   Price   Product_Name\n");
System.out.print("-----------------------------------\n");
for(Product p:ps){
System.out.println(p.pcode+"             "+p.price+"          "+p.pname);
}
for(Product p:ps){
if(p.price==min){
System.out.println("\n\nLeast priced product is:\nProduct Name:"+p.pname+"\nPrice: "+p.price+"\nProduct Code: "+p.pcode);
}}
}
}
