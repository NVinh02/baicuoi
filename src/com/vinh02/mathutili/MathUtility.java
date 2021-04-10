/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinh02.mathutili;

/**
 *
 * @author Admin
 */
public class MathUtility {
    //Class này dùng để chứa các methods dùng trong toán học.
    //java.util.Math của JDK
    // vì là đồ xài chung cho nên là static
    public static final double PI = 3.1415;
    
    //hàm tính n!
    //Vì giai thừa tăng rất nhanh, 21! tràn kiểu long
    //kiểu long chịu đc 10^18 18 con số 0, lớn hơn nữa là thua
    //âm giai thừa ko tính đc
    //hàm chỉ chấp nhận từ 0..20! -> long
    //0! = 1! = 1
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument number must be"
                    + " between 0..20");
        
        if (n == 0 || n == 1)//khỏi mắc công tính, return ngay
            return 1;
        
        //Đây là cách tính dùng for
        //đến đc đây thì sure kèo n = 0..20
//        long result = 1;//cố tình để value này
//        
//        for (int i = 2; i<=n;i++)
//            result*=i;
//        //n! = 1.2.3.4...n
//        return result;

        //Đây là cách tính dùng đệ quy
        return n * getFactorial(n - 1); //Xong đệ quy
    }
    
    
}
