# Singleton:  Threadsafe  Design Patterns

# Pros
 * Better compare to Lazy,block and Eager.
 
# Cons
* This works well for multiple threads but it reduces the performance of the application because cost associated with the synchronized method. 

# When to use
* Multiple threaded application 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.<br>
ThreadSafe [hashCode()=1836019240]<br>
ThreadSafe [hashCode()=1836019240]<br>
ThreadSafe [hashCode()=1836019240]<br>
