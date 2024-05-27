//simple inheritance
    class cls1
{    
    void add(int p,int q){
        System.out.println(p+q);
    }
}
class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int p,int q)
    {
          System.out.println((p*p)+(q*q));
    }
    
}
class sol{
public static void main(String args[]){
    int p=2,q=4;
  cls2 obj=new cls2();
  obj.add( p, q);
  obj.mul( p, q);
  obj.task( p, q);
}
}