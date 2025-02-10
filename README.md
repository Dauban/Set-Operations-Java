# Set Operations in Java

## Overview
This project implements a **custom Set data structure** in Java, showcasing common set operations such as **union, intersection, difference, and symmetric difference**. The implementation emphasizes foundational knowledge of data structures and algorithmic thinking while adhering to modular design principles.

## Features
- **Set Operations**:
  - **Union**: Combines all unique elements from two sets.
  - **Intersection**: Finds common elements between two sets.
  - **Difference**: Retrieves elements present in one set but not the other.
  - **Symmetric Difference**: Finds elements present in either set but not in both.
- **Set Utilities**:
  - **SimpleSet**: A basic set implementation with methods like `add`, `remove`, `contains`, `isEmpty`, and `size`.
  - **SetUtils**: A utility class that performs operations on sets.
- **Demonstration**: A `Main` class with test cases to showcase functionality.

## Project Structure
```
Set-Operations-Java/
│── SimpleSet.java        # Basic set implementation
│── Set.java              # Set interface definition
│── SetUtils.java         # Utility methods for set operations
│── Main.java             # Entry point with test cases
```

## Installation & Usage
### Compilation
Compile all Java files:
```sh
javac *.java
```

### Execution
Run the `Main` class to demonstrate the set operations:
```sh
java Main
```

### Example Output
**Sample Union Operation**:
```
Set A: [1, 2, 3]
Set B: [3, 4, 5]
Union: [1, 2, 3, 4, 5]
```

**Sample Intersection Operation**:
```
Set A: [1, 2, 3]
Set B: [3, 4, 5]
Intersection: [3]
```

## Potential Enhancements
- Implement **thread-safe sets** to handle concurrent modifications.
- Add performance optimizations for larger data sets.
- Extend the functionality with **Cartesian Product** or **Power Set** operations.
- Create a GUI to visualize the operations.

## Author
**Or Adar**  
GitHub: [github.com/Dauban](https://github.com/Dauban)  

---
This project demonstrates foundational data structure implementation and algorithmic problem-solving in Java. Ideal for academic learning and interview preparation.

