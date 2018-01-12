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
public class seniorGrading
{
    public String seniorGetGradeLanguageXhumanities (String marks)
    {
        String grade ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 75)
            {
                grade ="A";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                grade ="A-";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                grade ="B+";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
                grade ="B";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                grade ="B-";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                grade ="C+";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                grade ="C";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                grade ="C-";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                grade ="D+";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                grade ="D";
            }
            else if(StudentMarks >= 25 && StudentMarks <= 29)
            {
                grade ="D-";
            }else if(StudentMarks <= 24)
            {
                grade ="E";
            }
        }else{
                grade = "";
        }
        
      return grade;
    }
    public String seniorGetComment (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
             if(StudentMarks >= 75)
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
                 comment ="GOOD";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                 comment ="AVERAGE";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                 comment ="WEAK";
            }else if(StudentMarks >= 25 && StudentMarks <= 29)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks <= 24)
            {
                 comment ="POOR";
            }
        }else{
                comment = "";
        }
        
      return comment;
    }
    public String seniorSwaCommentLanguageXhumanities (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 75)
            {
                 comment ="VYEMA SANA";
            }else if(StudentMarks >= 70 && StudentMarks <= 74)
            {
                 comment ="VYEMA SANA";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                 comment ="VYEMA";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
               comment ="VYEMA";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                 comment ="VYEMA";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                 comment ="WASTANI";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                 comment ="WASTANI";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                 comment ="WASTANI";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                 comment ="TIA BIDII";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                 comment ="TIA BIDII";
            }else if(StudentMarks >= 25 && StudentMarks <= 29)
            {
                 comment ="TIA BIDII";
            }
            else if(StudentMarks < 24)
            {
                 comment ="TIA BIDII";
            }
        }else{
                comment = "";
        }
        
      return comment;
    }
    public String seniorGetAv (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            comment = String.valueOf(Integer.parseInt(marks)/3);
        }else{
                comment = "";
        }
        
      return comment;
    }
}
