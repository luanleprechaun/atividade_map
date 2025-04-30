import java.util.ArrayList;

public class Pedido{
    private int id;
    private ArrayList<Item> itens = new ArrayList<Item>();

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public ArrayList<Item> getItens(){
        return itens;
    }
    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }

}