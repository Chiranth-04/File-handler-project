# File-handler-project
# Java Maven Project for File Handling

## Project Overview
This project is a Java Maven application that focuses on handling text and Excel files. The application provides functionalities to read from and write to text files and Excel files.

## Project Structure
The project is organized into two main packages:

1. **Text File Handling**
   - `com.tripillar.filehandling.text`
     - `ReadTextFile.java`: Responsible for reading text files.
     - `WriteTextFile.java`: Responsible for writing to text files.

2. **Excel File Handling**
   - `com.tripillar.filehandling.excel`
     - `ReadExcelFile.java`: Responsible for reading Excel files.
     - `WriteExcelFile.java`: Responsible for writing to Excel files.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven 3.x
- Eclipse IDE (recommended: Eclipse IDE for Java Developers)

### Project Setup in Eclipse
1. **Install Eclipse**:
   - Download Eclipse from the [Eclipse official website](https://www.eclipse.org/downloads/).
   - Install Eclipse IDE for Java Developers.

2. **Create a New Maven Project**:
   - Open Eclipse and go to `File` > `New` > `Project...`.
   - Select `Maven Project` and click `Next`.
   - Choose `Create a simple project (skip archetype selection)` and click `Next`.
   - Fill in the details:
     - **Group ID**: `com.tripillar.filehandling`
     - **Artifact ID**: `FileHandlingProject`
     - **Version**: `1.0-SNAPSHOT`
   - Click `Finish`.

3. **Set Up Directory Structure**:
   - Right-click on `src/main/java` and select `New` > `Package`.
   - Create the following packages:
     - `com.tripillar.filehandling.text`
     - `com.tripillar.filehandling.excel`

4. **Add Dependencies**:
   Open `pom.xml` and add the following dependencies for Apache POI to handle Excel files:

   ```xml
   <dependencies>
       <!-- Apache POI dependencies for Excel file handling -->
       <dependency>
           <groupId>org.apache.poi</groupId>
           <artifactId>poi</artifactId>
           <version>5.2.3</version> <!-- Use the latest version -->
       </dependency>
       <dependency>
           <groupId>org.apache.poi</groupId>
           <artifactId>poi-ooxml</artifactId>
           <version>5.2.3</version> <!-- Use the latest version -->
       </dependency>
       <dependency>
           <groupId>org.apache.commons</groupId>
           <artifactId>commons-collections4</artifactId>
           <version>4.4</version> <!-- Use the latest version -->
       </dependency>
   </dependencies>
# Then add codes to the created class and run those clases
