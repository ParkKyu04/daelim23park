class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class Ex46CircleArray {
    public static void main(String[] args) {
        Circle[] c;         // 1. Circle 배열에 대한 레퍼런스 변수 c 선언
        c = new Circle[5];  // 2. 레퍼런스 배열 생성

        for(int i = 0; i < c.length; i++)
            c[i] = new Circle(i);   // 3. 각 원소 객체 생성

        for(int i = 0; i < c.length; i++)
            System.out.println((int) (c[i].getArea()) + " ");   // 배열의 원소 객체 사용
    }
}