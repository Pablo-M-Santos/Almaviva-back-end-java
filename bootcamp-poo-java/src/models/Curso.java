package models;


public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Curso: " + titulo + " | Descrição: " + descricao + " | Carga horária: " + cargaHoraria + "h");
    }
}