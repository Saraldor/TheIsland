package Package01;


import Package02.*;
import Package03.item_Orange;
import Package03.item_Potion;

import javax.swing.*;



import static Package01.Game.*;


public class Story {
    Game game;
    Ui ui;
    VisibilityManager vm;
    player player = new player();
    superEnemy Enemy;
    int gold;

    int itemKey;


    public Story(Game g, Ui userInterface, VisibilityManager vManager) {
        game = g;
        ui = userInterface;
        vm = vManager;

    }


    public void defaultSetup() {
        Package01.player.hp = 15;
        ui.healtBar.setValue(Package01.player.hp);
        player.currentWeapond = new Weapon_knife();
        ui.weaponNameLabel.setText(player.currentWeapond.name);
        itemKey= 0;
gold= 100;

    }
public void selectPositon(String nextPosition){
switch (nextPosition){
    case "townGate":townGate();break;
    case "talkGuard":talkGuard();break;
    case "talkwomen":talkwomen();break;
    case "attackGuard":attackGuard();break;
    case "crossRoad":crossRoad();break;
    case "tradeParrot": tradeParrot();break;
    case "east":east();break;
    case "west": west();break;
    case"fight": fight();break;
    case "playerAttack":playerAttack();break;
    case "dalekattack" :dalekattack();break;
    case "win": win();break;
    case "lose": lose();break;
    case "ending": ending();break;
    case "toTitle":toTitle();break;
    case "kitchen":kitchen();break;
    case "orange":orange();break;
    case "dice":dice();break;

}
}
    public void townGate() {
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/map.png");
        ui.imageLabel.setIcon(ui.image);

        ui.mainTextArea.setText("You standing in front of the map of the island.\nThere are door in front of you, on your left side you can se a women.\nOn you right side you can se door to the kitchen.\nYou have to find the key to th chest before you can take the ship to the island\n\n What do you want to do?");
        ui.choice1.setText("Go forward");
        ui.choice2.setText("Go right");
        ui.choice3.setText("Talk to the women");
        ui.choice4.setText("Leave");


        game.nextPos1 = "talkGuard";
        game.nextPos2 = "kitchen";
        game.nextPos3 = "talkwomen";
        game.nextPos4 = "crossRoad";
        game.nextPos5 = "inventory";
    }

    public void talkGuard() {
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/pirat.png");
        ui.imageLabel.setIcon(ui.image);
        if (itemKey == 0) {
            ui.mainTextArea.setText("Pirate: Hello stranger. I have never seen you face.\nI´m sorry bu you don t have the key to the chest, I think you can find it in tavern");
            ui.choice1.setText("<-----");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPos1 = "townGate";
            game.nextPos2 = "";
            game.nextPos3 = "";
        } else if (itemKey == 1) {
ending();
        }
    }
    public void attackGuard() {
        ui.mainTextArea.setText("Parrot:Don´t be a foul!\nThe parrot hit you hard and you receive 10 damage ");
        Package01.player.hp = Package01.player.hp -10;

ui.healtBar.setValue(Package01.player.hp);
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/parrot.png");
        ui.imageLabel.setIcon(ui.image);
        ui.choice1.setText("------>");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "crossRoad";
        game.nextPos2 = "";
        game.nextPos3 = "";
    }
    public void talkwomen(){
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratwomen.png");
        ui.imageLabel.setIcon(ui.image);

        int slotNumber = 0;
        while (playerItem[slotNumber]!= empty && slotNumber <4 ){
            slotNumber++;
        }
        if (playerItem[slotNumber] == empty) {
            ui.mainTextArea.setText("Women:Hello Little boy, you look hungry, take this orange\n (You receive a orange)");
            playerItem[slotNumber] = game.orange;
        }
        else if (playerItem[slotNumber]!=empty){
            ui.mainTextArea.setText("Women: It seems you cannot carry anymore! ");


        }
        ui.choice1.setText("------>");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "townGate";
        game.nextPos2 = "";
        game.nextPos3 = "";
    }

    public void kitchen() {
        ui.mainTextArea.setText("Her is the kitchen, her you can eat and get som strange for you journey.There are two dice in font of you, you gone need them for you journey. ");


        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratflag.png");

        ui.imageLabel.setIcon(ui.image);

        ui.choice1.setText("Go left");
        ui.choice2.setText("Eat some orange");
        ui.choice3.setText("Take the Dice");
        ui.choice4.setText("");

        game.nextPos1 = "townGate";
        game.nextPos2 = "orange";
        game.nextPos3 = "dice";
        game.nextPos4 = "";
    }
    public void orange() {
        ui.mainTextArea.setText("You eat the orange and receive som health for journey ");
        Package01.player.hp = Package01.player.hp +2;
        ui.healtBar.setValue(Package01.player.hp);
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/orange.png");

        ui.imageLabel.setIcon(ui.image);

        ui.choice1.setText("<-------");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "kitchen";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos4 = "";
    }
    public void dice() {
        ui.mainTextArea.setText("You took the dices\n You obtained two dices ");
        player.currentWeapond =new Weapon_LongSword();
        ui.weaponNameLabel.setText(player.currentWeapond.name);
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/dubbeldice.png");
        ui.imageLabel.setIcon(ui.image);
        ui.choice1.setText("<-------");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "kitchen";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
    public void crossRoad() {
        ui.mainTextArea.setText("You are outside of the building.\nIf you go forward then you enter the building.\nif you go left you se the tavern\nIf yo go right then you se a parrot. ");
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/road.png");
        ui.imageLabel.setIcon(ui.image);

        ui.choice1.setText(" Go forward");
        ui.choice2.setText("Go right");
        ui.choice3.setText("Go left");
        ui.choice4.setText("Go backwards");

        game.nextPos1 = "townGate";
        game.nextPos2 = "tradeParrot";
        game.nextPos3 = "east";
        game.nextPos4 = "west";
    }
    public void tradeParrot() {
        Enemy = new Enemy_Parrot();
        potion = new item_Potion();

        int slotNumber = 0;
        while (playerItem[slotNumber]!= empty && slotNumber <4 ){
            slotNumber++;
        }
        if (playerItem[slotNumber] == empty) {
            ui.mainTextArea.setText("Parrot: What a nice whether we have her in the town.\n What do you want buy from me.\n I have this to sell for you:" +Enemy.enamyItem + "\n\n Potion:"+item_Potion.buyingPrice+"\nOrange:" +item_Orange.buyingPrice+"\n\nWhat do you want to buy\nYou have:"+ gold+" Gold");



        }

        else if (playerItem[slotNumber]!=empty){
        ui.mainTextArea.setText("Parrot: You can not buy from me, increase you inventory first! ");


    }

        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/parrot.png");
        ui.imageLabel.setIcon(ui.image);
        ui.choice1.setText("<------");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Orange");
        ui.choice4.setText("");

        game.nextPos1 = "crossRoad";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
    public void east() {


        int i =new java.util.Random().nextInt(40)+2;

        if(i<30){
            Enemy = new Enemy_Pirate();

            ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratboy.png");
        }
        else {
            Enemy = new Enemy_Women();

            ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratgirl.png");
        }
        ui.imageLabel.setIcon(ui.image);
        ui.mainTextArea.setText("Welcome to the Tavern, her you will find the key to chest, You just have to play a little game first");



        ui.choice1.setText("Play a game for the key");
        ui.choice2.setText("Go away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "fight";
        game.nextPos2 = "crossRoad";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }

    public void west() {


        ui.mainTextArea.setText("You encounter a  " +Enemy.name+"!");


        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "fight";
        game.nextPos2 = "crossRoad";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
public void fight(){
    ui.mainTextArea.setText( Enemy.name+":" + Enemy.Hp+ "\nYou:"+ Package01.player.hp+" What do you want to do?");
    ui.choice1.setText("Play");
    ui.choice2.setText("Run");
    ui.choice3.setText("");
    ui.choice4.setText("");

    game.nextPos1 = "playerAttack";
    game.nextPos2 = "crossRoad";
    game.nextPos3 = "";
    game.nextPos3 = "";
}
public void playerAttack() {
    int playerDamage = new java.util.Random().nextInt(player.currentWeapond.damage);
    ui.mainTextArea.setText("You role the dice and the " + Enemy.name + " hits " + playerDamage);
    Enemy.Hp = Enemy.Hp - playerDamage;

    ui.imageLabel.setIcon(ui.image);
    ui.choice1.setText(">");
    ui.choice2.setText("");
    ui.choice3.setText("");
    ui.choice4.setText("");


    if (Enemy.Hp > 0) {
        game.nextPos1 = "dalekattack";

    } else if (Enemy.Hp<1){
        game.nextPos1 = "win";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
}
    public void dalekattack () {
        int dalekDamage = new java.util.Random().nextInt(Enemy.attack);
        ui.mainTextArea.setText(Enemy.attackMessage+"\nYou received " +dalekDamage);

        Package01.player.hp = Package01.player.hp - dalekDamage;
        ui.healtBar.setValue(Package01.player.hp);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (Package01.player.hp > 0) {
            game.nextPos1 = "fight";

        } else if (Package01.player.hp <1){
            game.nextPos1 = "lose";
            game.nextPos2 = "";
            game.nextPos3 = "";
            game.nextPos3 = "";
        }
    }
       public void win() {
            ui.mainTextArea.setText("You won the game:\n "+Enemy.name+" gave you the key!\n\n You obtained a key ");
            itemKey =1;
           ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/key.png");
           ui.imageLabel.setIcon(ui.image);
           ui.choice1.setText("Go out");
           ui.choice2.setText("");
           ui.choice3.setText("");
           ui.choice4.setText("");

           game.nextPos1 = "crossRoad";
           game.nextPos2 = "";
           game.nextPos3 = "";
           game.nextPos3 = "";
        }
    public void lose() {
        ui.mainTextArea.setText("You are dead\n\n Game Over  ");


        ui.choice1.setText("New Game");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPos1 = "toTitle";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
    public void  ending(){
        ui.mainTextArea.setText("Pirat: you have found the key to the chest,\n please let me help you open it. ");
        ui.image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratchest.png");
        ui.imageLabel.setIcon(ui.image);
          ui.choice1.setText("Open the Chest");
        ui.choice2.setVisible(false);
        ui.choice3.setVisible(false);
        ui.choice4.setVisible(false);

        game.nextPos1 = "Open";
        game.nextPos2 = "";
        game.nextPos3 = "";
        game.nextPos3 = "";
    }
    public void toTitle(){
        vm.showTitleScreen();
        defaultSetup();
    }
}



