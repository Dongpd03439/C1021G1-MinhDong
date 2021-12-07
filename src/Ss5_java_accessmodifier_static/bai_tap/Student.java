package Ss5_java_accessmodifier_static.bai_tap;

public class Student {
    private String name = "Đông";
    private String  class1 = "C10";

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public Student(String name, String class1) {
        this.name = name;
        this.class1 = class1;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Khoa");
        st.setClass1("C11");
        System.out.println(st.getName());
        System.out.println(st.getClass1());
    }
}
