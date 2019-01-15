import java.util.Scanner;

/* this example illustrates the use of an else if
statement.
 */
public class Example2 {

    static int marks;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks");

        marks = input.nextInt();

        if (marks >=75 && marks <=100){

            if(marks < 80)
                System.out.println("Grade A-");
            else
            System.out.println("Grade A");
        }else if(marks >=60 && marks <=74){
            System.out.println("Grade B");
        }else if(marks >=50 && marks <=59){
            System.out.println("Grade C");
        }else if(marks >=40 && marks <=49){
            System.out.println("Grade D");
        }else{
            System.out.println("FAIL!!!");
        }


    }
}
