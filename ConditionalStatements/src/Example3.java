import java.util.Scanner;

/* this example illustrates the use of a
switch conditional statement using
traffic light system.
 */
public class Example3 {

    static String color;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        color = input.next();

        switch (color.toUpperCase()){
            case "RED" :
                System.out.println("STOP !!");
                break;

            case "GREEN" :
                System.out.println("GO !!");
                break;
            case "UMBER" :
                System.out.println("Wait...");
                break;


        }

        if(color.toUpperCase()=="GREEN")
            System.out.println("Go");
        else if (color.toUpperCase()=="RED")
            System.out.println("STOP");
        else if(color.toUpperCase()=="UMBER")
            System.out.println("Wait..");
    }
}
