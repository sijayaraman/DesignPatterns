# Singleton:  DoubleCheckLocking  Design Patterns

# Pros
 * Better that Threadsafe approach. The synchronized block is used inside the if condition with an additional check to ensure that only one instance of singleton class is created.
 
# Cons

# When to use
* Multiple threaded application 
 
#Ouput
Getting the same hashcode irrespective any number of objects created in the client side.<br>
DoubleCheckedLocking [hashCode()=1836019240]<br>
DoubleCheckedLocking [hashCode()=1836019240]<br>
DoubleCheckedLocking [hashCode()=1836019240]<br>
