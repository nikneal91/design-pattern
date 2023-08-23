package memento.gui;
import javax.swing.*;
public class Main extends  JFrame
{
    private JButton save,undo,redo;
    private JTextArea article =new JTextArea(40,60);
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();
    int saveNo =0, curr=0;

    public Main() {
        this.setSize(750,780);
        this.setTitle("Memento");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Articles"));
        save = new JButton("save");
        undo = new JButton("Undo");
        redo = new JButton("REDO");
        save.addActionListener((event)->{
            {
                String content = article.getText();
                originator.setArticle(content);
                careTaker.addMemento(originator.saveInMemento());
                saveNo++;
                curr++;
                System.out.println("No of saves " + saveNo);
                undo.setEnabled(true);
            }
        });
         undo.addActionListener((event)->{
             System.out.println("Undo Button");
             if ( curr >= 1) {
                 curr--;
                 String content = originator.restore(careTaker.getMemento(curr));
                 System.out.println("Undo " + content);
                 article.setText(content);
                 redo.setEnabled(true);
             } else {
                 undo.setEnabled(false);
             }

         });
        redo.addActionListener((event)->{
            System.out.println("Redo Button");
            if ( saveNo-1 > curr) {
                curr++;
                String content = originator.restore(careTaker.getMemento(curr));
                article.setText(content);
                undo.setEnabled(true);
            } else {
                redo.setEnabled(false);
            }

        });

        panel.add(article);
        panel.add(save);
        panel.add(undo);
        panel.add(redo);
        this.add(panel);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }


}
