package bai_tap_lam_them.bai_2.service.impl;

import bai_tap_lam_them.bai_2.model.Student;
import bai_tap_lam_them.bai_2.service.StudentService;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IStudentService extends Student implements StudentService, Comparable<IStudentService>{

    Scanner scanner = new Scanner(System.in);

    public IStudentService() {
        super();
    }

    public IStudentService(int mssv, String name, String dayOfbirth, String sex, String nameOfClass, String grade) {
        super(mssv, name, dayOfbirth, sex, nameOfClass, grade);
    }

    private static Student[] studentsList = new Student[3];


    static {
        Student student = new IStudentService(1, "Nguyễn Minh Đông", "02/10/1997", " Nam", "C10", "g1_21");
        Student student1 = new IStudentService(4, "Phan Thị Kim Chi", "19/03/1995", " Nữ", "C10", "g1_21");
        Student student2 = new IStudentService(2, "Nguyễn Văn Duy Khang", "18/06/2018", " Nam", "C10", "g1_21");
        studentsList[0] = student;
        studentsList[1] = student1;
        studentsList[2] = student2;

    }

    @Override
    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập thông tin sinh viên mới");

        System.out.print("Nhập mã số sinh viên: ");
        int mssv = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập ngày sinh sinh viên: ");
        String dayOfbirth = scanner.nextLine();

        System.out.print("Nhập giới tính sinh viên: ");
        String gender = scanner.nextLine();

        System.out.print("Nhập lớp sinh viên: ");
        String ofClass = scanner.nextLine();

        System.out.print("Nhập khóa sinh viên: ");
        String grade = scanner.nextLine();
        Student student = new Student(mssv, name, dayOfbirth, gender, ofClass, grade);


        Student[] newStudentList = new Student[studentsList.length + 1];
        for (int i = 0; i < studentsList.length; i++) {
            newStudentList[i] = studentsList[i];
        }
        newStudentList[newStudentList.length - 1] = student;
        studentsList = newStudentList;

    }

    @Override
    public void removeMssv() {
        System.out.print("Mời nhập MSSV cần xóa: ");
        int value = Integer.parseInt(scanner.nextLine());
        Student[] newStudentList = new Student[studentsList.length - 1];
        for (int i = 0; i < studentsList.length; i++) {
            if (value == studentsList[i].getMssv()) {
                for (int j = i; j < studentsList.length - 1; j++) {
                    studentsList[j] = studentsList[j + 1];
                }
            }
        }
        for (int i = 0; i < newStudentList.length; i++) {
            newStudentList[i] = studentsList[i];
        }

        studentsList = newStudentList;
    }


    @Override
    public void removeP() {
        System.out.print("Mời nhập STT sinh viên cần xóa: ");
        int value = Integer.parseInt(scanner.nextLine());
        Student[] newStudentList = new Student[studentsList.length - 1];
        for (int i = 0; i < studentsList.length; i++) {
            if (value == i + 1) {
                for (int j = i; j < studentsList.length - 1; j++) {
                    studentsList[j] = studentsList[j + 1];
                }
            }
        }
        for (int i = 0; i < newStudentList.length; i++) {
            newStudentList[i] = studentsList[i];
        }

        studentsList = newStudentList;
    }

    @Override
    public Student searchStudent() {
        System.out.println("Mời nhập MSSV hoặc tên sinh viên cần tìm: ");
        String string = scanner.nextLine();
        Student student = new IStudentService();
        Pattern p = Pattern.compile("^[0-9]+$");
        for (int i = 0; i < studentsList.length; i++) {
            if (p.matcher(string).find()) {
                if (Integer.parseInt(string) == studentsList[i].getMssv()) {
                    student = studentsList[i];
                    break;
                }

            } else if (studentsList[i].getName().equals(string)) {
                student = studentsList[i];
                break;
            }
        }
        return student;
    }


    @Override
    public Student[] printAll() {
        return studentsList;
    }

    @Override
    public void sort() {
        Arrays.sort(studentsList);
    }

    @Override
    public int compareTo(IStudentService o) {
        return this.getMssv() - o.getMssv();
    }
}
