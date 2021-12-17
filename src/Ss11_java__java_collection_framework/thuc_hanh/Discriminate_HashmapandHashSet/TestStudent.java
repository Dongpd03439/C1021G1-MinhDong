package Ss11_java__java_collection_framework.thuc_hanh.Discriminate_HashmapandHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Đông",26, "ĐN");
        Student student2 = new Student("Chi",24, "ĐN");
        Student student3 = new Student("Khang",4, "ĐN");
        // write your code here
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
