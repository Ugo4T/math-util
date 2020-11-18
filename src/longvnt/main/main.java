/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.main;

import longvnt.util.MathUtility;

/**
 *
 * @author PC
 */
public class main {
    public static void main(String[] args) {
        // ta test thử hàm của ta
        //dùng mắt để so sánh kết quả thực tế khi chạy và kết qua mong muốn
        long expected =120; //ta mong nhận 120 nếu gọi hàm 5!
        long actual = MathUtility.getFactorial(5);
        System.out.println("expected: "+expected+" ;actual: "+actual);
        // expected 720 if tinh 6!
        System.out.println(MathUtility.getFactorial(6));
        //0! =1
        System.out.println(MathUtility.getFactorial(0));
        //-1! exception
        System.out.println("Goodbye and good luck to you all in the FINAL EXAM");
        System.out.println("Hope that you all will get the GREEN ICONS");
        
        //expected: IllegalArgumentException if tính -5
        System.out.println("-1"+MathUtility.getFactorial(-1));
        // in Pi coi co giong math.PI k
        System.out.println(MathUtility.PI);
        //muốn kl hàm mình ngon thì ta phải nhìn = mắt kq chãy của hàm
        // và so sánh vs kì vọng
        // làm đúng trường hợp chạy hàm - test case
        // cách này ổn, nhưng mất sức
        // nâng cao: dùng màu sắc xanh đỏ để kết luận
        //ta thấy xanh, hàm ý mọi tình huống ổn
        // ta thấy đỏ, chỉ 1 thằng màu đỏ coi như hàm toang
        //ta sài thêm 1 framework, unit test tên chung
        // Junit, testing, nunit, ... là những framework cụ thể để giúp test các hàm
        // một cách hiệu quả
        // dùng nó ta tích hợp vào 1 quy trình làm phần mền lớn hơn
    }
}
