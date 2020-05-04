package andrei.paz.roupas.controle;

import andrei.paz.roupas.modelo.Roupa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class RoupaControle {

    @GetMapping("/camisetas")
    public ArrayList<Roupa> getCamisetas() {
        Roupa camiseta1 = new Roupa();
        camiseta1.setNome("Camiseta Poliester");
        camiseta1.setTamanho("P");
        camiseta1.setCor("azul");
        camiseta1.setMarca("Gang");
        camiseta1.setValor(29.90);

        Roupa camiseta2 = new Roupa();
        camiseta2.setNome("Regata");
        camiseta2.setTamanho("M");
        camiseta2.setCor("Verde claro");
        camiseta2.setMarca("Adidas");
        camiseta2.setValor(69.99);

        Roupa camiseta3 = new Roupa();
        camiseta3.setNome("Camiseta manga longa");
        camiseta3.setTamanho("G");
        camiseta3.setCor("Cinza");
        camiseta3.setMarca("Nike");
        camiseta3.setValor(99.00);

        ArrayList<Roupa> lista1 = new ArrayList<>();

        lista1.add(camiseta1);
        lista1.add(camiseta2);
        lista1.add(camiseta3);

        return lista1;
    }

    @GetMapping("/calcas")
    public ArrayList<Roupa> getCalcas() {
        Roupa calca1 = new Roupa();
        calca1.setNome("Calça Jeans");
        calca1.setTamanho("38");
        calca1.setCor("azul claro");
        calca1.setMarca("Gang");
        calca1.setValor(300.00);

        Roupa calca2 = new Roupa();
        calca2.setNome("Calça Moletom");
        calca2.setTamanho("36");
        calca2.setCor("Preta");
        calca2.setMarca("Adidas");
        calca2.setValor(99.99);

        Roupa calca3 = new Roupa();
        calca3.setNome("Calça moletom");
        calca3.setTamanho("40");
        calca3.setCor("Cinza");
        calca3.setMarca("Rebook");
        calca3.setValor(109.00);

        ArrayList<Roupa> lista2 = new ArrayList<>();

        lista2.add(calca1);
        lista2.add(calca2);
        lista2.add(calca3);

        return lista2;

    }
}