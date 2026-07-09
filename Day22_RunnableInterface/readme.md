# Day 22 - Runnable Interface in Java

## Objective

Learn why Java recommends implementing Runnable instead of extending the Thread class.

---

# What is Runnable?

Runnable is an interface used to define a task that can be executed by a thread.

Unlike extending Thread, Runnable separates:

Task

↓

Thread

This makes programs more flexible.

---

# Why Do We Need Runnable?

Suppose two workers perform different jobs.

Worker 1

↓

Painting

Worker 2

↓

Cleaning

The work is different,

but both workers use the same concept of "working".

Runnable stores only the work.

Thread executes that work.

---

# Real-Life Example

Think about a delivery company.

Package

↓

Food Delivery

Medicine Delivery

Clothes Delivery

The package is the task.

The delivery person is the thread.

Different tasks can be assigned to different threads.

---

# How to Create a Runnable Thread?

Step 1

Implement Runnable.

```java
class MyTask implements Runnable {

}
```

---

Step 2

Override run().

```java
public void run() {

}
```

---

Step 3

Create Runnable Object.

```java
MyTask task = new MyTask();
```

---

Step 4

Pass Runnable object to Thread.

```java
Thread t = new Thread(task);
```

---

Step 5

Start Thread.

```java
t.start();
```

---

# Why Runnable is Better?

Suppose:

```java
class Employee extends Person {

}
```

Now Employee already extends Person.

Java does not support multiple inheritance.

So this is impossible:

```java
class Employee extends Person, Thread
```

Compiler Error.

Solution:

```java
class Employee extends Person
implements Runnable
```

Now Employee can inherit Person and still become a thread.

---

# Thread vs Runnable

| Thread | Runnable |
|----------|-----------|
| Class | Interface |
| Uses extends | Uses implements |
| Cannot extend another class | Can extend another class |
| Less flexible | More flexible |
| Rarely preferred | Mostly preferred |

---

# Program Explanation

Step 1

Create Runnable class.

```java
class MyTask
implements Runnable
```

---

Step 2

Override

```java
run()
```

---

Step 3

Create Thread

```java
Thread t =
new Thread(task);
```

---

Step 4

Call

```java
t.start();
```

Now JVM creates a new thread.

---

# Runnable Life Cycle

Runnable Object

↓

Thread Object

↓

start()

↓

run()

↓

Execution

---

# Advantages

- Better code reuse
- Supports inheritance
- Cleaner design
- Used in enterprise applications

---

# Interview Questions

## What is Runnable?

Runnable is an interface whose run() method contains the task to be executed by a thread.

---

## Why is Runnable preferred?

Because Java allows extending only one class.

Runnable avoids this limitation.

---

## Difference Between Thread and Runnable?

Thread

↓

Class

Runnable

↓

Interface

---

## Which method starts execution?

```java
start()
```

---

## Which method contains thread logic?

```java
run()
```

---

## Can Runnable create a thread by itself?

No.

Runnable only defines the task.

Thread executes it.

---

# Tricky Interview Questions

## Why doesn't Runnable have start()?

Because Runnable only represents work.

The Thread class is responsible for execution.

---

## Can multiple threads execute the same Runnable object?

Yes.

Example:

```java
MyTask task =
new MyTask();

Thread t1 =
new Thread(task);

Thread t2 =
new Thread(task);
```

Both execute the same task.

---

## Why is Runnable used in Spring Boot and enterprise applications?

Because it promotes loose coupling and better code reuse.

---

# Interview Corner

Use Thread

↓

Learning

Simple examples

Use Runnable

↓

Real-world applications

Enterprise projects

Spring Boot

---

# Common Mistakes

❌ Calling run() directly

❌ Forgetting to pass Runnable object to Thread

❌ Thinking Runnable itself creates a thread

---

# Key Takeaways

- Runnable defines a task.
- Thread executes the task.
- Runnable is more flexible than Thread.
- Supports inheritance.
- Preferred in real-world Java development.
