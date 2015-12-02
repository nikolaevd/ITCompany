
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

    // получить евклидову норму
    public double getLength(){
        return Math.sqrt((x*x)+(y*y));
    }
    
    // умножение вектора на число
    public void multiplication(double num){
        this.x *= num;
        this.y *= num;
    }
    
    // сложение векторов 
    public Vector addition(Vector v){
        return new Vector((x + v.getX()), (y + v.getY()));
    }
    
    // скалярное произведение двух векторов
    public double scalarMultiplication(Vector v){
        return (this.x * v.getX() + this.y * v.getY());
    }

    public static void main(String[] args) {

    }

}
