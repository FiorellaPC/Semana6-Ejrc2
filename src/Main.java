import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int conteoDias = 1;
        int diaMayorAct = 0;

        while (conteoDias <= 30){
            System.out.print("Indica los minutos de ejercicios realizados hoy, dia n° "+conteoDias+": ");
            int minutos = scan.nextInt();

            if (minutos > 30){
                diaMayorAct = diaMayorAct + 1;
            }
            conteoDias = conteoDias + 1;
        }
        System.out.println("Total de días con más de 30min. ejercicios: "+diaMayorAct);
    }
}