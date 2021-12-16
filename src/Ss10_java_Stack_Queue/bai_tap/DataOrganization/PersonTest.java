package Ss10_java_Stack_Queue.bai_tap.DataOrganization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        ArrayList<Person> arrayListOutput = new ArrayList<>();
        arrayList.add(new Person("Nguyễn Văn A", "nam", "15/12/2021"));
        arrayList.add(new Person("Nguyễn Văn B", "nam", "15/12/2021"));
        arrayList.add(new Person("Nguyễn Thị C", "nữ", "15/12/2021"));
        arrayList.add(new Person("Nguyễn Văn D", "nam", "15/12/2000"));
        arrayList.add(new Person("nguyễn Thị E", "nữ", "15/12/1998"));
        arrayList.add(new Person("Nguyễn Thị F", "nữ", "15/12/1998"));
        arrayList.add(new Person("Nguyễn Văn G", "nam", "15/12/2002"));

        Collections.sort(arrayList, new Sort());
        for (Person e : arrayList) {
            System.out.println(e);
        }
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();

        for (Person person : arrayList){
            if (person.getGioiTinh().equals("nam")){
                nam.add(person);
            }else {
                nu.add(person);
            }
        }
        while (!nu.isEmpty()){
            arrayListOutput.add(nu.poll());
        }
        while (!nam.isEmpty()){
            arrayListOutput.add(nam.poll());
        }
        System.out.println("Sau khi tổ chức lại dữ liệu");
        for (Person e : arrayListOutput) {
            System.out.println(e);
        }
    }
}
