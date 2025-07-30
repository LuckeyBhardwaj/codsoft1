import java.util.Scanner;
public class GradeCalculater {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println(" Student grade Calculator ");
            System.out.println("Enter the number of subjects : ");
            //Here sub is number of subjects
            int sub=sc.nextInt();
            int total=0;
            System.out.println("Enter the marks obtained in "+sub+" subjects respectively: ");
            for(int i=0;i<sub;i++){
                int marks=sc.nextInt();
                total=total+marks;
            }
            //AP is Average percentage
            double AP=(double)total/sub;
            String Grade;
            if (AP>=90){
                Grade="A+";
            }
            else if(AP>=80){
                Grade="A";
            }
            else if(AP>=70){
                Grade="B";
            }
            else if(AP>=60){
                Grade="C";
            }
            else if(AP>=50){
                Grade="D";
            }
            else if(AP>=40){
                Grade="E";
            }
            else{
                Grade="Fail(F)";
            }
            System.out.println("Total marks = "+total);
            System.out.println("Avreage Percentage = "+AP+" %");
            System.out.println("Grade is : "+Grade);

        }

}
