# Day 21 - Thread Class in Java

## Objective

Learn how Java executes multiple tasks simultaneously using threads.

---

# What is a Thread?

A Thread is the smallest unit of execution inside a process.

A Java program starts with one thread called the **Main Thread**.

We can create additional threads to perform multiple tasks at the same time.

---

# Process vs Thread

## Process

A Process is a running program.

Examples:

```
Chrome

VS Code

Spotify
```

Each is a separate process.

---

## Thread

A Thread is a smaller unit inside a process.

Example:

```
Chrome Browser

↓

Download Thread

↓

Video Thread

↓

UI Thread
```

One process can have many threads.

---

# Real-Life Example

Imagine a restaurant.

One waiter can only serve one customer at a time.

```
Customer 1

↓

Customer 2

↓

Customer 3
```

Everything becomes slow.

Now imagine four waiters.

```
Waiter 1

↓

Customer 1

Waiter 2

↓

Customer 2

Waiter 3

↓

Customer 3
```

All customers are served simultaneously.

Each waiter is like a Thread.

---

# Why Do We Need Threads?

Without Threads

```
Download File

↓

Play Music

↓

Open Browser
```

Everything waits.

With Threads

```
Download File

Play Music

Open Browser
```

All tasks execute together.

---

# How to Create a Thread?

Step 1

Extend Thread class.

```java
class MyThread extends Thread {

}
```

---

Step 2

Override run()

```java
public void run() {

}
```

---

Step 3

Create Object

```java
MyThread t = new MyThread();
```

---

Step 4

Start Thread

```java
t.start();
```

---

# Why start() Instead of run()?

Wrong:

```java
t.run();
```

Only executes like a normal method.

No new thread is created.

Correct:

```java
t.start();
```

Creates a new thread and internally calls:

```java
run();
```

---

# Thread Life Cycle

```
New

↓

Runnable

↓

Running

↓

Waiting / Blocked

↓

Terminated
```

---

# Thread.sleep()

Pauses a thread for a specific time.

Example:

```java
Thread.sleep(1000);
```

Meaning:

Pause for

```
1000 ms

↓

1 second
```

---

# Program Explanation

Step 1

Create child thread.

```
MyThread
```

---

Step 2

Call

```java
t.start();
```

Main Thread and Child Thread now execute simultaneously.

---

Step 3

Both print numbers.

Their order may change.

This is normal.

---

# Advantages

- Faster execution
- Better CPU utilization
- Improved responsiveness
- Multiple tasks run together

---

# Interview Questions

## What is a Thread?

A Thread is the smallest unit of execution inside a process.

---

## Difference Between Process and Thread?

| Process | Thread |
|----------|---------|
| Heavyweight | Lightweight |
| Separate Memory | Shared Memory |
| Slower | Faster |

---

## Which method starts a thread?

```java
start()
```

---

## Which method contains thread logic?

```java
run()
```

---

## Difference Between start() and run()?

| start() | run() |
|----------|--------|
| Creates New Thread | Normal Method Call |
| Executes Concurrently | Executes Sequentially |

---

## Can we call start() twice?

No.

Calling start() twice on the same thread throws:

```
IllegalThreadStateException
```

---

# Tricky Interview Questions

## Why doesn't Java call run() directly?

Because run() is just a normal method.

Only start() creates a new thread.

---

## Why does output change every execution?

Because the Thread Scheduler decides which thread runs first.

---

## Can we directly create an object of Thread?

Yes.

But usually we extend Thread or implement Runnable to define custom work.

---

# Interview Corner

Use Thread class when:

- Learning multithreading
- Small demo programs

For larger applications,

Runnable is generally preferred.

---

# Common Mistakes

❌ Calling run() instead of start()

❌ Assuming thread execution order is fixed

❌ Calling start() multiple times

---

# Key Takeaways

- Thread executes tasks concurrently.
- start() creates a new thread.
- run() contains thread logic.
- Thread scheduling is handled by the JVM.
- Output order is not guaranteed.
