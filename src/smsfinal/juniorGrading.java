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
public class juniorGrading
{
    public String juniorGetGrade (String marks)
    {
        String grade ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 80)
            {
                grade ="A";
            }else if(StudentMarks >= 75 && StudentMarks <= 79)
            {
                grade ="A-";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                grade ="B+";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                grade ="B";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
                grade ="B-";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                grade ="C+";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                grade ="C";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                grade ="C-";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                grade ="D+";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                grade ="D";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                grade ="D-";
            }
            else if(StudentMarks <= 29)
            {
                grade ="E";
            }
        }else{
                grade = "";
        }
        
      return grade;
    }
    public String juniorGetComment (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 80)
            {
                 comment ="V.GOOD";
            }else if(StudentMarks >= 75 && StudentMarks <= 79)
            {
                 comment ="V.GOOD";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                 comment ="GOOD";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                 comment ="GOOD";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
               comment ="GOOD";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks <= 29)
            {
                 comment ="POOR";
            }
        }else{
                comment = "";
        }
        
      return comment;
    }
    public String juniorSwaComment (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 80)
            {
                 comment ="V.SANA";
            }else if(StudentMarks >= 75 && StudentMarks <= 79)
            {
                 comment ="V.SANA";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                 comment ="VYEMA";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                 comment ="VYEMA";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
               comment ="VYEMA";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                 comment ="WASTANI";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                 comment ="WASTANI";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                 comment ="WASTANI";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                 comment ="TIA BIDII";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                 comment ="TIA BIDII";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                 comment ="TIA BIDII";
            }
            else if(StudentMarks <= 29)
            {
                 comment ="TIA BIDII";
            }
        }else{
                comment = "";
        }
        
      return comment;
    }
}
