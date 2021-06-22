/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm Exam
 * @author srinivsi
 */
public class StausUser 
{
    enum Input {
        _1,
        _2,
        _3,
    }
   public void statusDetail(String code){
       Input num1 = Input._1;
       Input num2 = Input._2;
       Input num3 = Input._3;
       
       switch(code)
       {
           case "0": System.out.println("REJECTED");
           break;
            case "1": System.out.println("PENDING");
            break;
            case "2":
            System.out.println("PROCESSING");
            break;
            case "3": 
                System.out.println("APPROVED");
            break;
            default:
            System.out.println("NOT VALID CODE");
            break;
       }
   }
}
