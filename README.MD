# 🔢 Gerador Congruente Linear em Java

Este projeto implementa um **gerador de números pseudoaleatórios**, utilizando o método dos **congruentes lineares** — uma técnica clássica e didática baseada em aritmética modular.

## 📌 Fórmula utilizada

X(n+1) = (a * Xn + c) mod M

Com os seguintes parâmetros:

- `a = 4` → multiplicador  
- `c = 4` → incremento  
- `M = 9` → módulo  
- `X₀ = 7` → semente inicial

## ▶️ Execução

Para rodar:

```bash
javac src/GeradorCongruenteLinear.java
java -cp src GeradorCongruenteLinear
