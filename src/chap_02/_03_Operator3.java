package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        //비교 연산자
        System.out.println(5 > 3); // true 5는 3보다 크므로 참 (참은 true, 거짓이면 false)
        System.out.println(5 >= 3); // false 5가 3보다 크거나 같다 (true)
        System.out.println(5 >= 5); // false 5가 5보다 크거나 같다 (true)
        System.out.println(5 >= 7); // false 5가 7보다 크거나 같다 (false)

        System.out.println(5 < 3); // 5는 3보다 작다 (false)
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다 (false)

        System.out.println(5 == 5); //5는 5와 같다 (true)
        System.out.println(5 == 3); //5는 3과 같다 (false)
        System.out.println(5 != 5); //5는 5와 같지 않다 (false)
        System.out.println(5 != 3); //5는 3와 같지 않다 (true)
    }
}
