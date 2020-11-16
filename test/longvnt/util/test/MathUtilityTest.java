/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longvnt.util.test;

import java.sql.SQLException;
import  longvnt.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilityTest {
    
//    public MathUtilityTest() {
//    }
    @Test //@Test biến hàm này thành public static void main()
    //cách đặt tên hàm sẽ nói lên mục tiêu test hàm. Có nhiều quy tắc đặt tên
    //hàm test 
    public void getFactorial_RunWell_IfValidArgument(){
        
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(120, MathUtility.getFactorial(5));
       
    }
    
    //cần test coi có ném về ngoại lệ hay không
    //nếu đúng là mày ném về ngoại lệ IllegalArgumentException trong
    //tình huống giai thừa -5 thì tao có màu xanh
    @Test (expected = SQLException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        MathUtility.getFactorial(-5);
    }
    //ngoài lệ ko phải là 1 value để đem ra so sánh, chỉ có thể kiểm tra
    //coi nó có xuất hiện hay không
    //một khi test còn đỏ thì không dc clean and build
}
