/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.util;

/**
 *
 * @author PC
 */
public class MathUtility {

    //clas này fake class math của jdk
    //math của jdk có .abs .sqr()  . sin() .PI
    //chúng toàn là static vì là thư viện dùng chung
    public static final double PI = 3.1415;

    // hàm tính giai thừa n!=1.2.3..n
    //0!=1!=1
    //mình ko tính dc giai thừa âm
    // 21! cực lớn tràng kiểu long, chứa ko nổi
    //int: tối đa 2 tỷ 1 mấy
    //giai thừa trong giới hạn đầu vào từ 0..20
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//        if (n < 2) {
//            return 1;
//        }
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result = result * i;
//        }
//        return result;
//    }
    //viết đệ quy cho hoành tráng
    // gọi lại chính mình với 1 quy mô khác
    //5!=5*4!, bắt tính 5! khoan, đi tính 4! rồi tính tiếp
    //4!=4*3!, bắt tính 4! khoan, đi tính 3! rồi tính tiếp
    //3!=3*2!, bắt tính 3! khoan, đi tính 2! rồi tính tiếp
    //2!=2*1!, bắt tính 2! khoan, đi tính 1! rồi tính tiếp
    //đệ quy phải có điểm dừng, ko đi miết à?
    // rất dễ bị lặp vô tận nếu ko có dùng
    //1!=1 quy ước rồi, dừng, hồi ngược lại lên trên !
    // kết 1 luận: n! = n*(n-1)!
    
    public static long getFactorial(int n){
        if (n<0||n>20) throw new IllegalArgumentException("n must be between 0..20");
        if (n==0|n==1)
            return 1;//dk dừng, lùi n mãi cũng phải đến úc dừng
        //n>1 & n<=20 rồi, ráp công thức đệ quy
        return n*getFactorial(n-1);
    }
            // mình minh họa khái niệm refactoring - tối ưu, chỉnh sửa lại code
            // cho tốt hơn
            // và minh họa khái niệm Reggression test, test hồi quy, test lại những
            // gì đã từng test xanh để xem code còn XANH như ngày xưa không
            // sau khi đã sửa code
    

}
