import java.util.ArrayList;

public class Estoque extends Item{

    private ArrayList<Item> itens = new ArrayList<Item>();

    public ArrayList<Item> getItens(){
        return itens;
    }
    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }

    public int calcular_qtd_item(Item item) {
        int quantidade = item.getQuantidade();
        return quantidade;
    }

    public void mostrar_itens_estoque(ArrayList<Item> itens){
        //codigo para mostrar os itens em estoque
    }
    
}
