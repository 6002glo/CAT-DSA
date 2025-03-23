

## 1. Big O Notation Rules

Big O notation is used to describe the efficiency and complexity of algorithms. [cite: 1] It helps us understand how the runtime or space requirements of an algorithm grow as the input size increases.

### 1.1 Constants Are Dropped

Big O notation ignores constant factors. 

* For example, an algorithm with a time complexity of 5n + 3 is simplified to O(n). 

### 1.2 Non-Dominant Terms Are Eliminated

Big O notation only considers the dominant term. [cite: 4]

* For example, an algorithm with a time complexity of n² + n is expressed as O(n²). 

### 1.3 Common Growth Rates

Here are some common Big O time complexities: [cite: 6]

* **O(1) - Constant Time:** The execution time does not depend on the input size (e.g., accessing an array element). 
* **O(log n) - Logarithmic Time:** The runtime grows slowly as the input size increases (e.g., binary search). 
* **O(n) - Linear Time:** The runtime increases linearly with the input size (e.g., iterating through an array). 
* **O(n²) - Quadratic Time:** The runtime increases exponentially with the input size (e.g., nested loops). 

### 1.4 Worst-Case vs. Best-Case Analysis

Big O notation typically describes the worst-case scenario. 

* For example, in searching an array:
    * Worst case: O(n) (element not found or at the end). 

### 1.5 Multiplication Rule

* Consecutive loops result in cumulative complexities. 
* Nested loops also result in cumulative complexities. 
    * Example: A code snippet with nested loops, each iterating 'n' times, has a time complexity of O(n²).
 
   


