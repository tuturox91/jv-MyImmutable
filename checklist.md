### Common mistakes

#### Your `clone()` should generate a deep copy 
Remember that calling `clone()` should return a deep copy if we want our class to be truly immutable.  
Reminder:  
[Shallow vs deep copy](https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/)

#### Each of these requirements should be fulfilled while designing an immutable class:  
* Class should be declared as `final`  so it can't be extended.
* Make all fields private final so the direct access is not allowed and field value can be assigned only once.
* Your class can't have setter methods for fields.
* Initialize all fields via a constructor, setting to a field a deep copy of input value.
* In getters you should return deep copy instead of a simple reference to the objects field.

#### Avoid NPE (NullPointerException):
```
public void showAge(Person person) {
    System.out.println("Person is " + person.getAge() + " years old");
}
```
What's gonna happen if pass `null` as an input into method? 
