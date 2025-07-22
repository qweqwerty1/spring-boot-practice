public class Main {
    public static void main(String[] args) {
        // 람다 이전 (익명 클래스 사용)
        Runnable oldWay = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello (Old way)");
            }
        };
        oldWay.run();

        // 람다 사용
        // () -> System.out.println("Hello (Lambda way)") 부분이 람다 표현식입니다.
        // 매개변수는 없고, 실행할 코드는 System.out.println(...) 입니다.
        Runnable newWay = () -> System.out.println("Hello (Lambda way)");
        newWay.run();
    }
}