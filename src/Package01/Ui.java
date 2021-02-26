package Package01;

import javax.swing.*;

import java.awt.*;


public class Ui {
    JFrame window;
    JPanel titleNamePanel,startButtonPanel,mainTextPanel,choiceButtonPanel,playerPanel, healtBarPanel,imagePanel, inventoryPanel;
    JLabel titleNameLabel,weaponLabel,weaponNameLabel,imageLabel;
    JButton startButton, continueButton,choice1,choice2,choice3,choice4,inventoryButton,itemButton1,itemButton2,itemButton3,itemButton4,itemButton5;
    JTextArea mainTextArea;
    Font titleFont = new Font("Verdana" ,Font.PLAIN,90);
    Font normalFont = new Font("Verdana" ,Font.PLAIN,15);
    Font startFont = new Font("Verdana" ,Font.PLAIN,25);
    Font weaponFont = new Font("Verdana", Font.BOLD,20);
    JProgressBar healtBar;
    ImageIcon image;





    public void createUI(Game.ChoiceHandler cHandler, Game.InventoryHandler iHandler){

        //windows
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);


        //titel Screen
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200, 100, 400, 200);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel(image  = new ImageIcon("/home/weeping-angel/IdeaProjects/guitextgame-main/src/graf/piratfront.png"));

        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        startButtonPanel = new JPanel(new GridLayout(2,1));
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(startFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("Start");
        startButton.setBorder(null);
        startButtonPanel.add(startButton);

        continueButton = new JButton("Continue");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(startFont);
        continueButton.setFocusPainted(false);
        continueButton.addActionListener(cHandler);
        continueButton.setBorder(null);
        continueButton.setActionCommand("continue");
        startButtonPanel.add(continueButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);


        //Game screen

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(20,260,400,200);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea("");
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setBounds(20,260,400,200);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(500,350,250,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(5, 1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("UP");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);
        choice2 = new JButton("Down");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);
        choice3 = new JButton("LEFT");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener( cHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);
        choice4 = new JButton("RIGHT");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener( cHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        inventoryButton = new JButton("*Inventory*");
        inventoryButton.setBackground(Color.black);
        inventoryButton.setForeground(Color.red);
        inventoryButton.setFont(normalFont);
        inventoryButton.setFocusPainted(false);
        inventoryButton.addActionListener(iHandler);
        inventoryButton.setActionCommand("inventoryButton");
        choiceButtonPanel.add(inventoryButton);

        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(20,500,450,50);
        inventoryPanel.setBackground(Color.black);
        inventoryPanel.setLayout(new GridLayout(1,1));
        window.add(inventoryPanel);
        itemButton1 = new JButton("");
        itemButton1.setBackground(Color.red);
        itemButton1.setForeground(Color.white);
        itemButton1.setFont(normalFont);
        itemButton1.setFocusPainted(false);
        itemButton1.addActionListener(iHandler);
        itemButton1.setActionCommand("item1");
        itemButton2 = new JButton("");
        itemButton2.setBackground(Color.red);
        itemButton2.setForeground(Color.white);
        itemButton2.setFont(normalFont);
        itemButton2.setFocusPainted(false);
        itemButton2.addActionListener(iHandler);
        itemButton2.setActionCommand("item2");
        itemButton3 = new JButton("");
        itemButton3.setBackground(Color.red);
        itemButton3.setForeground(Color.white);
        itemButton3.setFont(normalFont);
        itemButton3.setFocusPainted(false);
        itemButton3.addActionListener(iHandler);
        itemButton3.setActionCommand("item3");
        itemButton4 = new JButton("");
        itemButton4.setBackground(Color.red);
        itemButton4.setForeground(Color.white);
        itemButton4.setFont(normalFont);
        itemButton4.setFocusPainted(false);
        itemButton4.addActionListener(iHandler);
        itemButton4.setActionCommand("item4");
        itemButton5 = new JButton("");
        itemButton5.setBackground(Color.red);
        itemButton5.setForeground(Color.white);
        itemButton5.setFont(normalFont);
        itemButton5.setFocusPainted(false);
        itemButton5.addActionListener(iHandler);
        itemButton5.setActionCommand("item5");
        inventoryPanel.add(itemButton1);
        inventoryPanel.add(itemButton2);
        inventoryPanel.add(itemButton3);
        inventoryPanel.add(itemButton4);
        inventoryPanel.add(itemButton5);

        inventoryPanel.setVisible(false);

        healtBarPanel =new JPanel();
        healtBarPanel.setBounds(450, 15,300, 30);
        healtBarPanel.setBackground(Color.black);
        window.add(healtBarPanel);

        healtBar = new JProgressBar(0,15);
        healtBar.setPreferredSize(new Dimension(300,20));
        healtBar.setBackground(Color.RED);
        healtBar.setForeground(Color.green);
        healtBarPanel.add(healtBar);


        playerPanel =new JPanel();
        playerPanel.setBounds(450, 40,300, 30);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,2));
        window.add(playerPanel);

        weaponLabel= new JLabel("Dice:");
        weaponLabel.setFont(weaponFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponNameLabel= new JLabel();
        weaponNameLabel.setFont(weaponFont);
        weaponNameLabel.setForeground(Color.white);
        playerPanel.add(weaponNameLabel);
        imagePanel = new JPanel();
        imagePanel.setBounds(20,15,400,200);
        imagePanel.setBackground(Color.black);
        imageLabel = new JLabel();

        imagePanel.add(imageLabel);
        window.add(imagePanel);


        window.setVisible(true);
    }
}
