package ua.goit;


public class Customer {
    private String name;
    private int age;
    private boolean married;

    public Customer(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
