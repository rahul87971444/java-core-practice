# Day 27 - Top 10 String Interview Programs

## Objective

Practice the most frequently asked String programs for Java interviews and coding rounds.

---

# Why are String Programs Important?

Strings are one of the most commonly asked topics in Java interviews.

Almost every company asks at least one String-based question.

---

# Real-Life Example

Think about WhatsApp.

Everything you type is stored as a String.

Examples:

- Messages
- Usernames
- Passwords
- Email IDs

---

# Programs Covered

1. Reverse String
2. Palindrome
3. Count Vowels
4. Count Characters
5. Convert to Uppercase
6. Convert to Lowercase
7. Remove Spaces
8. Compare Two Strings
9. Check Empty String
10. Find Character by Index

---

# Program 1 - Reverse String

Input

```
Java
```

Output

```
avaJ
```

Logic:

Traverse from the last character to the first.

Time Complexity:

```
O(n)
```

---

# Program 2 - Palindrome

A Palindrome reads the same forward and backward.

Examples:

```
madam

level

racecar
```

Not Palindrome:

```
java

hello
```

---

# Program 3 - Count Vowels

Vowels:

```
a

e

i

o

u
```

Loop through each character and count vowels.

---

# Program 4 - Count Characters

Use:

```java
length()
```

---

# Program 5 - Uppercase

Use:

```java
toUpperCase()
```

---

# Program 6 - Lowercase

Use:

```java
toLowerCase()
```

---

# Program 7 - Remove Spaces

Use:

```java
replace(" ","")
```

---

# Program 8 - Compare Strings

Use:

```java
equals()
```

Never use:

```java
==
```

for comparing string contents.

---

# Program 9 - Check Empty String

Use:

```java
isEmpty()
```

Returns:

```
true

or

false
```

---

# Program 10 - Find Character

Use:

```java
charAt(index)
```

Example:

```
Java

↓

J

a

v

a
```

Index starts from:

```
0
```

---

# Interview Questions

## Difference between == and equals()?

```
==

↓

Reference Comparison

equals()

↓

Content Comparison
```

---

## Difference between length() and length?

```
String

↓

length()

Array

↓

length
```

---

## Which method converts String to uppercase?

```java
toUpperCase()
```

---

## Which method removes spaces?

```java
replace()
```

---

## How to check if a String is empty?

```java
isEmpty()
```

---

# Interview Corner

Most Asked String Methods:

- length()
- charAt()
- substring()
- equals()
- compareTo()
- contains()
- replace()
- toUpperCase()
- toLowerCase()
- trim()

---

# Common Mistakes

❌ Using == instead of equals().

❌ Forgetting that String index starts at 0.

❌ Using length instead of length() for Strings.

---

# Key Takeaways

- Strings are immutable.
- Use equals() for content comparison.
- Learn common String methods.
- Practice String programs regularly.
