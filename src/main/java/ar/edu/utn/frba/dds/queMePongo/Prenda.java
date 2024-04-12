package ar.edu.utn.frba.dds.queMePongo;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario) {
    if (tipoPrenda == null || material == null || colorPrimario == null) {
      throw new PrendaInvalidaException("Los datos de la prenda no fueron cargados" +
          "correctamente");
    }
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
  }

  private TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void Categoria obtenerCategoria() {
    return tipoPrenda.obtenerCategoria();
  }
}