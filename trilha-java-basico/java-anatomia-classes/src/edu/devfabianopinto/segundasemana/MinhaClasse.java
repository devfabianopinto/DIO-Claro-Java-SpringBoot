package edu.devfabianopinto.segundasemana;

//bloco geral de codigo
public class MinhaClasse {

//metodo executavel
    public static void main (String [] args) {

        //System.out.print("Hello World!!!!");

        String meuNome = "Fabiano";
        int anoFabricacao = 2022;
        boolean verdadeira = false;

        String priNome = "Fabiano";
        String segNome = "Fernandes";

        String tstMetodo2 = nomeCompleto(priNome, segNome);

        System.out.println(tstMetodo2);
    }


    //metodo 2
    public static String nomeCompleto (String priNome, String segNome){

//           return priNome.concat(" ").concat(segNome);
             return "Resultado do método: " + priNome.concat(" ").concat(segNome);
    }




}