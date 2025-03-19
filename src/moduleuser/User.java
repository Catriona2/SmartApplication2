package moduleuser;

public class User {
    private String name;
    int aging;
    private int age;

    public User(String namee, int agee) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
