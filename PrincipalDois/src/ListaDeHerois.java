import java.util.ArrayList;
public class ListaDeHerois {
    private static ArrayList<Hero> listaHero = new ArrayList<>();

    public  static  ArrayList<Hero> getListaHero(){
        return listaHero;
    }

    static void adicionar(Hero h){
        listaHero.add(h);
    }

    static void adicionar(Hero h, int index){
        listaHero.add(index,h);
    }

    static String listar(){
        String saida ="";
        for (Hero h:listaHero)
        saida += h.imprimir() + "\n";
        return saida;
    }

    static int buscarElemneto(Hero hero){
        return listaHero.indexOf(hero);
    }

    static Hero buscarElemento(String poder) {
        for (Hero h : listaHero) {
            if (h.getPoder().equalsIgnoreCase(poder))
                return h;
        }
        return null;
    }
    static void remover(int index){
        listaHero.remove(index);
    }
}

