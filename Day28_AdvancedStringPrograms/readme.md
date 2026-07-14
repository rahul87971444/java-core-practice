# Day 28 - Advanced String Interview Programs

## Objective

Practice advanced String problems frequently asked in coding interviews.

---

# Why are these important?

Companies like

- TCS
- Infosys
- Accenture
- Cognizant
- Capgemini

frequently ask String problems because they test logic rather than Java syntax.

---

# Programs Covered

1. Anagram
2. Character Frequency
3. Remove Duplicate Characters
4. Reverse Words
5. First Non-Repeating Character

---

# 1. Anagram

Two strings are anagrams if they contain the same characters with the same frequency.

Example:

```
listen

silent
```

Output

```
Anagram
```

Logic

- Convert to lowercase
- Convert to character array
- Sort both arrays
- Compare

Time Complexity

```
O(n log n)
```

---

# 2. Character Frequency

Input

```
programming
```

Output

```
p=1

r=2

o=1

...
```

Use HashMap.

---

# 3. Remove Duplicate Characters

Input

```
programming
```

Output

```
progamin
```

Use LinkedHashSet because

- No duplicates
- Maintains insertion order

---

# 4. Reverse Words

Input

```
Java is easy
```

Output

```
easy is Java
```

Split the sentence using spaces and print words in reverse order.

---

# 5. First Non-Repeating Character

Input

```
aabbcdde
```

Output

```
c
```

Use LinkedHashMap to preserve insertion order while counting frequencies.

---

# Interview Questions

## What is an Anagram?

Two strings containing the same characters with the same frequency.

---

## Which collection is best for character frequency?

```
HashMap
```

---

## Why LinkedHashSet for removing duplicates?

Because it:

- Removes duplicates.
- Preserves insertion order.

---

## Difference Between HashMap and LinkedHashMap?

HashMap

↓

No order

LinkedHashMap

↓

Maintains insertion order

---

# Interview Corner

Most Asked String Problems

✔ Reverse String

✔ Palindrome

✔ Anagram

✔ Character Frequency

✔ Remove Duplicates

✔ Reverse Words

✔ First Non-Repeating Character

✔ Longest Word

✔ String Compression

✔ Count Occurrences

---

# Common Mistakes

❌ Forgetting to convert both strings to lowercase before checking anagrams.

❌ Using HashSet when insertion order matters.

❌ Using == instead of equals() for String comparison.

---

# Key Takeaways

- HashMap is useful for counting frequencies.
- LinkedHashSet removes duplicates while preserving order.
- LinkedHashMap helps find the first non-repeating character.
- Anagram problems usually involve sorting or frequency counting.
