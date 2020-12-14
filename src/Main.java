import javax.swing.*;

import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FDemo f=new FDemo();
   f.setVisible(true);
   f.setBounds(200,100,820,540);
   f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}

}
class FDemo extends JFrame
{  JPDemo jp1;
   FDemo()
   {
	   super.setTitle("snake and ladder");
	   jp1=new JPDemo();
	   add(jp1);
			   
   }
}
class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4,img5,img6,img7;
	Image swt,i2,start,play2,play1,restart,dice;
	JButton b1,b2,b3;
	String name1;
	String name2;
	Label l1,l2,l3;
	int px1=30;
	int py1=460;
	int countp1=0;
	int countp2=0;
	int px2=10;
	int py2=460;
	int ey;
	int ex;
	int turn=1;
	JPDemo()
	{    
		Font f=new Font("Bauhaus 93",Font.ITALIC,30);
		setBackground(Color.black);
		img1=new ImageIcon("board.jpg");
		swt=img1.getImage();
		img2=new ImageIcon("snake.jpg");
		i2=img2.getImage();
		img3=new ImageIcon("start.jpg");
		start=img3.getImage();
		img4=new ImageIcon("playn.jpg");
		play2=img4.getImage();
		img5=new ImageIcon("player11.jpg");
		play1=img5.getImage();
		img6=new ImageIcon("restart.png");
		img7=new ImageIcon("dice.jpg");
		dice=img7.getImage();
		setLayout(null);
		b1=new JButton(img6);
		b2=new JButton(img3);
		b3=new JButton("ROLL");
		add(b2);
		add(b1);
        add(b3);   
		b1.setBounds(180,460,100,40);
		b2.setBounds(80,460,100,40);
		b3.setBounds(180,280,100,40);
		b3.setForeground(Color.red);
		b3.setFont(f);
		b1.addActionListener(this);
		b3.addActionListener(this);
		b2.addActionListener(this);
		l1=new Label("player 1 name");
		l1.setBounds(80,340,200,40);
		add(l1);
		l1.setBackground(Color.white);
		l2=new Label("player 2 name");
		l2.setBounds(80,400,200,40);
		add(l2);
		l2.setBackground(Color.white);
		l3=new Label("START GAME");
		l3.setBounds(50,210,200,40);
		add(l3);
		l3.setBackground(Color.white);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(swt,300,0,this);
		g.drawImage(i2,0,0,this);
	
		g.drawImage(play2,30,390,this);
		g.drawImage(play1,30,340,this);
		g.drawImage(dice,100,280,this);
		g.drawImage(play2,px2,py2,this);
		g.drawImage(play1,px1,py1,this);
		if(px1==300&&countp1==10)
		{
			g.setColor(Color.red);
			g.setFont(new Font("arial",Font.BOLD,40));
			g.drawString("congratualation "+name1, 200, 300);
			g.setFont(new Font("arial",Font.BOLD,20));
			g.drawString("you won", 350, 340);
		}
		else if(px2==310&&countp2==10)
		{
			g.setColor(Color.red);
			g.setFont(new Font("arial",Font.BOLD,40));
			g.drawString("congratualation "+name2, 200, 300);
			g.setFont(new Font("arial",Font.BOLD,20));
			g.drawString("you won", 350, 340);
		}
		
		
	}
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==b2)
		 {  
			 name1=JOptionPane.showInputDialog(null,"Enter first player NAME "); 
			l1.setText(name1);
			l1.setBackground(Color.pink);
		   name2=JOptionPane.showInputDialog(null,"Enter Second player NAME "); 
			l2.setText(name2);
			l2.setBackground(Color.pink);
			 
			l3.setText(name1+" Its Your Turn To Roll");
			l3.setBackground(Color.pink);
			
		 }
		 if(e.getSource()==b1)
		 {
			 px1=30;
			 py1=460;
			 countp1=0;
			 px2=10;
			 py2=460;
			 countp2=0;
			 img7=new ImageIcon("dice.jpg");
			 dice=img7.getImage();
			 repaint();
			 
		 }
		 if(e.getSource()==b3)
		{
			int random=(int)Math.round(Math.random()*5+1);
			if(turn==1)
			{
				
			
			if(countp1==0)
			{
				
			
			 px1=250;
			 py1=460;
			 countp1++;
			}
			switch(random)
			{
			case 1:
				img7=new ImageIcon("dice1.png");
				if(countp1%2==0)
				{
				px1-=50;
				}
				else
				{
					px1+=50;
				}
				if(countp1==10&&px1<300)
				{
					px1+=50;
				}
				break;
			case 2:
				img7=new ImageIcon("dice2.png");
				if(countp1%2==0)
				{
				px1-=100;
				}
				else
				{
					px1+=100;
				}
				if(countp1==10&&px1<300)
				{
					px1+=100;
				}
				break;
			case 3:
				img7=new ImageIcon("dice3.png");
				if(countp1%2==0)
				{
				px1-=150;
				}
				else
				{
					px1+=150;
				}
				if(countp1==10&&px1<300)
				{
					px1+=150;
				}
				break;
			case 4:
				img7=new ImageIcon("dice4.png");
				if(countp1%2==0)
				{
				px1-=200;
				}
				else
				{
					px1+=200;
				}
				if(countp1==10&&px1<300)
				{
					px1+=200;
				}
				break;
			case 5:
				img7=new ImageIcon("dice5.png");
				if(countp1%2==0)
				{
				px1-=250;
				}
				else
				{
					px1+=250;
				}
				if(countp1==10&&px1<300)
				{
					px1+=250;
				}
				break;
			case 6:
				img7=new ImageIcon("dice6.png");
				if(countp1%2==0)
				{
				px1-=300;
				}
				else
				{
					px1+=300;
				}
				if(countp1==10&&px1<300)
				{
					px1+=300;
				}
				break;
           }
			dice=img7.getImage();
			
			if(px1>750)
			{
				countp1++;
				ex=px1-750;
				px1=800-ex;
				py1=py1-50;
			}
			if(px1<300)
			{
		      countp1++;
		      ex=300-px1;
		      px1=250+ex;
		      py1=py1-50;
			}
			
			repaint();
			if(px1==300&&countp1==1&&py1==460)
			{
				px1=400;
				countp1=4;
				py1=310;
			}
			else if(px1==450&&countp1==1&&py1==460)
			{
				px1=600;
				countp1=2;
				py1=410;
			}
			else if(px1==700&&countp1==1&&py1==460)
			{
				px1=750;
				countp1=4;
				py1=310;
			}
			else if(px1==300&&countp1==3&&py1==360)
			{
				px1=350;
				countp1=5;
				py1=260;
			}
			else if(px1==650&&countp1==3&&py1==360)
			{
				px1=450;
				countp1=9;
				py1=60;
			}
			else if(px1==750&&countp1==6&&py1==210)
			{
				px1=600;
				countp1=7;
				py1=160;
			}
			else if(px1==700&&countp1==8&&py1==110)
			{
				px1=750;
				countp1=10;
				py1=10;
			}
			else if(px1==300&&countp1==8&&py1==110)
			{
				px1=350;
				countp1=10;
				py1=10;
			}
			else if(px1==450&&py1==410)
			{
				px1=600;
				py1=460;
				countp1=1;
			}
			else if(px1==600&&py1==210)
			{
				px1=600;
				py1=310;
				countp1=4;
			}
			else if(px1==350&&py1==160)
			{
				px1=350;
				py1=410;
				countp1=2;
			}
			else if(px1==450&&py1==160)
			{
				px1=300;
				py1=210;
				countp1=6;
			}
			else if(px1==600&&py1==60)
			{
				px1=500;
				py1=310;
				countp1=4;
			}
			else if(px1==650&&py1==10)
			{
				px1=650;
				py1=110;
				countp1=8;
			}
			else if(px1==550&&py1==10)
			{
				px1=550;
				py1=110;
				countp1=8;
			}
			else if(px1==400&&py1==10)
			{
				px1=350;
				py1=110;
				countp1=8;
			}
			repaint();
			l3.setText(name2+" Its Your Turn To Roll");
			l3.setBackground(Color.green);
			
			
			
		}
			if(turn==2)
			{
				if(countp2==0)
				{
					
				
				 px2=260;
				 py2=460;
				 countp2++;
				}
				switch(random)
				{
				case 1:
					img7=new ImageIcon("dice1.png");
					if(countp2%2==0)
					{
					px2-=50;
					}
					else
					{
						px2+=50;
					}
					if(countp2==10&&px2<300)
					{
						px2+=50;
					}
					break;
				case 2:
					img7=new ImageIcon("dice2.png");
					if(countp2%2==0)
					{
					px2-=100;
					}
					else
					{
						px2+=100;
					}
					if(countp2==10&&px2<300)
					{
						px2+=100;
					}
					break;
				case 3:
					img7=new ImageIcon("dice3.png");
					if(countp2%2==0)
					{
					px2-=150;
					}
					else
					{
						px2+=150;
					}
					if(countp2==10&&px2<300)
					{
						px2+=150;
					}
					break;
				case 4:
					img7=new ImageIcon("dice4.png");
					if(countp2%2==0)
					{
					px2-=200;
					}
					else
					{
						px2+=200;
					}
					if(countp2==10&&px2<300)
					{
						px2+=200;
					}
					break;
				case 5:
					img7=new ImageIcon("dice5.png");
					if(countp2%2==0)
					{
					px2-=250;
					}
					else
					{
						px2+=250;
					}
					if(countp2==10&&px2<300)
					{
						px2+=250;
					}
					break;
				case 6:
					img7=new ImageIcon("dice6.png");
					if(countp2%2==0)
					{
					px2-=300;
					}
					else
					{
						px2+=300;
					}
					if(countp2==10&&px2<300)
					{
						px2+=300;
					}
					break;
	           }
				dice=img7.getImage();
				
				if(px2>760)
				{
					countp2++;
					ey=px2-760;
					px2=810-ey;
					py2=py2-50;
				}
				if(px2<310)
				{
			      countp2++;
			      ey=310-px2;
			      px2=260+ey;
			      py2=py2-50;
				}
				
				repaint();
				if(px2==310&&py2==460)
				{
					px2=410;
					py2=310;
					countp2=4;
				}
				else if(px2==460&&py2==460)
				{
					px2=610;
					py2=410;
					countp2=2;
				}
				else if(px2==710&&py2==460)
				{
					px2=760;
					py2=310;
					countp2=4;
				}
				else if(px2==310&&py2==360)
				{
					px2=360;
					py2=260;
					countp2=5;
				}
				else if(px2==660&&py2==360)
				{
					px2=460;
					py2=60;
					countp2=9;
				}
				else if(px2==760&&py2==210)
				{
					px2=610;
					py2=160;
					countp2=7;
				}
				else if(px2==710&&py2==110)
				{
					px2=760;
					py2=10;
					countp2=10;
				}
				else if(px2==310&&py2==110)
				{
					px2=360;
					py2=110;
					countp2=10;
				}
				else if(px2==460&&py2==410)
				{
					px2=610;
					py2=460;
					countp2=1;
				}
				else if(px2==610&&py2==210)
				{
					px2=610;
					py2=310;
					countp2=4;
				}
				else if(px2==360&&py2==160)
				{
					px2=360;
					py2=410;
					countp2=2;
				}
				else if(px2==460&&py2==160)
				{
					px2=310;
					py2=210;
					countp2=6;
				}
				else if(px2==610&&py2==60)
				{
					px2=510;
					py2=310;
					countp2=4;
				}
				else if(px2==410&&py2==10)
				{
					px2=360;
					py2=110;
					countp2=8;
				}
				else if(px2==560&&py2==10)
				{
					px2=560;
					py2=110;
					countp2=8;
				}
				else if(px2==660&&py2==10)
				{
					px2=660;
					py2=110;
					countp2=8;
				}
				repaint();
				l3.setText(name1+" Its Your Turn To Roll");
				l3.setBackground(Color.pink);
				
				
			}
			if(turn==1)
			{
				turn=2;
			}
			else
			{
				turn=1;
			}
				
			}
			
		
		}
	}

