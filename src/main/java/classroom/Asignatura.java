package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
    }

    Asignatura(int codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, 0,tipo);
    }

    Asignatura(Tipo tipo) {
        this("Sin nombre",tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno, int codigoInterno) {
        this.codigoExterno = codigoExterno;
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
