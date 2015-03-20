# Singleton:  BillPughSingleton  Design Patterns

# Pros
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
 * This is one of the most widely used approach for Singleton class as it doesn’t require synchronization.
 
# Cons

# When to use
* Multiple threaded application 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.<br>

