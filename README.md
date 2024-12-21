Let me explain the main types of Programming Paradigms with examples:

1. Imperative Programming:
Focuses on describing how a program operates using statements that change program state.

```java
// Example of imperative programming
public void calculateSum() {
    int sum = 0;
    for(int i = 0; i < 10; i++) {
        sum += i;
    }
    System.out.println(sum);
}
```

2. Object-Oriented Programming (OOP):
Based on the concept of objects containing data and code.

```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void birthday() {
        age++;
        System.out.println(name + " is now " + age);
    }
}
```

3. Functional Programming:
Treats computation as the evaluation of mathematical functions, avoiding state change.

```java
// Java 8+ functional example
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 2)
    .reduce(0, Integer::sum);
```

4. Declarative Programming:
Expresses the logic of computation without describing its control flow.

```sql
-- SQL is a common declarative language
SELECT name, age 
FROM users 
WHERE age > 18;
```

5. Event-Driven Programming:
Program flow is determined by events like user actions or sensor outputs.

```java
public class ButtonClickHandler {
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
        }
    });
}
```

6. Aspect-Oriented Programming (AOP):
Addresses cross-cutting concerns separately from main business logic.

```java
@Aspect
public class LoggingAspect {
    @Before("execution(* com.example.service.*.*(..))")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Executing: " + joinPoint.getSignature());
    }
}
```

7. Procedural Programming:
Based on the concept of procedure calls.

```java
public class Calculator {
    public static void main(String[] args) {
        printHeader();
        int result = add(5, 3);
        printResult(result);
    }
    
    static void printHeader() {
        System.out.println("Calculation starting...");
    }
    
    static int add(int a, int b) {
        return a + b;
    }
}
```

8. Reactive Programming:
Focuses on data streams and propagation of change.

```java
// Using RxJava
Observable<String> stream = Observable.just("Hello", "World")
    .map(String::toUpperCase)
    .subscribe(System.out::println);
```

9. Logic Programming:
Based on formal logic, programs are sets of facts and rules.

```prolog
// Prolog example
parent(john, mary).
parent(mary, ann).

grandparent(X, Z) :- 
    parent(X, Y), 
    parent(Y, Z).
```

10. Concurrent Programming:
Handles multiple computations executing simultaneously.

```java
public class ConcurrentExample {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture
            .supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture
            .supplyAsync(() -> "World");
        
        CompletableFuture.allOf(future1, future2)
            .thenRun(() -> System.out.println("All done!"));
    }
}
```

Key Characteristics:

- Imperative: Focus on how to execute
- Declarative: Focus on what to execute
- OOP: Encapsulation, inheritance, polymorphism
- Functional: Immutability, pure functions
- Event-Driven: Response to events
- AOP: Separation of cross-cutting concerns
- Reactive: Data streams and change propagation
- Concurrent: Parallel execution

Many modern programming languages support multiple paradigms, allowing developers to choose the most appropriate approach for specific problems. The choice of paradigm often depends on:

- Problem domain
- Performance requirements
- Team expertise
- Maintainability needs
- System architecture
- Development time constraints

Understanding different paradigms helps in selecting the right tool for the job and writing more effective code.
