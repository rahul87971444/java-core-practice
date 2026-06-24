# Day 6 - Classes and Objects in Java

## Objective

Understand the foundation of Object-Oriented Programming using Classes and Objects.

---

## What is a Class?

A Class is a blueprint or template used to create objects.

It defines:

- Variables (Data Members)
- Methods (Functions)

Example:

```java
class Student {

    int id;
    String name;

    void display() {
        System.out.println(name);
    }
}
```

Think of a class as a design of a house.

The design itself is not a house.

It is only a blueprint.

---

## What is an Object?

An Object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

Here:

```text
Student → Class
s1      → Object
```

Unlike a class, an object occupies memory.

---

## Real World Example

### Class

```text
Car
```

Properties:

```text
Color
Brand
Speed
```

Methods:

```text
Start()
Stop()
Brake()
```

### Objects

```text
BMW Car
Audi Car
Tesla Car
```

All are objects created from the Car class.

---

## Why Use Classes and Objects?

Without OOP:

```java
int id = 101;
String name = "Rahul";
```

Data becomes difficult to manage.

With OOP:

```java
Student s1 = new Student();
```

Data and behavior remain together.

---

## Understanding the Program

### Step 1

Create Class

```java
class Student
```

---

### Step 2

Declare Variables

```java
int id;
String name;
```

These are called Instance Variables.

---

### Step 3

Create Method

```java
void display()
```

Method displays student details.

---

### Step 4

Create Object

```java
Student s1 = new Student();
```

Memory gets allocated.

---

### Step 5

Assign Values

```java
s1.id = 101;
s1.name = "Rahul";
```

---

### Step 6

Call Method

```java
s1.display();
```

Output:

```text
ID: 101
Name: Rahul
```

---

## Memory Representation

```text
Student s1
      |
      V

 -----------------
| id = 101        |
| name = Rahul    |
 -----------------
```

---

## Interview Questions

### What is a Class?

A class is a blueprint used to create objects.

---

### What is an Object?

An object is an instance of a class.

---

### Does a Class Occupy Memory?

No.

Memory is allocated only when objects are created.

---

### How to Create an Object?

```java
Student s1 = new Student();
```

---

### Can Multiple Objects Be Created?

Yes.

Example:

```java
Student s1 = new Student();
Student s2 = new Student();
Student s3 = new Student();
```

---

### What is an Instance Variable?

Variables declared inside a class but outside methods.

Example:

```java
int id;
String name;
```

---

## Tricky Interview Question

### Difference Between Class and Object?

| Class | Object |
|---------|---------|
| Blueprint | Real Entity |
| No Memory | Occupies Memory |
| Logical Entity | Physical Entity |

Example:

```text
Class  → Student

Objects →
Rahul
Aman
Amit
```

---

## Key Takeaways

- Class is a blueprint.
- Object is an instance of a class.
- Objects store data and perform actions.
- Multiple objects can be created from one class.
- Forms the foundation of OOP.
