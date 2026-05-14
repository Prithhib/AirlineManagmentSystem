# ✈️ Airline Management System

A Java-based desktop application for managing core airline operations, including flight scheduling, passenger booking, and ticket management. Built using Java SE and developed with the NetBeans IDE.

---

## 📋 Table of Contents

- [About](#about)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Building the Project](#building-the-project)
- [Running the Application](#running-the-application)
- [License](#license)

---

## About

The **Airline Management System** is a desktop application designed to simulate and manage essential airline operations. It provides an interface for administrators to handle flights, passengers, and bookings efficiently — making it suitable as an academic project or a foundation for a more complete airline operations tool.

---

## Features

- 🛫 **Flight Management** — Add, update, and remove flight records
- 👤 **Passenger Management** — Register and manage passenger information
- 🎟️ **Ticket Booking** — Book and cancel tickets for passengers
- 📋 **Booking Records** — View and track all reservations
- 🖥️ **Desktop GUI** — User-friendly graphical interface built with Java Swing

---

## Tech Stack

| Technology | Details |
|---|---|
| Language | Java SE |
| IDE | NetBeans |
| Build Tool | Apache Ant (`build.xml`) |
| GUI Framework | Java Swing |
| Output | Executable JAR (`dist/`) |

---

## Project Structure

```
AirlineManagmentSystem/
├── src/                  # Java source files
├── build/                # Compiled class files (generated)
├── dist/                 # Distributable JAR file (generated)
├── nbproject/            # NetBeans project configuration
├── build.xml             # Apache Ant build script
├── manifest.mf           # JAR manifest file
└── LICENSE               # GPL-3.0 License
```

---

## Prerequisites

Make sure you have the following installed:

- **Java Development Kit (JDK)** 8 or higher
  - [Download JDK](https://www.oracle.com/java/technologies/downloads/)
- **Apache Ant** (for command-line builds) — or use **NetBeans IDE** directly
  - [Download Ant](https://ant.apache.org/)
- *(Optional)* **NetBeans IDE** for opening and editing the project
  - [Download NetBeans](https://netbeans.apache.org/)

---

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Prithhib/AirlineManagmentSystem.git
cd AirlineManagmentSystem
```

### Open in NetBeans

1. Launch **NetBeans IDE**
2. Go to **File → Open Project**
3. Navigate to the cloned folder and select it
4. Click **Open Project**

---

## Building the Project

### Using NetBeans

Right-click the project in the Projects panel and select **Clean and Build**.

### Using Apache Ant (Command Line)

```bash
ant clean build
```

The compiled output will be placed in the `build/` directory and the runnable JAR will be generated inside `dist/`.

---

## Running the Application

### From NetBeans

Click the **Run** button (▶) or press `F6`.

### From the Command Line

After building, run the generated JAR:

```bash
java -jar dist/AirlineManagmentSystem.jar
```

---


## Author

**Prithhib** — [GitHub Profile](https://github.com/Prithhib)
