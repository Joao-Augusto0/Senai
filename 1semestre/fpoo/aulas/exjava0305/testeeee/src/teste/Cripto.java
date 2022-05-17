package teste;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
 
public class Cripto {
 
	public static void main(String[] argv) {
		Scanner leia = new Scanner(System.in);
		try {
			KeyGenerator gerador = KeyGenerator.getInstance("DES");
			SecretKey chaveDES = gerador.generateKey();
 
			Cipher desCipher;
 
			//Cria��o do cipher que conter� os objetos de criptografia
			desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
 
			// Iniciando cipher para criptografia
			desCipher.init(Cipher.ENCRYPT_MODE, chaveDES);
 
			//Dados a serem cripografados
			System.out.println("digite a senha: ");
			byte[] teste = leia.next().getBytes();
 
			System.out.println("Conte�do byte: " + teste);
 
			// Excriptando os dados
			byte[] mensagemCriptografada = desCipher.doFinal(teste);
 
			System.out.println("Conte�do criptografado : " + mensagemCriptografada);
 
			// Iniciando o chipher para realizar a descriptografia
			desCipher.init(Cipher.DECRYPT_MODE, chaveDES);
 
			// Texto a ser descriptografado
			byte[] textoDescriptografado = desCipher.doFinal(mensagemCriptografada);
			byte[] teste3 = "[B@783e6358".getBytes();
			System.out.println("Texto Descriptografado: " + new String(teste3));
 
		} catch (NoSuchAlgorithmException e) {
			System.err.println("N�o foi poss�vel localizar o algor�tmo de criptografia!" + e.getMessage());
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {			
			System.err.println("O mecanismo de preenchimento solicitado n�o existe no ambiente (Sistema Operacional)!" + e.getMessage());			
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			System.err.println("Chave inv�lida!" + e.getMessage());
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			System.err.println("Tamanho do bloco da mensagem inv�lido!" + e.getMessage());
			e.printStackTrace();
		} catch (BadPaddingException e) {
			System.err.println("Preenchimento incorreto de dados!" + e.getMessage());
			e.printStackTrace();
		}
	}
}