package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자(조건 연산자)

        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max =  (x > y) ? x : y;
        System.out.println(max);

        int min =  (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = x != y ? "달라요" : "같아요";
        System.out.println(s); // 달라요
    }
}
