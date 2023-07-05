package chap_06;

// 정보
// 이름 : 2번째 글자 (김어진)
// 주민등록번호 : 9번째 글자 (000428-3234567)
/// 전화번호 : 10번째 글자 (010-1234-5678)

// 실행 결과
// 이름 : 김**
// 주민등록번호 : 000428-3******
// 전화번호 : 010-1234-****

public class _Quiz_06 {
    public static String getHiddenData(String target , int indexNumber) {
        String hideentarget = target.substring(0, indexNumber);
        for (int i = 0; i < target.length() - indexNumber; i++) {
            hideentarget += "*";
        }
        return hideentarget;
    }
    public static void main(String[] args) {
        String name = "김어진"; // 이름
        String id = "000428-3234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
