class Cpu{
   int price=45000;
   class Processor{
     int NoOfCores=6;
     String manufacturer="AMD";
       void display(){
              System.out.println("No. of cores of Processor: "+NoOfCores);
              System.out.println("Manufacturer of Processor: "+manufacturer);
          }
    }
    void display(){
        Processor p=new Processor();
         p.display();
         System.out.println("Price of Processor :"+price);
   }
 
    static class Ram{
       int memory=8;
       String manufacturer="Samsung";
    void display(){
        System.out.println("Memory size: "+memory);
        System.out.println("Manufacturer of the Memory: "+manufacturer);
   }
 }
}
public class Pc{
   public static void main(String [] args){
       Cpu c1=new Cpu();
       c1.display();
 
 
     Cpu.Ram r1=new Cpu.Ram();
      r1.display();
}
}
