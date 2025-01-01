package oop1.ex;

public class Rectangle {

    int width = 0;
    int height = 0;

    void caculateArea() {
        int area = width * height;
        System.out.println("넓이 : " + area);
    }

    void caculatePerimeter() {
        int perimeter = (width + height) * 2;
        System.out.println("둘레 : " + perimeter);
    }

    void square() {
        boolean square = false;
        if(width == height) {
            square = true;
        }
        if(square) {
            System.out.println("정사각형 입니다.");
        } else{
            System.out.println("정사각형이 아닙니다.");
        }
    }
}
