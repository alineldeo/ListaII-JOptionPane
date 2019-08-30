import javax.swing.JOptionPane;

public class CNH {
    public static void main (String args []){
    
        String nome;
        int idade;
  
        nome = JOptionPane.showInputDialog (null,"Qual o seu nome?","Questionario",JOptionPane.QUESTION_MESSAGE);
    String txt = JOptionPane.showInputDialog(null,"Qual a sua idade?","Questionario",JOptionPane.QUESTION_MESSAGE);
      idade = Integer.parseInt(txt);
      
      if (idade >= 18) {
   JOptionPane.showMessageDialog(null,nome + " pode tirar a CNH!! ", "Informação", JOptionPane.INFORMATION_MESSAGE);
      }else if (idade < 18) {
      JOptionPane.showMessageDialog( null,  nome + " não pode tirar a CNH!! ","Informação", JOptionPane.INFORMATION_MESSAGE);}
    }
    
}
