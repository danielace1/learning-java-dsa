Here are some of the **best LeetCode problems** to learn **Greedy Algorithms**, arranged from easy to hard.

### 1. Assign Cookies (Easy)

**LeetCode 455**

**Problem:**

- Children have greed factors.
- Cookies have sizes.
- Give each child at most one cookie.
- Maximize the number of satisfied children.

**Greedy idea:**

- Sort both arrays.
- Give the **smallest cookie** that satisfies the **least greedy child**.

---

### 2. Lemonade Change (Easy)

**LeetCode 860**

**Problem:**
Customers pay with ₹5, ₹10, or ₹20 bills. You must return the correct change.

**Greedy idea:**

- Always use larger bills first when giving change (prefer ₹10 + ₹5 over three ₹5 bills).

---

### 3. Can Place Flowers (Easy)

**LeetCode 605**

**Problem:**
Determine if you can plant `n` flowers without placing two flowers next to each other.

**Greedy idea:**

- Traverse the array and plant a flower whenever it's valid.

---

### 4. Jump Game (Medium)

**LeetCode 55**

**Problem:**
Given an array, each element tells the maximum jump length. Can you reach the last index?

Example:

```
nums = [2,3,1,1,4]
Output: true
```

**Greedy idea:**

- Keep track of the **farthest reachable index**.
- If the current index exceeds the farthest reachable, you cannot continue.

---

### 5. Jump Game II (Medium)

**LeetCode 45**

**Problem:**
Find the **minimum number of jumps** to reach the last index.

**Greedy idea:**

- Expand the current reachable range.
- When you reach the end of the current range, make one jump.

---

### 6. Gas Station (Medium)

**LeetCode 134**

**Problem:**
Find the starting gas station to complete a circular route.

**Greedy idea:**

- If the tank becomes negative, the current start cannot work.
- Start again from the next station.

---

### 7. Partition Labels (Medium)

**LeetCode 763**

**Problem:**
Split a string into as many parts as possible so that each letter appears in only one part.

**Greedy idea:**

- Record the last occurrence of each character.
- Extend the current partition until all characters in it finish.

---

### 8. Non-overlapping Intervals (Medium)

**LeetCode 435**

**Problem:**
Remove the minimum number of overlapping intervals.

**Greedy idea:**

- Sort by end time.
- Always keep the interval that finishes first.

---

### 9. Task Scheduler (Medium)

**LeetCode 621**

**Problem:**
Schedule tasks with a cooldown period between identical tasks.

**Greedy idea:**

- Prioritize tasks with the highest remaining frequency.

---

### 10. Minimum Number of Arrows to Burst Balloons (Medium)

**LeetCode 452**

**Problem:**
Find the minimum number of arrows required to burst all balloons.

**Greedy idea:**

- Sort balloons by their end coordinate.
- Shoot an arrow at the earliest ending balloon that covers as many as possible.

## Best learning order

1. 455 – Assign Cookies
2. 860 – Lemonade Change
3. 605 – Can Place Flowers
4. 55 – Jump Game ⭐
5. 45 – Jump Game II ⭐
6. 134 – Gas Station ⭐
7. 763 – Partition Labels
8. 435 – Non-overlapping Intervals
9. 452 – Minimum Number of Arrows to Burst Balloons
10. 621 – Task Scheduler

If you're preparing for coding interviews, start with **Jump Game (55)** and **Jump Game II (45)**. They are among the most frequently asked greedy problems and help build intuition for the technique.

