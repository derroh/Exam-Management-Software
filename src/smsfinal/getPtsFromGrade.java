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
public class getPtsFromGrade 
{
     public String juniorGetGrade (String marks)
    {
        String pts ="";
        if(!marks.equals(""))
        {
           
            if(marks.equals("A")) 
            {
                pts ="12";
            } else if(marks.equals("A-"))
            {
                pts ="11";
            }else if(marks.equals("B+"))
            {
                pts ="10";
            }else if(marks.equals("B"))
            {
                pts ="9";
            }else if(marks.equals("B-"))
            {
                pts ="8";
            }else if(marks.equals("C+"))
            {
                pts ="7";
            }else if(marks.equals("C"))
            {
                pts ="6";
            }else if(marks.equals("C-"))
            {
                pts ="5";
            }else if(marks.equals("D+"))
            {
                pts ="4";
            }
            else if(marks.equals("D"))
            {
                pts ="3";
            }
            else if(marks.equals("D-"))
            {
                pts ="2";
            }
            else if(marks.equals("E"))
            {
                pts ="1";
            }else {
                pts ="0";
            }
        }else{
                pts = "";
        }
        
      return pts;
    }
    
}
