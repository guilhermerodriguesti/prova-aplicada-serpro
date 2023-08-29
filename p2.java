import java.util.ArrayList;
import java.util.Collections;

public class Cores {

    public static void main(String args[]) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("VERDE");
        lista.add("AZUL");
        lista.add("VERMELHO");
        lista.add("AMARELO");
        lista.add("CINZA");

        //Insira na linha imediatamente a seguir a linha de codigo que atenda ao requisito: Remover na segunda posição do array.
        lista.remove(1);

        System.out.println("Lista após exclusão: " + lista);

        //Insira na linha imediatamente a seguir a linha de codigo que atenda ao requisito: Ordenar os resultados.
        Collections.sort(lista);
        System.out.println("Lista após a ordenação: " + lista);

        //Insira na linha imediatamente a seguir a linha de codigo que atenda ao requisito: Método para atualizar a lista.
        alterar(lista, 2, "BRANCO");

        System.out.println("Lista após atualização: " + lista);
    }

    public static void alterar(ArrayList<String> lista, int index, String novaCor) {
        if (index >= 0 && index < lista.size()) {
            lista.set(index, novaCor);
        }
    }
}
