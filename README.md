# BMI
A console program calculate a person's body mass index. The application requests the person's weight (in kilograms) and height (in meters). The body mass index (BMI) is calculated using the following formula:

> <span style="color:red">**BMI = weight / height<sup>2</sup>**</span>

Then, from the BMI obtained, it's possible to calculate whether a person has a normal weight, is underweight, is overweight, or is obese. To generate these results, the calculated BMI must be within the ranges in the table.

### BMI results table

| BMI        | Results 
| ---------- | ------------- |
| < 16       | Severe thinness  |
| 16 - 17    | Moderate thinness |
| 17 - 18,5  | Mild thinness  |
| 18,5 - 25  | Normal weight  |
| 25 - 30    | Overweight |
| 30 - 35    | Mild obesity |
| 35 - 40    | Moderate obesity  |
| >= 40      | Morbid obesity |

# Activity Diagramm
```mermaid
graph TD
    A((Inicio)) --> B[Solicitar peso en kilogramos]
    B --> C[Solicitar altura en metros]
    C --> D[Calcular IMC: IMC = peso / altura²]
    D --> E[Determinar clasificación del IMC]
    E --> F{Clasificación}
    
    F --> |IMC < 16| G[Delgadez severa]
    F --> |16 <= IMC < 17| H[Delgadez moderada]
    F --> |17 <= IMC < 18.5| I[Delgadez leve]
    F --> |18.5 <= IMC < 25| J[Peso normal]
    F --> |25 <= IMC < 30| K[Sobrepeso]
    F --> |30 <= IMC < 35| L[Obesidad leve]
    F --> |35 <= IMC < 40| M[Obesidad moderada]
    F --> |IMC >= 40| N[Obesidad mórbida]

    G --> O[Mostrar resultado y clasificación]
    H --> O
    I --> O
    J --> O
    K --> O
    L --> O
    M --> O
    N --> O

    O --> P((Fin))
```mermaid
