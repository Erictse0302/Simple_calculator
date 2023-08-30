import java.util.Scanner;

public class cal 
{

    public static void main(String a [])
    {   
        int input1 , input2;
        int op;
        int result = 0;
        while(true){
        System.out.println("This is a simple calculator \n\n\n add Please input 1 \n subtraction Please input 2 \n multiplication Please input 3 \n division Please input 4 \n Exit Please input 5 ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n Choose Your Opeator");
        op = sc.nextInt();
      

        switch(op)
        {
          case 1 -> { System.out.println("Enter the first Number");
                      input1 = sc.nextInt();
                      System.out.println("Enter the Second Number");
                      input2 = sc.nextInt();
            
                      result = input1 - input2;}
          case 2 -> { System.out.println("Enter the first Number");
                      input1 = sc.nextInt();
                      System.out.println("Enter the Second Number");
                      input2 = sc.nextInt();
            
                      result = input1 + input2;}
          case 3-> { System.out.println("Enter the first Number");
                      input1 = sc.nextInt();
                      System.out.println("Enter the Second Number");
                      input2 = sc.nextInt();
            
                      result = input1* input2;}
          case 4 -> { System.out.println("Enter the first Number");
                      input1 = sc.nextInt();
                      System.out.println("Enter the Second Number");
                      input2 = sc.nextInt();
            
                      result = input1 / input2;}
          case 5 -> {System.out.println(" Thank You for use  \n" ); 
                     System.exit(0);}
          default-> System.out.println("Wrong Case");
        }
       

        System.out.println("\n" + result);}
        
      
    }
}
