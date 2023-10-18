public class Profesor {
    private String nombre;
    private int codigoP=0;
    private int cedula=0;

    public Profesor(){

    }

    public Profesor(String nombre, int cedula, int codigoP) {
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

    public int getCedula() {

        return cedula;
    }



    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }


    public void ingresarDatos () {
        System.out.println("Ingrese el nombre del profesor1: ");
        System.out.println("Ingrese el nombre del profesor2: ");
        System.out.println("Ingrese el nombre del profesor3: ");
    }
}


