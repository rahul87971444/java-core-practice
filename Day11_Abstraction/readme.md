# Day 11 - Abstraction in Java

## Objective

Learn how Java hides implementation details using abstract classes and abstract methods.

---

# What is Abstraction?

Abstraction is the process of hiding implementation details and showing only the necessary functionality to the user.

The user knows **what** an object does but does not need to know **how** it does it.

---

# Real World Example

## Car

When you drive a car, you simply press:

- Accelerator
- Brake
- Clutch

You don't need to know how the engine works internally.

This is Abstraction.

---

## ATM Machine

You insert the card.

Enter PIN.

Withdraw Money.

You don't know how the bank server processes the request.

That's Abstraction.

---

# Why Do We Need Abstraction?

Without abstraction,

every programmer would need to understand every internal implementation.

Abstraction:

- Reduces complexity
- Improves security
- Makes programs easier to use
- Hides unnecessary details

---

# What is an Abstract Class?

An abstract class is a class declared using the **abstract** keyword.

Example:

```java
abstract class Animal {

}
```

An abstract class **cannot be instantiated**.

Wrong:

```java
Animal a = new Animal();
```

Compiler Error.

Correct:

```java
Animal a = new Dog();
```

---

# What is an Abstract Method?

An abstract method has **no body**.

Example:

```java
abstract void sound();
```

The child class must provide its implementation.

---

# Program Explanation

## Step 1

Create Abstract Class

```java
abstract class Animal
```

---

## Step 2

Create Abstract Method

```java
abstract void sound();
```

No implementation is provided.

---

## Step 3

Create Normal Method

```java
void sleep()
```

Abstract classes can contain normal methods.

---

## Step 4

Dog extends Animal

```java
class Dog extends Animal
```

Dog must implement:

```java
sound()
```

---

## Step 5

Create Object

```java
Animal obj = new Dog();
```

Output

```text
Dog Barks
Animal is Sleeping
```

---

# Important Rules

## Rule 1

Abstract class cannot have objects.

Wrong:

```java
new Animal();
```

---

## Rule 2

Abstract methods have no body.

Example:

```java
abstract void sound();
```

---

## Rule 3

Child class must override all abstract methods.

---

## Rule 4

Abstract class may contain:

- Variables
- Constructors
- Normal Methods
- Static Methods
- Abstract Methods

---

# Difference Between Abstract Class and Normal Class

| Normal Class | Abstract Class |
|--------------|----------------|
| Can create objects | Cannot create objects |
| All methods have body | May contain abstract methods |
| Used directly | Used as base class |

---

# Advantages of Abstraction

- Hides implementation
- Improves security
- Reduces complexity
- Better code organization
- Easier maintenance

---

# Interview Questions

## What is Abstraction?

Abstraction is the process of hiding implementation details while showing only essential functionality.

---

## How is Abstraction achieved in Java?

Using:

- Abstract Classes
- Interfaces

---

## Can an Abstract Class have Constructors?

Yes.

---

## Can an Abstract Class have Normal Methods?

Yes.

---

## Can we create an object of an Abstract Class?

No.

---

## Why use an Abstract Class?

To provide a common base class while forcing child classes to implement specific methods.

---

# Tricky Interview Questions

## Can an Abstract Class have Static Methods?

Yes.

---

## Can an Abstract Class have Final Methods?

Yes.

Only abstract methods cannot be final.

---

## Can a Class have both Abstract and Normal Methods?

Yes.

Example:

```java
abstract class Animal {

    abstract void sound();

    void sleep() {

    }
}
```

---

# Key Takeaways

- Abstraction hides implementation details.
- Abstract classes cannot be instantiated.
- Abstract methods have no body.
- Child classes must implement abstract methods.
- Abstraction improves security and maintainability.
