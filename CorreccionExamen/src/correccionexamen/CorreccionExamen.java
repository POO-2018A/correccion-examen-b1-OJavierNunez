package correccionexamen;

import java.util.Scanner;

public class CorreccionExamen {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Autor[] autores = new Autor[5];

        autores[0] = new Autor("Dan Brown", "EEUU");
        autores[1] = new Autor("Margaret Mitchell", "EEUU");
        autores[2] = new Autor("Gabriel Garcia", "Mexico");
        autores[3] = new Autor("Pablo Neruda", "Chile");
        autores[4] = new Autor("JK Rowling", "Reino Unido");
        
        Libro[] libros = new Libro[10];
        int opcion;
        int contadorLibros = 0;
        do{
            System.out.println("********** Biblioteca Personal **********\n");
            System.out.println("1.- Ingresar nuevo libro ");
            System.out.println("2.- Imprimir libros favoritos");
            System.out.println("3.- Lista de autores ingresados");
            System.out.println("4.- Salir ");
            System.out.println("\nSeleccione la opción que desea: ");
            opcion = scan.nextInt();
            scan.nextLine();
            
            switch (opcion){
                case 1:
                    if (contadorLibros == 10){
                        System.out.println("\n La lista de libros esta llena\n");
                        break;
                    }
                    
                    System.out.println("Ingrese el título:");
                    String titulo = scan.nextLine();

                    System.out.println("Ingrese el año:");
                    int anio = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Es favorito? (si o no)");
                    String favoritoString = scan.nextLine();
                    boolean favorito = favoritoString.equals("si");

                    System.out.println("\nSeleccione el autor: ");
                    System.out.println("1.- " + autores[0].getNombre());
                    System.out.println("2.- " + autores[1].getNombre());
                    System.out.println("3.- " + autores[2].getNombre());
                    System.out.println("4.- " + autores[3].getNombre());
                    System.out.println("5.- " + autores[4].getNombre());

                    int opcionAutor = scan.nextInt();
                    scan.nextLine();
                    Autor autorLibro = autores[(opcionAutor - 1)];

                    Libro nuevoLibro = new Libro(titulo, anio, favorito, autorLibro);
                    libros[contadorLibros] = nuevoLibro;
                    
                    contadorLibros++;
                   
                    break;
                case 2:
                    if (contadorLibros ==0){
                        System.out.println("No se ha ingresado ningun libro. ");
                        System.out.println(" ");
                        break;
                    }
                    System.out.println("******** Libros Favoritos ********");
                    for (Libro libro : libros) {
                        if (libro != null && libro.isFavorito()) {
                            System.out.println(libro);
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    int opcionAutor1;
                    do{
                        System.out.println("\n********Autores Ingresados******* ");
                        System.out.println("1.- " + autores[0].getNombre());
                        System.out.println("2.- " + autores[1].getNombre());
                        System.out.println("3.- " + autores[2].getNombre());
                        System.out.println("4.- " + autores[3].getNombre());
                        System.out.println("5.- " + autores[4].getNombre());
                        System.out.println("6.- Volver al menu");
                        System.out.println("\nSeleccione un autor para ver la cantidad de libros registrados: ");
                        opcionAutor1 = scan.nextInt();
                        scan.nextLine();
                        if (opcionAutor1 <= 5){
                            Autor autorSeleccionado = autores[(opcionAutor1 -1)];
                            int contadorLibrosAutor = 0;
                    
                            for(Libro libro: libros) {
                                if(libro != null && libro.getAutor().equals(autorSeleccionado)) {
                                    contadorLibrosAutor++;
                                }
                            }
                    
                            System.out.println("El autor '"+autores[opcionAutor1 -1].getNombre()+"'" +" tiene " + contadorLibrosAutor + " libros registrados."); 
                        }else{
                            System.out.println(" Opcion invalida");
                        } 
                        
                    }while (opcionAutor1 != 6);

                    break;
                case 4:
                    System.out.println("Adios ");
                    break;
                default:
                    System.out.println("Opcion no valida ");
                    break;
                
            }
        }while(opcion != 4);
    }
    
}
