package edu.funtec.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Aluno {

    public static void main(String args[]){

        
    	//metodo aluno
    	Map<String, String> aluno = new HashMap<>();

        //criando alunos
    	aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

       //Utilizando o método keySet, que retorna o grupo (nome, idade...)
        System.out.println(aluno.keySet());
        
        //retorna os valores corenspondentes a cada chave
        System.out.println(aluno.values());
        
        //lista tipo map alunos
        List<Map<String, String>> listaAlunos = new ArrayList<>();

        
        //adiicionando outro aluno
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        //verifica se tem uma determinada chave
        System.out.println(aluno.containsKey("Nome"));
   

}}