package bai_tap_lam_them.bai_1.controlier;

import bai_tap_lam_them.bai_1.controlier.service.ICadidateService;
import bai_tap_lam_them.bai_1.controlier.service.impl.CadidateService;

import java.util.Scanner;

public class CadidateControllier {
    public static void main(String[] args) {
        ICadidateService iCadidateService = new CadidateService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Add new 1 Candidate");
            System.out.println("2. List all Candidate");
            System.out.println("3. Add n Candidate");
            System.out.println("4. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iCadidateService.addNewCadidate();
                    break;
                case 2:
                    iCadidateService.getAll();
                    break;
                case 3:
                    iCadidateService.addMoreCadidate();
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
