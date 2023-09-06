package Session2;

public class Prepare {
    public static void main(String[] args) {
//    Tham trị (Pass-by-Value):
//    Trong Java, tham trị là cách chuyển đối số vào một phương thức. Khi bạn truyền một biến vào một
//    phương thức, thực tế bạn đang truyền giá trị của biến đó, không phải là biến gốc. Điều này có nghĩa
//    là bất kỳ thay đổi nào bạn thực hiện trên tham số trong phương thức đó sẽ không ảnh hưởng đến giá
//    trị của biến gốc ngoài phạm vi của phương thức. Điều này áp dụng cho tất cả các kiểu dữ liệu nguyên
//    thủy (int, float, char, v.v.).
//    Ví dụ:
//    public class PassByValueExample {
//        public static void main(String[] args) {
//            int x = 10;
//            modifyValue(x);
//            System.out.println(x); // In ra 10, giá trị của x không thay đổi
//        }
//        public static void modifyValue(int value) {
//            value = 20;
//        }
//    }
//    Tham chiếu (Pass-by-Reference):
//    Trong Java, tham chiếu ám chỉ việc truyền đối số bằng cách truyền tham chiếu đến đối tượng (đối với
//    kiểu tham chiếu, như mảng và các đối tượng tạo ra từ lớp). Khi bạn thay đổi trạng thái của đối tượng
//    thông qua tham chiếu, thì trạng thái của đối tượng gốc cũng thay đổi bởi vì cả hai tham chiếu đều chỉ
//    đến cùng một đối tượng.
//    Ví dụ:
//    public class PassByReferenceExample {
//        public static void main(String[] args) {
//            int[] array = {1, 2, 3};
//            modifyArray(array);
//            System.out.println(array[0]); // In ra 10, giá trị của mảng đã thay đổi
//        }
//
//        public static void modifyArray(int[] arr) {
//            arr[0] = 10;
//        }
//    }
//    Trong ví dụ này, tham số arr là một tham chiếu đến mảng array, do đó thay đổi arr cũng làm thay đổi mảng array.
//    1. Khai báo mảng:
//    Để khai báo một mảng, bạn cần xác định kiểu dữ liệu của các phần tử trong mảng và cấp phát bộ nhớ cho mảng. Cú pháp khai báo mảng trong Java như sau:
//    // Khai báo một mảng kiểu int có kích thước 5
//    int[] myArray = new int[5];

//        2. Truy cập phần tử trong mảng:
//        Để truy cập phần tử của mảng, bạn sử dụng chỉ số của phần tử đó trong dấu []. Chúng ta biết rằng chỉ số trong mảng bắt đầu từ 0. Ví dụ:
//        int firstElement = myArray[0]; // Lấy phần tử đầu tiên (có chỉ số 0)
//        int thirdElement = myArray[2]; // Lấy phần tử thứ ba (có chỉ số 2)

//        3. Thay đổi giá trị phần tử trong mảng:
//        Để thay đổi giá trị của phần tử trong mảng, bạn gán giá trị mới cho phần tử đó bằng cách sử dụng chỉ số. Ví dụ:
//        myArray[1] = 10; // Gán giá trị 10 cho phần tử thứ hai (có chỉ số 1)

//        4. Độ dài của mảng:
//        Để biết được số phần tử trong mảng, bạn có thể sử dụng thuộc tính length của mảng. Ví dụ:
//        int arrayLength = myArray.length; // Lấy số lượng phần tử trong mảng

//        5. Duyệt mảng:
//        Bạn có thể duyệt qua từng phần tử trong mảng bằng cách sử dụng vòng lặp, ví dụ:
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]); // In ra từng phần tử của mảng
//        }
//        Hoặc bạn có thể sử dụng vòng lặp for-each (for-each loop) để duyệt mảng một cách tiện lợi:
//        for (int element : myArray) {
//            System.out.println(element); // In ra từng phần tử của mảng
//        }

//        1. Định nghĩa phương thức:
//        Cú pháp để định nghĩa một phương thức trong Java như sau:
//          [modifiers] [return_type] [method_name]([parameter_list]) {
//            // Thân của phương thức
//            // Các câu lệnh thực thi
//            // Trả về giá trị (nếu có)
//        }
//        modifiers (tuỳ chọn): Xác định phạm vi truy cập và các thuộc tính khác của phương thức như public, private, static, v.v.
//        return_type: Kiểu dữ liệu của giá trị trả về của phương thức (nếu có) hoặc void nếu phương thức không trả về giá trị.
//        method_name: Tên của phương thức.
//        parameter_list (tuỳ chọn): Danh sách tham số được truyền vào phương thức, mỗi tham số được xác định bởi kiểu dữ liệu và tên.
//        Ví dụ:
//        public int add(int a, int b) {
//            int sum = a + b;
//            return sum;
//        }

//        2. Gọi phương thức:
//        Để gọi một phương thức trong Java, bạn cần sử dụng tên phương thức cùng với các đối số (nếu có) được truyền vào nó.
//        Ví dụ:
//        int result = add(5, 3); // Gọi phương thức add và lưu kết quả vào biến result

//        3. Trả về giá trị:
//        Nếu phương thức có kiểu dữ liệu trả về khác void, bạn cần sử dụng từ khóa return để trả về một giá trị tương ứng với kiểu dữ liệu đã khai báo. Ví dụ:
//        public int add(int a, int b) {
//            int sum = a + b;
//            return sum; // Trả về giá trị của sum
//        }

//        4. Overloading (Nạp chồng phương thức):
//        Java cho phép bạn định nghĩa nhiều phương thức có cùng tên trong cùng một lớp, nhưng với danh sách tham
//        số khác nhau. Điều này gọi là "nạp chồng phương thức". Java sẽ tự động xác định phương thức cần gọi dựa
//        trên số lượng và kiểu dữ liệu của các tham số. Ví dụ:
//        public int add(int a, int b) {
//            return a + b;
//        }
//        public double add(double a, double b) {
//            return a + b;
//        }
    }
}
