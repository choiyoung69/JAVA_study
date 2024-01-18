public class Main {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1; //피연산자가 정수로 변환 후 저장

        c3 = (char)(c1 + 1); //int 결과를 char 로 형변환 시킨 것이기 때문에 자동형변환은 안됨
        c2++;
        c2++;  //c2 = c2 + 1;을 하면 안되는데 연산 결과가 int로 저장되기 때뮨아더,

        System.out.println("i=" + i);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);
    }
}