# Day 12 - Interface in Java

## Objective

Learn how Java Interfaces help achieve abstraction and support multiple inheritance.

---

# What is an Interface?

An Interface is a blueprint of a class.

It contains method declarations that implementing classes must define.

Unlike an abstract class, an interface focuses on **what a class should do**, not **how it should do it**.

Example:

```java
interface Animal {

    void sound();
}
```

---

# Why Do We Need Interfaces?

Suppose every payment application supports different payment methods.

Examples:

- Credit Card
- UPI
- Net Banking

Every payment method must implement:

```text
pay()
```

But each payment method has its own implementation.

Interface solves this problem.

---

# Real World Example

Think about a Mobile Charger.

Every charger must provide:

```text
Charge Device
```

How charging works internally depends on the manufacturer.

The charging port acts like an Interface.

---

# Syntax

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barks");
    }
}
```

Notice:

Classes use

```java
extends
```

Interfaces use

```java
implements
```

---

# Program Explanation

## Step 1

Create Interface

```java
interface Animal
```

Contains:

```java
sound()

eat()
```

---

## Step 2

Create Class

```java
class Dog implements Animal
```

Dog promises to implement all interface methods.

---

## Step 3

Override Methods

```java
sound()

eat()
```

---

## Step 4

Create Object

```java
Animal obj = new Dog();
```

Output:

```text
Dog Barks
Dog Eats Food
```

---

# Why Use Interfaces?

Interfaces help achieve:

- Abstraction
- Loose Coupling
- Code Reusability
- Flexibility

---

# Multiple Inheritance

Java classes cannot inherit multiple classes.

Example:

```text
Teacher
      \
       Student
      /
     Person
```

This causes the Diamond Problem.

Java avoids this.

But Interfaces allow:

```java
interface A { }

interface B { }

class C implements A, B {

}
```

This is Multiple Inheritance using Interfaces.

---

# Interface vs Abstract Class

| Interface | Abstract Class |
|------------|----------------|
| Uses implements | Uses extends |
| Supports multiple inheritance | Does not support multiple inheritance |
| Variables are public static final | Can have instance variables |
| Focuses on capability | Focuses on common behavior |
| Cannot be instantiated | Cannot be instantiated |

---

# Java 8 Features in Interface

Since Java 8, interfaces can have:

- Default Methods
- Static Methods

Example:

```java
default void display() {

}
```

---

# Advantages

- 100% abstraction (traditional concept)
- Multiple inheritance
- Loose coupling
- Standardization
- Better software design

---

# Interview Questions

## What is an Interface?

An Interface is a blueprint that defines methods a class must implement.

---

## Which keyword is used?

```java
implements
```

---

## Can we create an object of an Interface?

No.

Wrong:

```java
Animal a = new Animal();
```

Correct:

```java
Animal a = new Dog();
```

---

## Can Interface have Constructors?

No.

Interfaces do not have constructors.

---

## Can Interface have Variables?

Yes.

All variables are automatically:

```text
public
static
final
```

---

## Can Interface have Method Body?

Before Java 8:

No.

After Java 8:

Yes.

Using:

```text
default methods

static methods
```

---

## Why Multiple Inheritance through Interfaces?

Because Interfaces avoid ambiguity.

Implementation is provided by the class, not the Interface.

---

# Tricky Interview Questions

## Difference Between extends and implements?

```java
extends
```

Used for Class → Class inheritance.

```java
implements
```

Used for Class → Interface implementation.

---

## Can One Class Implement Multiple Interfaces?

Yes.

Example:

```java
interface A {

}

interface B {

}

class C implements A, B {

}
```

---

## Can an Interface Extend Another Interface?

Yes.

Example:

```java
interface A {

}

interface B extends A {

}
```

---

# Key Takeaways

- Interface is a blueprint.
- Uses implements keyword.
- Supports multiple inheritance.
- Cannot create objects.
- Methods are implemented by child classes.
- Used to achieve abstraction and loose coupling.
