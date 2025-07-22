# DAY 02: OOP 심화와 최신 Java 기능

## 1. 학습 목표

-   **상속(Inheritance)**을 활용하여 클래스 간의 관계를 설정하고 코드를 재사용한다.
-   **다형성(Polymorphism)**과 **메서드 오버라이딩(Method Overriding)**을 통해 유연하고 확장 가능한 코드를 작성한다.
-   **추상 클래스(Abstract Class)**를 이용해 자식 클래스에게 특정 메서드 구현을 강제하는 방법을 익힌다.
-   Java 8의 핵심 기능인 **람다 표현식(Lambda Expression)**과 **스트림 API(Stream API)**의 기본 사용법을 익힌다.

## 2. 핵심 개념

-   **상속 (`extends`)**: 부모 클래스의 필드와 메서드를 자식 클래스가 물려받는 것. 코드 중복을 줄이고 계층 구조를 형성한다.
-   **다형성**: 하나의 부모 타입으로 여러 다른 자식 객체를 참조할 수 있는 성질. `Vehicle v = new Car();` 형태가 대표적이다.
-   **메서드 오버라이딩 (`@Override`)**: 부모 클래스로부터 상속받은 메서드를 자식 클래스에서 재정의하는 것.
-   **추상 클래스/메서드 (`abstract`)**: 미완성 설계도. `abstract` 메서드는 자식 클래스가 반드시 구현해야 할 메서드의 '규칙'을 정의한다.
-   **람다 표현식**: 이름 없는 함수를 간결하게 표현하는 문법. `(매개변수) -> { 실행문 }` 형태로 작성하며, 주로 컬렉션 처리나 이벤트 핸들러에 사용된다.
-   **스트림 API**: 컬렉션(List, Set 등)의 요소들을 하나씩 순회하며 필터링, 매핑 등 연속적인 처리를 할 수 있는 데이터 파이프라인.

## 3. 코드 예제: 동물농장 만들기

```java
// Animal.java (추상 클래스)
public abstract class Animal {
    String name;
    public Animal(String name) { this.name = name; }
    public abstract void makeSound(); // 자식이 반드시 구현해야 할 추상 메서드
}

// Cat.java
public class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override
    public void makeSound() { System.out.println(this.name + ": 야옹~"); }
}

// Dog.java
public class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void makeSound() { System.out.println(this.name + ": 멍멍!"); }
}

// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 다형성을 활용하여 Animal 리스트에 Dog와 Cat 객체 저장
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("roi"));
        animals.add(new Dog("hoi"));
        animals.add(new Cat("rai"));
        animals.add(new Cat("hai"));

        // 스트림과 람다를 사용하여 모든 동물의 makeSound() 호출
        animals.stream().forEach(animal -> animal.makeSound());
    }
}