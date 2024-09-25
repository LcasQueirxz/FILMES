public class filme {
    private String titulo;
    private int duracao;
    private String genero;

    // Construtor
    public filme(String titulo, int duracao, String genero) {
        setTitulo(titulo);
        setDuracao(duracao);
        setGenero(genero);
    }

    // Metodo para definir o titulo com validação
    public void setTitulo(String titulo) {
        if (titulo == "") {
            System.out.println("Erro: O título não pode estar vazio.");
        } else {
            this.titulo = titulo;
        }
    }

    // Metodo para definir a duração com validação
    public void setDuracao(int duracao) {
        if (duracao <= 0) {
            System.out.println("Erro: A duração deve ser maior que zero.");
        } else {
            this.duracao = duracao;
        }
    }

    // Metodo para definir o genero com validação
    public void setGenero(String genero) {
        if (genero == ("Romance")  || genero == ("Terror") || genero ==  ("Comédia")) {
            this.genero = genero;
        } else {
            System.out.println("erro: O genero deve ser romance, terror ou comedia.");
        }
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getGenero() {
        return genero;
    }

    // Metodo para exibir as informações do filme
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Gênero: " + genero);
    }

    // Classe principal para testar o codigo
   
    public static void main(String[] args) {
        filme filme = new filme("Aventura do murilove", 140, "Terror");
        filme.exibirInfo();
    }
}