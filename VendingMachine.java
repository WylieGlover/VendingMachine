import java.util.Scanner;

class VendingMachine{

    public static void main(String[] args){

        System.out.println("Welcome to Wylie's Vending Machine!");

        String[] items = {"Snickers", "Twix","Doritos","Reeses","Lay's","Milky Way","Oreos",
        "Pocky Sticks","Bubble Gum","Dr. Pepper"};
        
        for(int i = 0; i < 10; i++){

            System.out.print(items[i] + " " + i + " | ");
        
            if(i == 3 || i == 6 || i == 9){
                // System.out.println();
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What would you like today? (Enter a number): ");
        String selection = input.nextLine();

        
        int items_r = Integer.parseInt(selection);

        if (items_r > 8)
            System.out.println("Error! Didn't select an available item!");
       

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
                    
                    float diff = amount_f - prices[items_r];
                    
                }
            
            }
            else{

                System.out.println(items[items_r] + " dropped! Have a nice day!");
            }
            
        }
}
