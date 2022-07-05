package com.mycompany.reto1;
import javax.swing.JOptionPane;

/*
 * @author JULIAN DAVID GUERRERO HERNANDEZ
 */
public class clsCalculadora {

    public clsCalculadora() { //Generar el constructor vacio
    }

    public void iniciarCalculadora(){
        

        String opc = "";
        do{
            try{
                opc = JOptionPane.showInputDialog("Seleccione una opción: \n"
                + "1. Realizar una operación. \n"
                + "2. Salir del programa.");

                Double.parseDouble(opc);

                if (Double.parseDouble(opc) > 2 ){
                    JOptionPane.showMessageDialog(null, "Ingresar opc. 1 o 2");
                    }
 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
            }


            if (opc.equals("1")){
                
                String menu2 = JOptionPane.showInputDialog("Seleccione una operación: \n"
                        + "1. Suma. \n"
                        + "2. Resta. \n"
                        + "3. Multiplicación. \n"
                        + "4. División. \n"
                        + "5. Potencia. \n"
                        + "6. Raiz cuadrada.\n"
                        + "7. Salir.");

                //   
                try{   
                    Double.parseDouble(menu2);

                    if(Double.parseDouble(menu2) > 7 ){
                        JOptionPane.showMessageDialog(null, "Ingrese un número del 1 al 7");
                    }

                    switch(menu2){
                        case ("1"):
                            String a1 = JOptionPane.showInputDialog("Ingrese el primer número:");
                            String b1 = JOptionPane.showInputDialog("Ingrese el segundo número:");

                            try{
                                double A1 = Double.parseDouble(a1);
                                double B1 = Double.parseDouble(b1);                       

                                double suma = Math.round((A1+B1)*100.0)/100.0;
                                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                                break; 
                            }catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                break;
                            }

                            case ("2"):
                                String a2 = JOptionPane.showInputDialog("Ingrese el primer número:");
                                String b2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

                                try{
                                    double A2 = Double.parseDouble(a2);
                                    double B2 = Double.parseDouble(b2);                       

                                    double resta = Math.round((A2-B2)*100.0)/100.0;
                                    JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                                    break; 
                                }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                    break;
                                }

                            case ("3"):
                                String a3 = JOptionPane.showInputDialog("Ingrese el primer número:");
                                String b3 = JOptionPane.showInputDialog("Ingrese el segundo número:");

                                try{
                                    double A3 = Double.parseDouble(a3);
                                    double B3 = Double.parseDouble(b3);                       

                                    double mult = Math.round((A3*B3)*100.0)/100.0;
                                    JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
                                    break; 
                                }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                    break;
                                }

                            case ("4"):
                                String a4 = JOptionPane.showInputDialog("Ingrese el primer número:");
                                String b4 = JOptionPane.showInputDialog("Ingrese el segundo número:");

                                try{
                                    double A4 = Double.parseDouble(a4);
                                    double B4 = Double.parseDouble(b4);
                                    
                                    if ( Double.parseDouble(b4) == 0){
                                        JOptionPane.showMessageDialog(null,"Ingrese un segundo valor diferente de 0");
                                        break;
                                    }

                                    //double div = Math.round((A4/B4)*100.0)/100.0;
                                    double div = Math.round((A4/B4)*100.0)/100.0;
                                    JOptionPane.showMessageDialog(null, "La división es: " + div);
                                    break; 
                                }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                    break;
                                }

                            case ("5"):
                                String a5 = JOptionPane.showInputDialog("Ingrese el primer número:");
                                String b5 = JOptionPane.showInputDialog("Ingrese el segundo número:");

                                try{
                                    double A5 = Double.parseDouble(a5);
                                    double B5 = Double.parseDouble(b5);                       

                                    double pot = Math.round((Math.pow(A5,B5))*100.0)/100.0;
                                    JOptionPane.showMessageDialog(null, "La potencia es: " + pot);
                                    break; 
                                }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                    break;
                                }
                            
                            case ("6"):
                                String a6 = JOptionPane.showInputDialog("Ingrese el número:");

                                try{
                                    double A6 = Double.parseDouble(a6);
                                                        

                                    double raiz = Math.round((Math.sqrt(A6))*100.0)/100.0;
                                    JOptionPane.showMessageDialog(null, "La raíz cuadrada es: " + raiz);
                                    break; 
                                }catch(NumberFormatException e){
                                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                                    break;
                                }

                            case "7":
                                JOptionPane.showMessageDialog(null, "Hasta pronto !");
                                System.exit(0); 

                    }//
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Debe ingresar valores numericos");
                   
                }
            }
        } while(!opc.equals("2")); 
    }
}