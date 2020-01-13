import java.util.Scanner;
class Calc{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter first number");
        int first=in.nextInt();
        System.out.println("enter second number");
        int second=in.nextInt();
           
           System.out.println("Enter Your Choice : ");
           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
            
            // done by dikyashi
           System.out.println("3.Multiplication");
           System.out.println("4.Division");
           
           //End of dikyashi
            
           
            int select=in.nextInt();
            int output=0;

            switch(select) {
                case 1 :output=first+second;
                      break;
                case 2 :output=first-second;
                      break;
                  // Done by dikyashi
                case 3 :output = first * second;
                       break;
                case 4 : output = first/second;
                        break
                  //end of dikyashi
                
        
         }
            System.out.println(" ");
            System.out.println("Answer is " + output);
            
    }
}
