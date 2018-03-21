/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionproject;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.SQLException;

/*
***
Array
 */
public class UncheckedExceptionProject {

    public static double avg(int[] nums) throws ArrayIndexOutOfBoundsException {
        System.out.println("------------------Begin avg--------------------");
        double sum = 0;
        for (int index = 0; index <= nums.length; index++) {
            sum += nums[index];
        }
        System.out.println("------out------");
        return sum / nums.length;
    }

    public static void main(String[] args) {
        System.out.println("------------------Begin main-------------------------");

        try {
            double avg = avg(new int[]{1, 2, 3});
            System.out.println("average : " + avg);
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("Exception occure --> " + aio.getMessage());
        } catch (Exception re) {
            System.out.println(re.getMessage());
            re.printStackTrace();
        } finally{
            System.out.println("finally block is working");
        }
        System.out.println("GOOD BYE, PROGRAM");
    }

}
