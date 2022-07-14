public class TestLibros 
{
    private Boolean coleccion = true;
    public static void main(String[] args) 
    {
        Libro libro = new Libro("Las aventuras de pepito","Juan Huertas", 1985, true, "si");
        System.out.println(libro.toString());
        
        LibroColeccion libro2 = new LibroColeccion("fsfsd","Luis ifa", 2005, false);
        System.out.println(libro2.toString());
    }
    
}
