# Singleton:  LazySingleton  Design Patterns

# Pros
 * Very simple to use
 
# Cons
* This works well for single thread application but for multithreaded application it may possible that multiple threads enter into if loop and destroy the notion of singleton pattern.

# When to use
* Single threaded application 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.<br>
LazySingleton [hashCode()=1836019240]<br>
LazySingleton [hashCode()=1836019240]<br>
LazySingleton [hashCode()=1836019240]<br>
