package br.com.treinaweb.vetoresecolecoes;

//import java.util.LinkedList; //se for adicionar elementos no meio do conjunto
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		//ArraysList
		List<String> nomesAmigos = new ArrayList<String>();
		Scanner leitor = new Scanner(System.in);
		String nome = "sair";
		do{
			System.out.println("Digite o nome de um amigo: ");
			nome = leitor.nextLine();
			if(!nome.equals("sair")) {
				nomesAmigos.add(nome);				
			}
		}while(!nome.equals("sair"));
		System.out.println("Os seus amigos são: ");
		for(int i = 0; i < nomesAmigos.size();i++) {
			System.out.println(nomesAmigos.get(i));
		}
		leitor.close();		
		
		//HashSets - não permite elementos duplicados
		Set<String> nomesAmigosSet = new HashSet<String>();
		Scanner leitorSet = new Scanner(System.in);
		String nomeSet = "";
		while(!nomeSet.equals("sair")) {
			System.out.print("Digite o nome de um amigo: ");
			nomeSet = leitorSet.nextLine();
			if(!nomeSet.equals("sair")) {
				nomesAmigosSet.add(nomeSet);
			}
		}
		System.out.println("Os nomes de seus amigos são: ");
		Iterator<String> it = nomesAmigosSet.iterator();
		while(it.hasNext()) { //se houver elemento
			System.out.println(it.next());//retorna o elemento
		}
		leitorSet.close();
		
		//HashMaps - Não pode ter elemento duplicado
		Map<String, Integer> notas = new HashMap<String, Integer>();
		Scanner leitorMap = new Scanner(System.in);
		Scanner leitorMapInt = new Scanner(System.in);
		boolean continuar = true;
		while(continuar) {
			System.out.print("Digite o nome do aluno: ");
			String nomeAluno = leitorMap.nextLine();
			System.out.print("Digite a nota do aluno: ");
			int notaAluno = leitorMapInt.nextInt();
			notas.put(nomeAluno, notaAluno);
			System.out.print("Deseja continuar? [S]im ou [N]ão: ");
			String pContinuar = leitorMap.nextLine();
			if(pContinuar.equals("N")) {
				continuar = false;
			}
		}
		System.out.println("As notas desta classe foram: ");
		for(String nomeAluno : notas.keySet()) {
			System.out.println(nomeAluno+" = "+notas.get(nomeAluno));
		}
		leitorMap.close();
		leitorMapInt.close();
	}
}