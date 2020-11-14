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
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n < 2) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
    

}
