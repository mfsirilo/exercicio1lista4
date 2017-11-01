package lst_4;

public class MetodosFila {

    public int inicio;
    public int fim;
    public int tamanho;
    public int qtdeElementos;
    public Object[] objeto;
    public Object[] prioridade;

    public MetodosFila() {
        this.tamanho = -1;
        this.objeto = new Object[40];
        this.prioridade = new Object[40];
    }

    public boolean estaVazia() {
        if (inicio == fim) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {
        if (this.objeto[objeto.length - 1] != null) {
            return true;
        }
        return false;
//        if (fim == incrementa(inicio) - 1) {
//            return true;
//        }
//        return false;
    }

    public int incrementa(int i) {
        if (i == objeto.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public void adicionar(Object elemento, Object prioridade2) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            objeto[fim] = elemento;
            prioridade[fim] = prioridade2;
            fim = incrementa(fim);
        }
    }

    public void ordenacao() {

    }

    public Object remover() {
        if (!estaVazia()) {
            inicio++;
            return inicio-1;
        }
        return inicio;
    }

    public void imprimir() {
        String elementos = "";
        String prio = "";
        for (int i = inicio; i<fim; i++) {
            elementos += objeto[i]+"\n";
            prio += prioridade[i]+"\n";
        }
        System.out.println();
        System.out.println(elementos +"\n"+ prio);
    }
}



            //JOptionPane.showMessageDialog(null, elementos);
