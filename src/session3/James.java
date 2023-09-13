package session3;

import java.util.Scanner;

public class James {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Thêm sửa xóa
//        int[] arr = new int[5];
//        int size = 0;
//        size = push(arr, 1, size);
//        size = push(arr, 6, size);
//        size = push(arr, 58, size);
//        size = push(arr, 523, size);
//        size = push(arr, 17, size);
//        System.out.println(Arrays.toString(arr));
//        System.out.print("Phần tử mà bạn muốn tìm: ");
//        int element1 = input.nextInt();
//        System.out.println("Vị trí: " + search(arr, element1, size));
//        System.out.println("Phần tử bạn muốn xóa: ");
//        int element2 = input.nextInt();
//        delete(arr, element2, size);
//        System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));

//        Gộp mảng
//        System.out.print("Độ dài mảng 1: ");
//        int n1 = input.nextInt();
//        int[] arr1 = new int[n1];
//        int size1 = 0;
//        while (size1 != arr1.length) {
//            for (int i = 1; i <= n1; i++) {
//                System.out.print("Nhập phần tử thứ " + i + ": ");
//                int element1 = input.nextInt();
//                arr1[size1] = element1;
//                size1++;
//            }
//        }
//        System.out.print("Độ dài mảng 2: ");
//        int n2 = input.nextInt();
//        int[] arr2 = new int[n2];
//        int size2 = 0;
//        while (size2 != arr2.length) {
//            for (int i = 1; i <= n2; i++) {
//                System.out.print("Nhập phần tử thứ " + i + ": ");
//                int element2 = input.nextInt();
//                arr2[size2] = element2;
//                size2++;
//            }
//        }
//        System.out.println("Mảng 1: " + Arrays.toString(arr1));
//        System.out.println("Mảng 2: " + Arrays.toString(arr2));
//        int[] arr3 = new int[size1 + size2];
//        int size3 = 0;
//        while (size3 != arr3.length) {
//            for (int i = 0; i < arr1.length; i++) {
//                size3 = push(arr3, arr1[i], size3);
//            }
//            for (int i = 0; i < arr2.length; i++) {
//                size3 = push(arr3, arr2[i], size3);
//            }
//        }
//        System.out.println("Mảng sau khi gộp: " + Arrays.toString(arr3));

//        Tìm Min
//        System.out.print("Nhập độ dài mảng: ");
//        int n = input.nextInt();
//        int[] arr = new int[n];
//        int size = 0;
//        while (size != arr.length) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print("Nhập phần tử thứ " + i + ": ");
//                int element = input.nextInt();
//                arr[size] = element;
//                size++;
//            }
//        }
//        System.out.println("Mảng: " + Arrays.toString(arr));
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println("Giá trị nhỏ nhất là: " + min);
//    }
//
//    public static int push(int[] arr, int element, int size) {
//        arr[size] = element;
//        size++;
//        return size;
//    }
//
//    public static int search(int[] arr, int element, int size) {
//        for (int i = 0; i < size; i++) {
//            if (arr[i] == element) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static int delete(int[] arr, int element, int size) {
//        int index = search(arr, element, size);
//        if (size == arr.length) {
//            for (int i = index; i < size - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[size - 1] = 0;
//        } else {
//            for (int i = index; i < size; i++) {
//                arr[i] = arr[i + 1];
//            }
//        }
//        return size - 1;
    }
}
