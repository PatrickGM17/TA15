package TA15;

public class Main
{
    public static void main(String args[])
    {
        DocenteControlador  docenteControlador = new DocenteControlador(2);
        docenteControlador.crear("Maria","Pilar", 56985666, 1993, 2022, "doctorado", " Maestro");
        docenteControlador.crear("Juan","Vasquez", 65546672, 1997, 2022, "doctorado", "Diseniador");

        System.out.println("------------- Lista de Docente -------------");
        docenteControlador.listar2();

        System.out.println("------------- Buscar Docente -------------");

        int dni = 65546679;

        Docente encontrado;

        encontrado = docenteControlador.buscar(dni);

        if(encontrado != null)
        {
            System.out.println("docente encontrado: "+encontrado.getNombres());
        }
        else {

            System.out.println("No se encontro: "+dni);
        }

        AlumnoControlador  alumnoControlador = new AlumnoControlador(2);
        alumnoControlador.crearAlumno("Jose", "Rojas", 656275783, 1998,2022, 2356768 );
        alumnoControlador.crearAlumno("Jordan", "Romero", 678279783, 1996,2022, 24556768 );

        System.out.println("------------- Lista de Estudiante -------------");
        alumnoControlador.listar();

        System.out.println("------------- Buscar Estudiante -------------");

        int dni1 = 656275783;

        Alumno eureka;

        eureka = alumnoControlador.buscarAlumno(dni1);

        if(eureka != null)
        {
            System.out.println("Alumno encontrado: "+eureka.getNombres());
        }
        else {

            System.out.println("No se encontro el alumno: "+dni1);
        }
    }
}