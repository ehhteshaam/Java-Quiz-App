# **Java Quiz Application**

A **Java-based GUI quiz application** that provides an engaging and interactive way for users to test their knowledge. The application features multiple-choice questions, a timer, and a score display, offering a fun and challenging quiz experience.

---

## **Features**
- **User-Friendly GUI**: Designed using Java Swing for a visually appealing and intuitive interface.
- **User Login**: Users can enter their name and start the quiz with a personalized experience.
- **Interactive Rules Page**: Displays quiz rules before the user begins.
- **Timed Questions**: Each question comes with a countdown timer to add excitement and challenge.
- **Multiple-Choice Questions**: Users can select their answers from four options for each question.
- **50-50 Lifeline**: Users can eliminate two incorrect options to improve their chances of answering correctly.
- **Dynamic Score Calculation**: Scores are displayed at the end based on correct answers.

---

## **Project Structure**
- **Login.java**: The entry point of the application. Manages user login and navigation to the rules page.
- **Rules.java**: Displays the rules of the quiz to the user.
- **Quiz.java**: Contains the main quiz functionality, including question display, timer, and answer handling.
- **Score.java**: Displays the final score and congratulates the user.

---

## **How to Run**
1. Compile all the `.java` files:
   ```bash
   javac Login.java Rules.java Quiz.java Score.java
   ```
2. Run the `Login` class to start the application:
   ```bash
   java Login
   ```
3. Follow the instructions on the GUI to complete the quiz.

---

## **Technologies Used**
- **Programming Language**: Java
- **Framework**: Java Swing (for GUI)
- **Concepts**: Object-Oriented Programming (OOP)

---

## **Future Enhancements**
- Adding more question sets or categories.
- Storing scores and user data in a database.
- Implementing a leaderboard feature to track top scores.
- Adding additional lifelines like "Ask a Friend" or "Audience Poll."

