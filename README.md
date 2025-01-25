# UnionMerge-and-StringNode-Utility

## Overview
This project contains two Java classes, `Problem5` and `StringNode`, that demonstrate operations on arrays and custom string data structures (using linked lists). It covers concepts such as array manipulation, recursion, and linked-list string implementation.

---

## Features

### **Problem5**
This class provides a utility for merging and deduplicating two integer arrays:
- **Key Method:**
  - `union(int[] a1, int[] a2)`: Merges two arrays, removes duplicates, and returns a sorted result.
- **Example Usage:**
  The `main` method demonstrates how the `union` function works with different test cases.

### **StringNode**
This class defines a custom string implementation using a linked list:
- **String Operations:**
  - Convert Java strings to linked lists and vice versa.
  - Perform operations like insertion, deletion, and finding characters.
  - Remove spaces, find prefixes, and count occurrences of characters.
- **Demonstrated in the `main` Method:**
  - Interactively tests the methods with user input.

---

## Requirements
- Java 8 or higher.

---

## How to Run
1. Clone the repository and open the project in your preferred Java IDE.
2. Compile and run the `Problem5` class to see examples of merging and deduplicating arrays.
3. Compile and run the `StringNode` class to interactively test linked-list string operations.

---

## Example Outputs

### **Problem5**
```text
Input Arrays: [10, 5, 7, 5, 9, 4] and [7, 5, 15, 7, 7, 9, 10]
Output Union: [4, 5, 7, 9, 10, 15]
