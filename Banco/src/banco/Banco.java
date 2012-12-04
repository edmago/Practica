/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.*;

/**
 *
 * @author Edgardo Gomez
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int    opc;
        int    posicion = -1;
        int    tempCodigo;
        String tempNombre;
        float  tempPrecio;
        
//        Articulos arreglo[];
//        arreglo = new Articulos [5]; // Se coloco 5 para realizar pruebas, poner un valor alto antes de enviar
//        int    tope = arreglo.length - 1;
                
        do
        {
        System.out.println("\n Menu Principal ");
        System.out.println("-----------------------------");
        System.out.println("   1.- Clientes");
        System.out.println("   2.- Tipo de Cuentas");
        System.out.println("   3.- Tipo de Operaciones");
        System.out.println("   4.- Manejar Cuentas");
        System.out.println("   5.- Operaciones Bancarias");
        System.out.println("   6.- Reportes");
        System.out.println("   9.- Salir");
        System.out.println("-----------------------------\n");
        
        InputStreamReader lector_opcion = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(lector_opcion);
        
        System.out.print("Introduzca la Opción deseada: ");
        try
        {
            opc = Integer.parseInt( buffer.readLine() );
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Opcion no valida, debe introducir numeros \n");
            opc = 0;
        }

        switch (opc)
         {
            case 1: // Insertar
            {
                do
                {
                System.out.println("\n Menu 1 Clientes ");
                System.out.println("-----------------------------");
                System.out.println("   1.- Insertar");
                System.out.println("   2.- Consultar");
                System.out.println("   3.- Modificar");
                System.out.println("   4.- Eliminar");
                System.out.println("   9.- Salir");
                System.out.println("-----------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 2: // Consultar
            {
                do
                {
                System.out.println("\n Menu 2 Tipo de Cuentas ");
                System.out.println("-----------------------------");
                System.out.println("   1.- Insertar");
                System.out.println("   2.- Consultar");
                System.out.println("   3.- Modificar");
                System.out.println("   4.- Eliminar");
                System.out.println("   9.- Salir");
                System.out.println("-----------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 3: // Listar
            {
                do
                {
                System.out.println("\n Menu 3 Tipo de Operaciones ");
                System.out.println("-----------------------------");
                System.out.println("   1.- Insertar");
                System.out.println("   2.- Consultar");
                System.out.println("   3.- Modificar");
                System.out.println("   4.- Eliminar");
                System.out.println("   9.- Salir");
                System.out.println("-----------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 4: // Eliminar
            {
                do
                {
                System.out.println("\n Menu 4 Manejo de Cuentas ");
                System.out.println("-----------------------------");
                System.out.println("   1.- Insertar");
                System.out.println("   2.- Consultar");
                System.out.println("   3.- Modificar");
                System.out.println("   4.- Eliminar");
                System.out.println("   9.- Salir");
                System.out.println("-----------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 5: // Eliminar
            {
                do
                {
                System.out.println("\n Menu 5 Operaciones Bancarias ");
                System.out.println("--------------------------------");
                System.out.println("   1.- Insertar");
                System.out.println("   2.- Consultar");
                System.out.println("   3.- Modificar");
                System.out.println("   4.- Eliminar");
                System.out.println("   9.- Salir");
                System.out.println("--------------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 6: // Eliminar
            {
                do
                {
                System.out.println("\n Menu 6 Reportes ");
                System.out.println("-----------------------------");
                System.out.println("   1.- Cuentas por Usuario");
                System.out.println("   2.- Cuenta");
                System.out.println("   3.- Listado de Usuarios");
                System.out.println("   4.- Listado de Cuentas por Tipo");
                System.out.println("   5.- Listado de Tipo de Operaciones");
                System.out.println("   6.- Listado de Tipo de Cuentas");
                System.out.println("   9.- Salir");
                System.out.println("-----------------------------\n");

                InputStreamReader lector_opcion1 = new InputStreamReader(System.in);
                BufferedReader buffer1 = new BufferedReader(lector_opcion1);

                System.out.print("Introduzca la Opción deseada: ");
                try
                {
                    opc = Integer.parseInt( buffer1.readLine() );
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("Opcion no valida, debe introducir numeros \n");
                    opc = 0;
                }
                }
                while (opc != 9);
                opc = 0;
                break;
            }
            case 9: // Salir
            {
                System.out.println("Opc 5: Salir");
                System.exit(0);
                break;                
            }
         }
        }
        while (opc != 9);
    }
}
