public class Main {
    public static void main(String[] args) {
        // 부모 타입(Vehicle)의 변수에 자식 객체(Car, Bicycle)를 담습니다.
        Vehicle myCar = new Car("현대", 4);
        Vehicle myBicycle = new Bicycle("삼천리");

        // 같은 move() 메서드를 호출했지만,
        // 실제 담겨있는 객체의 오버라이딩된 메서드가 실행됩니다.
        myCar.move();      // 출력: 자동차가 도로를 달립니다.
        myBicycle.move();  // 출력: 자전거가 페달을 밟으며 나아갑니다.
    }
}