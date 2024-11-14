# Algorithmic Exercises in Java, Python and Javascript

This repository contains my solutions to algorithmic exercises from popular coding platforms, including **CodeWars**, **LeetCode**, and **Project Euler**. Each solution is implemented in Java, demonstrating different approaches to problem-solving across a range of topics, such as data structures, algorithms, and mathematics. This repository serves as a learning resource for practicing coding skills, preparing for technical interviews, and exploring efficient solutions to common problems.

## Features
- **Platform-Based Solutions**: Organized by coding platform (CodeWars, LeetCode, Project Euler).
- **Topic-Based Organization**: Problems are categorized by topic, such as arrays, dynamic programming, graph theory, recursion, and more.
- **Complexity Analysis**: Time and space complexity analysis is provided for each solution to highlight performance considerations.
- **Solution Explanations**: Select solutions include step-by-step explanations of the logic and approach.

## Directory Structure
```
algorithmic-exercises/
│
├── CodeWars/
│   ├── src/
│   │   ├── Kata1.java
│   │   ├── Kata2.java
│   └── README.md
│
├── LeetCode/
│   ├── src/
│   │   ├── Problem1_TwoSum.java
│   │   ├── Problem2_AddTwoNumbers.java
│   └── README.md
│
├── ProjectEuler/
│   ├── src/
│   │   ├── Problem1.java
│   │   ├── Problem2.java
│   └── README.md
│
└── README.md
```

## Usage
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/algorithmic-exercises.git
   cd algorithmic-exercises
   ```

2. **Compile and Run**:
   - Navigate to the desired platform directory (e.g., `CodeWars/src`) and compile the Java file:
   ```bash
   javac Kata1.java
   java Kata1
   ```

3. **Test and Modify**:
   - Each solution can be modified or tested further based on custom test cases.

## Example Problem Solution
Here's a sample of what you can expect in each file:

```java
// LeetCode Problem: Two Sum
public class Problem1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

## Topics Covered
- **Arrays**
- **Linked Lists**
- **Trees**
- **Graphs**
- **Dynamic Programming**
- **Mathematics**
- **String Manipulation**
- **Sorting and Searching**

## Contributing
Contributions are welcome! If you’d like to add new solutions, improve explanations, or suggest optimizations, please feel free to submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.

---

Happy Coding!
