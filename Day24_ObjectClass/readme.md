# Day 24 - Object Class in Java

## Objective

Understand the Object class and its three most important methods:

- toString()
- equals()
- hashCode()

---

# What is Object Class?

Object is the parent class of every class in Java.

Example:

```java
class Student {

}
```

Actually becomes:

```java
class Student extends Object {

}
```

Every class automatically inherits Object.

---

# Real-Life Example

Think of a Human.

Every person has:

- Name
- Age
- Address

Similarly,

Every Java object automatically gets methods like

```
toString()

equals()

hashCode()
```

from Object class.

---

# 1. toString()

Purpose:

Returns the object as a readable String.

Without overriding:

```java
Student@4e25154f
```

Not meaningful.

After overriding:

```text
Student{id=101, name='Rahul'}
```

Much easier to understand.

---

# Why Override toString()?

Printing object directly:

```java
System.out.println(student);
```

internally calls

```java
student.toString();
```

---

# 2. equals()

Purpose:

Checks whether two objects are logically equal.

Example:

```java
Student s1 =
new Student(101,"Rahul");

Student s2 =
new Student(101,"Aman");
```

We compare only IDs.

Output

```
true
```

because

```
101 == 101
```

---

# Why Not Use == ?

```
==
```

checks

Memory Address

```
equals()
```

checks

Object Content

---

# Example

```java
String a = "Java";

String b = "Java";
```

```
a == b
```

may compare references.

```
a.equals(b)
```

compares actual text.

---

# 3. hashCode()

Purpose:

Returns an integer hash value.

Used by:

- HashMap
- HashSet
- Hashtable

Objects with equal content should return the same hash code.

---

# Why hashCode()?

Suppose HashMap stores

```
101

↓

Rahul
```

Java quickly finds the correct bucket using the hash code.

---

# Relationship Between equals() and hashCode()

Rule:

If

```java
a.equals(b)
```

is

```
true
```

then

```
a.hashCode()

==

b.hashCode()
```

should also be true.

---

# Important Methods of Object Class

| Method | Purpose |
|----------|----------|
| toString() | Convert object to String |
| equals() | Compare objects |
| hashCode() | Generate hash value |
| getClass() | Returns class information |

---

# Interview Questions

## What is Object Class?

Parent class of every Java class.

---

## Why override toString()?

To print meaningful object information.

---

## Difference Between == and equals()?

```
==

↓

Reference Comparison

equals()

↓

Content Comparison
```

---

## Why override hashCode()?

Required for HashMap and HashSet to work correctly.

---

## Does every class inherit Object?

Yes.

---

# Tricky Interview Questions

## Can two objects have the same hashCode?

Yes.

Hash collisions are possible.

---

## Can two unequal objects have the same hashCode?

Yes.

This is called a hash collision.

---

## If equals() returns true, should hashCode() also be equal?

Yes.

This is an important Java contract.

---

# Interview Corner

Override:

```
toString()

↓

Readable Output
```

Override:

```
equals()

↓

Logical Comparison
```

Override:

```
hashCode()

↓

Hash-Based Collections
```

---

# Common Mistakes

❌ Using == for object comparison.

❌ Overriding equals() without hashCode().

❌ Printing objects without overriding toString().

---

# Key Takeaways

- Every class inherits Object.
- toString() prints object details.
- equals() compares object content.
- hashCode() supports hashing.
- equals() and hashCode() should be overridden together.
