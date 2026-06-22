# Day 4 - StringBuilder vs StringBuffer

## Objective

Understand mutable strings in Java and learn the difference between StringBuilder and StringBuffer.

---

## Why Do We Need StringBuilder and StringBuffer?

Strings are immutable.

Example:

```java
String s = "Java";

s = s + " Programming";
```

Every modification creates a new object.

This wastes memory and reduces performance.

To solve this problem Java provides:

- StringBuilder
- StringBuffer

These are mutable classes.

---

## What is Mutable?

Mutable means the value can be modified after object creation.

Example:

```java
StringBuilder sb =
        new StringBuilder("Java");

sb.append(" Programming");
```

Output:

```text
Java Programming
```

No new object is created.

---

## StringBuilder

StringBuilder is a mutable class used for string manipulation.

Example:

```java
StringBuilder sb =
        new StringBuilder("Java");

sb.append(" Programming");
```

### Advantages

- Fast
- Memory Efficient
- Suitable for Single Thread Applications

---

## StringBuffer

StringBuffer is also mutable.

Example:

```java
StringBuffer sb =
        new StringBuffer("Java");

sb.append(" Programming");
```

### Advantages

- Thread Safe
- Suitable for Multi-Threaded Applications

---

## Difference Between StringBuilder and StringBuffer

| Feature | StringBuilder | StringBuffer |
|----------|---------------|--------------|
| Thread Safe | No | Yes |
| Performance | Faster | Slower |
| Synchronization | No | Yes |
| Memory Usage | Less | Slightly More |

---

## Why is StringBuilder Faster?

StringBuffer uses synchronization.

Before performing an operation it locks resources.

This makes it thread-safe but slower.

StringBuilder does not perform synchronization.

Therefore it is faster.

---

## Real World Example

### StringBuilder

Used in:

- Report Generation
- Text Processing
- Building SQL Queries
- Generating HTML

### StringBuffer

Used in:

- Banking Applications
- Multi-threaded Systems
- Shared Data Environments

---

## Common Methods

### append()

Adds data.

```java
sb.append(" Java");
```

---

### insert()

Inserts data.

```java
sb.insert(0,"Hello ");
```

---

### delete()

Removes characters.

```java
sb.delete(0,5);
```

---

### reverse()

Reverses string.

```java
sb.reverse();
```

---

## Interview Questions

### Difference Between String and StringBuilder?

| String | StringBuilder |
|---------|--------------|
| Immutable | Mutable |
| Slow | Fast |
| Creates New Object | Modifies Existing Object |

---

### Difference Between StringBuilder and StringBuffer?

StringBuilder is faster.

StringBuffer is thread-safe.

---

### Which is faster?

```text
StringBuilder
↓
StringBuffer
↓
String
```

---

### When should StringBuffer be used?

When multiple threads access the same object.

---

### When should StringBuilder be used?

When high performance is needed and only one thread is working.

---

## Tricky Interview Question

### Why is StringBuilder not thread-safe?

Because it does not use synchronization.

Multiple threads can modify the object simultaneously.

---

## Key Takeaways

- String is immutable.
- StringBuilder is mutable and fast.
- StringBuffer is mutable and thread-safe.
- StringBuilder is preferred in most applications.
- StringBuffer is preferred in multi-threaded environments.
