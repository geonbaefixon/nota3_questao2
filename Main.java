public class Main{
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Sam", "Shiba Inu");
        Gato g = new Gato("Sunnie", "Siamês");

         System.out.println("Informações do Animal:");
         System.out.println("Nome: " + c.getNome());
         System.out.println("Raça: " + c.getRaca());
         System.out.println("O que faz: ");
         c.late();
         System.out.println("Forma de caminhar:");
         c.caminha();

         System.out.println("Informações do Animal:");
         System.out.println("Nome: " + g.getNome());
         System.out.println("Raça: " + g.GetRaca());
         System.out.println("O que faz: ");
         g.mia();
         System.out.println("Forma de caminhar:");
         g.caminha();
    }
}
