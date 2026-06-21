# Day 3 - String Operations in Java

## Objective

Learn common string operations used in Java programs and interviews.

---

## What is a String?

A String is a sequence of characters enclosed in double quotes.

Example:

```java
String name = "Rahul";
```

Strings are used to store text data such as:

- Names
- Addresses
- Emails
- Messages

---

## Why are Strings Important?

Almost every Java application uses strings.

Examples:

- Login System
- Search Engine
- Chat Application
- Banking Software

---

## Common String Methods

### length()

Returns total number of characters.

```java
String s = "Java";
System.out.println(s.length());
```

Output:

```text
4
```

---

### toUpperCase()

Converts string to uppercase.

```java
s.toUpperCase();
```

Output:

```text
JAVA
```

---

### toLowerCase()

Converts string to lowercase.

```java
s.toLowerCase();
```

Output:

```text
java
```

---

### charAt()

Returns character at a specific index.

```java
s.charAt(1);
```

Output:

```text
a
```

---

### substring()

Extracts part of a string.

```java
s.substring(0, 2);
```

Output:

```text
Ja
```

---

### contains()

Checks whether a string contains another string.

```java
s.contains("av");
```

Output:

```text
true
```

---

### replace()

Replaces characters or words.

```java
s.replace("Java", "Python");
```

Output:

```text
Python
```

---

## String Immutability

Strings are immutable.

This means their value cannot be changed after creation.

Example:

```java
String s = "Java";

s.concat(" Programming");
```

The original string remains unchanged.

---

## Real World Applications

### Login System

```java
username.equals("admin")
```

### Search Feature

```java
text.contains("Java")
```

### Form Validation

```java
email.length()
```

---

## Interview Questions

### What is a String?

A String is a sequence of characters used to store text.

---

### Are Strings mutable?

No.

Strings are immutable in Java.

---

### What is String Immutability?

Once a String object is created, its value cannot be changed.

---

### Difference Between == and equals()?

| == | equals() |
|-----|---------|
| Compares memory addresses | Compares values |
| Reference comparison | Content comparison |

Example:

```java
String a = "Java";
String b = "Java";

System.out.println(a == b);
System.out.println(a.equals(b));
```

---

### Which method returns string length?

```java
length()
```

---

## Tricky Interview Question

### Why are Strings immutable?

Benefits:

- Security
- Thread Safety
- Efficient memory usage
- String Pool support

---

## Key Takeaways

- Strings store text data.
- Strings are immutable.
- Frequently used methods:
  - length()
  - charAt()
  - substring()
  - contains()
  - replace()
- Strings are heavily used in real-world applications.
