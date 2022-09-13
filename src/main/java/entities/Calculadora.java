package entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculadora {

    private String operacao;
    private Integer num1, num2;

    public int calcular(String operacao) {
        return switch (operacao) {
            case "x" -> num1 * num2;
            case "+" -> num1 + num2;
            case "/" -> num1 / num2;
            case "-" -> num1 - num2;
            default -> 0;
        };
    }
}
