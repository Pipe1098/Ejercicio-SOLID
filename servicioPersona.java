package inversionDependencia;

public class servicioPersona {

    private BaseDatos baseDatos;

    public servicioPersona(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    public void savePerson(Persona person) {
        baseDatos.save(person);
    }
}
