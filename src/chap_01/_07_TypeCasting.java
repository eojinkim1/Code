package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변화 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); // 98

        //정수 + 실수 연산
        score = 93 + (int) 98.8; // 93+98
        System.out.println(score); // 191

        score_d = (double) 93 + 98.8; //93.0 + 98.8 double 없어도 됨
        System.out.println(score_d);

        // 변수에 형변환되 데이터 집어넣기
        double convertedScoreDouble = score; // 191 > 191.0
        System.out.println(score);
        // int -> long -> float -> double (작은 범위에서 큰 범위는 자동 형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (큰 범위에서 작은 범위는 수동 형변환 해야함)

        // 숫자를 문자열로 변환
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로 변환
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98");
        System.out.println(d); // 98.8

//        int error = Integer.parseInt("자바"); "" 따옴표 안에 들어가는 형태가 숫자형태이어야 함
    }
}
