package senac2022;

public class Status {
    public static void main(String[] args) {
        Equipamentos equipamentos = new Equipamentos();
        Equipamentos ajustar = new Equipamentos();

        equipamentos.colete = "COLETE DE COURO, def: +4 / atk: +1\n";
        equipamentos.botas = " BOTAS DO COELHO, speed: +3 / def: +1\n";
        equipamentos.capacete = " CAPACETE DO VISIONARIO / def: +2\n";
        equipamentos.luvas = " LUVAS DO LADRAO, atk: +2\n";
        equipamentos.espada = " ESPADA DE ACO, atk: +7\n";

        ajustar.colete = "COLETE DE COURO COM ESPINHOS, def: +6 / atk: +3\n";
        ajustar.botas = " BOTAS DE COELHO DA NEVE, speed: +5 / def: +2\n";
        ajustar.capacete = " CAPACETE DO VISIONARIO CHEFE, def: +4 / percepcao: +2\n";
        ajustar.luvas = " LUVAS DO SORRATEIRO, atk: +2 / speed: +3\n";
        ajustar.espada = " ESPADA DE ACO REFORJADO, atk: +9 / alcance: +3\n";

        equipamentos.analisarEquipamentos(equipamentos);
        equipamentos.ajustarEquipamentos(ajustar);
    }
}
