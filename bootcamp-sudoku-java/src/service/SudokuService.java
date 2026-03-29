package service;


import model.Celula;
import model.Tabuleiro;

public class SudokuService {

    private Tabuleiro tabuleiro;

    public SudokuService(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public boolean inserir(int linha, int coluna, int valor) {
        Celula celula = tabuleiro.getGrid()[linha][coluna];

        if (celula.isFixa()) {
            return false;
        }

        if (validarLinha(linha, valor) &&
                validarColuna(coluna, valor) &&
                validarBloco(linha, coluna, valor)) {

            celula.setValor(valor);
            return true;
        }

        return false;
    }

    private boolean validarLinha(int linha, int valor) {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro.getGrid()[linha][i].getValor() == valor) {
                return false;
            }
        }
        return true;
    }

    private boolean validarColuna(int coluna, int valor) {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro.getGrid()[i][coluna].getValor() == valor) {
                return false;
            }
        }
        return true;
    }

    private boolean validarBloco(int linha, int coluna, int valor) {
        int inicioLinha = (linha / 3) * 3;
        int inicioColuna = (coluna / 3) * 3;

        for (int i = inicioLinha; i < inicioLinha + 3; i++) {
            for (int j = inicioColuna; j < inicioColuna + 3; j++) {
                if (tabuleiro.getGrid()[i][j].getValor() == valor) {
                    return false;
                }
            }
        }
        return true;
    }

    public void exibir() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("-------------------------");

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");

                System.out.print(tabuleiro.getGrid()[i][j].getValor() + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------------------");
    }
}