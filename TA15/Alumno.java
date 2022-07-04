package TA15;

public class Alumno extends Persona {
    protected int codigo;
    Alumno(String nombres, String apellidos, Integer dni, Integer fechaNacimiento,Integer fechaActual, int codigo) {
        super(nombres, apellidos, dni, fechaNacimiento, fechaActual);
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void mostrarDatos(){
        System.out.println ("Estudiante: " + getNombres() + " " +  getApellidos() + "\n"+
                "Codigo de Estudiante: " + getCodigo()
                +"\n"+"DNI de Estudiante:"+getDni());}
    @Override
    public Integer calcularEdad(){
        int edad;
        edad = getFechaActual() - getFechaNacimiento();
        System.out.println("Su edad es:"+edad);
        return edad;
    }

    public void listarAlumno() {
    }
}