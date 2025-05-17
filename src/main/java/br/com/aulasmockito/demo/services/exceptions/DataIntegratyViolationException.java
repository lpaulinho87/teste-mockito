package br.com.aulasmockito.demo.services.exceptions;

public class DataIntegratyViolationException extends RuntimeException {
    public DataIntegratyViolationException(String message) {

        super(message);
    }
}
