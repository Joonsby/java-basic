package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        // 넓이 구하기
        rectangle.caculateArea();
        // 둘레 구하기
        rectangle.caculatePerimeter();
        // 정사각형 여부
        rectangle.square();
    }
}
