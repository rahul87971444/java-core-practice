# Day 10 - Method Overriding in Java

## Objective

Learn how a child class provides its own implementation of a method inherited from the parent class.

---

## What is Method Overriding?

Method Overriding occurs when a child class defines a method with the same name, same parameters, and same return type as the parent class.

Example:

```java
class Animal {

    void sound() {

        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog barks");
    }
}
```

The Dog class overrides the sound() method of the Animal class.

---

## Why Do We Need Method Overriding?

Suppose every animal makes a different sound.

Without overriding:

```text
Animal
↓

sound()

↓

All animals make the same sound
```

With overriding:

```text
Dog    → Bark

Cat    → Meow

Cow    → Moo
```

Each child class provides its own behavior.

---

## Rules of Method Overriding

### Method name must be same

```java
sound()
```

---

### Parameters must be same

```java
void sound()
```

---

### Return type must be same (or compatible)

---

### Child class must inherit Parent class

```java
class Dog extends Animal
```

---

## What is @Override?

```java
@Override
```

It tells the compiler that this method is overriding a parent class method.

Benefits:

- Improves readability.
- Compiler checks for mistakes.

---

## Program Execution

### Step 1

Object is created.

```java
Animal obj = new Dog();
```

---

### Step 2

Compiler checks:

Reference Type

```text
Animal
```

Compiler confirms that sound() exists.

---

### Step 3

At Runtime,

Actual Object

```text
Dog
```

is checked.

Therefore,

```java
Dog.sound()
```

is executed.

Output:

```text
Dog barks
```

---

## Why is it called Runtime Polymorphism?

Because Java decides which method to execute while the program is running.

Method selection happens at runtime, not during compilation.

---

## Real World Example

### Payment System

Parent Class

```text
Payment
```

Child Classes

```text
CreditCardPayment

UPIPayment

NetBankingPayment
```

Each payment method processes payment differently.

---

## Advantages

- Runtime flexibility
- Code reusability
- Better maintainability
- Supports dynamic method dispatch

---

## Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|-------------------|-------------------|
| Same Class | Parent & Child Class |
| Different Parameters | Same Parameters |
| Compile Time | Runtime |
| Static Polymorphism | Runtime Polymorphism |

---

## Dynamic Method Dispatch

Example:

```java
Animal obj = new Dog();

obj.sound();
```

Reference:

```text
Animal
```

Actual Object:

```text
Dog
```

Method executed:

```text
Dog.sound()
```

This process is called Dynamic Method Dispatch.

---

## Interview Questions

### What is Method Overriding?

Method Overriding is redefining a parent class method in the child class with the same method signature.

---

### Why is it Runtime Polymorphism?

Because Java determines the method to execute during runtime.

---

### Can Static Methods be Overridden?

No.

Static methods belong to the class, not the object.

---

### Can Final Methods be Overridden?

No.

Methods declared as final cannot be overridden.

Example:

```java
final void display() {

}
```

---

### Can Private Methods be Overridden?

No.

Private methods are not inherited.

---

### Can Constructors be Overridden?

No.

Constructors are never inherited.

---

### What is Dynamic Method Dispatch?

It is the mechanism by which Java decides which overridden method to call based on the actual object at runtime.

---

## Tricky Interview Questions

### Which method executes?

```java
Animal obj = new Dog();

obj.sound();
```

Answer:

```text
Dog.sound()
```

Because the actual object is Dog.

---

### Why use @Override?

- Prevents mistakes.
- Compiler verifies that overriding is correct.
- Improves readability.

---

## Key Takeaways

- Method Overriding requires inheritance.
- Method name, parameters, and return type must match.
- Achieves Runtime Polymorphism.
- Supports Dynamic Method Dispatch.
- @Override improves code safety and readability.
