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
            
            //done by Bishal
            System.out.println("5.Modeless");
            //done by Bishal
            
           
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
                        break;
                  //end of dikyashi
                    
                //done by Bishal
                case 5 : output = first%second;
                    break;
                default: System.out.println("𝕾𝖊𝖑𝖊𝖈𝖙𝖎𝖔𝖓 𝕴𝖓𝖈𝖔𝖗𝖗𝖊𝖈𝖙. 𝕻𝖗𝖔𝖌𝖗𝖆𝖒 𝖎𝖘 𝕰𝖝𝖎𝖙𝖎𝖓𝖌");
                    //done by Bishal
        
         }
            System.out.println(" ");
            System.out.println("Answer is " + output);
            
    }
}



//Authors of the program
//Jyoti
//Bishal
//Dikyashi
