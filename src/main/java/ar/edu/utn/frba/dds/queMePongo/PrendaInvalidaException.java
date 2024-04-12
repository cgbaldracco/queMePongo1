package ar.edu.utn.frba.dds.queMePongo;

public class PrendaInvalidaException extends RuntimeException {
  public PrendaInvalidaException(String causa) {
    super(causa);
  }
}