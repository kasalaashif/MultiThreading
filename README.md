# Java Multithreading: Concepts & Practice

This repository contains a detailed exploration of **Java Multithreading and Concurrency** concepts through hands-on coding exercises, real-world simulations, and best-practice implementations.

## ✅ Concepts Covered

### 1. Creating Threads
- **Definition**: Concurrent execution using `Thread` or `Runnable`.
- **Example**: Print a message using multiple threads.
- **Practiced**: Difference between `run()` and `start()`.

### 2. Thread Lifecycle
- **Definition**: States like NEW, RUNNABLE, WAITING, TERMINATED.
- **Example**: Observed transitions using `getState()`.
- **Practiced**: Sleep and join to control thread execution.

### 3. Race Conditions & Synchronization
- **Definition**: Conflicts due to unsynchronized shared access.
- **Example**: Shared counter with and without `synchronized`.
- **Practiced**: Fixed race conditions using locks.

### 4. ReentrantLock & tryLock()
- **Definition**: Fine-grained lock control with retry support.
- **Example**: Bank transfer with `tryLock()` to avoid deadlocks.
- **Practiced**: Manual lock handling and timeout strategy.

### 5. Producer-Consumer Problem
- **Definition**: Coordinating producer and consumer threads.
- **Examples**:
  - wait()/notify()
  - ReentrantLock + Condition
  - BlockingQueue
- **Practiced**: All 3 variations, including multi-threaded buffering.

### 6. CountDownLatch
- **Definition**: Waits for a set of threads to complete before continuing.
- **Example**: Exam start simulation after all students are ready.
- **Practiced**: Launch gating for 3 threads.

### 7. CyclicBarrier
- **Definition**: Allows multiple threads to wait for each other.
- **Example**: Players waiting at starting line before running.
- **Practiced**: Multi-thread checkpoint simulation.

### 8. Semaphore
- **Definition**: Limit access to resources using permits.
- **Example**: Printer queue limited to 2 users at a time.
- **Practiced**: Controlled access with permit release and acquire.

### 9. Exchanger
- **Definition**: Exchanging data between two threads.
- **Example**: Friends swapping lists of shopping items.
- **Practiced**: Used generic Exchanger with objects.

## 🧠 Additional Topics Implemented
- Thread naming and logging
- Thread.sleep, join
- Real-world analogies and use-cases

---

## 📁 How to Use
Clone this repo and explore each folder named after the topic. Each section contains:
- Example code
- Assignment/problem simulation
- Output walkthrough

---

## 🚀 What's Next?
Planned additions include:
- `volatile` keyword and visibility issues
- `ThreadLocal` and per-thread data
- `ExecutorService`, `Callable`, `Future`
- `CompletableFuture` async chaining
- ForkJoinPool, Java Memory Model, Deadlocks

Happy multithreading! 💻🧵
