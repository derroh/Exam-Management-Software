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
public class seniorGradingSciencesMath
{
    public String seniorGetGradeScienceXMath (String marks)
    {
        String grade ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
            if(StudentMarks >= 70)
            {
                grade ="A";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                grade ="A-";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
                grade ="B+";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                grade ="B";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                grade ="B-";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                grade ="C+";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                grade ="C";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                grade ="C-";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                grade ="D+";
            }
            else if(StudentMarks >= 25 && StudentMarks <= 29)
            {
                grade ="D";
            }else if(StudentMarks >= 20 && StudentMarks <= 24)
            {
                grade ="D-";
            }else if(StudentMarks <=19 )
            {
                grade ="E";
            }
        }else{
                grade = "";
        }
        
      return grade;
    }
    public String seniorGetCommentScienceXMath (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int StudentMarks = Integer.parseInt(marks);
             if(StudentMarks >= 70 )
            {
                 comment ="V.GOOD";
            }else if(StudentMarks >= 65 && StudentMarks <= 69)
            {
                 comment ="V.GOOD";
            }else if(StudentMarks >= 60 && StudentMarks <= 64)
            {
               comment ="GOOD";
            }else if(StudentMarks >= 54 && StudentMarks <= 59)
            {
                 comment ="GOOD";
            }else if(StudentMarks >= 50 && StudentMarks <= 54)
            {
                 comment ="GOOD";
            }else if(StudentMarks >= 45 && StudentMarks <= 49)
            {
                 comment ="AVERAGE";
            }else if(StudentMarks >= 40 && StudentMarks <= 44)
            {
                 comment ="AVERAGE";
            }
            else if(StudentMarks >= 35 && StudentMarks <= 39)
            {
                 comment ="AVERAGE";
            }
            else if(StudentMarks >= 30 && StudentMarks <= 34)
            {
                 comment ="WEAK";
            }else if(StudentMarks >= 25 && StudentMarks <= 29)
            {
                 comment ="WEAK";
            }
            else if(StudentMarks >= 20 && StudentMarks <= 24)
            {
                 comment ="WEAK";
            }else if(StudentMarks <= 19)
            {
                 comment ="POOR";
            }
        }else{
                comment = "";
        }
        
      return comment;
    }
    
}
