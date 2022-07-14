public class LibroColeccion extends Libro{
    //Atributos
    

    public LibroColeccion()
    {

    }

    public LibroColeccion(String n, String a, int anio, boolean tipoEdicion)
    {
           setNombreLibro(n);
           setAutorLibro(a);
           setAnioEdicion(anio);
           setTipoEdicion(tipoEdicion);
    }

    public String toString()
    {
        return "Datos del libro de colección " + nombreLibro + " el autor del libro es: " + autorLibro1 + " ";
    }

}
