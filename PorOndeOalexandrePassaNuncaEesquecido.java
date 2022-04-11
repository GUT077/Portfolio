import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner PorOndeOalexandrePassaNuncaEesquecido = new Scanner(System.in);
        System.out.println("digite a primeira nota");
        double nota1 = PorOndeOalexandrePassaNuncaEesquecido.nextDouble();
        System.out.println("digite a segunda nota");
        double nota2 = PorOndeOalexandrePassaNuncaEesquecido.nextDouble();
        System.out.println("digite a terceira nota");
        double nota3 = PorOndeOalexandrePassaNuncaEesquecido.nextDouble();
        System.out.println("digite a quarta nota");
        double nota4 = PorOndeOalexandrePassaNuncaEesquecido.nextDouble();
        
        double media = calcMedia(nota1, nota2, nota3, nota4);
        if(aprovado(media) == true){
            System.out.println("Passou de ANO"+media);
        }
        else{
            System.out.println("R O D O U  D E  A N O!!!"+media);
        }
	}
	public static double calcMedia(double a, double b, double c, double d){
	    return (a+b+c+d)/4;
	}
	public static boolean aprovado(double m){
	    if(m >= 7){
	        return true;
	    }
	    else{
	        return false;
	        
	    }
	}
}
