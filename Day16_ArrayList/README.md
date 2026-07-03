# Day 16 - ArrayList in Java

## Objective

Learn how to store, retrieve, update, and delete multiple objects dynamically using ArrayList.

---

# What is ArrayList?

ArrayList is a class in the Java Collections Framework that stores a dynamic list of elements.

Unlike arrays, an ArrayList automatically grows or shrinks as elements are added or removed.

Example:

```java
ArrayList<String> students = new ArrayList<>();
```

---

# Why Do We Need ArrayList?

Suppose a college has student records.

Today:

```
100 Students
```

Tomorrow:

```
125 Students
```

Next Month:

```
90 Students
```

Using an array:

```java
String[] students = new String[100];
```

The size is fixed.

If more students join, the array becomes full.

ArrayList solves this problem because it resizes automatically.

---

# Real-Life Example

Imagine a bus.

Seats can be occupied or become empty as passengers get on and off.

The passenger list changes continuously.

An ArrayList works in the same way.

---

# How ArrayList Works

Initially:

```
[]
```

After adding Rahul:

```
[Rahul]
```

After adding Aman:

```
[Rahul, Aman]
```

After removing Aman:

```
[Rahul]
```

The size changes automatically.

---

# Creating an ArrayList

```java
ArrayList<String> students = new ArrayList<>();
```

Here,

```text
String
```

is called the Generic Type.

It specifies that only String objects can be stored.

---

# Common Methods

## add()

Adds an element.

```java
students.add("Rahul");
```

---

## get()

Returns an element using its index.

```java
students.get(0);
```

Output:

```
Rahul
```

---

## set()

Updates an existing element.

```java
students.set(1, "Rohit");
```

---

## remove()

Deletes an element.

```java
students.remove(2);
```

---

## size()

Returns the total number of elements.

```java
students.size();
```

---

## contains()

Checks whether an element exists.

```java
students.contains("Rahul");
```

Returns:

```
true
```

---

## isEmpty()

Checks whether the list is empty.

```java
students.isEmpty();
```

---

## clear()

Removes all elements.

```java
students.clear();
```

---

# Array vs ArrayList

| Array | ArrayList |
|--------|-----------|
| Fixed Size | Dynamic Size |
| Stores primitives & objects | Stores objects only |
| Faster | Slightly slower |
| No built-in methods | Many useful methods |

---

# Internal Working

ArrayList internally uses an array.

When it becomes full,

Java automatically creates a larger array and copies all existing elements into it.

This resizing is automatic.

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| add() (end) | O(1) |
| get() | O(1) |
| set() | O(1) |
| remove() | O(n) |
| search | O(n) |

---

# Interview Questions

## What is ArrayList?

ArrayList is a resizable array implementation in the Java Collections Framework.

---

## Difference Between Array and ArrayList?

Array has fixed size.

ArrayList has dynamic size.

---

## Can ArrayList store primitive data types?

No.

It stores objects.

For primitive values, Java uses Wrapper Classes.

Example:

```java
ArrayList<Integer> numbers = new ArrayList<>();
```

---

## Is ArrayList synchronized?

No.

ArrayList is not thread-safe.

---

## Which package contains ArrayList?

```java
java.util
```

---

## Can ArrayList store duplicate values?

Yes.

Example:

```java
Rahul
Rahul
Rahul
```

All are allowed.

---

# Tricky Interview Questions

## Why is ArrayList slower than an array?

Because it provides dynamic resizing and additional methods.

---

## Can we store different data types in one ArrayList?

Only if we use:

```java
ArrayList<Object>
```

Otherwise, all elements should be of the declared type.

---

## What happens when ArrayList becomes full?

Java creates a larger internal array and copies the existing elements into it.

---

# Key Takeaways

- ArrayList is dynamic.
- Stores objects.
- Allows duplicate values.
- Maintains insertion order.
- Provides many built-in methods.
- Internally uses an array.
- Not synchronized.
