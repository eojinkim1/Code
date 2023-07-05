package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;


        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 (괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true (최고의 식당)

        //AND 연산
        System.out.println(5 > 3 && 3 > 1); // true
        System.out.println(5 > 3 && 3 < 1); // false

        // OR 연산
        System.out.println(5 > 3 || 3 > 1); // true
        System.out.println(5 > 3 || 3 < 1); // true
        System.out.println(5 < 3 || 3 < 1); // false

        // System.out.println(1 < 3 < 5); // 불가능코드

        //논리 부정 연산자 (결과 역전)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}

