package io.github.daviaarrudaofc.arquiteturaSpring.montadora.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD}) // serve para todos os casos,caso for usado,tipo classe,metodo..
@Qualifier("motorAspirado")
public @interface Aspirado {

}
