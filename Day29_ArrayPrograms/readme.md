# Day 29 - Top 10 Array Interview Programs

## Objective

Practice the most frequently asked Array programs in Java interviews.

---

# Why are Arrays Important?

Arrays are the foundation of Data Structures and Algorithms.

Many advanced structures like:

- ArrayList
- Heap
- Matrix
- Hashing

are based on arrays.

---

# Real-Life Example

Think of a classroom.

Seat Numbers

```
1

2

3

4

5
```

Each seat has an index.

Similarly,

```
arr[0]

arr[1]

arr[2]
```

---

# Programs Covered

1. Largest Element
2. Smallest Element
3. Reverse Array
4. Sum of Elements
5. Average
6. Linear Search
7. Sort Array
8. Second Largest Element
9. Check Sorted Array
10. Count Even & Odd Numbers

---

# Program Explanations

## Largest Element

Traverse the array and keep updating the maximum value.

Time Complexity

```
O(n)
```

---

## Smallest Element

Keep updating the minimum value.

---

## Reverse Array

Traverse from the last index to the first.

---

## Sum of Elements

Add every element using a loop.

---

## Average

Average =

```
Sum / Number of Elements
```

---

## Linear Search

Compare every element one by one.

Best for unsorted arrays.

---

## Sort Array

Use

```java
Arrays.sort()
```

Time Complexity

```
O(n log n)
```

---

## Second Largest

Sort the array.

Return

```
arr[length-2]
```

(Works when all elements are distinct.)

---

## Check Sorted

Compare each element with the next.

If any element is greater than the next,

the array is not sorted.

---

## Count Even & Odd

Use

```
number % 2
```

---

# Interview Questions

## Difference Between Array and ArrayList?

| Array | ArrayList |
|--------|-----------|
| Fixed Size | Dynamic Size |
| Faster | Flexible |
| Stores primitives | Stores objects |

---

## Which search is best for unsorted arrays?

```
Linear Search
```

---

## Which method sorts an array?

```java
Arrays.sort()
```

---

## Difference Between Linear Search and Binary Search?

| Linear Search | Binary Search |
|---------------|---------------|
| O(n) | O(log n) |
| Unsorted Array | Sorted Array |

---

# Interview Corner

Most Asked Array Questions

✔ Largest Element

✔ Second Largest

✔ Reverse Array

✔ Linear Search

✔ Remove Duplicates

✔ Rotate Array

✔ Missing Number

✔ Move Zeroes

✔ Merge Arrays

✔ Maximum Subarray Sum (Kadane's Algorithm)

---

# Common Mistakes

❌ Accessing an invalid index.

❌ Forgetting array indices start from 0.

❌ Using Binary Search on an unsorted array.

---

# Key Takeaways

- Arrays store elements in contiguous memory.
- Index starts from 0.
- Arrays have fixed size.
- Linear Search works on unsorted arrays.
- Arrays.sort() sorts in ascending order.
