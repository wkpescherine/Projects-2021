import java.awt.*;
import javax.swing.*;
import java.lang.String;

public class Site{
    JPanel site = new JPanel();
	JLabel siteText = new JLabel("This is a test site");
	String itemsArray1 [] ={"item1","310","240", "item2","310","240","item3","630","200"};
	String itemsArray2 [] ={"item1","200","440", "item2","200","440","item3","200","440"};
	String testsite1 = "Zero;p(name,100,100, none);name(t(This is a string text))";
    
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

	public void panelBuilder2(String sampleSite){
		site.removeAll();
		String [] sections = sampleSite.split(";");
		int start = sections.length;
		JPanel jpanel[] = new JPanel[start];
		JLabel jlabel[] = new JLabel[start];

		for(int i = 0; i <sections.length; i++ ){
			System.out.println(sections[i]);
			if(sections[i].equals("Zero")){
				String newPanel = sections[i+1];
				String [] subSections = newPanel.split("\\,|\\(|\\)");
				for(int a = 0; a < subSections.length; a++){
					if(subSections[a].equals("p")){
						jpanel[i] = new JPanel();
						JPanel test = jpanel[i];
						int val1 = Integer.parseInt(subSections[2]);
						int val2 = Integer.parseInt(subSections[3]);
						test.setPreferredSize(new Dimension (val1,val2));
						test.setBackground(Color.WHITE);
						site.add(test);
						String newSection = sections[i+2];
						String [] subNewSections = newSection.split("\\,|\\(|\\)");
						for(int x = 0; x < 100; x++ ){

						}

					}
				}
			}
		}
		site.validate();
		site.repaint();
	}   
}//74