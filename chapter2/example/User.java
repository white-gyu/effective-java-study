package chapter2.example;

public class User {
    private String name;
    private String address;

    private static final User ADMIN = new User("admin");
    private static final User TESTER = new User("tester");

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    static User getAdminUser() {
        return ADMIN;
    }

    static User getTesterUser() {
        return TESTER;
    }

    static User Name(String name) {
        User user = new User();

        user.name = name;

        return user;
    }

    public static void main(String[] args) {
        //생성자에 넘기는 매개변수와 생성자 자체만으로는 반환될 특성 설명 불가능
        User whiteGyuByConstructor = new User("white-gyu");

        // 이름을 가질 수 있다. -> 반환될 객체의 특성 설명 가능
        User whiteGyuByStaticMethod = User.Name("white-gyu");
    }
}