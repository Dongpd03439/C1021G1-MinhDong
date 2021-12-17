package Ss11_java__java_collection_framework.thuc_hanh.Sorting_compareable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        Student student = new Student("Đông", 26, "ST");
        Student student1 = new Student("Lôc", 30, "NHS");
        Student student2 = new Student("Hoàng", 21, "GL");
        Student student3 = new Student("Sơn", 38, "CL");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
