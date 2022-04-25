package patonotucupi;

import javax.swing.JOptionPane;


public class Patonotucupi {

  
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo, "+nome);
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        JOptionPane.showMessageDialog(null, "Que legal "+nome+", você tem "+idade+" anos.");
        String escolha = JOptionPane.showInputDialog("Você prefere: Mazda ou Supra?");
        if(escolha.equals ("Mazda")){
            JOptionPane.showMessageDialog(null, "olho no mazda medusa!");
        }
        else if(escolha.equals ("Supra")){
            JOptionPane.showMessageDialog(null, "is that a supra?");
        }
        else{
            JOptionPane.showMessageDialog(null,"errado!");
        }
    }
    
}
