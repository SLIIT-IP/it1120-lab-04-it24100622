import java.util.Scanner;
public class IT24100622
Lab4Q2{
public static void main (String[]args){
int labmark, exammark, perlab, perexam;
float finalmark;
Scanner input = new Scanner(System.in);
System.out.print (" pleace enter exam mark (out of 100): ");
exammark = input.nextInt ();
System.out.print (" pleace enter lab submission marks (out of 100): ");
labmark = input.nextInt ();
System.out.print (" pleace enter the percentage given for the exam : ");
perexam = input.nextInt ();
System.out.print (" pleace enter the percentage given for the lab submission : ");
perlab = input.nextInt ();
     if (labmark >=0 && labmark <=100 && exammark >=0 && exammark <=100)
         if (perlab + perexam ==100)
         {
finalmark =(labmark*perlab/100) + (exammark*perexam/100);
  System.out.print(" Final mark is : " + finalmark);
}
else 
   {

   System.out.print("The percentage must add up to 100.Terminating program. ");
   }
else 
   {
   
   System.out.print("invalid input for exam marks.Terminating program .");
   }
}
}





