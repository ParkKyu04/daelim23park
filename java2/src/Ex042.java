public class Ex042 {
    public static void main(String[] args) {
        for(int k = 2; k < 10; k++){
            System.out.print("[ " + k +"단 ]");
            System.out.print('\t');
            }
            System.out.println();
        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.print(j + "*" + i + "=" + i * j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}