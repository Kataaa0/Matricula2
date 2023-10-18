public class Materia {
    private String nombre="";
    private int codigo = 0;
    private int numeroHoras = 0;
    private Profesor Profesor1;
    private Profesor Profesor2;
    private Profesor Profesor3;
    public Materia(){

    }


    public Materia(String nombre, int codigo, int numeroHoras, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numeroHoras = numeroHoras;
        Profesor1 = profesor1;
        Profesor2 = profesor2;
        Profesor3 = profesor3;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public Profesor getProfesor1() {
        return Profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        Profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return Profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        Profesor2 = profesor2;
    }

    public Profesor getProfesor3() {
        return Profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        Profesor3 = profesor3;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;






    }
}