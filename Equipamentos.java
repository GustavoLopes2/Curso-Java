package senac2022;

public class Equipamentos {
    String colete;
    String luvas;
    String botas;
    String capacete;
    String espada;

    public void analisarEquipamentos(Equipamentos equipamentos) {
        System.out.println("Seus itens estao desgastados e serao melhorados. Esses sao os status atuais:\n " + equipamentos.colete +
                equipamentos.capacete +
                equipamentos.luvas +
                equipamentos.botas +
                equipamentos.espada);
    }

    public void ajustarEquipamentos(Equipamentos ajustar) {
        System.out.println("Os seus itens foram ajustados e seus atributos mudaram:\n " + ajustar.colete +
                ajustar.capacete +
                ajustar.luvas +
                ajustar.botas +
                ajustar.espada);

    }

}
