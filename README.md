# BMI
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
