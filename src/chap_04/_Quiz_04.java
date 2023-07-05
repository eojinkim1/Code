package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {

        // 주차 요금은 시간당 4,000원 (일일 최대 요금은 30,000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 10;
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;

        int fee = hour * 4_000;
        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30_000){
            fee = 30_000; // 일일 최대 요금
        }
        if (isSmallCar || withDisabledPerson) {
            fee/=2;
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
