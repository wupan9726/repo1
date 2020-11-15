package Static静态;

public class Demo01StaticStudent {
    private String name;
    private int age;
    static String room;
    private int id;
    private static int idcount=0;

    public Demo01StaticStudent() {
    this.id=++idcount;
    }

    public Demo01StaticStudent(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
