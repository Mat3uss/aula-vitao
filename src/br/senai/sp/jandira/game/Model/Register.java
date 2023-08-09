package br.senai.sp.jandira.game.Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Register {

    /** Instancia Player  */
    Player player = new Player();

    /** Instancia Enemy */
    Enemy enemy = new Enemy();

    /** Instancia Output */
    Output output = new Output();

    /** Instancia Teclado */
    Scanner teclado = new Scanner(System.in);

    public void BothRegister(){

        /** Coleta Dados */

        PlayerRegister();
        EnemyRegister();

    }

    public void PlayerRegister(){
        System.out.println("-------------------------------------------");
        System.out.println("------------   Cadastro Player  -----------");
        System.out.print("Qual é  seu nome: ");
        player.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green] : ");
        player.skin = teclado.nextLine();
        System.out.println("------ Player Cadastrado com Sucesso ------");
        System.out.println("-------------------------------------------");

        output.PrintPlayer(player);


    }

    public void EnemyRegister(){
        System.out.println("-------------------------------------------");
        System.out.println("------------   Cadastro Enemy  -----------");
        System.out.print("Qual é  seu nome: ");
        enemy.name = teclado.nextLine();
        System.out.println("Selecione sua Skin [Red - Blue - Green] : ");
        enemy.skin = teclado.nextLine();
        System.out.println("------ Enemy Cadastrado com Sucesso ------");
        System.out.println("-------------------------------------------");

        output.PrintEnemy(enemy);

    }

    public void Decision(){

        String decision;

        System.out.println("-------  Seja Bem Vindo !! -------");
        System.out.println("O que deseja cadastrar [Player - Enemy - Ambos]: ");
        decision = teclado.nextLine();

        switch (decision){

            case "Player":
                PlayerRegister();
                break;

            case "Enemy":
                EnemyRegister();
                break;

            case "Ambos":
                BothRegister();
                break;

            default:
                System.out.println("Escolha uma opção valida !!");

        }

    }
}
