package Ss12_java_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchAscending {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> substring = new LinkedList<>();
            substring.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > substring.getLast()) {
                    substring.add(string.charAt(j));
                }
            }
            if (substring.size() > max.size()) {
                max = substring;
            }
        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
