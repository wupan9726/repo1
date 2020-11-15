public class Student {
   /* private String name;
    private int age;
    private boolean male;
    public void setName(String str){
        name=str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age=num;
    }
    public int getAge(){
        return age;
    }
    public void setMale(boolean b){
        male=b;
    }
    public boolean isMale(){
        return male;
    }*/
   /* String name;
    public void sayHello(String name){
        System.out.println(name+ this.name);
    }*/
   /*public Student(){
       System.out.println("构造方法");
   }*/
   private String name;
   private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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
}
