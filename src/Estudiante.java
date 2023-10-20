public class Estudiante {
    private String cedula;
    private String nombre;
    private int codigo;
    private String materia1;
    private String materia2;
    private String materia3;




    public Estudiante(String cedula, String nombre, int codigo, String materia1, String materia2, String materia3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo= codigo;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

    public void imprimirMaterias() {
        System.out.println("Nombre de la materia 1: " + materia1);
        System.out.println("Nombre de la materia 2: " + materia2);
        System.out.println("Nombre de la materia 3: " + materia3);
    }

    public void ingresarProfesores() {
        System.out.println("Nombre del profesor de la materia 1: ");
        System.out.println("Nombre del profesor de la materia 2: ");
        System.out.println("Nombre del profesor de la materia 3: ");
    }

    public void ingresarDatos() {
        System.out.println("Ingrese el nombre del estudiante: ");
        System.out.println("Ingrese la cédula del estudiante: ");
        System.out.println("Ingrese el código del estudiante: ");
         
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    

    }

