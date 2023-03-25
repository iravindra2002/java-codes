public class compoundinterest {
    public static void main(String args[])
    {
        double principal=100;
         double rate=1.5;
         double time=1;
          double CI=principal*(Math.pow((1+rate/100),time));
          System.out.println("Compound Interest"+CI);     
    }
    
}
