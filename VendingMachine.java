import java.util.Scanner;

class VendingMachine{

    public static void main(String[] args){

        System.out.println("Welcome to Wylie's Vending Machine!");

        String[] items = {"Snickers", "Twix","Doritos","Reeses","Lay's","Milky Way","Oreos",
        "Pocky Sticks","Bubble Gum"};
        
        for(int i = 0; i < 9; i++){

            System.out.print(items[i] + " " + i + " | ");
        
            if(i == 2 || i == 5 || i == 8){
                System.out.println();
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like today? (Enter a number): ");
        String selection = input.nextLine();

        
        int items_r = Integer.parseInt(selection);

        if (items_r > 8){
            System.out.println("Error! Didn't select an available item!");
            System.exit(0);
        }
        
        float[] prices =  {1.50f, 1.50f, 1.25f, 2f, 1.25f, 1.50f, 2f, 1.50f, 1.25f};
        
        switch(items_r){

            case 0:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 1:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 2:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
           
            case 3:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 4:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 5:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 6:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 7: 
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;
            
            case 8:
            System.out.println(items[items_r] + " selected! Please enter " + prices[items_r]);
            break;

        }

        String amount = input.nextLine();
        float amount_f = Float.parseFloat(amount);
            
        if(prices[items_r] != amount_f){

            
            if(prices[items_r] < amount_f){
                    
            float diff =  amount_f - prices[items_r];
            System.out.println(items[items_r] + " dropped! You have a remaining balance of $" + diff + " after your purchase. " +
            "Please grab your remaining change.");
            }
            
            if(prices[items_r] > amount_f)
            System.out.println("Insufficient funds! Please insert the correct funds.");
                
            }
        else{
        
            System.out.println(items[items_r] + " dropped! Have a nice day!");
        
        }
            
        }
}
