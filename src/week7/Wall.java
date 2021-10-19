package week7;

public class Wall {
    /*Write a class with the name homeworkweek_7.Wall. The class needs two fields (instance variables) with name width
    and height of type double.*/
    double width, height;

    public Wall() {

    }


    /*The class needs to have two constructors. The first constructor does not have any parameters (no-arg
    constructor). The second constructor has parameters width and height of type double and it needs to
    initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
    height parameter is less than 0 it needs to set the height field value to 0.
     */
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else
            this.width = width;
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Write the following methods (instance methods):
    //* Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        return this.width;
    }

    //* Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return this.height;
    }
    //* Method named setWidth with one parameter of type double, it needs to set the value of the width
    //field. If the parameter is less than 0 it needs to set the width field value to 0.

    public void setWidth(double width1) {
        if (width1 < 0) {
            this.width = 0;
        } else {
            this.width = width1;
        }
    }

    //* Method named setHeight with one parameter of type double, it needs to set the value of the
    //height field. If the parameter is less than 0 it needs to set the height field value to 0.
    public void setHieght(double height1) {
        if (height1 < 0) {
            this.height = 0;
        }else{
            this.height=height1;
        }
    }

    //* Method named getArea without any parameters, it needs to return the area of the wall.
    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public static void main(String[] args) {

        Wall wall = new Wall(5, 4);

        System.out.println("area= " + wall.getArea());

        wall.setHieght(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }
}


