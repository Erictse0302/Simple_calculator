import java.util.Scanner;

public class cal{

    public static void main(String a [])
    {
        System.out.println("This is a simple calculator \n\n\n add Please input a \n subtraction Please input b \n multiplication Please input c \n division Please input d ");
        String opeator; 
        int input1 , input2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Choose Your Opeator");
        opeator = sc.nextLine();
        System.out.println("Enter the first Number");
        input1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        input2 = sc.nextInt();

        int result = 0; 

        

        switch(opeator)
        {
          case "a" -> result = input1 + input2;
          case "b" -> result = input1 - input2;
          case "c"-> result = input1 * input2;
          case "d" -> result = input1 / input2;
          default-> System.out.println("Wrong Case");
        };
        
        System.out.println("The Result is" + result)
      
        sc.close();
    }
}
