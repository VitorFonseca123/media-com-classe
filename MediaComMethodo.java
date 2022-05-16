package media.com.methodo;
import java.util.Scanner;
/**
 *
 * @author Vitor
 */
public class MediaComMethodo {

    

    
    static class aluno{
        double n1;
        double n2;
        double media;
        String nome;
        String aprovados = "\n";
        String reprovados = "\n";

        

        public double getN1() {
            return n1;
        }

        public void setN1(double n1) {
            this.n1 = n1;
        }

        public double getN2() {
            return n2;
        }

        public void setN2(double n2) {
            this.n2 = n2;
        }

        public double getMedia() {
            return media;
        }

        public void setMedia(double media) {
            this.media = media;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getAprovados() {
            return aprovados;
        }

        public void setAprovados(String aprovados) {
            this.aprovados += aprovados;
        }

        public String getReprovados() {
            return reprovados;
        }

        public void setReprovados(String reprovados) {
            this.reprovados += reprovados;
        }

        public void calc(){
            
            this.setMedia((this.getN1()+this.getN2())/2);
        }
       
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;
        String vazio="";
        double n1=0;
        double n2=0;
        double media=0;
        String nome="";
        aluno a = new aluno();
        num = in.nextInt();
        
        for(int i =0;i<num;i++){
            vazio = in.nextLine();
            nome = in.nextLine();
            a.setNome(nome);
            n1=in.nextDouble();
            a.setN1(n1);
            n2=in.nextDouble();
            a.setN2(n2);
            
            a.calc();
            if(a.getMedia()>=5){
                a.setAprovados(a.getNome()+"\n");
            }else{
                a.setReprovados(a.getNome()+"\n");
            }
            
        }
        System.out.println("Aprovados: "+a.getAprovados());
        System.out.println("Reprovados: "+a.getReprovados());
        
    }
     
    
}
