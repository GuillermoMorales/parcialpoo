/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Aritmetica.Aritmetica;
import Conversor.Conversor;

/**
 *
 * @author LN710Q
 */
public class Ventana extends JPanel{
    
        private int widthL = 100, heightL =30;
        private int WIDTH=500, HEIGHT =300;
        private int widthTF=120, heightTF =20;
        private int widthBT=100, heightBT =30;
        
        AbstractFactory factory = FactoryProducer.getFactory("aritmetica");
        AbstractFactory factory2= FactoryProducer.getFactory("conversor");
        
        JLabel letra,num1,num2,re,num,resultadovonver,letra2;
        JButton btn,btn2,btn3,btn1,btnbinario;
        JTextField textfield1, textfield2, resultado,txtconver,reconver;

    public Ventana() {
        //Botones
        this.btn = new JButton("Suma");
        this.btn1 = new JButton("Resta");
        this.btn2 = new JButton("Multiplicación");
        this.btn3 = new JButton("Dividisión");
        this.btnbinario = new JButton("Binario");
        //Textfields
        this.textfield1 = new JTextField();
        this.textfield2 = new JTextField();
        this.resultado = new JTextField();
        this.txtconver = new JTextField();
        this.reconver = new JTextField();
        //Letras
        this.letra2 = new JLabel("Conversor");
        this.letra = new JLabel("Aritmetica");
        this.num1 = new JLabel("Número1:");
        this.num2 = new JLabel("Número2:");
        this.re = new JLabel("Resultado:");
        this.num = new JLabel("Número:");
        this.resultadovonver = new JLabel("Resultado:");
        
        letra2.setBounds(210,160,widthL,heightL);
        letra.setBounds(210,10,widthL,heightL);
        resultadovonver.setBounds(250,190,widthL,heightL);
        reconver.setBounds(320,190,widthL,heightL);
        num1.setBounds(40,35,widthL,heightL);
        num2.setBounds(240,35,widthL,heightL);
        re.setBounds(175,125,widthL,heightL);
        num.setBounds(40,190,widthL,heightL);
        txtconver.setBounds(100,190,widthL,heightL);
        
        textfield2.setBounds(300,40,widthTF,heightTF);
        textfield1.setBounds(100,40,widthTF,heightTF);
        resultado.setBounds(250,130,widthTF,heightTF);
        btn.setBounds(40,80,widthBT,heightBT);
        btn1.setBounds(150,80,widthBT,heightBT);
        btn2.setBounds(260,80,widthBT,heightBT);
        btn3.setBounds(370,80,widthBT,heightBT);
        btnbinario.setBounds(200,230,widthBT,heightBT);
        btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    double a,b,s;
                    String r;
                    try{
                        a = Double.parseDouble(textfield1.getText());
                        b = Double.parseDouble(textfield2.getText());
                        Aritmetica suma = factory.getAritmetica("suma");
                        s = suma.operar(a, b);
                        r = Double.toString(s);
                        resultado.setText(r);
                    }catch (Exception e) {
                        resultado.setText("Error");
                    }
                }
        });
        btn1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    double a,b,s;
                    String r;
                    try{
                        a = Double.parseDouble(textfield1.getText());
                        b = Double.parseDouble(textfield2.getText());
                        Aritmetica resta = factory.getAritmetica("resta");
                        s = resta.operar(a, b);
                        r = Double.toString(s);
                        resultado.setText(r);
                    }catch (Exception e) {
                        resultado.setText("Error");
                    }
                }
        });
        btn2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    double a,b,s;
                    String r;
                    try{
                        a = Double.parseDouble(textfield1.getText());
                        b = Double.parseDouble(textfield2.getText());
                        Aritmetica multiplicacion = factory.getAritmetica("multiplicacion");
                        s = multiplicacion.operar(a, b);
                        r = Double.toString(s);
                        resultado.setText(r);
                    }catch (Exception e) {
                        resultado.setText("Error");
                    }
                }
        });
        btn3.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    double a,b,s;
                    String r;
                    try{
                        a = Double.parseDouble(textfield1.getText());
                        b = Double.parseDouble(textfield2.getText());
                        Aritmetica division = factory.getAritmetica("division");
                        s = division.operar(a, b);
                        r = Double.toString(s);
                        resultado.setText(r);
                    }catch (Exception e) {
                        resultado.setText("Error");
                    }
                }
        });
        
        btnbinario.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent arg0){
                    int n1;
                    try {
                        n1=Integer.parseInt(txtconver.getText());
                        Conversor binario=factory2.getConversor("binario");
                        reconver.setText(binario.convertir(n1));
                    } catch (Exception e) {
                        reconver.setText("No ingresó un entero");
                    }
                }
        });
        textfield1.setEditable(true);
        textfield2.setEditable(true);
        resultado.setEditable(false);
        reconver.setEditable(false);
        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnbinario);
        add(resultadovonver);
        add(reconver);
        add(resultado);
        add(letra);
        add(letra2);
        add(num);
        add(txtconver);
        add(num1);
        add(num2);
        add(re);
        add(textfield1);
        add(textfield2);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }

        

}
