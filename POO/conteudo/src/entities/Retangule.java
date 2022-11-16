
package entities;

public class Retangule {
 
    public double Width;
    public double Heigth;


    public double area(){
        return this.Width * this.Heigth;
    }
    public double perimeter(){
        return  2 * (this.Width + this.Heigth);
    }
    public double diagonal(){
        return Math.sqrt((Width * Width) + (Heigth *Heigth));
    }
    public String toString(){
        return  "area:" + area() + ",   " + "Perimetro :" + perimeter() + ", " + "Diagonal :" + diagonal();
    }
}
