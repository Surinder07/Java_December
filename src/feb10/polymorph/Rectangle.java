package feb10.polymorph;

public class Rectangle extends Shape{

   /* // method overriding
    @Override
    public double getArea() {
        return super.getArea();
    }*/

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // @ annotation ---> compile time check
    @Override
    public double getArea(){
        return length * width;
    }
}


/*
To achieve method overriding
create a CanadaBank - provide some interest rate
6.5
getRateOfInterest(){
}

ScotiaBank, 7.8
 BMO bank,  8.5
 RBC bank , 7.7



 */