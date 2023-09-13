package session3;

public class Prepare {
//    1. Lớp (Class):
//    Lớp là một mô tả, một khuôn mẫu để tạo ra các đối tượng. Nó định nghĩa thuộc tính (trạng thái) và phương thức (hành vi) của các đối tượng của lớp đó.
//    Ví dụ:
//    public class Dog {
//        // Thuộc tính (trạng thái)
//        String name;
//        int age;
//
//        // Phương thức (hành vi)
//        void bark() {
//            System.out.println(name + " is barking!");
//        }
//    }

//2. Đối tượng (Object):
//    Đối tượng là một thể hiện cụ thể của một lớp. Bạn có thể tạo nhiều đối tượng từ cùng một lớp.
//    Ví dụ:
//    Dog myDog = new Dog(); // Tạo một đối tượng Dog từ lớp Dog
//    myDog.name = "Buddy"; // Gán giá trị cho thuộc tính name của đối tượng
//    myDog.age = 3;
//myDog.bark(); // Gọi phương thức bark() trên đối tượng

//3. Tính đóng gói (Encapsulation):
//    Tính đóng gói cho phép che dấu chi tiết bên trong của một đối tượng và chỉ cho phép truy cập thông qua các phương thức công khai. Sử dụng từ khóa private, public, và protected để quản lý quyền truy cập.

//4. Kế thừa (Inheritance):
//    Kế thừa cho phép bạn tái sử dụng mã từ một lớp tồn tại để tạo ra một lớp mới. Lớp mới được gọi là lớp con (subclass) và lớp đã tồn tại được gọi là lớp cha (superclass).
//    Ví dụ:
//    public class Labrador extends Dog {
//        // Các thuộc tính và phương thức riêng cho Labrador
//    }

//5. Đa hình (Polymorphism):
//    Đa hình cho phép một đối tượng được thể hiện dưới nhiều dạng. Trong Java, đa hình thường được thực hiện thông qua kỹ thuật ghi đè phương thức (method overriding) và quá tải phương thức (method overloading).
//            6. Tính trừu tượng (Abstraction):
//    Tính trừu tượng cho phép bạn tạo các lớp trừu tượng (abstract classes) và các phương thức trừu tượng (abstract methods) mà không cung cấp triển khai cụ thể. Điều này giúp bạn xác định các hành vi cơ bản mà các lớp con cần triển khai.
//            7. Tính đa hình (Interface):
//    Java cung cấp giao diện (interface) để xác định một tập hợp các phương thức mà các lớp cụ thể phải triển khai. Giao diện cho phép bạn định rõ hành vi chung mà các lớp phải tuân theo.
//Lớp (Class):

//    Khái niệm
//    1. Lớp
//    Lớp là một mô tả, một khuôn mẫu để tạo ra các đối tượng.
//    Nó định nghĩa thuộc tính và phương thức của các đối tượng của lớp đó.
//    Để định nghĩa một lớp, sử dụng từ khóa class.
//    public class Dog {
//        // Khai báo thuộc tính và phương thức của lớp
//    }

//    2. Đối tượng (Object)
//    Đối tượng là một thể hiện cụ thể của một lớp.
//    Để tạo một đối tượng, sử dụng từ khóa new.
//    Dog myDog = new Dog(); // Tạo một đối tượng Dog từ lớp Dog

//    3. Thuộc tính (Property):
//    Thuộc tính là các biến hoặc trạng thái mà một đối tượng có thể có.
//    Chúng được định nghĩa trong lớp và mô tả thông tin về đối tượng.
//    public class Dog {
//        String name; // Thuộc tính name của lớp Dog
//        int age;     // Thuộc tính age của lớp Dog
//    }

//    4. Phương thức (Method):
//    Phương thức là các hành động hoặc hành vi mà một đối tượng có thể thực hiện.
//    Chúng được định nghĩa trong lớp và mô tả cách đối tượng thực hiện các hành vi.
//    public class Dog {
//        void bark() { // Phương thức bark của lớp Dog
//            System.out.println(name + " is barking!");
//        }
//    }

//    5. Sử dụng đối tượng:
//    Để sử dụng một đối tượng, bạn có thể gọi phương thức và truy cập thuộc tính của nó.
//    myDog.name = "Buddy"; // Gán giá trị cho thuộc tính name
//    myDog.age = 3;       // Gán giá trị cho thuộc tính age
//myDog.bark();        // Gọi phương thức bark()

//    6. Tạo nhiều đối tượng:
//    Bạn có thể tạo nhiều đối tượng từ cùng một lớp.
//    Dog dog1 = new Dog();
//    Dog dog2 = new Dog();

//    7. Khởi tạo đối tượng:
//    Có thể tạo một phương thức constructor để khởi tạo đối tượng khi nó được tạo ra.
//    public class Dog {
//        String name;
//        int age;
//        // Constructor để khởi tạo đối tượng
//        public Dog(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//    }
//    Dog myDog = new Dog("Buddy", 3); // Tạo đối tượng với thông tin ban đầu


//    1. Truy xuất thuộc tính (Property):
//    Giả sử bạn có một đối tượng myDog và bạn muốn truy xuất giá trị của thuộc tính name của nó:
//    String dogName = myDog.name; // Truy xuất giá trị thuộc tính name

//    2. Truy xuất phương thức (Method):
//    Giả sử bạn có một đối tượng myDog và bạn muốn gọi phương thức bark() của nó:
//myDog.bark(); // Gọi phương thức bark()
//    Khi gọi một phương thức, bạn sử dụng dấu chấm sau đối tượng, và sau đó là tên phương thức, theo sau bởi dấu ngoặc đơn (). Nếu phương thức yêu cầu tham số, bạn sẽ truyền các tham số này trong ngoặc đơn.
//    Ví dụ, nếu phương thức bark() yêu cầu một tham số, bạn sẽ truyền tham số đó như sau:
//myDog.bark("Loud"); // Gọi phương thức bark() với tham số "Loud"
}
