package chat_app_using_threads;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class Client extends JFrame {

        Socket socket;
        BufferedReader br;
        PrintWriter out;
        //declare components
        private final JLabel heading=new JLabel("Client Area");
        private final JTextArea messageArea=new JTextArea();
        private final JTextField messageInput=new JTextField();
        private final Font font=new Font("Roboto",Font.PLAIN,20);

        //class constructor
    public Client() {
            try {
                System.out.println("Sending request to Server");
                socket = new Socket("127.0.0.1", 7777);
                System.out.println("Connection done");
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream());
                startReading();
                CreateGUI();
                handleEvants();
                // startWriting();

            } catch (Exception e) {

            }
        }

        private void handleEvants() {
            messageInput.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {

                }

                @Override
                public void keyReleased(KeyEvent e) {
                    //  System.out.println("Key released "+e.getKeyCode());
                    if (e.getKeyCode()==10)
                    {
                        //System.out.println("enter pressed");
                        String contentToSend=messageInput.getText();
                        messageArea.append(  "Me :" +contentToSend+"\n");
                        out.println(contentToSend);
                        out.flush();
                        messageInput.setText("");
                        messageInput.requestFocus();
                    }

                }
            });

        }

        private void CreateGUI() {
            //gui
            this.setTitle("Client Messager[END]");
            this.setSize(600,600);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            //coding for component
            heading.setFont(font);
            messageArea.setFont(font);
            messageInput.setFont(font);
            heading.setIcon(new ImageIcon("c.jpeg"));
            heading.setHorizontalTextPosition(SwingConstants.CENTER);
            heading.setVerticalTextPosition(SwingConstants.BOTTOM);
            heading.setVerticalTextPosition(SwingConstants.CENTER);
            heading.setHorizontalAlignment(SwingConstants.CENTER);
            heading.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
            //  messageInput.setEditable(false);
            //messageArea.setEditable(false);
            messageInput.setHorizontalAlignment(SwingConstants.CENTER);
            //set layout frame
            this.setLayout(new BorderLayout());
            // adding components to frame
            this.add(heading,BorderLayout.NORTH);
            //JScrollPane jScrollPane=new JScrollPane(messageArea);
            this.add(messageArea,BorderLayout.CENTER);
            this.add(messageInput,BorderLayout.SOUTH);

        }

        //startreading methodgit status
        public void startReading(){
            //tread read
            Runnable r1=()->
            {
                System.out.println("reader started..");
                try {
                    while (true) {

                        String msg = br.readLine();
                        if (msg.equals("exit")) {
                            System.out.println("Server terminated the chat");
                            JOptionPane.showMessageDialog(this,"server terminated the chat");
                            messageInput.setEnabled(false);
                            break;
                        }
                        //System.out.println("Server: " + msg);
                        messageArea.append("Server: " + msg+ "\n");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Connection closed");
                }
            };
            new Thread(r1).start();

        }
        public void startWriting(){
            //tread write
            Runnable r2= () ->
            {
                System.out.println("writer started");
                while(true)
                {
                    try
                    {
                        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
                        String content=br1.readLine();
                        out.println(content);
                        out.flush();

                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }

                }

            };
            new Thread(r2).start();

        }

        public static void main(String[] args){
            System.out.println("this is Client...");
            new Client();

        }
}
