package bai_tap_lam_them.bai_2.service;

import bai_tap_lam_them.bai_2.model.Student;

public interface StudentService {
    void addStudent();
    void removeMssv();
    void removeP();

    Student searchStudent() ;


    Student[] printAll();
    void sort();
}
