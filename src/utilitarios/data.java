/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Masds
 */
public class data {
    public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformat = new SimpleDateFormat("HH:mm:ss");
    
    public void le_hora(){
        Date horaAtual = new Date();
        hora = horaformat.format(horaAtual);
    }
    
    public void le_data(){
        Date data = new Date();
        mes = ""+data.getMonth();
        dia = ""+data.getDate();
        ano = ""+(1900 + data.getYear());
        dia_semana = ""+data.getDay();
        
        switch(data.getMonth()){
            case 0: mes = "Janeiro";break;
            case 1: mes = "Fevereiro";break;
            case 2: mes = "Março";break;
            case 3: mes = "Abril";break;
            case 4: mes = "Maio";break;
            case 5: mes = "Junho";break;
            case 6: mes = "Julho";break;
            case 7: mes = "Agosto";break;
            case 8: mes = "Setembro";break;
            case 9: mes = "Outubro";break;
            case 10: mes = "Novembro";break;
            case 11: mes = "Dezembro";break;
        }
        
        switch(data.getDay()){
            case 0 : dia_semana = "Domingo";break;
            case 1 : dia_semana = "Segunda-Feira";break;
            case 2 : dia_semana = "Terça-Feira";break;
            case 3 : dia_semana = "Quarta-Feira";break;
            case 4 : dia_semana = "Quinta-Feira";break;
            case 5 : dia_semana = "Sexta-Feira";break;
            case 6 : dia_semana = "Sábado";break;
    }
    }
    
    public void getDataHora(){
        this.le_data();
        this.le_hora();
    }
}
