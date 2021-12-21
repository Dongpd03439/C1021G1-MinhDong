package Ss14_java_Debug_handling.bai_tap;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào giá trị cạnh: " + super.getMessage();
    }
}
