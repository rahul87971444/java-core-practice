# Day 19 - HashMap in Java

## Objective

Learn how HashMap stores data using key-value pairs and understand why it is one of the fastest collections in Java.

---

# What is HashMap?

HashMap is a class in the Java Collections Framework that stores data in **Key → Value** pairs.

Example:

```
101 → Rahul

102 → Aman

103 → Neha
```

Instead of storing only values, HashMap stores both a unique key and its corresponding value.

---

# Why Do We Need HashMap?

Imagine a college.

Every student has:

```
Roll Number

↓

Student Name
```

Instead of searching every student's name one by one,

you simply search using Roll Number.

HashMap works exactly like this.

---

# Real-Life Example

Think about your phone contacts.

```
9876543210

↓

Rahul

9123456780

↓

Neha

9988776655

↓

Aman
```

Phone Number acts as the Key.

Person Name acts as the Value.

---

# Creating HashMap

```java
HashMap<Integer, String> students =
        new HashMap<>();
```

Meaning:

```
Integer → Key

String → Value
```

---

# Common Methods

## put()

Adds a new entry.

```java
students.put(101, "Rahul");
```

---

## get()

Returns value using key.

```java
students.get(101);
```

Output:

```
Rahul
```

---

## remove()

Deletes an entry.

```java
students.remove(101);
```

---

## containsKey()

Checks whether a key exists.

```java
students.containsKey(101);
```

---

## containsValue()

Checks whether a value exists.

```java
students.containsValue("Rahul");
```

---

## size()

Returns total entries.

---

## clear()

Removes all entries.

---

# Internal Working

HashMap uses **Hashing**.

When you insert:

```
101 → Rahul
```

Java calculates a hash code for key **101** and stores it in an appropriate bucket.

This makes searching extremely fast.

---

# Rules of HashMap

### Keys

- Must be unique.

Example:

```java
students.put(101,"Rahul");

students.put(101,"Aman");
```

Output:

```
101 → Aman
```

The old value is replaced.

---

### Values

Duplicate values are allowed.

Example:

```
101 → Rahul

102 → Rahul
```

Valid.

---

# Time Complexity

| Operation | Complexity |
|------------|------------|
| put() | O(1) Average |
| get() | O(1) Average |
| remove() | O(1) Average |
| containsKey() | O(1) Average |

---

# HashMap vs HashSet

| HashMap | HashSet |
|----------|----------|
| Key-Value Pair | Only Values |
| Keys Unique | Values Unique |
| Duplicate Values Allowed | No Duplicates |
| Uses put() | Uses add() |

---

# HashMap vs Hashtable vs TreeMap

| HashMap | Hashtable | TreeMap |
|----------|------------|----------|
| Fast | Thread Safe | Sorted |
| Allows One Null Key | No Null Key | No Null Key |
| Not Synchronized | Synchronized | Slower |

---

# Interview Questions

## What is HashMap?

HashMap stores data in key-value pairs.

---

## Can HashMap have duplicate keys?

No.

Duplicate keys replace the previous value.

---

## Can HashMap have duplicate values?

Yes.

---

## Does HashMap maintain insertion order?

No.

---

## Can HashMap store null?

Yes.

One null key and multiple null values are allowed.

---

## Why is HashMap fast?

Because it uses hashing.

---

# Tricky Interview Questions

## Which is unique in HashMap?

Only Keys.

---

## What happens if the same key is inserted again?

The old value is replaced.

Example:

```java
students.put(101,"Rahul");

students.put(101,"Rohit");
```

Output:

```
101 → Rohit
```

---

## Difference Between containsKey() and containsValue()?

```
containsKey()

↓

Checks Key

containsValue()

↓

Checks Value
```

---

# Interview Corner

### Use HashMap when:

- Fast searching is needed.
- Data is stored as Key → Value.
- Order is not important.

---

# Common Mistakes

❌ Thinking duplicate keys are allowed.

❌ Expecting insertion order.

❌ Using get() with a missing key without checking.

---

# Key Takeaways

- HashMap stores Key → Value pairs.
- Keys are unique.
- Values can be duplicated.
- Uses hashing internally.
- Very fast for searching.
- Most important Collection class for interviews.
