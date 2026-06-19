# Day 2 - File Handling in Java

## Objective

Learn how to create, write, and read files using Java.

---

## What is File Handling?

File Handling is the process of creating, reading, writing, updating, and deleting files.

Files allow data to be stored permanently even after a program terminates.

Without files:

```java
String name = "Rahul";
```

Data exists only while the program runs.

With files:

```text
student.txt
```

Data remains available even after the program closes.

---

## Why Do We Need File Handling?

Consider a Student Management System.

Without file handling:

- Student records disappear after program ends.

With file handling:

- Student records remain stored permanently.

---

## Important Classes

### File

Used to create and manage files.

```java
File file = new File("student.txt");
```

---

### FileWriter

Used to write data into a file.

```java
FileWriter writer =
        new FileWriter("student.txt");
```

---

### FileReader

Used to read characters from a file.

```java
FileReader reader =
        new FileReader("student.txt");
```

---

### BufferedReader

Used for efficient reading.

```java
BufferedReader br =
        new BufferedReader(reader);
```

Provides methods like:

```java
readLine()
```

---

## Program Flow

1. Create FileWriter.
2. Write data into file.
3. Close FileWriter.
4. Create FileReader.
5. Read data line by line.
6. Close FileReader.

---

## Real World Applications

### Banking System

Store:

- Account Information
- Transaction Records

### Hospital Management

Store:

- Patient Records
- Doctor Information

### College Management

Store:

- Student Details
- Attendance Records

---

## Common File Handling Methods

### write()

Writes data into file.

```java
writer.write("Hello");
```

---

### readLine()

Reads one line at a time.

```java
reader.readLine();
```

---

### close()

Closes file resources.

```java
writer.close();
```

---

## Why Close Files?

If files are not closed:

- Data may not be saved properly.
- Resources remain occupied.
- Memory leaks can occur.

---

## Interview Questions

### What is File Handling?

File Handling is the process of storing and retrieving data from files.

---

### Difference Between FileWriter and FileReader?

| FileWriter | FileReader |
|------------|------------|
| Writes Data | Reads Data |
| Output Stream | Input Stream |

---

### Why use BufferedReader?

BufferedReader improves reading performance and provides readLine() functionality.

---

### What happens if file does not exist?

Java throws:

```java
FileNotFoundException
```

---

### Why close files?

To release resources and ensure data is saved properly.

---

## Tricky Interview Question

### Why is BufferedReader faster than FileReader?

BufferedReader reads larger chunks of data into memory at once, reducing disk access operations.

---

## Key Takeaways

- File Handling stores data permanently.
- FileWriter writes data.
- FileReader reads data.
- BufferedReader improves reading performance.
- close() releases resources.
- Used in almost every real-world application.
