package br.com.treinaweb.arquivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EstudoArquivos {

	public static void main(String[] args) {
		String texto = "Conteúdo escrito nos arquivos.";
		escreverArquivoComBufferedWriter(texto);
		escreverArquivoComFiles(texto);
		escreverArquivoComFileWriter(texto);
		escreverArquivoComOutputStream(texto);
		System.out.println("Terminei de escrever os arquivos.");
		
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
}