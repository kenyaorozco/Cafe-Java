public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        // Create 3 Vars 
        double latte = 2.5;
        double dripCoffe = 4.30;
        double cappuccino = 5.25;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        // Create 3 new Customers
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        String customer5 = "Sam";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(generalGreeting + customer1 +  " ordered a coffee" + pendingMessage); 
        System.out.println(isReadyOrder1? "your order will be ready shortly" : "your order is ready " + customer4); 
        // SAMMM ORDRED 2 coffees 
        System.out.println(displayTotalMessage + (latte +latte));
        System.out.println(isReadyOrder2? "your order will be ready shortly" : "your order is ready "); 
        // JIMMY
        System.out.println(customer3 + " ordered a coffee but got charged for a latte "); 
        System.out.println(customer3 + "got charged for coffee  which is "+ dripCoffe + "while he wanted a latte which is " + latte + "he will need to get some money back due to the difference " +  (dripCoffe - latte)); 

    }
}
