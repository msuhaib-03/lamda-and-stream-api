# lamda-and-stream-api
Lambda Expressions & Stream API in Java
#Overview
This project demonstrates Java 8+ Lambda Expressions and the Stream API, which enable a functional programming style in Java.
Instead of writing verbose loops, you can use declarative pipelines to filter, transform, and collect data.

#Features
Lambda Expressions: Anonymous functions for concise code.
Functional Interfaces: Interfaces with a single abstract method (e.g., Predicate, Function, Consumer).
Stream API: Process collections with operations like filter, map, reduce, and collect.
Method References: Shorter syntax for calling existing methods.
Parallel Streams: Speed up processing using multiple threads.
Project Structure

#Copy code
src/
 ├── Main.java              # Entry point
 ├── LambdaExamples.java    # Basic lambda usage
 ├── StreamExamples.java    # Stream API examples
 └── model/
      └── Person.java       # Sample data model
#Requirements
Java 8 or higher
Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or CLI tools
📜 Example Code
1️⃣ Lambda Expression
Java

Copy code
// Functional interface
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaExamples {
    public static void main(String[] args) {
        Greeting greet = name -> System.out.println("Hello, " + name + "!");
        greet.sayHello("Alice");
    }
}
#Stream API
Java

Copy code
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Filter names starting with 'A', convert to uppercase, and collect
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());

        System.out.println(result); // Output: [ALICE]
    }
}
#Key Concepts
Lambda Syntax
Java

Copy code
(parameters) -> expression
(parameters) -> { statements; }
Common Stream Operations
Operation	Description
filter()	Keep elements matching a condition
map()	Transform each element
sorted()	Sort elements
forEach()	Perform an action for each element
collect()	Gather results into a collection
reduce()	Combine elements into a single value
#Running the Project
Bash

Copy code
# Compile
javac src/*.java src/model/*.java

# Run
java -cp src Main
