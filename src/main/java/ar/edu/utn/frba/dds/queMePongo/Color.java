package ar.edu.utn.frba.dds.queMePongo;

public class Color {
  Integer rojo, verde, azul;

    public Color(Integer rojo, Integer verde, Integer azul) {
    if (rojo < 0 || rojo > 300 || verde < 0 || verde > 300 || azul < 0 || azul > 300) {
      throw new ColorInvalidoException("COLOR INVALIDO: Los colores deben estar " +
          "compuestos por un rgb, sus valores deben estar entre 0 y 300");
    }
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }
}