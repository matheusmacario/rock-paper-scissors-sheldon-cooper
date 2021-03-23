import java.util.Scanner;

public class JogoDoSheldon {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int qtteste;
       
        System.out.print("Digite a quantidade de cenarios a serem testados: ");
        qtteste= (Integer.parseInt(sc.nextLine()));
        
        
      
        System.out.print("---------\n-pedra\n-papel\n-tesoura\n-lagarto\n-spock\n");
        System.out.println("----------\n");
        
        for(int i=1;i<=qtteste;i++){
        System.out.print("Escolha uma opção para Sheldon: ");
        String escolhaSheldon = sc.nextLine();
        System.out.print("Escolha outro uma opção para Raj: ");
        String escolhaRaj = sc.nextLine();
        
        //toma a primeira escolha (do sheldon) como base e compara com  a segunda escolha (do raj)
        //estrutura switch/case para a escolha do sheldon e ifs/elses para a escolha do raj
        
        switch (escolhaSheldon){
            
        //PEDRA (CONDICOES DE VITORIA/EMPATE/DERROTA)
        // caso sheldon escolha pedra, compara com a escolha do raj e devolve o resultado
        // Raj- pedra (empata)
        //    - papel ou spock (sheldon perde)
        //    - else, que seria tesoura ou lagarto (sheldon ganha)
        //**e assim por diante com as outras combinações e possibilidades...**
            
            case "pedra": if (escolhaRaj.equals ("pedra")) {   
                System.out.println("Caso#"+ i +":De novo!\n");
                break;
                         } else if ((escolhaRaj.equals ("papel") || (escolhaRaj.equals ("spock")))){
                System.out.println("Caso#"+ i + ": Raj trapaceou!\n");
                break;
                        } else {
                System.out.println("Caso#"+ i +":Bazinga!\n");
                break;
            }
            
            //PAPEL (CONDICOES DE VITORIA/EMPATE/DERROTA)
            case "papel":  if (escolhaRaj.equals ("papel")) {   
                System.out.println("Caso#"+ i +":De novo!\n");
                break;
                         } else if ((escolhaRaj.equals ("tesoura") || (escolhaRaj.equals ("lagarto")))){
                System.out.println("Caso#"+ i +":Raj trapaceou!\n");
                break;
                        } else {
                System.out.println("Caso#"+ i +":Bazinga!\n");
                break;
            }
            
            //TESOURA (CONDICOES DE VITORIA/EMPATE/DERROTA)
            case "tesoura":  if (escolhaRaj.equals ("tesoura")) {   
                System.out.println("Caso#"+ i +":De novo!\n");
                break;
                         } else if ((escolhaRaj.equals ("spock") || (escolhaRaj.equals ("pedra")))){
                System.out.println("Caso#"+ i +":Raj trapaceou!\n");
                break;
                        } else {
                System.out.println("Caso#"+ i +":Bazinga!\n");
                break;
            }
            
            //LAGARTO (CONDICOES DE VITORIA/EMPATE/DERROTA)
            case "lagarto":  if (escolhaRaj.equals ("lagarto")) {   
                System.out.println("Caso#"+ i +":De novo!\n");
                break;
                         } else if ((escolhaRaj.equals ("tesoura") || (escolhaRaj.equals ("pedra")))){
                System.out.println("Caso#"+ i +":Raj trapaceou!\n");
                break;
                        } else {
                System.out.println("Caso#"+ i +":Bazinga!\n");
                break;
            }
            
            //SPOCK (CONDICOES DE VITORIA/EMPATE/DERROTA)
            case "spock":  if (escolhaRaj.equals ("spock")) {   
                System.out.println("Caso#"+ i +":De novo!\n");
                break;
                         } else if ((escolhaRaj.equals ("lagarto") || (escolhaRaj.equals ("papel")))){
                System.out.println("Caso#"+ i +":Raj trapaceou!\n");
                break;
                        } else {
                System.out.println("Caso#"+ i +":Bazinga!\n");
                break;
                }       
            } 
        }
    }   
}