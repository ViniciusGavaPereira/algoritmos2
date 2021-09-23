import java.io.*;


public class dicionário {

    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello World");
        
        String v =lerVetor("nomes.txt");
        System.out.print(v.toLowerCase());
        
        
        String[] organizardor = new String[v.length()];
    }
    
    
    public static String lerVetor(String nomeArquivo) throws Exception{
        
       
        String conteudo = "";
        
        FileReader arq = new FileReader(nomeArquivo);
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = "";
        
        linha = lerArq.readLine();  
        
        try{
            while(linha!=null){
                // System.out.println("Não tá vazio");
                conteudo += linha + "\r\n";
                linha = lerArq.readLine();            
            }

            arq.close();
            return conteudo;

        }catch(IOException ex){
        
            System.out.println("Não foi possivel ler este arquivo");
            return "";
        }
    } 
    
    
     
}
