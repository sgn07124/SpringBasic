package hello.core.Singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();  // 자기 자신을 static으로 하나만 생성

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){  // private로 만들었기 때문에 외부에서 new로 객체를 생성할 수 없다.

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
