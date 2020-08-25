
    class Arithmetic{
    }

    class Adder extends Arithmetic{
        public int add(int c, int d){
            return c+d;
        }
    }

public class Test{
    public static void main(String []args){
        
        Adder ad = new Adder();
        

        System.out.println("Myrclass is: " + ad.getClass().getSuperclass().getName());  

       
        System.out.println(ad.add(10,32) + " " + ad.add(10,3) + " " + ad.add(10,10) + "\n");
     }
}