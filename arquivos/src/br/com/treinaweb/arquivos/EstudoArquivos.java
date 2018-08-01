package br.com.treinaweb.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EstudoArquivos {

	public static void main(String[] args) {
		//escrevendo em arquivos
		String texto = "Conteúdo escrito nos arquivos.";
		escreverArquivoComBufferedWriter(texto);
		escreverArquivoComFiles(texto);
		escreverArquivoComFileWriter(texto);
		escreverArquivoComOutputStream(texto);
		System.out.println("Terminei de escrever os arquivos.");
		//lendo os arquivos
		lerArquivoComInputStream();
		lerArquivoComFiles();
		lerArquivoComBufferedReader();
		lerArquivoComFileReader();
		System.out.println("Terminada a leitura dos arquivos.");
	}
	//Quatro formas de escrever arquivos em com Java
	//método 1
	private static void escreverArquivoComOutputStream(String texto){
		File arquivo = new File("arquivo_outputStream.txt");
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) { //se não houver permissão para criar arquivos
				e.printStackTrace();
			}
		}
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(arquivo);
			stream.write(texto.getBytes(),0,texto.length());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//leitura
	private static void lerArquivoComInputStream() {
		File arquivo = new File("arquivo_outputStream.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(arquivo);
			byte[] conteudo = new byte[100];
			is.read(conteudo);
			String conteudoArquivo = new String(conteudo);//convertendo byte para string
			System.out.println("===Lendo com InputStream:==");
			System.out.println(conteudoArquivo);
			System.out.println("===========================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
				e.printStackTrace();
		}finally {
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//método 2
	private static void escreverArquivoComFiles(String texto) {
		File arquivo = new File("arquivo_Files.txt");
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Files.write(Paths.get(arquivo.getAbsolutePath()), texto.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//leitura
	private static void lerArquivoComFiles() {
		File arquivo = new File("arquivo_Files.txt");
		try {
			String conteudoArquivo = new String(Files.readAllBytes(Paths.get(arquivo.getAbsolutePath())));
			System.out.println("======Lendo com Files:=====");
			System.out.println(conteudoArquivo);
			System.out.println("===========================");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//método 3
	private static void escreverArquivoComBufferedWriter(String texto) {
		File arquivo = new File("arquivo_bufferedWriter.txt");
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Writer fw = null; //ou FileWriter
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(arquivo);
			bw = new BufferedWriter(fw);
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw !=null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//leitura
	private static void lerArquivoComBufferedReader() {
		File arquivo = new File("arquivo_bufferedWriter.txt");
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			System.out.println("=Lendo com BufferedReader:=");
			while((linha = bf.readLine())!=null) {
				System.out.println(linha);
			}
			System.out.println("===========================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(bf != null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//método 4
	private static void escreverArquivoComFileWriter(String texto) {
		File arquivo = new File("arquivo_fileWriter.txt");
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Writer fw = null;
		try {
			fw = new FileWriter(arquivo);
			fw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//leitura
	private static void lerArquivoComFileReader() {
		File arquivo = new File("arquivo_fileWriter.txt");
		char[] conteudo = new char[100];
		Reader reader = null;
		try {
			reader = new FileReader(arquivo);
			System.out.println("====Lendo com FileReader:===");
			while(reader.read(conteudo) != -1) {
				System.out.println(String.copyValueOf(conteudo));			
			}
			System.out.println("===========================");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}