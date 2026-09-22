package io.github.daviaarrudaofc.arquiteturaSpring.montadora.configuration;

import io.github.daviaarrudaofc.arquiteturaSpring.montadora.Motor;
import io.github.daviaarrudaofc.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Diz ao Spring que esta classe contém configurações da aplicação
// e métodos responsáveis por criar objetos que serão gerenciados pelo Spring.
public class MontadoraConfiguration {

    @Bean
    // Cria um objeto e registra esse objeto no Spring.
    // Depois, o Spring pode reutilizar/injetar esse Motor em outras classes.
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
