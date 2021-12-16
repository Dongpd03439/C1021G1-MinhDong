package Ss10_java_Stack_Queue.bai_tap.DataOrganization;

import java.util.Comparator;

public class Sort implements  Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String[] str1 = o1.getNgaySinh().split("/");
        String[] str2 = o2.getNgaySinh().split("/");
        String ngaySinh1 = "";
        String ngaySinh2 = "";
        for (int i = str1.length-1; i >=0; i--) {
            ngaySinh1 += str1[i];
            ngaySinh2 += str2[i];
        }
        return ngaySinh1.compareTo(ngaySinh2);
    }
}
