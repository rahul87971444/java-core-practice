# Day 8 - Inheritance in Java

## Objective

Learn how one class can acquire the properties and methods of another class using inheritance.

---

## What is Inheritance?

Inheritance is a mechanism in which one class acquires the properties and methods of another class.

It promotes:

- Code Reusability
- Maintainability
- Extensibility

---

## Basic Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

Here:

```text
Parent → Superclass
Child  → Subclass
```

---

## Real World Example

### Parent Class

```text
Animal
```

Properties:

```text
Eat
Sleep
Walk
```

### Child Class

```text
Dog
```

Properties:

```text
Bark
```

Dog already gets:

```text
Eat
Sleep
Walk
```

from Animal.

---

## Why Do We Need Inheritance?

Without Inheritance:

```java
class Dog {

    void eat() {}
}

class Cat {

    void eat() {}
}
```

Duplicate code.

---

With Inheritance:

```java
class Animal {

    void eat() {}
}

class Dog extends Animal {

}

class Cat extends Animal {

}
```

Code reuse.

---

## Understanding the Program

### Parent Class

```java
class Animal {

    void eat() {

        System.out.println("Animal is Eating");
    }
}
```

---

### Child Class

```java
class Dog extends Animal {

    void bark() {

        System.out.println("Dog is Barking");
    }
}
```

---

### Object Creation

```java
Dog d = new Dog();
```

Dog object gets access to:

```text
eat()
bark()
```

---

## IS-A Relationship

Inheritance represents an IS-A relationship.

Examples:

```text
Dog IS-A Animal

Car IS-A Vehicle

Student IS-A Person
```

---

## Types of Inheritance in Java

### Single Inheritance

```text
Animal
   |
   V
 Dog
```

Supported ✅

---

### Multilevel Inheritance

```text
Animal
   |
 Dog
   |
 Puppy
```

Supported ✅

---

### Hierarchical Inheritance

```text
       Animal
      /      \
    Dog      Cat
```

Supported ✅

---

### Multiple Inheritance

```text
Teacher     Student
      \     /
       Child
```

Not supported with classes ❌

Supported using Interfaces ✅

---

## Advantages of Inheritance

### Code Reusability

Reuse existing code.

---

### Easy Maintenance

Changes in parent class automatically reflect in child classes.

---

### Faster Development

Less code writing.

---

## Interview Questions

### What is Inheritance?

Inheritance is a mechanism where one class acquires the properties and methods of another class.

---

### Which keyword is used for inheritance?

```java
extends
```

---

### What is a Parent Class?

A class whose properties are inherited.

---

### What is a Child Class?

A class that inherits properties from another class.

---

### What is an IS-A relationship?

Represents inheritance.

Example:

```text
Dog IS-A Animal
```

---

### Does Java support multiple inheritance?

No.

Java does not support multiple inheritance through classes.

---

### Why?

To avoid Diamond Problem ambiguity.

---

## Tricky Interview Question

### Can a Child Class Access Private Members of Parent?

No.

Private members cannot be accessed directly outside their class.

Example:

```java
private int age;
```

Not accessible in child class.

---

### Can Constructors Be Inherited?

No.

Constructors are not inherited.

However, parent constructors can be called using:

```java
super()
```

---

## Key Takeaways

- Inheritance promotes code reuse.
- Uses the extends keyword.
- Represents IS-A relationship.
- Java supports:
  - Single Inheritance
  - Multilevel Inheritance
  - Hierarchical Inheritance
- Java does not support Multiple Inheritance using classes.
- One of the four pillars of OOP.
