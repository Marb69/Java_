import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        String myName = "   Jhon Alvert";

        System.out.println("Name: " + myName + "]");
        System.out.println("Name: " + myName.trim());

        String sentence = "Hello, I'm \"Jhon\" From tagum";

        System.out.println(sentence);

        int max = Math.max(5, 10);
        int min = Math.min(5, 10);
        if (max == 10) {

            System.out.println("Max is 10");

        }

        if (min == 5) {

            System.out.println("Min is 5");

        }


        double sqrt = Math.sqrt(20);

        int intt  = (int) sqrt;
        System.out.println(intt);


        System.out.println(Math.abs(22));

        System.out.println(Math.pow(2, 8));
        System.out.println(Math.round(4.45));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.floor(4.9));

        System.out.println(Math.floor(Math.random() * 11));

      /*
       double ranNum = Math.floor(Math.random() * 11);
        int Number = (int) ranNum;

        Scanner scanner = new Scanner(System.in);

        boolean TryAgain = true;
        do{


        System.out.println("=====Number guesting 1 to 10 =======");
        System.out.print("Enter your number: ");
        int choice = scanner.nextInt();
   
        if(choice==Number){

            System.out.println("Congrast loop has terminated");
            TryAgain = false;
        }else System.out.println("Looping! Try again!");
       

        }while(TryAgain);
       */
       
      

String txt = "Kani";

 if(!(txt.equalsIgnoreCase("dili kani"))){
      
     System.out.println("Dili sya \"kani\" so falsy");
 }else{

    System.out.println("\"Kani\" man sya so truty");
 }
        

 for(int i = 1; i<=3; i++){

    for(int j = 1; j<=3; j++){
         
        System.out.print(i * j + " ");
    }

    System.out.println();
 }

 String cars[] = {"volvo","GTR","Civic"};

 for (String car : cars) {

    System.out.println("Car Brand: " + car);
    
 }

 for(int i = 0; i<cars.length; i++){

    System.out.println(cars[i]);
 }

 for(int i = 0; i<10; i++){

    System.out.println("X : "+ i * 2);
 }

 for(int i = 1; i<10; i++){

    if(i==5){
        break;
    }
    System.out.println(i);
 }

 for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

for (int i = 0; i < 6; i++) {
  if (i == 2) {
    System.out.println("two");
    continue;
  }
  if (i == 4) {
    break;
  }
  System.out.println(i);
 
 
}

int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}

int num[][] = {{1,2,3},{4,5,6}};


System.out.println(num[0][1]);


String twoD[][] = {{"R1 C1","R1 C2","R1 C3","R1 C4"},
                   {"R2 C1","R2 C2","R2 C3","R2 C4"},
                   {"R3 C1","R3 C2","R3 C3","R3 C4"},
                   {"R4 C1","R4 C2","R4 C3","R4 C4"},
                 
                };

                 for(int row = 0; row < twoD.length; row++){

                    for(int col = 0; col < twoD[row].length; col++){
                         
                        System.out.print(twoD[row][col] + " ");

                        
                    }
                    System.out.println();
        
    }


}
}
