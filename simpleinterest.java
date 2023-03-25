 class Simpleinterest{

    float principal=100;
    float rate=2;
    float time=3;
    
    public static void main (String args[]){
        Simpleinterest obj=new Simpleinterest();
        float SI=(obj.principal*obj.time*obj.rate)/100;
        System.out.println("Simple interest:"+SI);
    }
}