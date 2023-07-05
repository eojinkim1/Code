package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 정수만 나옴
        System.out.println(2 / 4); // 0 정수만 나옴
        System.out.println(4 % 2); // 0  %는 나머지 구하기
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6 헷갈리지 않게 이래봄

        int a = 20;
        int b = 20;
        int c;

        c = a + b;
        System.out.println(c); // 40

        c = a - b;
        System.out.println(c); // 0

        c = a * b;
        System.out.println(c); // 400

        c = a / b;
        System.out.println(c); // 1

        c = a % b;
        System.out.println(c); // 0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11 ++가 앞에 있으면 1을 먼저 더하는 연산
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 ++이 뒤에 있으면 문장을 수행하고 더하기를 해줌
        System.out.println(val); //11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 --가 앞에 있으면 1을 먼저 빼는 연산
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10 --가 앞에 있으면 1을 먼저 빼는 연산
        System.out.println(val); // 9

        //은행 대기번호 표 ++예시
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); //총 대기 인원 : 3
    }
}
