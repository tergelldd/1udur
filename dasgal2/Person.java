public class Person {
    private String name;
    private int age;

    public void greet(){
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
