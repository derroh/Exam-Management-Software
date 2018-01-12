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
public class examMethods 
{
    public String GetComment (String marks)
    {
        String comment ="";
        if(!marks.equals(""))
        {
            int Studentmarks = Integer.parseInt(marks);
            if(Studentmarks > 81)
            {
                comment ="Very Good";
            }else if(Studentmarks >= 73 && Studentmarks <= 80)
            {
                comment ="Very Good";
            }else if(Studentmarks >= 66 && Studentmarks <= 72)
            {
                comment ="Good";
            }else if(Studentmarks >= 59 && Studentmarks <= 65)
            {
                comment ="Good";
            }else if(Studentmarks >= 52 && Studentmarks <= 58)
            {
                comment ="Good";
            }else if(Studentmarks >= 45 && Studentmarks <= 51)
            {
                comment ="Average";
            }else if(Studentmarks >= 38 && Studentmarks <= 44)
            {
                comment ="Average";
            }else if(Studentmarks >= 31 && Studentmarks <= 37)
            {
                comment ="Average";
            }else if(Studentmarks >= 24 && Studentmarks <= 30)
            {
                comment ="Weak";
            }else if(Studentmarks >= 17 && Studentmarks <= 23)
            {
                comment ="Weak";
            }else if(Studentmarks >= 10 && Studentmarks <= 16)
            {
                comment ="Weak";
            }else if(Studentmarks < 10)
            {
                comment ="Poor";
            }
        }else{
        comment ="";
        }
       
      return comment;
    }
}
