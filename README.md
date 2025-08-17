# Evidencia **GA7-220501096-AA2-EV01**

## Descripción
Evidencia **GA7-220501096-AA2-EV01**. Es un módulo Java con JDBC que gestiona una tabla de estudiantes en MySQL usando NetBeans y XAMPP. Permite:
- Crear: Inserta un estudiante (nombre, edad, email).
- Leer: Lista todos los estudiantes.
- Actualizar: Modifica un estudiante por ID.
- Eliminar: Borra un estudiante por ID.

## Estructura
```
CodificacionDeModulosDelSofware_JDBC/
├── src/com/example/studentmanagement/
│   ├── DatabaseConnection.java  # Conexión a MySQL
│   ├── Student.java            # Modelo de estudiante
│   ├── StudentDAO.java         # Operaciones CRUD
│   ├── Main.java               # Correr las operaciones
├── Libraries/
│   └── mysql-connector-java.jar
├── README.md                  
```

## Configuración
**Base de Datos**:
   - Iniciar MySQL en XAMPP (Panel de Control > Start MySQL).
   - En phpMyAdmin (`http://localhost/phpmyadmin`), crear:
     ```sql
     CREATE DATABASE student_db;
     USE student_db;
     CREATE TABLE students (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(100) NOT NULL,
         age INT NOT NULL,
         email VARCHAR(100) UNIQUE NOT NULL
     );
     ```

## Ejecución
1. En NetBeans, abrir `Main.java` (`src/com/example/studentmanagement`).
2. Clic derecho > Run File.
3. Salida esperada:
   ```
   Estudiante insertado exitosamente.
   Estudiantes:
   ID: 1, Name: Juan Perez, Age: 20, Email: juan@example.com
   Estudiante actualizado exitosamente.
   Estudiante eliminado exitosamente.
   ```
