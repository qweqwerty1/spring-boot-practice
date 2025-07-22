// 모든 탈것의 공통적인 특징을 정의한 부모 클래스
public class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle 객체 생성!");
    }

    void start() {
        System.out.println("엔진 시동을 겁니다.");
    }

    void stop() {
        System.out.println("정지합니다.");
    }

    // @Override 될 메서드
    void move() {
        System.out.println("탈것이 움직입니다.");
    }
}