package Atividade_Luara_Patracon;
import java.util.Arrays;
public class Figurinhas {

	public static void main(String[] args) {

        int tamanhoAlbum = 50; // Tamanho do álbum (quantidade total de figurinhas)
        
        //  números das figurinhas que ele possui
        int[] figurinhasPossuidas = {4, 17, 22, 40};
     
        // Verificando a quantidade de figurinhas possuídas
        int quantidadeFigurinhasPossuidas = figurinhasPossuidas.length;

        // Gerando a lista de todas as figurinhas possíveis (de 1 até o tamanho do álbum)
        int[] todasFigurinhas = new int[tamanhoAlbum];
        for (int i = 0; i < tamanhoAlbum; i++) {
            todasFigurinhas[i] = i + 1;
        }

        // Identificando as figurinhas faltantes
        int[] figurinhasFaltantes = new int[tamanhoAlbum - quantidadeFigurinhasPossuidas];
        int index = 0;
        for (int i = 0; i < todasFigurinhas.length; i++) {
            int figurinhaAtual = todasFigurinhas[i];
            if (!contains(figurinhasPossuidas, figurinhaAtual)) {
                figurinhasFaltantes[index++] = figurinhaAtual;
            }
        }

        // Exibindo as informações
        System.out.println("Quantidade de figurinhas possuídas: " + quantidadeFigurinhasPossuidas);
        System.out.println("Figurinhas possuídas: " + Arrays.toString(figurinhasPossuidas));
        System.out.println("Figurinhas faltantes: " + Arrays.toString(figurinhasFaltantes));
    }

    // Método auxiliar para verificar se um valor está presente no array
    public static boolean contains(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}

 


