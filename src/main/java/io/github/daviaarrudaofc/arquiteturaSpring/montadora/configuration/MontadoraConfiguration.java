package io.github.daviaarrudaofc.arquiteturaSpring.montadora.configuration;

import io.github.daviaarrudaofc.arquiteturaSpring.montadora.Motor;
import io.github.daviaarrudaofc.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// Diz ao Spring que esta classe contém configurações da aplicação
// e métodos responsáveis por criar objetos que serão gerenciados pelo Spring.
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    // Cria um objeto e registra esse objeto no Spring.
    // Depois, o Spring pode reutilizar/injetar esse Motor em outras classes.
    //@Primary // é o bean primario,se caso tiver mais de um Bean e não tiver especificado qual usar,esse que sera usado
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-40");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Primary // é o bean primario,se caso tiver mais de um Bean e não tiver especificado qual usar,esse que sera usado
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
