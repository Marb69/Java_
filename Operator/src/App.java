public class App {
    public static void main(String[] args) throws Exception {
      

        int num1 = 5;
        int num2 = 5;
   
        System.out.println("Addition: + result => " + (num1 + num2));
        System.out.println("Mutiplication: * result => " + ( num1 * num2));
        System.out.println("Subtraction: - result => " + (num1 - num2));
        System.out.println("Division: / result => " + (num1 / num2));
        System.out.println("Modulus: % result => " + (num1%num2));
        int increment = 0;
        increment++;
        
        System.out.println("Increment: ++ from 0 to " + increment);
        int decrement = 1;
        decrement--;

        System.out.println("Decrement: -- from 1 to "+ decrement);

        int number = 1;
     
        System.out.println("My number " + number);
        System.out.println("Assign value: from 1 to " + ( number=5));
        System.out.println("Addition assignment: number adding from a value result => "+ (number+=5));
        System.out.println("Subtraction assignment: number subtracting from a value result => "+ (number-=5));
        System.out.println("Multiplication assigment: number multiplying from a value result => " + (number*=5));
        System.out.println("Division assignment: number divide from a value result => " + (number/=5));
        System.out.println("Modulus assignment: number modulus to value result => " + (number%=2));
        

        int x = 2;
        int y = 3;

        System.out.println("Equal to operator: x is equal to y?  => " + (x==y));
        System.out.println("Not Equal operator: x is not equal to y? => "+ (x!=y));
        System.out.println("Greater than operator: x is greater than y? => "+(x>y));
        System.out.println("Less than operator: x is less than y?=> "+ (x<y));
       
        x = 3;

        System.out.println("Greater than or equal to operator: x is greater than or equal to y? => "+ (x>=y));
        System.out.println("Less than or equal to operator: x is less than or eqaul to y? => "+ (x<=y));

        System.out.println("Logical and: x greater than 10 and x greater than 5 => " + (x>10 && x>1));
        System.out.println("Logical or: x greate than 10 or x greater than 5 => " + (x>10 || x>5));

        
    }
}
