/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.MVC_graf;

/**
 *
 * @author 33010
 */
public class Controlador implements ActionListener {

    Modelo model;
    MVC_graf view;

    public Controlador(Modelo model, MVC_graf view) {
        this.model = model;
        this.view = view;
        
        view.cmdConvertir.addActionListener(this);
        
    }
    
    public void iniciar (){
        view.setTitle("Conversion de moneda");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setDivisaEntrante(view.cboDe.getSelectedItem().toString());
            switch (model.getDivisaEntrante()){
            case "DOL":
                model.setDivisaSaliente(view.cboA.getSelectedItem().toString());
            switch (model.getDivisaSaliente())  {
                case "COR":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.DOL[0]));
                          break;
                case "EUR":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.DOL[1]));
                          break;
                default:
                    model.setResultado(Double.valueOf(view.txtCantidad.getText()));
                    break;
            }  
            break;
            
            case "EUR":
                model.setDivisaSaliente(view.cboA.getSelectedItem().toString());
            switch (model.getDivisaSaliente())  {
                case "COR":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.EUR[0]));
                          break;
                case "DOL":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.EUR[1]));
                          break;
                default:
                    model.setResultado(Double.valueOf(view.txtCantidad.getText()));
                    break;
            }  
            break;
            case "COR":
                model.setDivisaSaliente(view.cboA.getSelectedItem().toString());
            switch (model.getDivisaSaliente())  {
                case "DOL":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.COR[0]));
                          break;
                case "EUR":
                    model.setResultado(model.conversion(Double.valueOf(view.txtCantidad.getText()),model.COR[1]));
                          break;
                default:
                    model.setResultado(Double.valueOf(view.txtCantidad.getText()));
                    break;
            }  
            break;
        }
           view.lblResultado.setText(model.aMoneda(model.getResultado(),model.getDivisaSaliente()));
           view.txtCantidad.requestFocus();
           view.txtCantidad.selectAll();
    }
    
    
}
