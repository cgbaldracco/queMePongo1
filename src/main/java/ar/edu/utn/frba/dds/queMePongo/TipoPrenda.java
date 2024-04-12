package ar.edu.utn.frba.dds.queMePongo;

public enum TipoPrenda {
  public abstract Categoria obtenerCategoria();

  REMERA {
    @Override
    public Categoria obtenerCategoria() { return PARTE_SUPERIOR }
  },
  PANTALON {
    @Override
    public Categoria obtenerCategoria() { return PARTE_INFERIOR }
  },
  BUZO {
    @Override
    public Categoria obtenerCategoria() { return PARTE_SUPERIOR }
  },
  CAMPERA {
    @Override
    public Categoria obtenerCategoria() { return ABRIGO }
  },
  ZAPATO {
    @Override
    public Categoria obtenerCategoria() { return CALZADO }
  },
  ZAPATILLA {
    @Override
    public Categoria obtenerCategoria() { return CALZADO }
  },
  BLUSA {
    @Override
    public Categoria obtenerCategoria() { return PARTE_SUPERIOR }
  },
  SHORT {
    @Override
    public Categoria obtenerCategoria() { return PARTE_INFERIOR }
  },
  MALLA {
    @Override
    public Categoria obtenerCategoria() { return PARTE_INFERIOR }
  },
  SANDALIA {
    @Override
    public Categoria obtenerCategoria() { return CALZADO }
  },
  AROS {
    @Override
    public Categoria obtenerCategoria() { return ACCESORIO }
  }
}