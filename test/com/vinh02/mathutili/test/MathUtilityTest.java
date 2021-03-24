/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinh02.mathutili.test;

import static com.vinh02.mathutili.MathUtility.*; // muốn các hàm có trong class này gõ
// trực tiếp ko cần class.blabla, chỉ static mới có điều này
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        int n = 5;  // tui muốn test 5! có đúng = 120 hay ko
        long expected = 120;
        long actual = getFactorial(n);
        assertEquals(expected, actual);
        
        //mình test tiếp các trường hợp khác đúng đầu vào, đúng đầu ra
        //khỏi cần biến trung gian, chơi luôn trong lệnh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
        
    }
    // điều này neus ta đưa vào tham số cà chớn, âm hay > 20
    //theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ
    //và ta cần TEST XEM, NGOẠI LỆ CÓ ĐC NÉM RA KO NẾU TA CÀ CHỚN
    //TỨC LÀ THẤY XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO -> HÀM ĐÚNG
    //THẤY NGOẠI LỆ KHI CÓ CÀ CHÓN MÌNH LẠI MỪNG VÌ HÀM ĐÃ CHẠY ĐÚNG
    
    @Test(expected = IllegalArgumentException.class)
    //có đúng là khi chạy hàm này thì ném ra ngoại lệ tên là IllegalArgu...
    //nếu đúng nó ném ra ngoại lệ cùng tên, code đúng, XANH THÔI
    public void testFactorialWrongArgumentThrowsException() {
        //mình test tình huống hàm test ra ngoại lệ nếu tham số cà chớn
        //ngoại lệ là thứ chứ ko phải là value để so sánh
        //ta phải dùng chiu khác, junit 4 khác junit 5 ở chỗ bắt ngoại lệ
        //kì 5 đi dự thính môn SWT301 của thầy Hoàng: DI, Lambda Expression liên
        //quan đến junit 5               Dependency Ịnjection / SQLID / 
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }
}
