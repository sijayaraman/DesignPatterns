# Singleton:  EagerInitializedSingleton  Design Patterns
 * In EagerInitializedSingleton the instance is created during class loading itself.
 
# Pros
 * Very simple to use
 
# Cons
* The instance is created eventhough the client is not using it.
* This object creation part doesn't handle any exceptional handling mechanism.

# When to use
* If your single class is not using too many resources(filehandling, database connection pooling) etc. 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.<br>
EagerInitializedSingleton [hashCode()=1836019240]<br>
EagerInitializedSingleton [hashCode()=1836019240]<br>
EagerInitializedSingleton [hashCode()=1836019240]<br>
