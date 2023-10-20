public class Materia {
    private String nombre;
    private int codigo;
    private int numeroHoras;
    private String Profesor1;
    private String Profesor2;
    private String Profesor3;

    public Materia(String nombre, int codigo, int numeroHoras, String profesor1, String profesor2, String profesor3) {
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

    public String getProfesor1() {
        return Profesor1;
    }

    public void setProfesor1(String profesor1) {
        Profesor1 = profesor1;
    }

    public String getProfesor2() {
        return Profesor2;
    }

    public void setProfesor2(String profesor2) {
        Profesor2 = profesor2;
    }

    public String getProfesor3() {
        return Profesor3;
    }

    public void setProfesor3(String profesor3) {
        Profesor3 = profesor3;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
        System.out.println("021");
        System.out.println("012");
        System.out.println("003");

    }
    public void ingresarMaterias() {
        this.nombre=nombre;

        System.out.println("Fisica: ");
        System.out.println("Calculo ");
        System.out.println("Comunicacion: ");

    }


    public void ingresarProfesor() {
        this.numeroHoras=numeroHoras;
        //"Ingrese el nombre de la materia1: ");
        System.out.println("2: ");
        System.out.println("3 ");
        System.out.println("2 ");

    }
}



    
   
