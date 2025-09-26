public class EngineBatalha {

    public void ataque(Combatente atacante, Combatente defensor) {
        if (atacante.rolarParaAcertar() >= defensor.getAc()) {
            System.out.println(atacante.getNome() + " acertou " + defensor.getNome());
            int dano = atacante.rolarDano();
            defensor.receberDano(dano);
            System.out.println(defensor.getNome() + " sofreu " + dano + " de dano");

            if (!defensor.getVivo()) {
                System.out.println(defensor.getNome() + " morreu!");
            }
        } else {
            System.out.println(atacante.getNome() + " errou o ataque em " + defensor.getNome());
        }
    }

    public void lutar(Combatente a, Combatente b) {
        System.out.println("=== BATALHA COMEÇOU ===");
        System.out.println(a.getNome() + " VS " + b.getNome());

        int turno = 1;
        while (a.getVivo() && b.getVivo()) {
            System.out.println("\n--- Turno " + turno + " ---");

            System.out.println("Vez de " + a.getNome() + ":");
            ataque(a, b);

            if (b.getVivo()) {
                System.out.println("Vez de " + b.getNome() + ":");
                ataque(b, a);
            } else {
                System.out.println(b.getNome() + " foi derrotado!");
                break;
            }

            turno++;

            // Prevenir loop infinito
            if (turno > 50) {
                System.out.println("BATALHA MUITO LONGA! Empate!");
                break;
            }
        }

        System.out.println("\n=== BATALHA TERMINOU ===");
        if (a.getVivo()) {
            System.out.println(a.getNome() + " venceu!");
        } else if (b.getVivo()) {
            System.out.println(b.getNome() + " venceu!");
        } else {
            System.out.println("Ambos foram derrotados!");
        }
    }
}
