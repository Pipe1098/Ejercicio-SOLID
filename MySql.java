package inversionDependencia;

public class MySql implements BaseDatos{
    @Override
    public void save(Object obj) {
        System.out.println("Guardado en sql");
    }
}
