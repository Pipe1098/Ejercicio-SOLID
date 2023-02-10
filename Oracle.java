package inversionDependencia;

public class Oracle implements BaseDatos{

    @Override
    public void save(Object obj) {
        System.out.println("Guardado en Oracle");
    }
}
