public class Estudiante {
    private double cedula;
    private String nombre;
    private int codigo=0;
    private String materia1="";
    private String materia2="";
    private String materia3="";


    public Estudiante(double cedula, String nombre) {

    }


    public Estudiante(double cedula, String nombre, int codigo, String materia1, String materia2, String materia3) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }
    public void imprimirMaterias(String nombreMateria) {
        System.out.println("El nombre de la materia1 es: " +materia1);
        System.out.println("El nombre de la materia2 es: " + materia2);
        System.out.println("El nombre de la materia3 es: " +materia3);
    }
    public void imprimirProfesores() {

        System.out.println("Nombre del profesor 1 de la Materia 1: ");
        System.out.println("Nombre del profesor 2 de la Materia 2: " );
        System.out.println("Nombre del profesor 3 de la Materia 3: " );
    }



    public void ingresarDatos() {

        System.out.println("Ingrese el nombre del estudiante: ");


    }

    public double getCedula() {
            return cedula;
        }
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public void setCedula(double cedula) {
            this.cedula = cedula;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }
}
