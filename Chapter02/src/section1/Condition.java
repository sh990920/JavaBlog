package section1;

public class Condition {
    public static void main(String[] args) {
        int score = 95;
        if(score >= 90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score < 90){
            System.out.println("점수가 90 보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}
