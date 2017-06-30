/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

/**
 *
 * @author verma_000
 */
import java.awt.*;
import java.awt.event.*;
class Calci extends Frame  implements ActionListener,WindowListener,MouseListener,KeyListener
{
    TextField t;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28;
    String op="";
    float glob=0.0f;
    Calci()
    {
    super("Calculator");
    t=new TextField("0");
    
    b1=new Button("1");
    b2=new Button("2");
    b3=new Button("3");
    b4=new Button("4");
    b5=new Button("5");
    b6=new Button("6");
    b7=new Button("7");
    b8=new Button("8");
    b9=new Button("9");
    b10=new Button("MC");
    b11=new Button("MR");
    b12=new Button("MS");
    b13=new Button("M+");
    b14=new Button("M-");
    b15=new Button("<-");
    b16=new Button("CE");
    b17=new Button("C");
    b18=new Button("+-");
    b19=new Button("^0.5");
    b20=new Button("/");
    b21=new Button("%");
    b22=new Button("*");
    b23=new Button("1/x");
    b24=new Button("-");
    b25=new Button("+");
    b26=new Button("0");
    b27=new Button(".");
    b28=new Button("=");

    
   t.setBounds(17,50,220,50);
   t.addActionListener(this);
  t.addKeyListener(this);
   add(t);
setLayout(null);
b10.setBounds(17, 120, 40, 38); 
b10.setBackground(Color.WHITE);
b10.addMouseListener(this);
b10.addActionListener(this);
add(b10);
   b11.setBounds(62,120,40,38);
   b11.setBackground(Color.WHITE);
   b11.addMouseListener(this);
   b11.addActionListener(this);
   add(b11);
   b12.setBounds(107,120,40,38);
   b12.setBackground(Color.WHITE);
   b12.addMouseListener(this);
   b12.addActionListener(this);
   add(b12);
   b13.setBounds(152,120,40,38);
   b13.setBackground(Color.WHITE);
   b13.addMouseListener(this);
   b13.addActionListener(this);
   add(b13);
   b14.setBounds(197,120,40,38);
   b14.setBackground(Color.WHITE);
   b14.addMouseListener(this);
   b14.addActionListener(this);
   add(b14);
   b15.setBounds(17,178,40,38);
   b15.setBackground(Color.WHITE);
   b15.addMouseListener(this);
   b15.addActionListener(this);
   add(b15);
   b16.setBounds(62,178,40,38);
   b16.setBackground(Color.WHITE);
   b16.addMouseListener(this);
   b16.addActionListener(this);
   add(b16);
   b17.setBounds(107,178,40,38);
   b17.setBackground(Color.WHITE);
   b17.addMouseListener(this);
   b17.addActionListener(this);
   add(b17);
   b18.setBounds(152,178,40,38);
   b18.setBackground(Color.WHITE);
   b18.addMouseListener(this);
   b18.addActionListener(this);
   add(b18);
   b19.setBounds(197,178,40,38);
   b19.setBackground(Color.WHITE);
   b19.addMouseListener(this);
   b19.addActionListener(this);
   add(b19);
   b7.setBounds(17,236,40,38);
   b7.setBackground(Color.WHITE);
   b7.addMouseListener(this);
   b7.addActionListener(this);
   add(b7);
   b8.setBounds(62,236,40,38);
   b8.setBackground(Color.WHITE);
   b8.addMouseListener(this);
   b8.addActionListener(this); 
   add(b8);
    b9.setBounds(107,236,40,38);
    b9.setBackground(Color.WHITE);
    b9.addMouseListener(this);
    b9.addActionListener(this);
    add(b9);
    b20.setBounds(152,236,40,38);
    b20.setBackground(Color.WHITE);
    b20.addMouseListener(this);
    b20.addActionListener(this);
    add(b20);
    b21.setBounds(197,236,40,38);
    b21.setBackground(Color.WHITE);
    b21.addMouseListener(this);
    b21.addActionListener(this);
    add(b21);
    b4.setBounds(17,294,40,38);
    b4.setBackground(Color.WHITE);
    b4.addMouseListener(this);
    b4.addActionListener(this);
    add(b4);
    b5.setBounds(62,294,40,38);
    b5.setBackground(Color.WHITE);
    b5.addMouseListener(this);
    b5.addActionListener(this);
    add(b5);
    b6.setBounds(107,294,40,38);
    b6.setBackground(Color.WHITE);
    b6.addMouseListener(this);
    b6.addActionListener(this);
    add(b6);
    b22.setBounds(152,294,40,38);
    b22.setBackground(Color.WHITE);
    b22.addMouseListener(this);
    b22.addActionListener(this);
    add(b22);
    b23.setBounds(197,294,40,38);
    b23.setBackground(Color.WHITE);
    b23.addMouseListener(this);
    b23.addActionListener(this);
    add(b23);
    b1.setBounds(17,352,40,38);
    b1.setBackground(Color.WHITE);
    b1.addMouseListener(this);
    b1.addActionListener(this);
    add(b1);
      b2.setBounds(62,352,40,38);
     b2.setBackground(Color.WHITE);
     b2.addMouseListener(this);
      b2.addActionListener(this);
      add(b2);
      b3.setBounds(107,352,40,38);
     b3.setBackground(Color.WHITE);
     b3.addMouseListener(this);
      b3.addActionListener(this);
      add(b3);
      b24.setBounds(152,352,40,38);
     b24.setBackground(Color.WHITE);
     b24.addMouseListener(this);
      b24.addActionListener(this);
      add(b24);
      b28.setBounds(197,352,40,96);
     b28.setBackground(Color.WHITE);
     b28.addMouseListener(this);
      b28.addActionListener(this);
      add(b28);
    b26.setBounds(17,410,85,38);
    b26.setBackground(Color.WHITE);
    b26.addMouseListener(this);
    b26.addActionListener(this);
    add(b26);
    b27.setBounds(107,410,40,38);
    b27.setBackground(Color.WHITE);
    b27.addMouseListener(this);
    b27.addActionListener(this);
    add(b27);
    b25.setBounds(152,410,40,38);
    b25.setBackground(Color.WHITE);
    b25.addMouseListener(this);
    b25.addActionListener(this);
    add(b25);
    setSize(255,480);
    Color b=new Color(188,254,245);
    setBackground(b);
    addWindowListener(this);
    show();
     
    }
    
    @Override
    public void actionPerformed(ActionEvent m)
    {
        try
        {
                String f=t.getText();
                if(m.getSource()==b7)
                {
                     f=f+b7.getLabel();
                }
                if(m.getSource()==b8)
                {
                     f=f+b8.getLabel();
                }
                if(m.getSource()==b9)
                {
                     f=f+b9.getLabel();
                }
                if(m.getSource()==b4)
                {
                     f=f+b4.getLabel();
                }
                if(m.getSource()==b5)
                {
                     f=f+b5.getLabel();
                }
                if(m.getSource()==b6)
                {
                     f=f+b6.getLabel();
                }
                if(m.getSource()==b1)
                {
                     f=f+b1.getLabel();
                }
                if(m.getSource()==b2)
                {
                     f=f+b2.getLabel();
                }
                if(m.getSource()==b3)
                {
                     f=f+b3.getLabel();
                }
                if(m.getSource()==b26)
                {
                     f=f+b26.getLabel();
                }
                if(m.getSource()==b27)
                {
                     f=f+b27.getLabel();
                }
                if(m.getSource()==b25)
                {
                    if(f.contains("+")==false) 
                    f=f+b25.getLabel();
                    else
                    f=f;    
                }
                if(m.getSource()==b21)
                {
                     f=f+b21.getLabel();
                }
                if(m.getSource()==b24)
                {
                    if(f.contains("-")==false) 
                    f=f+b24.getLabel();
                    else
                    f=f;    
                }
                if(m.getSource()==b20)
                {
                     f=f+b20.getLabel();
                }
                if(m.getSource()==b22)
                {
                     if(f.contains("*")==false) 
                    f=f+b22.getLabel();
                    else
                    f=f;    
                }

                t.setText(f);
                if(m.getSource()==b18)
                {
                    int x=Integer.parseInt(f);
                    int x1=(-x);
                    t.setText(""+x1);
                    
                }
                if(m.getSource()==b13)
                {
                    int x=Integer.parseInt(f);
                    t.setText("+"+x);
                }
                if(m.getSource()==b14)
                {
                    int x=Integer.parseInt(f);
                    t.setText("-"+x);
                }
                if(m.getSource()==b19)
                {
                    double x=Double.parseDouble(f);
                    t.setText(""+Math.sqrt(x));
                    

                }
                if(m.getSource()==b15)
                {
                    int x=f.length();
                    String f1=f.substring(0, x-1);
                    t.setText(f1);
                }
                if((m.getSource()==b16)||(m.getSource()==b17)||(m.getSource()==b10)||(m.getSource()==b11)||(m.getSource()==b12))
                {
                    t.setText("0");
                }

                if(m.getSource()==b23)
                {double x;
                    x = Double.parseDouble(t.getText());
                    x=(1/x);
                   t.setText(" "+x);
                }

                if(m.getSource()==b28)
                {
                    String s=t.getText();
                    int flag=0;
                   if(s.contains("*")==true)
                   {op="*";flag=1;
                    int b=s.indexOf("*"); 
                    int len=s.length();
                    String a1= s.substring(0, b);
                    String a2=s.substring(b+1,len);
                    int x1,y1,x2;
                    x1=0;y1=0;
                    float x,y;
                    x=0.0f;y=0.0f;
                    int lena1=a1.indexOf(".");
                    int lena2=a2.indexOf(".");
                    if(lena1==-1)
                    {
                        x1=Integer.parseInt(a1);
                    }

                    else
                    {
                         x=Float.parseFloat(a1);
                    }
                    if(lena2==-1)
                    {
                         y1=Integer.parseInt(a2);
                    }

                  else
                    {
                         y=Float.parseFloat(a2);
                    }
                    if((x1*y1)!=0.0)
                    {glob=y1;
                        t.setText(""+x1*y1);
                    }
                    if((x1*y)!=0.0)
                    {glob=y;
                        t.setText(""+(x1*y));
                    }
                    if((x*y1)!=0.0)
                    {glob=y1;
                        t.setText(""+(x*y1));
                    }
                    if((x*y)!=0.0)
                    {glob=y;
                        t.setText(""+(x*y));
                    }
                   }
                   
                  if(s.contains("+")==true)
                   {op="+";flag=1;
                        int b=s.indexOf("+"); 
                        int len=s.length();
                        String a1= s.substring(0, b);
                        String a2=s.substring(b+1,len);
                        float x=Float.parseFloat(a1);
                        float y=Float.parseFloat(a2);
                        glob=y;
                        t.setText(""+(x+y));

                   }
                  if(s.contains("-")==true)
                   {op="-";flag=1;
                        int b=s.indexOf("-"); 
                        int len=s.length();
                        String a1= s.substring(0, b);
                        String a2=s.substring(b+1,len);
                        float x=Float.parseFloat(a1);
                        float y=Float.parseFloat(a2);
                        glob=y;
                        t.setText(""+(x-y));

                   }
                  if(s.contains("/")==true)
                   {op="/";flag=1;
                        int b=s.indexOf("/"); 
                        int len=s.length();
                        String a1= s.substring(0, b);
                        String a2=s.substring(b+1,len);
                        float x=Float.parseFloat(a1);
                        float y=Float.parseFloat(a2);
                        glob=y;
                        float z=(x/y);
                        if(y!=0)
                        t.setText(""+z);
                        else
                        t.setText("devisor should be non-zero");    

                   }
                  if(s.contains("%")==true)
                   {op="%";flag=1;
                        int b=s.indexOf("%"); 
                        int len=s.length();
                        String a1= s.substring(0, b);
                        String a2=s.substring(b+1,len);
                        float x=Float.parseFloat(a1);
                        float y=Float.parseFloat(a2);
                        glob=y;
                        float z=(x/y);
                        if(y!=0)
                        {
                            float r1=(z*y);
                            float r=(x-r1);
                            t.setText(""+r);
                        }
                        else
                        {
                            t.setText("devisor should be non-zero");
                        }
                   }
                   if(flag==0)
                   { 
                       String hh=t.getText();
                       if((hh.contains("/")==false)&&(hh.contains("+")==false)&&(hh.contains("%")==false)&&(hh.contains("*")==false)&&(hh.contains("-")==false))
                    {
                       
                       float tab1=Float.parseFloat(hh);
                       float res;
                       if(null != op)
                       switch (op) {
                           case "+":
                               res=(tab1+glob);
                               t.setText(""+res);
                               break;
                           case "-":
                               res=(tab1-glob);
                               t.setText(""+res);
                               break;
                           case "*":
                               res=(tab1*glob);
                               t.setText(""+res);
                               break;
                           case "/":
                               res=(tab1/glob);
                               t.setText(""+res);
                               break;
                           case "%":
                               float z=(tab1/glob);
                               if(glob!=0)
                               {
                                   float r1=(z*glob);
                                   float r=(tab1-r1);
                                   t.setText(""+r);
                               }
                               else
                               {
                                   t.setText("devisor should be non-zero");
                               }      break;
                       }
                   }
                 }

            }
        }
        catch(Exception x)
        {
            t.setText(x.getMessage());
        }
            
          
           
        }
    public void windowOpened(WindowEvent e)
    {
        
    }
    public void windowClosed(WindowEvent e)
    {
        
    }
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowActivated(WindowEvent e)
    {
        
    }
    public void windowDeactivated(WindowEvent e)
    {
        
    }
    public void windowIconified(WindowEvent e)
    {
        
    }
    public void windowDeiconified(WindowEvent e)
    {
        
    }
    public void mousePressed(MouseEvent e)
    {
        if(e.getSource()==b1)
        {
            b1.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b2)
        {
            b2.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b3)
        {
            b3.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b4)
        {
            b4.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b5)
        {
            b5.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b6)
        {
            b6.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b7)
        {
            b7.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b8)
        {
            b8.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b9)
        {
            b9.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b10)
        {
            b10.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b11)
        {
            b11.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b12)
        {
            b12.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b13)
        {
            b13.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b14)
        {
            b14.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b15)
        {
            b15.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b16)
        {
            b16.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b17)
        {
            b17.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b18)
        {
            b18.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b19)
        {
            b19.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b20)
        {
            b20.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b21)
        {
            b21.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b22)
        {
            b22.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b23)
        {
            b23.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b24)
        {
            b24.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b25)
        {
            b25.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b26)
        {
            b26.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b27)
        {
            b27.setBackground(Color.YELLOW);
        }
        if(e.getSource()==b28)
        {
            b28.setBackground(Color.YELLOW);
        }
        
    }
    public void mouseReleased(MouseEvent e)
    {
        if(e.getSource()==b1)
        {
            b1.setBackground(Color.WHITE);
        }
        if(e.getSource()==b2)
        {
            b2.setBackground(Color.WHITE);
        }
        if(e.getSource()==b3)
        {
            b3.setBackground(Color.WHITE);
        }
        if(e.getSource()==b4)
        {
            b4.setBackground(Color.WHITE);
        }
        if(e.getSource()==b5)
        {
            b5.setBackground(Color.WHITE);
        }
        if(e.getSource()==b6)
        {
            b6.setBackground(Color.WHITE);
        }
        if(e.getSource()==b7)
        {
            b7.setBackground(Color.WHITE);
        }
        if(e.getSource()==b8)
        {
            b8.setBackground(Color.WHITE);
        }
        if(e.getSource()==b9)
        {
            b9.setBackground(Color.WHITE);
        }
        if(e.getSource()==b10)
        {
            b10.setBackground(Color.WHITE);
        }
        if(e.getSource()==b11)
        {
            b11.setBackground(Color.WHITE);
        }
        if(e.getSource()==b12)
        {
            b12.setBackground(Color.WHITE);
        }
        if(e.getSource()==b13)
        {
            b13.setBackground(Color.WHITE);
        }
        if(e.getSource()==b14)
        {
            b14.setBackground(Color.WHITE);
        }
        if(e.getSource()==b15)
        {
            b15.setBackground(Color.WHITE);
        }
        if(e.getSource()==b16)
        {
            b16.setBackground(Color.WHITE);
        }
        if(e.getSource()==b17)
        {
            b17.setBackground(Color.WHITE);
        }
        if(e.getSource()==b18)
        {
            b18.setBackground(Color.WHITE);
        }
        if(e.getSource()==b19)
        {
            b19.setBackground(Color.WHITE);
        }
        if(e.getSource()==b20)
        {
            b20.setBackground(Color.WHITE);
        }
        if(e.getSource()==b21)
        {
            b21.setBackground(Color.WHITE);
        }
        if(e.getSource()==b22)
        {
            b22.setBackground(Color.WHITE);
        }
        if(e.getSource()==b23)
        {
            b23.setBackground(Color.WHITE);
        }
        if(e.getSource()==b24)
        {
            b24.setBackground(Color.WHITE);
        }
        if(e.getSource()==b25)
        {
            b25.setBackground(Color.WHITE);
        }
        if(e.getSource()==b26)
        {
            b26.setBackground(Color.WHITE);
        }
        if(e.getSource()==b27)
        {
            b27.setBackground(Color.WHITE);
        }
        if(e.getSource()==b28)
        {
            b28.setBackground(Color.WHITE);
        }
    }
    public void mouseClicked(MouseEvent e)
    {
        
    }
    public void mouseEntered(MouseEvent e)
    {
        
    }
    public void mouseExited(MouseEvent e)
    {
        
    }
    public void keyPressed(KeyEvent e)
    {
        
        if((e.getKeyCode()>47&&e.getKeyCode()<58))
       {
           t.setEditable(true);
           
       }
        else
        {
            t.setEditable(false);
        }
        
    }
    public void keyReleased(KeyEvent e)
    {
        
    }
     public void keyTyped(KeyEvent e)
    {
//        String s=t.getText();
//        String s1="";
//        for(int i=0;i<s.length();i++)
//        {
//            if((s.charAt(i)>='0'&&s.charAt(i)<='9'))
//            {
//                s1=s1+s.charAt(i);
//
//            }      
//            
//        }
    }
}

public class Calculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Calci d=new Calci();
    }
}
