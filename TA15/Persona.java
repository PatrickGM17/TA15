package TA15;

public abstract class Persona{
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected int fechaNacimiento;
    protected int fechaActual;

    Persona(String nombre, String apellido, int dni, Integer fechaNacimiento, Integer fechaActual){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = this.dni;
        this.fechaNacimiento = this.fechaNacimiento;
        this.fechaActual = this.fechaActual;

    }
    public String getApellidos() {
        return apellidos;
    }
    public int getDni() {
        return dni;
    }
    public int getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getNombres() {
        return nombres;
    }
    public int getFechaActual() {
        return fechaActual;
    }

    public Integer calcularEdad(){
        int edad;
        edad = getFechaActual() - getFechaNacimiento();
        return edad;
    }
}