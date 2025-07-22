public class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    void move() {
        System.out.println("자전거가 페달을 밟으며 나아갑니다.");
    }
}
