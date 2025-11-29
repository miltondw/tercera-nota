# Sistema de Ejercicios de Programación en Java

Este proyecto contiene una colección completa de ejercicios de programación en Java organizados por unidades temáticas, con un menú interactivo mejorado para una mejor experiencia de usuario.

## 📁 Estructura del Proyecto

```
src/
├── App.java                    # Menú principal del sistema
├── UI/
│   └── MenuDesign.java        # Utilidades de diseño para la terminal
├── Unit1/                     # Ejercicios de la Unidad 1
│   ├── ArithmeticOperators/
│   ├── Arrays/
│   ├── ControlStructure/
│   ├── Loop/
│   ├── Operators/
│   └── Sistem_IO/
└── Unit2/                     # Ejercicios de la Unidad 2
    ├── Arrays/               # Ejercicios con arrays unidimensionales
    ├── Matrices/             # Ejercicios con matrices bidimensionales
    └── Methods/              # Ejemplos de paso de parámetros
```

## 🎯 Unidad 1 - Fundamentos de Programación

### Temas cubiertos:
- Variables y tipos de datos
- Operaciones aritméticas
- Estructuras de control (if/else, switch)
- Bucles (for, while)
- Operadores lógicos y relacionales
- Entrada y salida de datos

### Ejercicios incluidos:
1. Variables del usuario con valores asignados
2. Solicitud de valores al usuario
3. Operaciones aritméticas
4. Descuento en tienda de ropa
5. Retiros bancarios
6. Media de tres números
7. Comparación de tres números
8. Lista de lenguajes de programación
9. Mayor de tres números
10. Contador de números pares
11. Calculadora interactiva
12. Factorial de un número
13. Tabla de multiplicar

## 🎯 Unidad 2 - Estructuras de Datos

### Arrays Unidimensionales (9 ejercicios)

1. **PowerCalculator** - Calcula cuadrados y cubos de números
2. **ReverseArrayCopy** - Copia y invierte un array de cadenas
3. **GradeAnalyzer** - Analiza notas (mayor, menor, media)
4. **PositiveNumberValidator** - Valida números positivos con salida temprana
5. **ArraySorter** - Ordena arrays usando `Arrays.sort()`
6. **MonthDaysSelector** - Sistema de consulta de días por mes
7. **VectorSumCalculator** - Suma elemento a elemento de dos vectores
8. **StudentAgeManager** - Gestiona estudiantes con ArrayList
9. **TemperatureAnalyzer** - Analiza temperaturas semanales

### Matrices Bidimensionales (7 ejercicios)

1. **MatrixRowColumnSum** - Suma filas y columnas de matriz 5×5
2. **DiagonalMatrixGenerator** - Genera matriz con diagonal de unos
3. **BorderFrameMatrix** - Crea marco 5×15 con bordes
4. **DriverWeeklyKilometers** - Registra kilómetros semanales de conductores
5. **InventoryManagementSystem** - Sistema completo de inventario multi-sucursal
6. **SoccerPoolManager** - Administración de quiniela deportiva (15 partidos)
7. **UniversityGradeSystem** - Sistema de gestión de notas universitarias

### Métodos y Paso de Parámetros (5 ejemplos)

1. **PrimitiveValuePass** - Paso por valor con tipos primitivos
2. **VariableSwapExample** - Intento de intercambio de variables
3. **StringValuePass** - Inmutabilidad de Strings
4. **ArrayReferenceModification** - Modificación de arrays por referencia
5. **ObjectReassignmentExample** - Reasignación vs modificación de objetos

## 🎨 Características del Menú

El sistema incluye un menú interactivo con las siguientes características:

### Diseño Visual Mejorado
- ✅ Colores ANSI para mejor legibilidad
- ✅ Símbolos especiales (✓, ✗, →, ★)
- ✅ Separadores decorativos
- ✅ Títulos con marcos
- ✅ Organización por secciones

### Navegación
- Menú organizado por unidades y categorías
- Numeración secuencial de todos los ejercicios
- Validación de entrada con mensajes de error claros
- Opción de ejecutar múltiples ejercicios sin salir
- Limpieza de pantalla entre ejecuciones

### Mensajes Informativos
- **Success** (verde): Operaciones exitosas
- **Error** (rojo): Errores y validaciones
- **Info** (azul): Información general
- **Prompt** (púrpura): Solicitud de entrada

## 🚀 Cómo Ejecutar

### Compilar el proyecto:
```bash
javac -d bin src/App.java
```

### Ejecutar el menú principal:
```bash
java -cp bin App
```

### Ejecutar un ejercicio específico directamente:
```bash
# Ejemplo: Ejecutar PowerCalculator
java -cp bin Unit2.Arrays.PowerCalculator
```

## 📝 Convenciones de Código

- **Nombres descriptivos**: Todos los archivos usan nombres en inglés que describen claramente su función
- **Estructura de paquetes**: Organización jerárquica por unidad y categoría
- **Método run()**: Cada ejercicio tiene un método estático `run()` o `run(Scanner sc)` para ser llamado desde el menú
- **Reutilización de Scanner**: El Scanner se pasa como parámetro para evitar cerrar System.in
- **Comentarios en español**: Los comentarios del código están en español para mejor comprensión

## 🎓 Propósito Académico

Este proyecto fue creado con fines educativos para:
- Practicar fundamentos de programación en Java
- Aprender sobre estructuras de datos básicas
- Entender el paso de parámetros por valor y referencia
- Desarrollar habilidades de diseño de interfaces de usuario en consola
- Organizar código en proyectos modulares

## 📋 Requisitos

- Java 8 o superior
- Terminal con soporte para códigos ANSI (para colores)
- Sistema operativo: Windows, Linux o macOS

## 🔧 Tecnologías Utilizadas

- **Java SE**: Lenguaje de programación principal
- **Scanner**: Para entrada de datos del usuario
- **Arrays y ArrayList**: Estructuras de datos
- **ANSI Escape Codes**: Para colores y formato en terminal

## 👨‍💻 Autor

Proyecto desarrollado como parte del curso de Programación en Java.

---

**Nota**: Para una mejor experiencia visual, se recomienda ejecutar en una terminal que soporte códigos de escape ANSI (la mayoría de terminales modernas lo soportan).
