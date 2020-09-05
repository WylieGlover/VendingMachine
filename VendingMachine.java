import java.util.Scanner;

class VendingMachine{

    public static void main(String[] args){

        System.out.println("Welcome to Wylie's Vending Machine!");

        String[] items = {"Snickers", "Twix","Doritos","Reeses","Lay's","Milky Way","Oreos",
        "Pocky Sticks","Bubble Gum","Dr. Pepper"};
        
        for(int i = 0; i < 10; i++){

            System.out.print(items[i] + " " + i + " | ");
        
            if(i == 3 || i == 6 || i == 9){
                System.out.println("");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like today? (Enter a number): ");
        String selection = input.nextLine();

        int items_r = Integer.parseInt(selection);

        switch(items_r){

            case 0:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 1:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 2:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
           
            case 3:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 4:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 5:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 6:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 7: 
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;
            
            case 8:
            System.out.println(items[items_r] + " dropped! Have a nice day!");
            break;

        }

        
        }
}
