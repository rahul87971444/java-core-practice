# Day 25 - final vs finally vs finalize()

## Objective

Understand the difference between final, finally, and finalize().

This is one of the most common Java interview questions.

---

# Real-Life Example

Imagine you are writing an exam.

## final

Your Roll Number.

Once assigned,

it cannot change.

---

## finally

Whether you pass or fail,

the answer sheet must be submitted.

This always happens.

---

## finalize()

After the exam,

the classroom is cleaned.

Cleaning happens before everything is removed.

This is similar to finalize().

---

# 1. final Keyword

final means

"You cannot change this."

---

## Final Variable

```java
final int age = 21;
```

Cannot change later.

Wrong

```java
age = 25;
```

Compiler Error.

---

## Final Method

```java
final void display() {

}
```

Cannot be overridden.

---

## Final Class

```java
final class Car {

}
```

Cannot be inherited.

Example

```java
String
```

is a final class.

---

# Why Use final?

- Prevent modification.
- Improve security.
- Make constants.

Example

```java
final double PI = 3.14159;
```

---

# 2. finally Block

finally belongs to

Exception Handling.

Example

```java
try {

}
catch(Exception e){

}
finally{

}
```

The finally block executes

whether an exception occurs or not.

---

# Why Use finally?

To close resources.

Example

```
Database Connection

↓

Close

File

↓

Close

Scanner

↓

Close
```

---

# Example

```java
try{

    int a=10/0;

}

catch(Exception e){

}

finally{

    System.out.println("Always Executes");
}
```

Output

```
Always Executes
```

---

# 3. finalize()

finalize() is a method of Object class.

Earlier,

it was called before garbage collection.

Example

```java
protected void finalize(){

}
```

---

# Important Note

Modern Java versions discourage using finalize() because it is unreliable and has been deprecated.

Instead,

use

- try-with-resources
- AutoCloseable
- Cleaner (for advanced use cases)

---

# Difference

| final | finally | finalize() |
|--------|----------|------------|
| Keyword | Block | Method |
| Prevents Modification | Always Executes | Called before garbage collection (deprecated) |
| Used with Variable, Method, Class | Used in Exception Handling | Belongs to Object Class |

---

# Interview Questions

## What is final?

A keyword used to prevent modification.

---

## What is finally?

A block that executes whether an exception occurs or not.

---

## What is finalize()?

A method that was used before garbage collection.

It is deprecated in modern Java.

---

## Can final variable change?

No.

---

## Can final method be overridden?

No.

---

## Can final class be inherited?

No.

---

## Does finally always execute?

Almost always.

Exception:

If JVM terminates abruptly (for example, `System.exit()`), finally may not execute.

---

# Tricky Interview Questions

## Is String final?

Yes.

String is a final class.

---

## Can final variable store different values?

No.

Once assigned,

it cannot change.

---

## Is finalize() still recommended?

No.

It is deprecated.

Use modern resource-management techniques instead.

---

# Interview Corner

Use

```
final

↓

Constants
```

Use

```
finally

↓

Resource Cleanup
```

Avoid

```
finalize()

↓

Deprecated
```

---

# Common Mistakes

❌ Thinking final, finally and finalize() are related.

❌ Believing finalize() is the normal way to release resources.

❌ Thinking finally executes only when an exception occurs.

---

# Key Takeaways

- final prevents modification.
- finally executes after try/catch for cleanup.
- finalize() is a deprecated method related to garbage collection.
- String is a final class.
- Use try-with-resources for modern Java resource management.
