package andrei.paz.roupas.modelo;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Roupa {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String tamanho;

    @Getter @Setter
    private double valor;

    @Getter @Setter
    private String cor;

    @Getter @Setter
    private String marca;
}
