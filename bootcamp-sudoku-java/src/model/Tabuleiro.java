package model;

public class Tabuleiro {

    private Celula[][] grid = new Celula[9][9];

    public Celula[][] getGrid() {
        return grid;
    }

    public void inicializar(String entrada) {
        String[] partes = entrada.split(" ");

        for (String parte : partes) {
            String[] posValor = parte.split(";");
            String[] pos = posValor[0].split(",");
            String[] valorFixo = posValor[1].split(",");

            int linha = Integer.parseInt(pos[0]);
            int coluna = Integer.parseInt(pos[1]);
            int valor = Integer.parseInt(valorFixo[0]);
            boolean fixa = Boolean.parseBoolean(valorFixo[1]);

            grid[linha][coluna] = new Celula(valor, fixa);
        }
    }
}