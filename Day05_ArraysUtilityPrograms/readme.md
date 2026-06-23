# Day 5 - Arrays Utility Programs

## Objective

Learn basic array operations that are commonly used in coding interviews and programming problems.

---

## What is an Array?

An Array is a collection of elements of the same data type stored in contiguous memory locations.

Example:

```java
int arr[] = {10, 20, 30, 40, 50};
```

---

## Why Use Arrays?

Arrays help store multiple values using a single variable.

Without Arrays:

```java
int a = 10;
int b = 20;
int c = 30;
```

With Arrays:

```java
int arr[] = {10,20,30};
```

---

## Advantages of Arrays

- Easy data storage
- Fast access using index
- Less code
- Foundation for advanced data structures

---

## Program 1: Find Largest Element

Logic:

```java
int largest = arr[0];

for(int i=1;i<arr.length;i++) {

    if(arr[i] > largest) {

        largest = arr[i];
    }
}
```

### Dry Run

Array:

```text
10 25 8 45 30
```

Largest becomes:

```text
10
25
45
```

Final Answer:

```text
45
```

---

## Program 2: Reverse Array

Logic:

```java
for(int i = arr.length-1; i>=0; i--)
```

Output:

```text
30 45 8 25 10
```

---

## Program 3: Linear Search

Searches element one by one.

Example:

```java
int key = 25;
```

Process:

```text
10 ❌
25 ✅
```

Element Found.

---

## Time Complexity

| Operation | Complexity |
|------------|------------|
| Access | O(1) |
| Linear Search | O(n) |
| Find Largest | O(n) |
| Reverse Array | O(n) |

---

## Real World Applications

### Student Marks

```java
int marks[] = {80,90,75,88};
```

### Monthly Sales

```java
double sales[] = {1200,1500,2000};
```

### Temperature Data

```java
float temp[] = {30.5f,31.2f};
```

---

## Interview Questions

### What is an Array?

An Array is a collection of similar data types stored in contiguous memory locations.

---

### What is the index of the first element?

```java
0
```

---

### What is the index of the last element?

```java
length - 1
```

---

### Difference Between Array and ArrayList?

| Array | ArrayList |
|---------|---------|
| Fixed Size | Dynamic Size |
| Faster | Flexible |
| Primitive Supported | Objects Only |

---

### Can arrays store different data types?

No.

Arrays store only one type of data.

Example:

```java
int arr[];
String names[];
```

---

## Tricky Interview Question

### Why does ArrayIndexOutOfBoundsException occur?

Example:

```java
int arr[] = {1,2,3};

System.out.println(arr[5]);
```

Because index 5 does not exist.

---

## Key Takeaways

- Arrays store multiple values.
- Index starts from 0.
- Fixed size data structure.
- Used in searching and sorting algorithms.
- Foundation of DSA.
