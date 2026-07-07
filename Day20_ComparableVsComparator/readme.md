# Day 20 - Comparable vs Comparator

## Objective

Learn how to sort custom objects using Comparable and Comparator.

---

# Why Do We Need Sorting?

Suppose a college stores students.

```
103 Rahul

101 Aman

102 Neha
```

This is difficult to read.

Sorted version:

```
101 Aman

102 Neha

103 Rahul
```

Sorting makes data easier to understand.

---

# Real-Life Example

Think of a classroom.

Students can be arranged by:

- Roll Number
- Name
- Marks
- Height

Different sorting methods are required.

Java provides:

- Comparable
- Comparator

---

# What is Comparable?

Comparable is used when the class itself knows how it should be sorted.

Example:

Student always sorted by Roll Number.

```java
class Student
implements Comparable<Student>
```

Method:

```java
compareTo()
```

---

# What is Comparator?

Comparator is used when different types of sorting are required.

Example:

Sort Student by

- Name
- Marks
- Age

Method:

```java
compare()
```

---

# Program Explanation

Student List

```
103 Rahul

101 Aman

102 Neha
```

Comparable

↓

Sort by ID

Output

```
101 Aman

102 Neha

103 Rahul
```

Comparator

↓

Sort by Name

Output

```
101 Aman

102 Neha

103 Rahul
```

---

# Difference Between Comparable and Comparator

| Comparable | Comparator |
|------------|------------|
| Inside Class | Outside Class |
| compareTo() | compare() |
| One Sorting Logic | Multiple Sorting Logics |
| java.lang | java.util |

---

# compareTo()

Used inside Comparable.

```java
return this.id - s.id;
```

Negative

↓

Current Object Smaller

Positive

↓

Current Object Larger

Zero

↓

Both Equal

---

# compare()

Used inside Comparator.

```java
return s1.name.compareTo(s2.name);
```

Compares two different objects.

---

# Time Complexity

Collections.sort()

↓

O(n log n)

---

# Interview Questions

## What is Comparable?

Comparable is an interface used for default sorting.

---

## What is Comparator?

Comparator is an interface used for custom sorting.

---

## Which method belongs to Comparable?

```java
compareTo()
```

---

## Which method belongs to Comparator?

```java
compare()
```

---

## Which package contains Comparable?

```java
java.lang
```

---

## Which package contains Comparator?

```java
java.util
```

---

## Which is better?

If only one sorting method is needed

↓

Comparable

If multiple sorting methods are needed

↓

Comparator

---

# Tricky Interview Questions

## Can one class have multiple Comparables?

No.

Only one compareTo() method.

---

## Can one class have multiple Comparators?

Yes.

One Comparator for Name.

One Comparator for Age.

One Comparator for Marks.

---

## Why is Comparator more flexible?

Because sorting logic is separate from the class.

---

# Interview Corner

Use Comparable

↓

Default Sorting

Use Comparator

↓

Custom Sorting

---

# Common Mistakes

❌ Thinking Comparable and Comparator are the same.

❌ Writing compareTo() inside Comparator.

❌ Forgetting Collections.sort().

---

# Key Takeaways

- Comparable provides default sorting.
- Comparator provides custom sorting.
- compareTo() belongs to Comparable.
- compare() belongs to Comparator.
- Comparator is more flexible.
- Collections.sort() performs sorting.
