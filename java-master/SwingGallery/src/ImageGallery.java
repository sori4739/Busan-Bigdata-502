import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageGallery extends JFrame implements ActionListener{

	private JPanel p1,p2;
	private JButton btn1 , btn2;
	private JLabel imageLabel;
	private ImageIcon spider , wonder , bet , superman;
	
	public ImageGallery() {
		setTitle("Open Challenge 11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
	
		//이미지 레이블 생성
		ImageIcon spider = new ImageIcon("images/image0.jpg");
		ImageIcon wonder = new ImageIcon("images/image1.jpg");
		ImageIcon bet = new ImageIcon("images/image2.jpg");
		ImageIcon superman = new ImageIcon("images/image3.jpg");
		imageLabel = new JLabel(spider);
		
		//문자열 + 이미지 레이블 생성
		ImageIcon left = new ImageIcon("images/left.png");
		ImageIcon right = new ImageIcon("images/right.png");
		
		btn1 = new JButton(left);
		btn2 = new JButton(right);
		
		
		p1.add(imageLabel);
		p2.setLayout(new FlowLayout());
		p2.add(btn1);
		p2.add(btn2);
		p1.setBackground(Color.black);
		p2.setBackground(Color.black);
		c.add(p1,BorderLayout.CENTER);
		c.add(p2,BorderLayout.SOUTH);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		setSize(288,390);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			imageLabel.setIcon(bet);

		}
		
		
	



	public static void main(String[] args) {
		new ImageGallery();

	}

}
