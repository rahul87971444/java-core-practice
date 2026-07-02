# Day 14 - Access Modifiers in Java

## Objective

Learn how Java controls the visibility of variables, methods, and classes using Access Modifiers.

---

# What are Access Modifiers?

Access Modifiers determine **who can access a class, variable, or method**.

Think of them as security levels for your code.

Java provides four access modifiers:

- public
- private
- protected
- default (package-private)

---

# Real-Life Example

Imagine your house.

### Public

The **main gate** is open for visitors.

Everyone can enter through it.

Example:

```text
Park
Bus Stop
Hospital
```

Anyone can access them.

---

### Private

Your **bedroom**.

Only you can enter.

Nobody else has permission.

Example:

```text
ATM PIN

Password

Bank Balance
```

These should never be directly accessible.

---

### Protected

Family members can access.

But strangers cannot.

---

### Default

Accessible only to people living in the same apartment.

Outside people cannot enter.

---

# 1. Public

Accessible from anywhere.

Example:

```java
public String college;
```

Anyone can use it.

---

# 2. Private

Accessible only inside the same class.

Example:

```java
private int rollNo;
```

Cannot access directly.

Wrong:

```java
student.rollNo;
```

Correct:

Use Getter methods.

---

# 3. Protected

Accessible:

- Same package
- Subclasses (Inheritance)

Example:

```java
protected String department;
```

---

# 4. Default

No keyword.

Example:

```java
String name;
```

Accessible only within the same package.

---

# Access Levels

| Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------|-----------|--------------|-----------|---------------|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

---

# Why Use Access Modifiers?

Without access modifiers:

Anyone could modify important data.

Example:

```java
student.marks = -500;
```

This is invalid.

Using:

```java
private
```

prevents unauthorized access.

---

# Relationship with Encapsulation

Encapsulation uses:

```java
private variables
```

and

```java
public getters/setters
```

to protect object data.

Access Modifiers make encapsulation possible.

---

# Program Explanation

## Step 1

Create variables with different access levels.

```java
public

private

protected

default
```

---

## Step 2

Create object.

```java
Student s = new Student();
```

---

## Step 3

Observe access.

Public:

```java
s.college
```

works.

Private:

```java
s.rollNo
```

gives compile-time error.

---

# Interview Questions

## What are Access Modifiers?

Keywords used to control the visibility of variables, methods, and classes.

---

## Which is the most restrictive modifier?

```java
private
```

---

## Which modifier provides maximum accessibility?

```java
public
```

---

## Can private variables be accessed outside the class?

No.

Use Getter methods.

---

## Why are private variables used?

To protect object data.

---

## Difference Between protected and default?

Protected can be accessed in subclasses outside the package.

Default cannot.

---

# Tricky Interview Questions

## Which Access Modifier is Used in Encapsulation?

```java
private
```

---

## Can a Top-Level Class be private?

No.

A top-level class can only be:

- public
- default

---

## Can Constructors be private?

Yes.

Private constructors are commonly used in the Singleton Design Pattern.

---

# Key Takeaways

- Java has four access modifiers.
- private provides maximum protection.
- public provides maximum accessibility.
- protected supports inheritance.
- default allows package-level access.
- Access modifiers are the foundation of encapsulation.
