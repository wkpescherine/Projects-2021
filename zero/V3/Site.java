import java.awt.*;
import javax.swing.*;
import java.lang.String;

public class Site{
    JPanel site = new JPanel();
	JLabel siteText = new JLabel("This is a test site");
	String testsite1 = "Zero;p(name,100,100, none);name(t(This is a string text))";
	String testsite2 = "Zero;p(name,100,100, none);t(Welcome to a Zero Site)";
	
    Site(){
		site.removeAll();
        site.setLayout(new FlowLayout());
        site.setPreferredSize(new Dimension (860,540));
		site.setVisible(false);
		site.add(siteText);
		site.validate();
		site.repaint();
	}
    
    public void changeText(String words){
        siteText.setText(words);
    }
	
	public void panelBuilder3(String sampleSite){
		String [] sections = sampleSite.split(";");
		int start = sections.length;
		JPanel jpanel[] = new JPanel[start];
		JLabel jlabel[] = new JLabel[start];
		JButton jbutton[] = new JButton[start];

		for(int i = 0; i <sections.length; i++ ){
			String [] subSections = sections[i].split("\\,|\\(|\\)");
			if(subSections[0].equals("Zero")){
				site.removeAll();
			}
			if(subSections[0].equals("p")){
				jpanel[i] = new JPanel();
				JPanel test = jpanel[i];
				int val1 = Integer.parseInt(subSections[2]);
				int val2 = Integer.parseInt(subSections[3]);
				test.setPreferredSize(new Dimension (val1,val2));
				test.setBackground(Color.WHITE);
				site.add(test);
			}
			if(subSections[0].equals("t")){
				jlabel[i] = new JLabel("text");
				JLabel testLabel = jlabel[i];
				testLabel.setText(subSections[1]);
				site.add(testLabel);
			}
		}
		site.validate();
		site.repaint();
	}
}//56