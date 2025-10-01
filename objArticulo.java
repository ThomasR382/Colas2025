public class objArticulo{
    private int IdArticulo;
    private String NomArticulo;
    private String Categoria;
    private int Existencias;
    private int Estado;
    private Double Precio;
    
    public objArticulo() {
    }

    public int getIdArticulo() {
        return IdArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        IdArticulo = idArticulo;
    }

    public String getNomArticulo() {
        return NomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        NomArticulo = nomArticulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int  getExistencias() {
        return Existencias;
    }

    public void setExistencias(int existencias) {
        Existencias = existencias;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int estado) {
        Estado = estado;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    
    
}