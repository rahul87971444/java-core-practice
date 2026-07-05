# Day 18 - HashSet in Java

## Objective

Learn how HashSet stores unique elements using hashing and why duplicate values are not allowed.

---

# What is HashSet?

HashSet is a class in the Java Collections Framework that stores **only unique elements**.

It automatically removes duplicate values.

Example:

```java
HashSet<String> students =
        new HashSet<>();
```

---

# Why Do We Need HashSet?

Suppose a college stores student email IDs.

```
rahul@gmail.com

aman@gmail.com

rahul@gmail.com
```

The same email should not be stored twice.

HashSet automatically ignores duplicate entries.

---

# Real-Life Example

Imagine an attendance register.

A student's name should appear only once.

```
Rahul

Aman

Rahul ❌
```

The duplicate entry is ignored.

HashSet works the same way.

---

# Internal Working

HashSet stores data using a technique called **Hashing**.

Instead of storing elements one after another, Java calculates a **hash code** and places the element into a bucket.

```
Bucket 1

↓

Rahul

Bucket 2

↓

Aman

Bucket 3

↓

Saswati
```

This makes searching very fast.

---

# Creating a HashSet

```java
HashSet<String> students =
        new HashSet<>();
```

---

# Common Methods

## add()

Adds an element.

```java
students.add("Rahul");
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

## remove()

Deletes an element.

```java
students.remove("Rahul");
```

---

## size()

Returns the total number of elements.

```java
students.size();
```

---

## isEmpty()

Checks whether the set is empty.

---

## clear()

Removes all elements.

---

# Duplicate Elements

Example:

```java
students.add("Rahul");

students.add("Rahul");
```

Result:

```
Rahul
```

Only one copy is stored.

---

# Does HashSet Maintain Order?

No.

Example:

Added:

```
Rahul

Aman

Saswati
```

Output may be:

```
Aman

Saswati

Rahul
```

The order is not guaranteed.

---

# HashSet vs ArrayList

| Feature | ArrayList | HashSet |
|----------|-----------|----------|
| Duplicate Values | Yes | No |
| Insertion Order | Maintained | Not Maintained |
| Search Speed | O(n) | O(1) Average |
| Index Access | Yes | No |

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| add() | O(1) Average |
| contains() | O(1) Average |
| remove() | O(1) Average |

---

# Interview Questions

## What is HashSet?

HashSet is a collection that stores unique elements using hashing.

---

## Does HashSet allow duplicates?

No.

Duplicate elements are ignored.

---

## Does HashSet maintain insertion order?

No.

---

## Can HashSet store null?

Yes.

Only one null value is allowed.

---

## Which package contains HashSet?

```java
java.util
```

---

## Can we access elements using an index?

No.

HashSet does not support indexing.

---

# Tricky Interview Questions

## Why doesn't HashSet allow duplicates?

Because before inserting an element, HashSet checks its hash code and equality. If an equal element already exists, the new element is ignored.

---

## Why is searching fast in HashSet?

Because HashSet uses hashing to locate elements quickly.

---

## Difference Between HashSet, LinkedHashSet, and TreeSet?

| HashSet | LinkedHashSet | TreeSet |
|----------|---------------|----------|
| No Order | Insertion Order | Sorted Order |
| Fastest | Slightly Slower | Slowest |
| Uses Hashing | Hashing + Linked List | Red-Black Tree |

---

# Interview Corner

### Use HashSet when:

- Duplicate values are not allowed.
- Fast searching is required.
- Order is not important.

---

# Common Mistakes

❌ Expecting elements to appear in insertion order.

❌ Trying to access elements by index.

---

# Key Takeaways

- HashSet stores unique elements.
- Duplicate values are ignored.
- Does not maintain insertion order.
- Uses hashing internally.
- Very fast for search, add, and remove operations.
