# Day 9 - Method Overloading in Java

## Objective

Understand how multiple methods can have the same name but different parameter lists.

---

## What is Method Overloading?

Method Overloading means creating multiple methods with the same name but different parameters.

Example:

```java
add(int a, int b)

add(int a, int b, int c)

add(double a, double b)
```

All methods have the same name:

```java
add()
```

but different parameter lists.

---

## Why Do We Need Method Overloading?

Suppose we want addition for:

```java
2 numbers
3 numbers
decimal numbers
```

Without overloading:

```java
addTwoNumbers()
addThreeNumbers()
addDoubleNumbers()
```

Too many method names.

With overloading:

```java
add()
add()
add()
```

Cleaner and easier to use.

---

## Rules of Method Overloading

Methods must differ by:

### Number of Parameters

```java
add(int a, int b)

add(int a, int b, int c)
```

---

### Type of Parameters

```java
add(int a, int b)

add(double a, double b)
```

---

### Order of Parameters

```java
display(int id, String name)

display(String name, int id)
```

---

## Not Valid Overloading

Changing only return type is NOT overloading.

Wrong:

```java
int add(int a, int b)

double add(int a, int b)
```

Compiler Error.

---

## How Does Java Decide?

Example:

```java
add(10,20)
```

Java finds:

```java
add(int,int)
```

Example:

```java
add(10.5,20.5)
```

Java finds:

```java
add(double,double)
```

This decision is made during compilation.

Therefore Method Overloading is called:

```text
Compile-Time Polymorphism
```

---

## Real World Example

### Mobile Phone

Same action:

```text
Call
```

Different ways:

```text
Call(String phoneNumber)

Call(Contact person)

Call(WhatsAppContact user)
```

Same method name.

Different parameters.

---

## Advantages

### Better Readability

Use same method name.

---

### Code Reusability

No need to create many method names.

---

### Flexibility

Different inputs can be handled easily.

---

## Interview Questions

### What is Method Overloading?

Method Overloading means multiple methods having the same name but different parameter lists.

---

### What is Compile-Time Polymorphism?

Method selection occurs during compilation.

Therefore overloading is Compile-Time Polymorphism.

---

### Can We Overload main() Method?

Yes.

Example:

```java
main()

main(int a)

main(String s)
```

Only:

```java
main(String[] args)
```

is called by JVM.

---

### Can Return Type Alone Differentiate Methods?

No.

Example:

```java
int add(int a,int b)

double add(int a,int b)
```

Invalid.

---

### Can Constructors Be Overloaded?

Yes.

Example:

```java
Student()

Student(int id)

Student(int id,String name)
```

---

## Difference Between Overloading and Overriding

| Overloading | Overriding |
|------------|------------|
| Same Class | Parent & Child Class |
| Compile Time | Runtime |
| Different Parameters | Same Parameters |
| Faster | Slightly Slower |

---

## Tricky Interview Question

### Why is Overloading called Static Polymorphism?

Because method binding happens during compilation.

Compiler already knows which method to execute.

---

## Key Takeaways

- Same method name.
- Different parameter list.
- Achieves Compile-Time Polymorphism.
- Improves readability.
- Return type alone cannot overload methods.
- Frequently asked in interviews.
