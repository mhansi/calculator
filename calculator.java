import java.awt.*;
import java.awt.event.*;

class Cal extends Frame implements ActionListener{

   TextField tx1;
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;

   String fv,sv,op;
   double fdv,sdv,tot;

   Cal(){
      setBounds(20,20,300,300);
      setTitle("Calculatar");

      Toolkit tk=getToolkit();
      Image image=tk.getImage("cal.png");
      setIconImage(image);

      Panel p1=new Panel();
      Panel p2=new Panel();

      GridLayout g=new GridLayout(5,5,8,10);
      p2.setLayout(g);

      //tx1=new TextField("Enter Your value",20);
      tx1=new TextField(20);
      b1=new Button("<-");
      b2=new Button("CE");
      b3=new Button("C");
      b4=new Button("+/-");
      b5=new Button("SQRL");
      b6=new Button("7");
      b7=new Button("8");
      b8=new Button("9");
      b9=new Button("/");
      b10=new Button("%");
      b11=new Button("4");
      b12=new Button("5");
      b13=new Button("6");
      b14=new Button("*");
      b15=new Button("1/x");
      b16=new Button("1");
      b17=new Button("2");
      b18=new Button("3");
      b19=new Button("-");
      b20=new Button("=");
      b21=new Button("0");
      b22=new Button("");
      b23=new Button(".");
      b24=new Button("+");
      b25=new Button("");

      b10.setForeground(Color.red);

      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      b10.addActionListener(this);
      b11.addActionListener(this);
      b12.addActionListener(this);
      b13.addActionListener(this);
      b14.addActionListener(this);
      b15.addActionListener(this);
      b16.addActionListener(this);
      b17.addActionListener(this);
      b18.addActionListener(this);
      b19.addActionListener(this);
      b20.addActionListener(this);
      b21.addActionListener(this);
      b22.addActionListener(this);
      b23.addActionListener(this);
      b24.addActionListener(this);
      b25.addActionListener(this);

      p1.add(tx1);
      p2.add(b1);
      p2.add(b2);
      p2.add(b3);
      p2.add(b4);
      p2.add(b5);
      p2.add(b6);
      p2.add(b7);
      p2.add(b8);
      p2.add(b9);
      p2.add(b10);
      p2.add(b11);
      p2.add(b12);
      p2.add(b13);
      p2.add(b14);
      p2.add(b15);
      p2.add(b16);
      p2.add(b17);
      p2.add(b18);
      p2.add(b19);
      p2.add(b20);
      p2.add(b21);
      p2.add(b22);
      p2.add(b23);
      p2.add(b24);
      p2.add(b25);

      add(p1,BorderLayout.NORTH);
      add(p2,BorderLayout.CENTER);

      addWindowListener(new Close());

      setVisible(true);
   }
   public void actionPerformed(ActionEvent e){

      Object o=e.getSource();
   // System.out.println(o+"");

      if(o.equals(b6)){
         tx1.setText(tx1.getText()+b6.getActionCommand()+"");
      }

      if(o.equals(b7)){
         tx1.setText(tx1.getText()+b7.getActionCommand()+"");
      }

      if(o.equals(b8)){
         tx1.setText(tx1.getText()+b8.getActionCommand()+"");
      }

      if(o.equals(b11)){
         tx1.setText(tx1.getText()+b11.getActionCommand()+"");
      }

      if(o.equals(b12)){
         tx1.setText(tx1.getText()+b12.getActionCommand()+"");
      }

      if(o.equals(b13)){
         tx1.setText(tx1.getText()+b13.getActionCommand()+"");
      }

      if(o.equals(b16)){
         tx1.setText(tx1.getText()+b16.getActionCommand()+"");
      }

      if(o.equals(b17)){
         tx1.setText(tx1.getText()+b17.getActionCommand()+"");
      }

      if(o.equals(b18)){
         tx1.setText(tx1.getText()+b18.getActionCommand()+"");
      }

      if(o.equals(b21)){
         tx1.setText(tx1.getText()+b21.getActionCommand()+"");
      }

       else if(o.equals(b1)){//<-
         String value=tx1.getText();
         if(!value.equals("")){
         value=value.substring(0,value.length()-1);
}
         tx1.setText(value);
      }
     
      else if(o.equals(b24)){//+
         fv=tx1.getText();
         op=b24.getActionCommand();
         tx1.setText(null);
      }else if(o.equals(b3)){
         tx1.setText(null);
      }else if(o.equals(b5)){//SQRT
	 fv = tx1.getText();
	 fdv= Double.parseDouble(fv);
	 double sqrt=Math.sqrt(fdv);
         tx1.setText(sqrt+"");
      }
      else if(o.equals(b19)){//-
         fv=tx1.getText();
         op=b19.getActionCommand();
         tx1.setText(null);
      }
      else if(o.equals(b14)){//*
         fv=tx1.getText();
         op=b14.getActionCommand();
         tx1.setText(null);
      }
      else if(o.equals(b9)){///
         fv=tx1.getText();
         op=b9.getActionCommand();
         tx1.setText(null);
      }

      else if(o.equals(b20)){//=
         sv=tx1.getText();
         fdv=Double.parseDouble(fv);
         sdv=Double.parseDouble(sv);

         if(op.equals("+")){
            tot=fdv+sdv; 
            tx1.setText(tot+"");           
         }
         if(op.equals("-")){
            tot=fdv-sdv;     
            tx1.setText(tot+"");       
         }
         if(op.equals("*")){
            tot=fdv*sdv;     
            tx1.setText(tot+"");       
         }
         if(op.equals("/")){
            tot=fdv/sdv;  
            tx1.setText(tot+"");          
         }
      }
         else if(o.equals(b23)){//"."
             if(tx1.getText().contains(".")){
             }else{
		String value= tx1.getText();
	        tx1.setText(value+b23.getActionCommand()+"");
             }
       }
        else if(o.equals(b4)){//"+/-"
	  if(!tx1.getText().equals("")){
             double value=Double.parseDouble(tx1.getText());
	     double setvalue = value*-1;
	     tx1.setText(setvalue+"");
         }
       }
   }
}
class CreateCal{
   public static void main(String args[]){
      Cal c1=new Cal();
   }
}
class Close extends WindowAdapter{
   public void windowClosing(WindowEvent e){
      System.exit(5);
   }
}