# Day 1 - Exception Handling in Java

## Objective

Understand how Java handles runtime errors using exception handling mechanisms.

---

## What is an Exception?

An Exception is an unexpected event that occurs during program execution and disrupts the normal flow of a program.

Example:

```java
int result = 10 / 0;
```

This generates an ArithmeticException because division by zero is not allowed.

---

## Why Do We Need Exception Handling?

Without exception handling:

- Program terminates immediately.
- Remaining code is not executed.

With exception handling:

- Program continues execution.
- Errors are handled gracefully.
- Better user experience.

---

## Components

### try Block

Contains code that may generate an exception.

```java
try {
    int result = 10 / 0;
}
```

### catch Block

Handles the exception.

```java
catch(ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### finally Block

Always executes whether an exception occurs or not.

```java
finally {
    System.out.println("Cleanup Code");
}
```

---

## Program Flow

1. JVM enters try block.
2. Exception occurs.
3. Matching catch block executes.
4. finally block executes.
5. Program continues.

---

## Real World Example

ATM Machine:

- User enters invalid PIN.
- ATM displays an error.
- ATM does not crash.

Exception handling works similarly.

---

## Common Exceptions

### ArithmeticException

```java
10 / 0
```

### NullPointerException

```java
String s = null;
s.length();
```

### ArrayIndexOutOfBoundsException

```java
int arr[] = {1,2,3};
System.out.println(arr[5]);
```

### NumberFormatException

```java
Integer.parseInt("ABC");
```

---

## Interview Questions

### What is Exception Handling?

Exception handling is a mechanism used to handle runtime errors and maintain normal program execution.

### Difference Between Error and Exception?

| Error | Exception |
|---------|---------|
| Serious problem | Recoverable problem |
| JVM related | Application related |

### Will finally execute if exception occurs?

Yes.

### Will finally execute if return statement exists?

Yes.

finally executes before returning.

---

## Key Takeaways

- Exceptions occur at runtime.
- try contains risky code.
- catch handles exceptions.
- finally always executes.
- Exception handling improves reliability.
