import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Hero> listaHero = new ArrayList<>();

        Hero hero1 = new Hero("homem-aranha","escalar paredes");
        Hero hero2 = new Hero("hulk","super força");
        Hero hero3 = new Hero("superman","super visão");
        Hero hero4 = new Hero("wolverine","super garra");
        //add heroi na position especifica
        Hero hero5 = new Hero("Batman","ser rico");

        ListaDeHerois.adicionar(hero1);
        ListaDeHerois.adicionar(hero2);
        ListaDeHerois.adicionar(hero3);
        ListaDeHerois.adicionar(hero4);

        System.out.println("===Herois Cadastrados===");
        System.out.println(ListaDeHerois.listar());

        System.out.println("===Insere um heroi na posição especifica===");
        //add heroi na position especifica
        ListaDeHerois.adicionar(hero5,1);
        System.out.println("Apos novo cadastro");
        System.out.println(ListaDeHerois.listar());

        System.out.println("===USO DO get(int index)===");
        System.out.println("Heroi cadastrado na posição" + (1)+" "+ listaHero.get(0).getNome());

        System.out.println("===Total de herois cadastrados===");
        System.out.println(listaHero.size());

        System.out.println("===Verifica se o array está vazio===");
        if (listaHero.isEmpty()){
            System.out.println("Array vazio");
        }else{
            System.out.println(("Tem elementos cadastrados"));
        }

        System.out.println("===USO DO Index(Object 0)===");
        System.out.println("esta no indice"+buscarElemento(listaHero,hero4));

        System.out.println("===BUSCA OBJ PELO PODER: força===");
        Hero h = buscarElemento(listaHero,"ser rico");
        System.out.println(h.imprimir());

        System.out.println("===remover obj pelo indice(posição 0)===");
        removeHero(listaHero,0);
        System.out.println(listarHerois(listaHero));

    }
     static void adicionarHero(ArrayList<Hero> listaHero, Hero hero) {
        listaHero.add(hero);
    }

    static int buscarElemento(ArrayList<Hero> listaHero, Hero hero) {
        return listaHero.indexOf(hero);
    }

    static void adicionarHero(ArrayList<Hero> listaHero, Hero hero,int index) {
        listaHero.add(index,hero);
    }

    static String listarHerois(ArrayList<Hero>listaHero){
        String saida="";

        for(Hero h : listaHero){
            saida += h.imprimir() + "\n";
        }
        return saida;
    }

    static Hero buscarElemento (ArrayList<Hero>listaHero,String poder)
    {
        for(Hero h: listaHero){
            if (h.getPoder().equalsIgnoreCase(poder)){
                return h;
            }
        }
        return null;
    }

    static  void removeHero(ArrayList<Hero>listaHero,int index){
        listaHero.remove(index);
    }


}