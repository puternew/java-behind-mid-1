/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionproject;

/**
 *
 * @author INT105
 */
public class WrongWordException extends Exception{
    public WrongWordException(){
        super("Invalid words!!");
    }
    public WrongWordException(String msg){
        super(msg);
    }
    
}
