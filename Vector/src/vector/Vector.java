
package vector;

public class Vector {
    private double x;
    private double y;

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getLength(){
        return Math.sqrt((x*x)+(y*y));
    }
    
    public void multiplication(double num){
        x *= num;
        y *= num;
    }
    
    public Vector addition(Vector v){
        return new Vector((x + v.getX()), (y + v.getY()));
    }

    public static void main(String[] args) {

    }

}
