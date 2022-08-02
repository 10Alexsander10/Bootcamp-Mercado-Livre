import java.util.*;

public class DecompondoNumeros{

    public static void verificaMaxDigit(Integer md) {

        List<Integer> listaDeNumeros = new ArrayList<>();
        
        String num;

        for(Integer i = 1000; i<= 9999;i++){
            num = String.valueOf(i);
            
            Integer soma = 0;
            List<Integer> numSeparado = new ArrayList<>();
            for (int index = 0; index < num.length(); index++) {

                String c = num.substring(index, index+1); 
                numSeparado.add(Integer.parseInt(c));
             
                if(numSeparado.get(index) <= md){
                    Integer d = numSeparado.get(index); 
                    soma += d;  
                }
            }
            if(soma == 21 && numSeparado.size()==4){
                listaDeNumeros.add(i);
            }
        }
        if(listaDeNumeros.isEmpty())
            System.out.println("null");

        else{
            for(Integer nums : listaDeNumeros){
                System.out.println(nums);
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        Integer maxDigit = input.nextInt();
        verificaMaxDigit(maxDigit);
    }
}