package bai_tap_lam_them.bai_1.controlier.service.impl;

import bai_tap_lam_them.bai_1.controlier.model.Cadidate;
import bai_tap_lam_them.bai_1.controlier.service.ICadidateService;

import java.util.Scanner;

public class CadidateService implements ICadidateService {
    private Cadidate[] cadidates = new Cadidate[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void addNewCadidate() {
        if (count < cadidates.length) {
            System.out.print("Mời bạn nhập mã: ");
            String code = scanner.nextLine();
            System.out.print("Mời bạn nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Mời bạn nhập ngày tháng năm sinh: ");
            String dateOfBirth = scanner.nextLine();
            System.out.print("Mời bạn nhập điểm Toán: ");
            double pointOfMath = Double.parseDouble(scanner.nextLine());
            System.out.print("Mời bạn nhập điểm Văn: ");
            double pointOfLiterature = Double.parseDouble(scanner.nextLine());
            System.out.print("Mời bạn nhập điểm Anh: ");
            double pointOfEnglish = Double.parseDouble(scanner.nextLine());
            Cadidate cadidate = new Cadidate(code, name, dateOfBirth, pointOfMath, pointOfLiterature, pointOfEnglish);
            cadidates[count] = cadidate;
            count++;
        } else {
            System.out.println("Danh sách đã đầy. Không thể thêm mới.");
        }

    }

    @Override
    public void getAll() {
        for (Cadidate cadidate : cadidates) {
            if (cadidate == null) {
                break;
            }
            if (cadidate.getPointOfEnglish() + cadidate.getPointOfLiterature() + cadidate.getPointOfMath() > 15) {
                System.out.println(cadidate);
            }
        }
    }

    @Override
    public void addMoreCadidate() {
        System.out.print("Mời bạn nhập số lượng cần thêm: ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num + count > 100) {
            System.out.println("Số lượng vượt quá danh sách");
        } else {
            for (int i = 0; i < num; i++) {
                addNewCadidate();
            }
        }
    }

}
