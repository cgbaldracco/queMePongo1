package ar.edu.utn.frba.dds.queMePongo;

public class ColorInvalidoException extends RuntimeException {
  public ColorInvalidoException(String causa) {
    super(causa);
  }
}