/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsfinal;

/**
 *
 * @author RiFF
 */
public class getPtsJunior 
{
     public String juniorGetGrade (String marks)
    {
        String pts ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 80)
            {
                pts ="12";
            }else if(StudentMarks >= 75 && StudentMarks <= 79)
            {
                pts ="11";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                pts ="10";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                pts ="9";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
                pts ="8";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                pts ="7";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                pts ="6";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                pts ="5";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                pts ="4";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                pts ="3";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                pts ="2";
            }
            else if(StudentMarks <= 29)
            {
                pts ="1";
            }
        }else{
                pts = "";
        }
        
      return pts;
    }
    
}
