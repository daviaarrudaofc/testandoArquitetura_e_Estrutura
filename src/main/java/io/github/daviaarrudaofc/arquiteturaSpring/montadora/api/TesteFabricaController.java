package io.github.daviaarrudaofc.arquiteturaSpring.montadora.api;

import io.github.daviaarrudaofc.arquiteturaSpring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired//->pede um objeto ao Spring
    // Injeta nesta variável um objeto Motor que já foi criado e gerenciado pelo Spring.

    @Qualifier("motorTurbo")//-> especifica qual objeto usar quando existem vários Beans do mesmo tipo
    // Especifica qual Bean do tipo Motor o Spring deve injetar,
    // pois existem vários Beans do mesmo tipo.
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }
}
