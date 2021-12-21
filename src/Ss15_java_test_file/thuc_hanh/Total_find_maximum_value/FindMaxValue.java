package Ss15_java_test_file.thuc_hanh.Total_find_maximum_value;

import java.util.List;

public class FindMaxValue {

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("Module2/src/io_text_file/thuc_hanh/data/numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("Module2/src/io_text_file/thuc_hanh/data/result.txt", maxValue);
    }
}
