
public class Trapezio {
    private double a,b,h,ar;
    
    public double getAr(){
        return ar;
    }
    public  double getA(){
        return a;
    }
    public  double getH(){
        return h;
    }
    public  double getB(){
        return b;
    }
    
    public void setAr(double ar){
        this.ar=ar;
    }
    public void setB(int b){
        this.b=b;
    }
    public void setH(int h){
        this.h=h;
    }
    public void setA(int a){
        this.a=a;
    }
    
    public double calcularArea(){
         ar=(h*(a+b))*0.5;
         return ar;
     }
}
