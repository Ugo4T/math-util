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
        //expected: IllegalArgumentException if tính -5
        System.out.println("-1"+MathUtility.getFactorial(-1));
    }
}
