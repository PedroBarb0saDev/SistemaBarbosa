/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u09219761190
 */
public class UsuariosController extends AbstractTableModel {

    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return  0 ;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return null ;
    }
    
    public String getColumnName( int column){
         if ( column== 0 ) {
             return "id";
            
        }
         if ( column== 0 ) {
             return "nome";
        }
         if ( column== 0 ) {
             return "cpf"
                     + "";
        }
         if ( column== 0 ) {
             return "id";
        }
         return "";
    }
    
}
