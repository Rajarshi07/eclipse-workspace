package day6_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator implements ActionListener {
	JFrame f;// =new JFrame();
	JTextField t;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdiv, bmul, bdec, beq, bdel, bclr;
	static Double a = 0.0, b = 0.0, res = 0.0;
	static Character o = 'n';
	static Integer dec = 0;

	public MyCalculator() {
		// TODO Auto-generated constructor stub
		f = new JFrame("MY Calculator");
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(20, 20, 290, 500);
		f.setResizable(false);
		Font fo = new Font("Arial", Font.BOLD, 20);
		t = new JTextField();
		t.setFont(fo);
		t.setBackground(Color.BLUE);
		t.setForeground(Color.WHITE);
		t.setBounds(20, 20, 230, 60);
		f.add(t);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bdec = new JButton(".");
		beq = new JButton("=");
		bdel = new JButton("DEL");
		bclr = new JButton("CLR");
		b7.setBounds(20, 120, 50, 50);
		b8.setBounds(80, 120, 50, 50);
		b9.setBounds(140, 120, 50, 50);
		bdiv.setBounds(200, 120, 50, 50);
		b4.setBounds(20, 180, 50, 50);
		b5.setBounds(80, 180, 50, 50);
		b6.setBounds(140, 180, 50, 50);
		bmul.setBounds(200, 180, 50, 50);
		b1.setBounds(20, 240, 50, 50);
		b2.setBounds(80, 240, 50, 50);
		b3.setBounds(140, 240, 50, 50);
		bsub.setBounds(200, 240, 50, 50);
		b0.setBounds(20, 300, 50, 50);
		bdec.setBounds(80, 300, 50, 50);
		badd.setBounds(140, 300, 50, 50);
		beq.setBounds(200, 300, 50, 50);
		bdel.setBounds(20, 360, 110, 50);
		bclr.setBounds(140, 360, 110, 50);

		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bdiv.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bmul.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		bsub.addActionListener(this);
		b0.addActionListener(this);
		bdec.addActionListener(this);
		badd.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);

		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(bdec);
		f.add(beq);
		f.add(bdel);
		f.add(bclr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator c = new MyCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(dec==0) {
				a*=10;a+=1;
			}
			else {
				a=a+(1/dec)*1;
				dec*=10;
			}
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b2) {
			a*=10;a+=2;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b3) {
			a*=10;a+=3;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b4) {
			a*=10;a+=4;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b5) {
			a*=10;a+=5;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b6) {
			a*=10;a+=6;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b7) {
			a*=10;a+=7;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b8) {
			a*=10;a+=8;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b9) {
			a*=10;a+=9;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==b0) {
			a*=10;a+=0;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==badd) {
			b=a;
			o='+';
			a=0.0;
			dec=0;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==bsub) {
			b=a;
			o='-';
			a=0.0;
			dec=0;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==bmul) {
			b=a;
			o='*';
			a=0.0;
			dec=0;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==bdiv) {
			b=a;
			o='/';
			a=0.0;
			dec=0;
			t.setText(a.toString());
			return;
		}
		if(e.getSource()==bdec) {
			dec=10;
			return;
		}
		
	}

}
