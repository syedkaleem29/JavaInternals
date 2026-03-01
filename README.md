# ☕ Java Learning Hub

A structured, hands-on repository for mastering core Java concepts — from fundamentals to advanced topics. Each concept includes personal notes, code examples, and practice exercises.

## 📂 Project Structure

```
java-learning/
├── pom.xml
├── docs/
│   ├── streams/
│   │   └── streams-notes.md
│   ├── collections/
│   │   └── collections-notes.md
│   ├── concurrency/
│   │   └── concurrency-notes.md
│   └── ...
└── src/
    └── main/java/com/learning/
        ├── streams/
        ├── collections/
        ├── concurrency/
        └── ...
```

- **`docs/`** — Concept notes, cheat sheets, and key takeaways written in my own words.
- **`src/`** — Runnable Java files organized by topic. Each class has its own `main` method for independent execution.

## 📖 Topics Covered

| Topic | Status | Notes | Code |
|-------|--------|-------|------|
| Streams | 🟡 In Progress | [Notes](docs/streams/streams-notes.md) | [Code](src/main/java/com/learning/streams/) |
| Collections | 🟢 Complete | — | — |
| Concurrency | ⬜ Planned | — | — |

> 🟢 Complete &nbsp; 🟡 In Progress &nbsp; ⬜ Planned

## 🚀 How to Run

**Prerequisites:** Java 17+, Gradle

```bash
# Clone the repo
git clone https://github.com/<your-username>/java-learning.git
cd java-learning

# Compile
gradle build

# Run any class
gradle run -PmainClass=com.learning.streams.StreamBasics
```

Or compile and run directly:

```bash
javac -d target src/main/java/com/learning/streams/StreamBasics.java
java -cp target com.learning.streams.StreamBasics
```

## 🧠 Approach

This repo is my learning journal. The goal isn't perfection — it's consistency and depth.

- **Notes** are written in my own words after reading docs, tutorials, and source code. They focus on the "why" and edge cases, not just syntax.
- **Code** is intentionally simple and focused. Each file explores a specific concept with inline comments explaining what's happening.
- **Mistakes and iterations** are part of the process. Commit history reflects real learning, not curated highlights.

## 🔗 Resources I'm Learning From

- [Official Java Documentation](https://docs.oracle.com/en/java/)
- [Baeldung](https://www.baeldung.com/)
- [Java Design Patterns](https://java-design-patterns.com/)

## 📝 License

This project is for personal learning purposes. Feel free to reference or fork it for your own studies.