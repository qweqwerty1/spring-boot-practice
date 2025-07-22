// Vehicle 클래스를 '상속'받는 Car 클래스
public class Car extends Vehicle {
    int doorCount;

    // super(...)는 부모 클래스의 생성자를 호출하는 코드입니다.
    public Car(String brand, int doorCount) {
        super(brand); // 부모 클래스의 생성자 호출
        this.doorCount = doorCount;
        System.out.println("Car 객체 생성!");
    }

    // 자식 클래스만의 새로운 메서드
    void honk() {
        System.out.println("빵빵!");
    }

    // 부모의 move() 메서드를 Car에 맞게 재정의(Overriding)
    @Override // 이 어노테이션은 오버라이딩을 정확히 했는지 컴파일러가 체크해주는 역할을 합니다.
    void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }
}