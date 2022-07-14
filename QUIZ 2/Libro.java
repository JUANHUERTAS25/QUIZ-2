public class Libro
{
    protected String nombreLibro;
    protected String autorLibro1;
    protected String autorLibro2;
    protected int cantidadAutores;
    protected int anioEdicion;
    protected Boolean tipoEdicion;
    

    
    public Libro()
    {

    }

    public Libro(String nombreLibro, String autorLibro1, int anioEdicion, Boolean tipoEdicion, String coleccion)
    {
        this.nombreLibro = nombreLibro;
        this.autorLibro1 = autorLibro1;
        this.anioEdicion = anioEdicion;
        this.tipoEdicion = tipoEdicion;
        
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutorLibro() {
        return autorLibro1;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro1 = autorLibro;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public Boolean getTipoEdicion() {
        return tipoEdicion;
    }

    public void setTipoEdicion(Boolean tipoEdicion) {
        this.tipoEdicion = tipoEdicion;
    }
    
    public String toString()
    {
        return "El nombre del libro es: " + nombreLibro + ", el autor del libro es: " + autorLibro1 + " el año de edición es: " + anioEdicion + " , el tipo de edición es: " + tipoEdicion;
    }

}