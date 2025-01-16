public class Main {
    public static void main(String[] args) {
        // Khai báo và gán giá trị cho các biến
        int intValue = 42;
        double doubleValue = 3.14;
        String stringValue = "Hello, Java!";

        // In giá trị của các biến ra màn hình
        System.out.println("Giá trị của int: " + intValue);
        System.out.println("Giá trị của double: " + doubleValue);
        System.out.println("Giá trị của String: " + stringValue);

        // Kiểm tra giá trị của biến int
        if (intValue > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Less or equal to 10");
        }
    }
}
