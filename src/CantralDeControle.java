public class CentralDeControle {

    /* Este é o nosso "Botão Play" polimórfico.
    Ele aceita qualquer objeto que seja um DispositivoDeMidia.*/
    public void apertarPlay(DispositivoDeMidia dispositivo) {
        System.out.println("Conectando ao dispositivo: " + dispositivo.nomeDoDispositivo);
        /*O Java se encarrega de chamar a versão CORRETA do metodo reproduzir(),
        dependendo da forma real do objeto (TV, Celular ou Rádio).*/
        dispositivo.reproduzir();
        System.out.println("---");
    }


    public static void main(String[] args) {
        // Criando a nossa central de controle.
        CentralDeControle controle = new CentralDeControle();

        // Criando os objetos com suas formas específicas.
        SmartTV tvDaSala = new SmartTV("TV da Sala", "Matrix");
        Celular meuCelular = new Celular("iPhone 15", "Stairway to Heaven", "Led Zeppelin");
        RadioAutomotivo radioDoCarro = new RadioAutomotivo("Rádio do Carro", 98.9);

        // Usando polimorfismo: o mesmo método funciona para diferentes tipos.
        controle.apertarPlay(tvDaSala);
        controle.apertarPlay(meuCelular);
        controle.apertarPlay(radioDoCarro);

        System.out.println("\n --- Demostração de uma lista de Dispositivos ----");

        DispositivoDeMidia[] meusDispositivos = {tvDaSala, meuCelular, radioDoCarro};

        for (DispositivoDeMidia dispositivo : meusDispositivos) {
            dispositivo.reproduzir();
        }
    }
}