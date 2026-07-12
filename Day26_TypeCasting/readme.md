# Day 26 - Type Casting in Java

## Objective

Learn how Java converts one data type into another.

---

# What is Type Casting?

Type Casting means converting one data type into another.

Example

```
int

↓

double
```

or

```
double

↓

int
```

---

# Real-Life Example

Imagine a bottle.

```
1 Litre Bottle

↓

2 Litre Bottle
```

You can easily pour water.

No loss.

This is like

```
int → double
```

---

Now imagine

```
2 Litre Bottle

↓

1 Litre Bottle
```

Some water is lost.

This is like

```
double → int
```

Decimal part disappears.

---

# Types of Type Casting

Java has two types.

```
1. Implicit Casting

2. Explicit Casting
```

---

# 1. Implicit Type Casting

Also called

```
Widening Casting
```

Small data type

↓

Large data type

Automatically done by Java.

Example

```java
int number = 100;

double d = number;
```

Output

```
100.0
```

No data loss.

---

# Memory Representation

```
100

↓

100.0
```

Java automatically converts.

---

# 2. Explicit Type Casting

Also called

```
Narrowing Casting
```

Large data type

↓

Small data type

Must be done manually.

Example

```java
double price = 99.99;

int amount = (int) price;
```

Output

```
99
```

Decimal part is removed.

---

# Why Use Explicit Casting?

Java wants to avoid accidental data loss.

Therefore,

you must write

```java
(int)
```

yourself.

---

# Character to Integer

Every character has an ASCII value.

Example

```java
char ch = 'A';

int value = ch;
```

Output

```
65
```

---

# Primitive Conversion Chart

```
byte

↓

short

↓

int

↓

long

↓

float

↓

double
```

Moving downward

↓

Implicit

Moving upward

↓

Explicit

---

# Interview Questions

## What is Type Casting?

Converting one data type into another.

---

## What is Implicit Casting?

Automatic conversion from a smaller type to a larger type.

---

## What is Explicit Casting?

Manual conversion from a larger type to a smaller type.

---

## Difference Between Widening and Narrowing?

| Widening | Narrowing |
|-----------|------------|
| Automatic | Manual |
| No Data Loss | Data Loss Possible |
| Small → Large | Large → Small |

---

## Why does Java require explicit casting?

To prevent accidental loss of data.

---

## Can double be stored in int directly?

No.

Wrong

```java
int x = 10.5;
```

Correct

```java
int x = (int)10.5;
```

---

# Tricky Interview Questions

## Output?

```java
int x = (int)9.99;

System.out.println(x);
```

Output

```
9
```

---

## Output?

```java
char ch = 'A';

System.out.println((int)ch);
```

Output

```
65
```

---

## Output?

```java
int x = 100;

double d = x;

System.out.println(d);
```

Output

```
100.0
```

---

# Interview Corner

Use

```
Implicit Casting

↓

When converting

int → double
```

Use

```
Explicit Casting

↓

When converting

double → int
```

---

# Common Mistakes

❌ Forgetting explicit casting.

❌ Assuming rounding happens.

Example

```
(int)9.99

↓

9

NOT

10
```

❌ Thinking characters don't have numeric values.

---

# Key Takeaways

- Type Casting converts one data type into another.
- Implicit casting is automatic.
- Explicit casting requires a cast operator.
- Widening has no data loss.
- Narrowing may lose data.
- Characters have ASCII values.
