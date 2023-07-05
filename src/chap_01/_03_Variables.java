package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김어진";
        int hour = 15;

        System.out.println(name +"님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name +"님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격햇을까요?"+ pass);

        double d = 3.14123456789; // flot보다 소수 표현 정밀 큰 수 표현할 대
        float f = 3.14123446789F; // 소수 6번째자리까지만 정밀 표현 뒤는 정밀x 그렇게 많은 표현 필요 없을 때
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);

//        int, long, float, double, char, String, boolean 각 범위에 맞는 변수 사용 필요 아니면 공간이 부족하거나 남음
    }
}
