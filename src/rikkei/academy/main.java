package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Điền phần tử muốn chèn vào mảng");
        int x = sc.nextInt();
        System.out.println("Nhập vị trí muốn chèn vào mảng");
        int index = sc.nextInt();

        //kiểm tra index hợp lệ khum
        if (index < 0 && index > arr.length) {
            System.out.println("Vị trí chèn khum hợp lệ");
        }

        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index]=x;
        for (int i = index + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
//        in ra thui nào anh em

        System.out.println("Mảng mới sau khi thêm là:");
        for(int i=0; i< newArr.length;i++){
            System.out.println(newArr[i]+" ");
        }


    }
}
