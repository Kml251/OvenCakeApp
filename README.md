# Cake Oven Management Application 🍰

This Java Swing application simulates a bakery oven management system.
The oven can hold up to five cakes, and each cake includes a name, weight, best-before date, and timestamp 
when it was placed in the oven. 
The system uses a Queue (FIFO) data structure to model how cakes are handled in the oven.

---

## 🔧 Features

- Add a new cake with name, weight, and expiry date
- Automatically records when the cake was placed in the oven
- Prevents adding more than 5 cakes (capacity limit)
- Remove the oldest cake (FIFO)
- Peek at the front cake without removing it
- Display all cakes currently in the oven
- Validation for empty fields, invalid data, and best-before limit (max 14 days)
- GUI interface built with Java Swing

---

## 🛠 Technologies Used

- Java 17
- Java Swing (GUI)
- Java Collections (ArrayList for Queue logic)
- Git & GitHub (for version control)
- NetBeans IDE

---

## ▶️ How to Run

1. Clone this repository:
```bash
git clone https://github.com/Kml251/OvenCakeApp
