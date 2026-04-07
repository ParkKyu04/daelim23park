// 예제2-4
// 자동 형변환과 강제 형변환을 보여주는 예제

public class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.println(b+i);        // b가 int타입으로 자동 변환
        System.out.println(10/4);
        System.out.println(10.0/4);     // 4가 4.0으로 자동 변환
        System.out.println((char)0x12340041);   // 16진수
        System.out.println((byte)(b+i)); // byte랑 int랑 합쳐버려서 결과값이 찌끄러짐
        System.out.println((int)2.9 + 1.8);
        System.out.println((int)(2.9 + 1.8));
        System.out.println((int)2.9 + (int)1.8);
    }
}
