 if(items[items_r].price != amount_f){

            if(items[items_r].price < amount_f){
                    
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