import java.awt.*;
import javax.swing.*;
import java.lang.String;

public class Site{
    JPanel site = new JPanel();
	JLabel siteText = new JLabel("This is a test site");
	String itemsArray1 [] ={"item1","310","240", "item2","310","240","item3","630","200"};
	String itemsArray2 [] ={"item1","200","440", "item2","200","440","item3","200","440"};
    
    Site(){
		site.removeAll();
        site.setLayout(new FlowLayout());
        site.setPreferredSize(new Dimension (860,540));
		site.setVisible(true);
		site.add(siteText);
		site.validate();
		site.repaint();
	}
    
    public void changeText(String words){
        siteText.setText(words);
    }

    public void panelBuilder(String [] array){
		site.removeAll();
		int start = array.length;
		JPanel jpanel[] = new JPanel[start];

		for(int i = 0; i <array.length; ){
			jpanel[i] = new JPanel();
			JPanel test = jpanel[i];
			int val1 = Integer.parseInt(array[i+1]);
			int val2 = Integer.parseInt(array[i+2]);
			test.setPreferredSize(new Dimension (val1,val2));
			test.setBackground(Color.WHITE);
			System.out.println("Clicked on the blank2");
			site.add(test);
			i += 3;
		}
		site.validate();
		site.repaint();
	}
    
}//45