package day5;

public class UserTest {
    public static void main(String[] args) {
        User inhwan = new User();
        inhwan.name = "손인환";
        inhwan.phoneNumber = "010-5059-8076";
        inhwan.age = 30;

        User jeasung = new User();
        jeasung.name = "재성 매니저님";
        jeasung.phoneNumber = "010-0000-1234";
        jeasung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n", inhwan.name, inhwan.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jeasung.name, jeasung.isAdult());

    }
}
