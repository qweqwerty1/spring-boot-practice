import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "Jpa", "SpringBoot");

        names.stream() // 1. 리스트를 스트림으로 변환 (데이터가 흐르기 시작)
                .filter(name -> name.startsWith("J")) // 2. 필터링: "J"로 시작하는 이름만 통과시킴
                .map(name -> name.toUpperCase())      // 3. 변환: 통과된 이름을 대문자로 바꿈
                .forEach(name -> System.out.println(name)); // 4. 최종 소비: 각각의 이름을 출력
    }
}