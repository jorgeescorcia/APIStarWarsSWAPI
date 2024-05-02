import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        ConsultaPelicula consulta = new ConsultaPelicula();

        System.out.println("Escriba el numero de la pelicula de Starwars que quiere");

        try {
            var numeroPelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consulta.buscaPelicula(numeroPelicula);
            System.out.println(pelicula);
            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        }catch (NumberFormatException e){
            System.out.println("Numero no encontrado");

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la Aplicación ");
        }


    }
}