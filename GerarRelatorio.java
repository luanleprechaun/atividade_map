public class GerarRelatorio {
    private String dado;

    private String getDado(){
        return dado;
    }
    private void setDado(String dado){
        this.dado = dado;
    }

    public String gerarRelatorio(String dado){
        GerarRelatorio relatorio = new GerarRelatorio();
        relatorio.setDado(dado);
        return "Relatorio: " + getDado();
    }
}
