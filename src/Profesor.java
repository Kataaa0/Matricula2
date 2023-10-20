public class Profesor {
    private String nombre;
    private int codigoP=0;
    private String  cedula="";

    public Profesor(String nombre, String cedula, int codigoP) {
        this.nombre = nombre;
        this.codigoP = codigoP;
        this.cedula = cedula;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }


    public void ingresarDatos() {
        //System.out.println("Ingrese el nombre del profesor: ");
        this.nombre = "Rafael";
        //System.out.println("Ingrese la cédula del profesor: ");
        this.cedula ="0963204185";
        //System.out.println("Ingrese el código del profesor: ");
        //this.codigoP = "58"
    }

    public void ingresarDatosp2() {
        this.nombre = "Santiago";
        this.cedula ="0963204185";
        //this.codigoP = "58"
    }
}
