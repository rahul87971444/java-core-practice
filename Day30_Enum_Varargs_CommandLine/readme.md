# Day 30 - enum, varargs & Command Line Arguments

## Objective

Learn three small but important Java topics commonly asked in interviews.

---

# 1. Enum

## What is Enum?

Enum (Enumeration) is a special Java type used to represent a fixed set of constants.

Example:

```java
enum Day {

MONDAY,

TUESDAY,

WEDNESDAY

}
```

---

## Real-Life Example

Traffic Signal

```
RED

YELLOW

GREEN
```

Only these three values exist.

Similarly

```
Days

Months

Directions

Status

Gender

Payment Status
```

are good examples of Enum.

---

## Why Enum?

Without Enum

```java
String day = "Monday";
```

Someone may accidentally write

```
Mondy

Mon

Mondayy
```

Enum prevents invalid values.

---

## Enum Methods

### values()

Returns all constants.

```java
Day.values()
```

---

### valueOf()

Converts String to Enum.

```java
Day.valueOf("MONDAY")
```

---

# Interview Questions

## What is Enum?

A special type representing fixed constants.

---

## Why use Enum?

To improve type safety and readability.

---

# 2. Varargs

## What is Varargs?

Varargs allow a method to accept any number of arguments.

Example

```java
sum(int... numbers)
```

Can accept

```
1 Number

2 Numbers

10 Numbers
```

without creating multiple methods.

---

## Real-Life Example

Imagine a shopping cart.

Some customers buy

```
1 Item
```

Some buy

```
5 Items
```

Some buy

```
20 Items
```

The billing system should work for all.

Varargs solve this.

---

## Syntax

```java
method(int... x)
```

Java internally converts

```
10,20,30
```

into

```
int[]
```

---

# Interview Questions

## Difference Between Array and Varargs?

Array

↓

Must create array.

Varargs

↓

Arguments can be passed directly.

---

## Can a method have multiple varargs?

No.

Only one varargs parameter is allowed.

---

## Where should varargs be placed?

Always at the end of the parameter list.

Correct

```java
display(String name,int... marks)
```

Wrong

```java
display(int... marks,String name)
```

---

# 3. Command Line Arguments

## What are Command Line Arguments?

Values passed while starting the Java program.

Example

```bash
java Demo Rahul Java
```

Here

```
Rahul

Java
```

are Command Line Arguments.

---

## Why use them?

Useful when input is known before program execution.

---

## Interview Questions

## Where are Command Line Arguments stored?

Inside

```java
String[] args
```

---

## Can Command Line Arguments be numbers?

Yes.

But they are received as Strings.

Use

```java
Integer.parseInt()
```

to convert them.

---

# Difference

| Enum | Varargs | Command Line |
|------|----------|--------------|
| Fixed Constants | Variable Arguments | Program Input |
| Type Safe | Flexible Methods | Input at Runtime |

---

# Common Mistakes

❌ Writing invalid Enum values.

❌ Declaring multiple varargs.

❌ Assuming command-line arguments are integers.

---

# Key Takeaways

- Enum stores fixed constants.
- Varargs accept variable numbers of arguments.
- Command-line arguments are passed through `String[] args`.
