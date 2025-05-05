import java.util.*;

public class FanChat {
    static Scanner scanner = new Scanner(System.in);
    static String nomeUsuario;
    static boolean emPartida = false;

    public static void main(String[] args) {
        boasVindas();
        while (true) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao) {
                case 1 -> statusAoVivo();
                case 2 -> noticiasRecentes();
                case 3 -> calendarioPartidas();
                case 4 -> rankingJogadores();
                case 5 -> torcidaInterativa();
                case 6 -> enviarMensagem();
                case 7 -> Compra();
                case 8 -> {
                    System.out.println("Obrigado por usar o FURIA Fan Chat! 🐍 Até logo!");
                    return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    static void boasVindas() {
        System.out.print("Bem-vindo ao FURIA Fan Chat! Digite seu nome: ");
        nomeUsuario = scanner.nextLine();
        System.out.println("Olá, " + nomeUsuario + "! Pronto para torcer com a gente? 🐍");
    }

    static void exibirMenu() {
        System.out.println("\n📋 Menu Principal:");
        System.out.println("1. Status ao Vivo dos Jogos 🎮");
        System.out.println("2. Notícias Recentes 🗞️");
        System.out.println("3. Calendário dos Eventos 📅");
        System.out.println("4. Ranking dos Jogadores 📊");
        System.out.println("5. Torcida Interativa 🙌");
        System.out.println("6. Enviar Mensagem para a Equipe 💌");
        System.out.println("7. Comprar produtos Oficiais na loja da Furia 🛍️");
        System.out.println("8. Sair ❌");
        System.out.print("Escolha uma opção: ");
    }

    static void statusAoVivo() {
    System.out.println("\n🎮 Jogo ao Vivo: FURIA vs NAVI");
    emPartida = true;

    int vitoriasFuria = 0;
    int vitoriasNavi = 0;

    for (int mapa = 1; mapa <= 3; mapa++) { // Melhor de 3 mapas
        try {
            Thread.sleep(1500); // Simula tempo entre mapas
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        boolean furiaVence = new Random().nextBoolean(); // Define aleatoriamente o vencedor
        int perdedorPontos = new Random().nextInt(13); // Perdedor entre 0 e 12

        int furiaPontos, naviPontos;
        if (furiaVence) {
            furiaPontos = 13;
            naviPontos = perdedorPontos;
            vitoriasFuria++;
        } else {
            naviPontos = 13;
            furiaPontos = perdedorPontos;
            vitoriasNavi++;
        }

        System.out.printf("Mapa %d - FURIA %d x %d NAVI%n", mapa, furiaPontos, naviPontos);

        if (vitoriasFuria == 2 || vitoriasNavi == 2) {
            break; // Vencedor definido
        }
    }

    emPartida = false;

    if (vitoriasFuria > vitoriasNavi) {
        System.out.println("🏁 Partida finalizada! Vitória da FURIA! 🎉");
    } else {
        System.out.println("🏁 Partida finalizada! Vitória da NAVI! 💀");
    }
    }


    static void noticiasRecentes() {
        System.out.println("\n🗞️ Últimas Notícias da FURIA:");
        System.out.println("02/05 - FURIA descobre seu adversario da PGL Astana");
        System.out.println("01/05 - FURIA anuncia Krizzen como novo assistente.");
        System.out.println("29/04 - Furia bota Skullz no banco e anuncia Yekindar como substituto");
    }

    static void calendarioPartidas() {
        System.out.println("\n📅 Próximos Eventos:");
        System.out.println("10/05 - PGL Astana 2025 -- FURIA vs The Mongolz");
        System.out.println("19/05 - IEM Dallas 2025 -- Adversario a ser definido");
        System.out.println("07/06 - BLAST.tv Austin Major Stage 2 -- Adversario a ser definido");
    }

    static void rankingJogadores() {
        System.out.println("\n📊 Ranking Interno dos Jogadores:");
        System.out.println("1. KSCERATO - 95 pontos");
        System.out.println("2. yuurih - 92 pontos");
        System.out.println("3. Yekindar - 88 pontos");
        System.out.println("4. Molodoy - 85 pontos");
        System.out.println("5. FalleN - 80 pontos");
    }

    static void torcidaInterativa() {
        System.out.println("\n🙌 Torcida Interativa - Escolha uma reação:");
        System.out.println("1. Vai FURIAAAA! 🐍");
        System.out.println("2. GG demais!");
        System.out.println("3. Esse round foi lindo!");
        System.out.println("4. Enviar mensagem livre");

        int escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha) {
            case 1 -> System.out.println(nomeUsuario + ": Vai FURIAAAA! 🐍");
            case 2 -> System.out.println(nomeUsuario + ": GG demais!");
            case 3 -> System.out.println(nomeUsuario + ": Esse round foi lindo!");
            case 4 -> {
                System.out.print("Digite sua mensagem de torcida: ");
                String msg = scanner.nextLine();
                System.out.println(nomeUsuario + ": " + msg);
            }
            default -> System.out.println("Reação inválida.");
        }
    }
    
    static void Compra() {
        System.out.println ("Acesse o site: Furia.gg e garanta ja seu manto");
    }

    static void enviarMensagem() {
        System.out.print("\n💌 Escreva sua mensagem para os jogadores da FURIA: ");
        String mensagem = scanner.nextLine();
        System.out.println("Mensagem enviada com sucesso!");
        // Aqui poderia salvar em arquivo ou banco
    }
}
