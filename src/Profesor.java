public class Profesor {
    private String nombre;
    private String codigoP;
    private String  cedula="";

    public Profesor(String nombre, String cedula, String codigoP) {
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

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }


    public void ingresarDatos() {
        this.nombre = "Rafael";
        this.cedula ="0963204185";
        this.codigoP = "58";
    }

    public void ingresarDatosp2() {
        this.nombre = "Santiago";
        this.cedula ="0963204185";
        this.codigoP = "25";
    }

    public void Ingresardatos3(){
        this.nombre = "Juan";
        this.cedula="1396875240";
        this.codigoP= "47";
    }
}
