//LITMAN ENRIQUE PORTILLO COLQUE

package miniproyecto; // Esto es el nombre del paquete donde está nuestro código

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

import java.util.ArrayList; // Importamos la clase ArrayList para manejar listas dinámicas

import java.util.HashMap; // Importamos la clase HashMap para manejar mapeos clave-valor

import java.util.Map; // Importamos la interfaz Map para trabajar con mapas







public class MiniProyecto {



  public static void main(String[] args) {

     

    try {

     

    Scanner scanner = new Scanner(System.in);

    boolean salir = false;

    while(!salir){

      // 1. Array --- 2. ArrayList --- 3. HashMap --- 8. Salir

      System.out.println("|--------------------------------------------------------------------------|");

      System.out.println("|       Entrevista de trabajo de una jugueteria                            |");

      System.out.println("|--------------------------------------------------------------------------|");

      System.out.println("| 1.- Entrevistadores - Equipo de recursos humanos                         |");

      System.out.println("| 2.- Informacion de los postulantes                                       |");

      System.out.println("| 3.- Experiencia y habiliades previas                                     |");

      System.out.println("| 4.- Conocimiento en el area                                              |");

      System.out.println("| 5.- Puntualidad - Nombre y Fecha de ingreso                              |");

      System.out.println("| 6.- Disponibilidad y Horario                                             |");

      System.out.println("| 7.- Lista de postulantes Aprobados y Rechazados para el puesto laboral   |");

      System.out.println("| 8.- Informe o Registro de los nuevos empleados                           |");

      System.out.println("| 9.- Fin de la entrevista                                                 |");

      System.out.println("|--------------------------------------------------------------------------|");

       

      System.out.println("");

      System.out.print( "Ingrese una opcion: ");

      

      int opcion = scanner.nextInt();

       

       

      switch(opcion) {

        case 1:

        System.out.println("LISTA DE ENTREVISTADORES - EQUIPO DE RECURSOS HUMANOS");

   

        String[] entrevistadores = {"Maria Lopez", "Juan Garcia", "Laura Martinez", "Pedro Rodriguez"};

        String[] especialidades = {"Psicologia", "Recursos Humanos", "Comunicacion", "Evaluacion Tecnica"};

   

        // Imprime los nombres de los entrevistadores junto con sus especialidades

         for (int i = 0; i < entrevistadores.length; i++) {

          System.out.println("Entrevistador: " + entrevistadores[i] + " - Especialidad: " + especialidades[i]);

        }

        break;

         

        case 2:

        System.out.println("INFORMACION ACERCA DE LOS POSTULANTES AL PUESTO DE TRABAJO");

           

          String[] nombres = {"Litman","Carlos","Daniel","Ariel","Estefany","Adrian","Ariana","Estevan"};

          String[] nro = {"Nro1. ","Nro2. ","Nro3. ","Nro4. ","Nro5. ","Nro6. ","Nro7. ","Nro8. "}; 

          int[] edades = {18,19,25,26,25,26,26,27};

          int[] dni = {71023465,71071435,71253789,71243264,71303546,71452376,71423548,71042253};

           

          //Imprime Arrays en filas

          System.out.println("Nombre, Nro, Edad y DNI: ");

          for (int i = 0; i < nombres.length; i++) {

            System.out.println(nro[i] + "" + nombres[i] + ", " + edades[i] + ", " + dni[i]);

          }

        break;

       

       

        case 3:

        System.out.println("EXPERIENCIA Y HABILIDADES PREVIAS DE LOS POSTULANTES");



        String[] nombres1 = {"Litman", "Carlos", "Daniel", "Ariel", "Estefany", "Adrian", "Ariana", "Estevan"};

        int[] edades1 = {18,19,25,26,25,26,26,27};



        // Imprimir experiencia y habilidades previas basadas en la edad

        for (int i = 0; i < nombres1.length; i++) {

        String habilidades;

        if (edades1[i] < 20) {

        habilidades = "Básicas: 2 años     HP: Buena comunicación, capacidad para aprender rápido";

         } else if (edades1[i] < 23) {

        habilidades = "Intermedias: 7 años   HP: Experiencia en atención al cliente, conocimientos básicos de ventas";

         } else if (edades1[i] < 26) {

        habilidades = "Avanzadas: 8 años    HP: Experiencia en gestión de inventario, habilidades de liderazgo";

         } else {

        habilidades = "Expertos: 9 años     HP: Experiencia en gestión de equipos, amplio conocimiento del mercado de juguetes";

        }

          System.out.println(nombres1[i] + ": " + habilidades);

      }

        break;   

         

        case 4:

         

        System.out.println("CONOCIMIENTO EN EL ÁREA DE VENTAS DE LOS POSTULANTES");

         

        String[] nombres2 = {"Litman", "Carlos", "Daniel", "Ariel", "Estefany", "Adrian", "Ariana", "Estevan"};

        int[] edades2 = {18,19,25,26,25,26,26,27};

        // Definir niveles de conocimiento en ventas basados en la edad

        for (int i = 0; i < nombres2.length; i++) {

          String conocimiento;

          if (edades2[i] < 20) {

           conocimiento = "Tiene potencial para desarrollar habilidades en ventas.";

          } else if (edades2[i] < 23) {

          conocimiento = "Posee algunas habilidades relacionadas con ventas.";

          } else if (edades2[i] < 26) {

          conocimiento = "Tiene experiencia y conocimiento en técnicas de venta.";

          } else {

          conocimiento = "Experto en ventas, con amplia experiencia y habilidades excepcionalmente dominadas.";

          }

          // Imprimir información resumida sobre el conocimiento en ventas

          System.out.println(nombres2[i] + ": Conocimiento en ventas - " + conocimiento);

        }

   



        break;

       

       

        case 5:

        System.out.println("PUNTUALIDAD - NOMBRE Y FECHA DE INGRESO");

         

        Map<String,String> empleado = new HashMap<>();

         

        //Insertando Data

        empleado.put("Litman Enrique Portillo Colque", "01/05/2024 - 08:30 AM");

        empleado.put("Daniel Armando Maradona Alvarez", "01/05/2024 - 09:00 AM");

        empleado.put("Adrian Eduardo Manolo Zantino", "01/05/2024 - 09:30 AM");

        empleado.put("Ariana Alberto Alcala de la Alameda", "01/05/2024 - 10:00 AM");

        empleado.put("Estevan Alberto Alcala de la Alameda", "01/05/2024 - 10:30 AM");

         

        //Imprimir las llaves (key) + capturar o recuperar un valor

        for(String key : empleado.keySet()){

           

          System.out.println("Nombre: "+ key);

          System.out.println("Fecha y Hora: "+ empleado.get("Litman Enrique Portillo Colque"));

          System.out.println("");

           

        }

        break;

       

        case 6:

        System.out.println("DISPONIBILIDAD Y HORARIO DE LOS POSTULANTES");



        // Definir horarios y disponibilidad aleatorios para cada postulante

        String[] horarios = {"Mañana", "Tarde", "Noche"};

        String[] disponibilidades = {"Por horas", "Medio Tiempo", "Tiempo Completo"};

        ArrayList<String> HorarioDisponibilidad = new ArrayList<>();

         

        //Agregar datos a la ArrayList == ListaNombres

        HorarioDisponibilidad.add("Litman");

        HorarioDisponibilidad.add("Carlos");

        HorarioDisponibilidad.add("Daniel");

        HorarioDisponibilidad.add("Ariel");

        HorarioDisponibilidad.add("Estefany");

        HorarioDisponibilidad.add("Adrian");

        HorarioDisponibilidad.add("Ariana");

        HorarioDisponibilidad.add("Estevan");

        String Aprobado1 = (HorarioDisponibilidad.get(0)+ ", " + HorarioDisponibilidad.get(2) + ", " + HorarioDisponibilidad.get(5) + ", " + HorarioDisponibilidad.get(6) + ", " + HorarioDisponibilidad.get(7));

             

        String Rechazado1 = (HorarioDisponibilidad.get(1) + ", " + HorarioDisponibilidad.get(3) + ", " + HorarioDisponibilidad.get(4));

           



          System.out.println("");

            System.out.println("Horarios y Disponibilidades: ");           

            System.out.println(horarios[0] + ", " + disponibilidades[2]);

            System.out.println("Participantes que eligen este horario y disponibilidad: "+ Aprobado1);

           

             

          System.out.println("");

            System.out.println("Horarios y Disponibilidades: ");           

            System.out.println(horarios[1] + ", " + disponibilidades[0]);

            System.out.println("Participantes que eligen este horario y disponibilidad: "+ Rechazado1);

           

         

        break;   

        case 7:

        System.out.println("LISTA DE POSTULANTES APROBADOS Y RECHAZADOS PARA EL PUESTO LABORAL");

         

        ArrayList<String> ListaNombres = new ArrayList<>();

         

        //Agregar datos a la ArrayList == ListaNombres

        ListaNombres.add("Litman");

        ListaNombres.add("Carlos");

        ListaNombres.add("Daniel");

        ListaNombres.add("Ariel");

        ListaNombres.add("Estefany");

        ListaNombres.add("Adrian");

        ListaNombres.add("Ariana");

        ListaNombres.add("Estevan");

        String ListaAprobados = (ListaNombres.get(0)+ ", " + ListaNombres.get(2) + ", " + ListaNombres.get(5) + ", " + ListaNombres.get(6) + ", " + ListaNombres.get(7));

          System.out.println("Postulantes que cumplieron todos los requisitos de esta prueba: " + ListaAprobados);

           

        String ListaRechazados = (ListaNombres.get(1) + ", " + ListaNombres.get(3) + ", " + ListaNombres.get(4));

          System.out.println("Postulantes que no cumplieron con los requisitos de esta prueba: " + ListaRechazados);

        

        //Longitud de la lista

        System.out.println("Tamaño Lista que pasaron la prueba de aptitud: "+ 5 + " nuevos empleados");

         

        break;

         

        case 8:

        System.out.println("INFORME O REGISTRO DE LOS NUEVOS EMPLEADOS");

        int Nro1 = 01; 

        int Nro2 = 02; 

        int Nro3 = 03;

        int Nro4 = 04;

        int Nro5 = 05;

         

        String Nombre1 = "Litman";

        String Nombre2 = "Daniel";

        String Nombre3 = "Adrian";

        String Nombre4 = "Ariana";

        String Nombre5 = "Estevan";

         

        String FechaIngreso1 = "01/05/2024";

        String FechaIngreso2 = "01/05/2024";

        String FechaIngreso3 = "01/05/2024";

        String FechaIngreso4 = "01/05/2024";

        String FechaIngreso5 = "01/05/2024";

         

        String Hora1 = "8:30 AM";

        String Hora2 = "9:00 AM";

        String Hora3 = "9:30 AM";

        String Hora4 = "10:00 AM";

        String Hora5 = "10:30 AM";

         

        int Edad1 = 18;

        int Edad2 = 25;

        int Edad3 = 26;

        int Edad4 = 26;

        int Edad5 = 27;

         

        int Dni1 = 71023465;

        int Dni2 = 71253789;

        int Dni3 = 71452376;

        int Dni4 = 71423548;

        int Dni5 = 71042253;

         

        String Experiencia1 = "2 años";

        String Experiencia2 = "7 años";

        String Experiencia3 = "8 años";

        String Experiencia4 = "8 años";

        String Experiencia5 = "9 años";

         

         

        String HabilidadesPrevias1 = "Buena comunicacion, capacidad para aprender rapido";

         

        String HabilidadesPrevias2 = "Experiencia en atencion al cliente, conocimientos basicos de ventas";

        String HabilidadesPrevias3 = "Experiencia en gestion de inventario, habilidades de liderazgo";

        String HabilidadesPrevias4 = "Experiencia en gestion de inventario, habilidades de liderazgo";

        String HabilidadesPrevias5 = "Experiencia en gestion de equipos, amplio conocimiento del mercado de juguetes";

         

        String ConocimientoArea1 = "Tiene potencial para desarrollar habilidades en ventas";

        String ConocimientoArea2 = "Posee algunas habilidades relacionadas con ventas";

        String ConocimientoArea3 = "Tiene experiencia y conocimiento en tecnicas de venta.";

        String ConocimientoArea4 = "Tiene experiencia y conocimiento en tecnicas de venta.";

        String ConocimientoArea5 = "Experto en ventas, con amplia experiencia y habilidades excepcionalmente dominadas.";

         

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

          System.out.println("|  Nro   Nombre    Fecha Ingreso      Hora     Edad       DNI     Experiencia     Habilidades Previas                                                   Conocimiento en el area                                                       |");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");   

          System.out.println("|" + Nro1  + Nombre1  +  FechaIngreso1  +   Hora1   +  Edad1   +    Dni1   +  Experiencia1  +  HabilidadesPrevias1             +                                       ConocimientoArea1                                    +  "|");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

          System.out.println("|" + Nro2  + Nombre2  +  FechaIngreso2  +   Hora2   +  Edad2   +    Dni2   +  Experiencia2  +  HabilidadesPrevias2             +                                       ConocimientoArea2                                    +  "|");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

          System.out.println("|" + Nro3  + Nombre3  +  FechaIngreso3  +   Hora3   +  Edad3   +    Dni3   +  Experiencia3  +  HabilidadesPrevias3             +                                       ConocimientoArea3                                    +  "|");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

          System.out.println("|" + Nro4  + Nombre4  +  FechaIngreso4  +   Hora4   +  Edad4   +    Dni4   +  Experiencia4  +  HabilidadesPrevias4             +                                       ConocimientoArea4                                    +  "|");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

          System.out.println("|" + Nro5  + Nombre5  +  FechaIngreso5  +   Hora5   +  Edad5   +    Dni5   +  Experiencia5  +  HabilidadesPrevias5             +                                       ConocimientoArea5                                    +  "|");

          System.out.println("|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");

        break;

         

        case 9:

        System.out.println("Hasta la proxima");

        salir = true;

          default:

        System.out.println("Elija una opcion valida");     

        break;

       

    }

    }    scanner.close();

  } catch (Exception e) {

      System.out.println("Ingrese un numero: "+e.getMessage());

  } finally {

      System.out.println("Gracias por su preferencia");

  }

  }

   

}