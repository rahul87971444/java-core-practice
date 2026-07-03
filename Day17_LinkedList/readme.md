# Day 17 - LinkedList in Java

## Objective

Learn how LinkedList stores data using nodes and when it is better than ArrayList.

---

# What is LinkedList?

LinkedList is a class in the Java Collections Framework that stores elements as a chain of nodes.

Each node contains:

- Data
- Address of Next Node
- (In Java's LinkedList, also the Previous Node)

Unlike ArrayList, elements are **not stored in continuous memory locations**.

---

# Real-Life Example

Imagine a Train.

```
Engine
   ↓
Coach 1
   ↓
Coach 2
   ↓
Coach 3
```

Every coach is connected to another coach.

If you add a new coach,

you simply connect it.

You don't move every coach.

This is exactly how LinkedList works.

---

# Why Do We Need LinkedList?

Suppose a music playlist.

Songs are continuously

- Added
- Removed
- Rearranged

LinkedList performs these operations efficiently.

---

# Internal Working

```
Rahul

↓

Aman

↓

Priya

↓

Neha
```

Each element stores

```
Data

+

Reference to next node
```

---

# Creating LinkedList

```java
LinkedList<String> students =
        new LinkedList<>();
```

---

# Common Methods

## add()

Adds an element.

```java
students.add("Rahul");
```

---

## addFirst()

Adds at beginning.

```java
students.addFirst("Rohit");
```

---

## addLast()

Adds at end.

```java
students.addLast("Neha");
```

---

## getFirst()

Returns first element.

```java
students.getFirst();
```

---

## getLast()

Returns last element.

```java
students.getLast();
```

---

## removeFirst()

Deletes first element.

```java
students.removeFirst();
```

---

## removeLast()

Deletes last element.

```java
students.removeLast();
```

---

## contains()

Checks whether element exists.

```java
students.contains("Rahul");
```

---

## size()

Returns total number of elements.

---

# ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Storage | Dynamic Array | Nodes |
| Random Access | Fast | Slow |
| Insert/Delete | Slow (middle) | Fast |
| Memory | Less | More |
| Best For | Searching | Frequent Insert/Delete |

---

# Time Complexity

| Operation | ArrayList | LinkedList |
|------------|-----------|------------|
| Add End | O(1) | O(1) |
| Get by Index | O(1) | O(n) |
| Insert Beginning | O(n) | O(1) |
| Delete Beginning | O(n) | O(1) |
| Search | O(n) | O(n) |

---

# When Should We Use LinkedList?

Use LinkedList when:

- Frequent insertions
- Frequent deletions
- Queue implementation
- Stack implementation

---

# When Should We Use ArrayList?

Use ArrayList when:

- Frequent searching
- Random access
- Read-heavy applications

---

# Interview Questions

## What is LinkedList?

LinkedList is a linear data structure where elements are stored as connected nodes.

---

## Difference Between ArrayList and LinkedList?

ArrayList uses arrays.

LinkedList uses nodes.

---

## Which is faster for insertion?

LinkedList.

---

## Which is faster for searching?

ArrayList.

---

## Does LinkedList allow duplicate values?

Yes.

Example:

```
Rahul

Rahul

Rahul
```

All are allowed.

---

## Does LinkedList maintain insertion order?

Yes.

---

## Which package contains LinkedList?

```java
java.util
```

---

# Tricky Interview Questions

## Why is LinkedList slower for searching?

Because nodes are connected.

To reach the 5th element,

Java must traverse

1 → 2 → 3 → 4 → 5

---

## Why is LinkedList faster for insertion?

Only node references are changed.

Existing elements are not shifted.

---

## Does LinkedList implement Queue?

Yes.

It implements:

- List
- Queue
- Deque

---

# Interview Corner

### Use ArrayList when:

- Reading data frequently
- Accessing by index
- Memory is important

### Use LinkedList when:

- Inserting frequently
- Deleting frequently
- Implementing Queue/Deque

---

# Common Mistakes

❌ Using LinkedList when frequent index access is needed.

❌ Assuming LinkedList is always faster than ArrayList.

It depends on the operation.

---

# Key Takeaways

- LinkedList stores nodes.
- Faster insertion and deletion.
- Slower random access.
- Allows duplicate values.
- Maintains insertion order.
- Implements List, Queue, and Deque interfaces.
