# Exam Management Software for 8-4-4 Curriculum

This is an exam management software designed specifically for Kenyan schools following the 8-4-4 curriculum. The software provides functionalities for recording, analyzing, and reporting student marks. It is developed using Java Swing for the user interface and MySQL database for storing data.

## Features
- **User Authentication:** Secure login system for administrators, teachers, and other authorized personnel.
- **Student Management:** Add, edit, and delete student profiles including their personal details and academic information.
- **Exam Management:** Create exams specifying details such as subject, date, duration, and maximum marks.
- **Mark Entry:** Input and record marks obtained by students in various subjects for each exam.
- **Analysis Tools:** Generate statistical analysis reports to assess student performance across exams and subjects. Includes features like mean, median, mode, standard deviation, and grade distribution.
- **Grade Calculation:** Automatically calculate grades based on pre-defined grading criteria for the 8-4-4 curriculum.
- **Reporting:** Generate comprehensive reports for individual students, classes, or the entire school. Reports can be exported in various formats such as PDF or Excel.
- **Data Backup and Restore:** Ensure data integrity with the ability to backup and restore the database.

## Installation
1. Clone the repository to your local machine:
```bash
git clone https://github.com/derroh/Exam-Management-Software.git
 ```
2. Import the project into your preferred Java IDE.
3. Set up a MySQL database and import the provided SQL schema to create the necessary tables.
4. Update the database connection settings in the Java code to point to your MySQL database.
5. Compile and run the application

## Usage
- **Login:** Use your credentials to log in as an administrator or teacher.
- **Manage Students:** Add, edit, or delete student profiles as necessary.
- **Manage Exams:** Create exams by providing relevant details such as subject, date, and maximum marks.
- **Enter Marks:** Enter marks obtained by students for each exam.
- **Generate Reports:** Utilize the analysis tools to generate reports on student performance.
- **Backup and Restore:** Regularly backup your database to prevent data loss. Restore data from backups if needed.

## Technologies Used
- Java Swing: For the graphical user interface.
- MySQL: For storing and managing data.
- JDBC: For database connectivity.

## License
This Exam Management Software is open-source software licensed under the MIT license.
