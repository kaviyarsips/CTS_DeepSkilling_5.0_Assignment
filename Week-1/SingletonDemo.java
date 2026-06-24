class ConfigurationManager {

    // Stores the single object of the class
    private static ConfigurationManager instance;

    // Private constructor prevents object creation from outside
    private ConfigurationManager() {
        System.out.println("Configuration Manager Initialized");
    }

    // Method to get the single instance
    public static ConfigurationManager getInstance() {

        if (instance == null) {
            instance = new ConfigurationManager();
        }

        return instance;
    }

    public void displayMessage() {
        System.out.println("Singleton Pattern is Working");
    }
}

public class SingletonDemo {

    public static void main(String[] args) {

        ConfigurationManager obj1 = ConfigurationManager.getInstance();
        ConfigurationManager obj2 = ConfigurationManager.getInstance();

        obj1.displayMessage();

        if (obj1 == obj2) {
            System.out.println("Both references point to the same object");
        } else {
            System.out.println("Different objects created");
        }
    }
}