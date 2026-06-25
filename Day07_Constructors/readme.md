# Day 7 - Constructors in Java

## Objective

Understand how constructors initialize objects automatically when they are created.

---

## What is a Constructor?

A Constructor is a special method that is automatically called when an object is created.

Example:

```java
Student s1 = new Student();
```

As soon as this line executes:

```java
Student()
```

gets called automatically.

---

## Why Do We Need Constructors?

Without constructors:

```java
Student s1 = new Student();

s1.id = 101;
s1.name = "Rahul";
```

We must assign values manually.

With constructors:

```java
Student s1 =
    new Student(101, "Rahul");
```

Values are initialized automatically.

---

## Rules of Constructor

### Rule 1

Constructor name must be same as class name.

```java
class Student {

    Student() {

    }
}
```

---

### Rule 2

Constructors have no return type.

Wrong:

```java
void Student() {

}
```

Correct:

```java
Student() {

}
```

---

### Rule 3

Called automatically when object is created.

```java
new Student();
```

---

## Types of Constructors

### 1. Default Constructor

A constructor with no parameters.

Example:

```java
Student() {

    id = 101;
    name = "Rahul";
}
```

---

### 2. Parameterized Constructor

A constructor with parameters.

Example:

```java
Student(int id, String name) {

    this.id = id;
    this.name = name;
}
```

---

## What is this Keyword?

### Problem

```java
Student(int id, String name) {

    id = id;
    name = name;
}
```

Java gets confused between local variables and instance variables.

Solution:

```java
this.id = id;
this.name = name;
```

### Meaning of this

```java
this
```

refers to the current object.

---

## Program Execution

### Step 1

```java
Student s1 = new Student();
```

Default constructor executes.

---

### Step 2

```java
Student s2 =
    new Student(102,"Aman");
```

Parameterized constructor executes.

---

### Step 3

Values are stored inside objects.

---

## Real World Example

### Student Admission System

When a new student joins:

```java
Student s =
    new Student(
        101,
        "Rahul");
```

Student details are initialized immediately.

---

## Interview Questions

### What is a Constructor?

A special method used to initialize objects.

---

### When is a Constructor Called?

Automatically when an object is created.

---

### Can Constructor Have a Return Type?

No.

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

### Difference Between Method and Constructor?

| Constructor | Method |
|------------|---------|
| Initializes object | Performs action |
| Same name as class | Any valid name |
| No return type | Has return type |
| Called automatically | Called manually |

---

### What is Constructor Overloading?

Having multiple constructors with different parameter lists.

Example:

```java
Student()

Student(int id)

Student(int id,String name)
```

---

## Tricky Interview Question

### If No Constructor Is Written, What Happens?

Java automatically provides a default constructor.

Example:

```java
class Student {

}
```

Java internally creates:

```java
Student() {

}
```

---

### Can We Call Constructor Explicitly?

Normally No.

Constructors are called during object creation.

```java
new Student();
```

---

## Key Takeaways

- Constructor initializes objects.
- Constructor name must match class name.
- No return type.
- Called automatically.
- Types:
  - Default Constructor
  - Parameterized Constructor
- Constructors can be overloaded.
- this refers to the current object.
