# Singleton:  StaticBlockedSingleton  Design Patterns
 * In BlockedSingleton the instance is created during class loading itself.
 * The object creation part handle runtime exceptional handling mechanism in the static block which is much better than EagerInitialization singleton method.
 
# Pros
 * Very simple to use
 
# Cons
* The instance is created eventhough the client is not using it.

# When to use
* If your class is not using too many resources(filehandling, database connection pooling) etc. 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.
StaticBlockSingleton [hashCode()=1836019240]<br>
StaticBlockSingleton [hashCode()=1836019240]<br>
StaticBlockSingleton [hashCode()=1836019240]<br>
