public class Ex41Circle {
    int radius; // 원의 반지름 필드
    String name;   // 원의 이름을 필드

    public double getArea() { //멤버 메소드
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex41Circle pizza;   // 객체 선언(빈 포인터만 생김)
        pizza = new Ex41Circle();   // Circle 객체 생성
        pizza.radius = 10;  // 피자의 반지름을 10으로 설정
        pizza.name = "자바피자";    // 객체 이름 설정
        double area = pizza.getArea();  // 피자의 면적 알아내기
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex41Circle dount = new Ex41Circle();    // Circle 객체 생성
        dount.radius = 2;   // 도넛의 반지름을 2로 설정
        dount.name = "자바도넛";    // 도넛의 이름 설정
        area = dount.getArea();     // 도넛의 면적 알아내기
        System.out.println(dount.name + "의 면적은 " + area);
    }
}