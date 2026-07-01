# Day 13 - Encapsulation in Java

## Objective

Learn how Encapsulation protects data by restricting direct access and allowing controlled access through methods.

---

# What is Encapsulation?

Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) while restricting direct access to the data.

Simply put,

> **Data + Methods = Encapsulation**

---

# Why Do We Need Encapsulation?

Suppose we have a Bank Account.

Without encapsulation:

```java
account.balance = -5000;
```

Anyone can change the balance directly, leading to invalid data.

With encapsulation:

```java
account.setBalance(-5000);
```

The setter method checks the value before storing it.

This protects the object's data.

---

# Real World Example

Think about an ATM.

You cannot directly change your bank balance.

You can only:

- Deposit Money
- Withdraw Money
- Check Balance

The bank controls how the balance changes.

This is Encapsulation.

---

# How is Encapsulation Achieved?

Three steps:

1. Make variables private.

```java
private double balance;
```

2. Create Getter methods.

```java
getBalance()
```

3. Create Setter methods.

```java
setBalance()
```

---

# Understanding the Program

## Step 1

Declare private variables.

```java
private String accountHolder;
private double balance;
```

These variables cannot be accessed directly.

---

## Step 2

Setter Methods

```java
setBalance()
```

Stores values after validation.

Example:

```java
if(balance >= 0)
```

Negative balance is not allowed.

---

## Step 3

Getter Methods

```java
getBalance()
```

Returns the stored value.

---

## Step 4

Create Object

```java
BankAccount account = new BankAccount();
```

---

## Step 5

Access data using methods.

```java
account.setBalance(5000);

account.getBalance();
```

---

# Advantages of Encapsulation

- Protects data
- Prevents unauthorized access
- Allows validation
- Improves security
- Improves maintainability

---

# Getters and Setters

## Getter

Used to read data.

Example:

```java
getBalance()
```

---

## Setter

Used to modify data.

Example:

```java
setBalance()
```

---

# Access Modifiers Used

```java
private
```

Restricts direct access.

```java
public
```

Allows controlled access through methods.

---

# Interview Questions

## What is Encapsulation?

Encapsulation is wrapping data and methods into a single unit while restricting direct access to data.

---

## Why use private variables?

To protect data from unauthorized modification.

---

## What are Getters?

Methods used to retrieve private data.

---

## What are Setters?

Methods used to update private data after validation.

---

## Difference Between Encapsulation and Abstraction?

| Encapsulation | Abstraction |
|--------------|-------------|
| Protects data | Hides implementation |
| Uses private variables | Uses abstract class/interface |
| Focuses on security | Focuses on simplicity |

---

## Why not make variables public?

Because anyone can modify them, leading to invalid or inconsistent data.

---

# Tricky Interview Questions

## Can Encapsulation exist without Getters and Setters?

Yes.

You can expose only the methods you need.

For example, a class may provide only a getter if the data should be read but never modified.

---

## Is Encapsulation only about private variables?

No.

It is about controlling access to data. Private variables with appropriate methods are the most common way to achieve it.

---

# Key Takeaways

- Encapsulation protects object data.
- Use private variables.
- Access data using getters and setters.
- Validation can be added inside setters.
- Improves security and code quality.
