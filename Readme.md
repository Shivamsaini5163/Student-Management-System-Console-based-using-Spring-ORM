# <a name="xc6a36885c44882cbb3f59d1b10d5a9451bb02ba"></a>Student Management System – Console App using Spring ORM (Hibernate)


A **menu‑driven console application** that demonstrates full **CRUD** (Create, Read, Update, Delete) functionality for managing student records. Built with **Spring Framework’s ORM module** and **Hibernate** to perform object‑relational mapping with a **MySQL** database.

-----
## <a name="key-features"></a>✨ Key Features
- **Add, view, update, and delete** students from the database
- Clean separation of concerns via **DAO pattern**
- **Spring IoC container** for dependency injection (XML configuration)
- **Hibernate** for transparent ORM and SQL generation
- **Maven** for dependency management and builds
- **Console UI** with a simple menu (BufferedReader)
-----
## <a name="tech-stack"></a>🛠️ Tech Stack

|Layer|Technology|
| :- | :- |
|Language|Java 17+|
|Framework|Spring Framework (Core, ORM)|
|ORM|Hibernate 5|
|Database|MySQL 8|
|Build Tool|Maven|
|IDE |` `Eclipse|

-----
## <a name="project-structure"></a>📁 Project Structure
spring\_orm/
` `├─ src/main/java/
` `│  ├─ org/project/orm/
` `│  │   └─ App.java          # Main console program
` `│  ├─ org/project/orm/dao/
` `│  │   ├─ StudentDao.java   # DAO interface
` `│  │   └─ StudentDaoImpl.java
` `│  ├─ org/project/orm/entities/
` `│  │   └─ Student.java      # JPA entity
` `│  └─ ...
` `├─ src/main/resources/
` `│  └─ config.xml            # Spring bean configuration
` `├─ pom.xml
` `└─ README.md

-----
## <a name="prerequisites"></a>⚙️ Prerequisites
- **JDK 17** or higher
- **Maven 3.9** or higher
- **MySQL 8** (or compatible version)
-----
## <a name="getting-started"></a>🚀 Getting Started
1. **Clone the repository**

   git clone https://github.com/ Shivamsaini5163/Student-Management-System-Console-based-using-Spring-ORM.git
   cd Student-Management-System-Console-based-using-Spring-ORM
1. **Configure the database**
   - Create a MySQL schema, e.g. studentdb.
   - Update connection properties in config.xml (URL, username, password).
1. **Build the project**

   mvn clean package
1. **Run the application**

   mvn exec:java -Dexec.mainClass="org.project.orm.App"
   *# or simply run App.java from your IDE*

You’ll see a menu like:

\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*
Press 1 for add new Student
Press 2 for display all Students
Press 3 for get detail of single Student
Press 4 for delete Student
Press 5 for update Student
Press 6 for exit
\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*

Enter the desired option number and follow the prompts.

-----
## <a name="screenshots"></a>🖼️ Screenshot
![Add Student](https://github.com/Shivamsaini5163/Student-Management-System-Console-based-using-Spring-ORM/blob/main/image.png)

-----
## <a name="future-improvements"></a>🧩 Future Improvements
- Switch to **Spring Boot** for easier configuration
- Add **JUnit / Mockito** tests
- Provide **RESTful API** layer
- Integrate **Docker** for containerized deployment
- Add **pagination & sorting** for large datasets
-----
