import java.util.*;

class Item{
    
    
    // Members of the class "Item" and will be hoilding the "name" and the "price" of the Item
    String name;
    float price;


    // Constructor with 2 arguments (Arguments: String and float)
    Item(String x, float y){
        name = x;
        price = y;
    }

}

class VendingMachine{
    
    public static boolean isNumeric(String strNum){

        if(strNum == null){
            return false;
        } 
        try{
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
    

    public static void main(String[] args){

        System.out.println("Welcome to Wylie's Vending Machine!");

        Item items[] = new Item[5];
        items[0] = new Item("Snickers", 1.50f);
        items[1] = new Item("Twix", 1.50f);
        items[2] = new Item("Doritos", 1.50f);
        items[3] = new Item("Coke", 1f);
        items[4] = new Item("Pocky Sticks", 1.50f);
        
        for(int i = 0; i < items.length; i++){

            System.out.print(items[i].name + " " + i + " | ");
        
            if(i == 2 || i == 4){
                System.out.println("");
            }
        }

        Scanner input = new Scanner(System.in);
        int items_r = 0;
        boolean is_valid = false;
        
        do { 

            System.out.print("What would you like today? (Enter a number): ");
            String selection = input.nextLine();
            
            is_valid = isNumeric(selection);

            if(is_valid == false){
                System.out.println("Error! Not a number!");
                
            } 
            else{
                items_r = Integer.parseInt(selection);
            }
            
            if (items_r > items.length - 1 || items_r < 0){ 
                System.out.println("Error! Didn't select an available item!");
                
                
            } 
        } 
        while(items_r > items.length - 1 || items_r < 0 || is_valid == false);

        float amount_f = 0;

        do{
            
            if(items_r < items.length){
                System.out.println(items[items_r].name + " selected! Please enter " + items[items_r].price);
            }   
           
            String amount = input.nextLine();
            is_valid = isNumeric(amount);
            
            if(is_valid == false){
                System.out.println("Error! Not a number!");
            }
            else{
                amount_f = Float.parseFloat(amount); 
            }
        } while(is_valid == false);
        
        if(items[items_r].price != amount_f){

            if(items[items_r].price < amount_f){
                 :   
            float diff =  amount_f - items[items_r].price;
                System.out.println(items[items_r].name + " dropped! You have a remaining balance of $" + diff + " after your purchase. " +
                "Please grab your remaining change.");
            
             }

            if(items[items_r].price > amount_f)
                System.out.println("Insufficient funds! Please insert the correct funds.");
                
            }
        else{
            System.out.println(items[items_r].name + " dropped! Have a nice day!");
        }
            
        }

}
