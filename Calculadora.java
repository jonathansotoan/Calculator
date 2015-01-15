import javax.swing.*;
public class Calculadora {
	//n_ingX: numero ingresado X
	int numero,funcion;
    double ingreso,n_ing1,n_ing2,n_ing3,n_ing4,n_ing5,n_ing6,n_ing7,n_ing8,n_ing9,n_ing10,n_ing11,n_ing12,n_ing13,n_ing14,n_ing15;
    double n_ing16,n_ing17,n_ing18,n_ing19,n_ing20,angulo,angulo2,angulo3,angulo4,angulo5,angulo6;
 public static void main(String[] args) {
 	//do{
    int numero=Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea realizar?\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir"
    	+ "\n5. Residuo de una división\n6. Potenciar\n7. Radicar\n8. Función exponencial\n9. Función logarítmica (de base e)\n10. Valor"
    		+" Absoluto\n11. Funciones trigonométricas\n12. Salir\n\n\n-Ingrese el numero correspondiente de la opción a elegir-"));
    		//do{
    switch(numero){
      case 1://sumar
       double n_ing1=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato x"));
       double n_ing2=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato y"));
       //n_ing1=Math.floor(n_ing1);
       //n_ing2=Math.round(n_ing2);
       if((n_ing1<0)||(n_ing2<0)){
        JOptionPane.showMessageDialog(null, "El resultado de la suma es:\n("+n_ing1+") + ("+n_ing2+") = "+(n_ing1+n_ing2));
       }else{
       	JOptionPane.showMessageDialog(null, "El resultado de la suma es:\n"+n_ing1+" + "+n_ing2+" = "+(n_ing1+n_ing2));
       }
       break;
      case 2://Restar
       double n_ing3=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato x"));
       double n_ing4=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato y"));
       if((n_ing3<0)||(n_ing4<0)){
        JOptionPane.showMessageDialog(null,"El resultado de la resta es:\n("+n_ing3+") - ("+n_ing4+") = "+(n_ing3-n_ing4));
       }else{
       	JOptionPane.showMessageDialog(null,"El resultado de la resta es:\n"+n_ing3+" - "+n_ing4+" = "+(n_ing3-n_ing4));
       }
       break;
      case 3://multiplicar
       double n_ing5=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato x"));
       double n_ing6=Double.parseDouble(JOptionPane.showInputDialog("ingrese dato y"));
       if((n_ing5<0)||(n_ing6<0)){
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es:\n("+n_ing5+") * ("+n_ing6+") = "+n_ing5*n_ing6);
       }else{
       	JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es:\n"+n_ing5+" * "+n_ing6+" = "+n_ing5*n_ing6);
       }
       break;
      case 4://dividir
       double n_ing7=Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato x"));
       double n_ing8=Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato y"));
       if (n_ing8==0.0){
       	JOptionPane.showMessageDialog(null,"No se puede dividir por cero");
       }else{
       	if((n_ing7<0)||(n_ing8<0)){
       	 JOptionPane.showMessageDialog(null,"El resultado de la división es:\n("+n_ing7+") ÷ ("+n_ing8+") = "+n_ing7/n_ing8);
       	}else{
         JOptionPane.showMessageDialog(null,"El resultado de la división es:\n"+n_ing7+" ÷ "+n_ing8+" = "+n_ing7/n_ing8);
        }
       }
       break;
      case 5://Residuo
       int n_ing21=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato x"));
       int n_ing22=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato y"));
       if ((n_ing21>=0)&&(n_ing22>=0)){
        JOptionPane.showMessageDialog(null,"El residuo de la división: "+n_ing21+"/"+n_ing22+" = "+n_ing21%n_ing22);
       }else{
       	JOptionPane.showMessageDialog(null,"El residuo de la división: ("+n_ing21+") / ("+n_ing22+") = "+n_ing21%n_ing22);
       }
       break;
      case 6://potenciar
       double n_ing9=Double.parseDouble(JOptionPane.showInputDialog("Sea x^y, ingrese x"));
       double n_ing10=Double.parseDouble(JOptionPane.showInputDialog("Sea x^y, ingrese y"));
       if((n_ing9<0)||(n_ing10<0)){
        JOptionPane.showMessageDialog(null, "El resultado de la potenciación es:\n("+n_ing9+")^("+n_ing10+") = "+Math.pow(n_ing9,n_ing10));
       }else{
       	JOptionPane.showMessageDialog(null, "El resultado de la potenciación es:\n"+n_ing9+"^"+n_ing10+" = "+Math.pow(n_ing9,n_ing10));
       }
       break;
      case 7://radicar
       double n_ing11=Double.parseDouble(JOptionPane.showInputDialog("Raiz cuadrada de:"));
       if(n_ing11<0){
       	JOptionPane.showMessageDialog(null,"No se puede radicar un numero negativo dentro de los numeros reales");
       }else{
        JOptionPane.showMessageDialog(null,"El resultado de la radicación es:\n"+"la raiz cuadrada de "+n_ing11+" = "+(Math.sqrt(n_ing11)));
       }
       break;
      case 8://exponecial
       double n_ing12=Double.parseDouble(JOptionPane.showInputDialog("Sea e^x, Donde e: es el numero euler= "+Math.E+" ingrese x"));
       if(n_ing12<0){
        JOptionPane.showMessageDialog(null,"El resultado de la funcion exponencial es:\ne^("+n_ing12+") = "+Math.exp(n_ing12));
       }else{
       	JOptionPane.showMessageDialog(null,"El resultado de la funcion exponencial es:\ne^"+n_ing12+" = "+Math.exp(n_ing12));
       }
       break;
      case 9://logaritmica
       double n_ing13=Double.parseDouble(JOptionPane.showInputDialog("Sea Log(x) (de base e), digite dato x"));
       if(n_ing13<0){
        JOptionPane.showMessageDialog(null,"No se puede utilizar el cero en la función logarítmica (de base e)");
       }else{
       	JOptionPane.showMessageDialog(null,"El resultado de la función logarítmica (de base e) es:\nLog ("+n_ing13+") = "+Math.log(n_ing13));
       }
       break;
      case 10://vlor absoluto
       double n_ing14=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero del cual quiere saber su valor absoluto."));
       JOptionPane.showMessageDialog(null,"El valor absoluto es:\n|"+n_ing14+"| = "+Math.abs(n_ing14));
       break;
      case 11://funciones trigonometricas
      	int funcion=Integer.parseInt(JOptionPane.showInputDialog("¿Qué función trigonométrica desea utilizar?\n1. Seno\n2. Coseno"
      		+"\n3. Tangente\n4. Cosecante\n5. Secante\n6. Cotangente\n\n\n-Ingrese el numero correspondiente de la opción a elegir-"));
      		switch(funcion){
      		case 1://seno
      		 double n_ing15=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      		 double angulo=n_ing15*Math.PI/180;
      		 JOptionPane.showMessageDialog(null,"El resultado es:\nsin ("+n_ing15+") = "+Math.sin(angulo));
      		 break;
      		case 2://coseno
      		 double n_ing16=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      		 double angulo2=n_ing16*Math.PI/180;
      		 JOptionPane.showMessageDialog(null,"El resultado es:\ncos ("+n_ing16+") = "+Math.cos(angulo2));
      		 break;
      		case 3://tangente
      		 double n_ing17=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      		 double angulo3=n_ing17*Math.PI/180;
      		 if((n_ing17==90)||(n_ing17==270)||(n_ing17==-90)||(n_ing17==-270)){
      		  JOptionPane.showMessageDialog(null,"El resultado es:\ntan ("+n_ing17+") = Indeterminado");
      		 }else{
      		  JOptionPane.showMessageDialog(null,"El resultado es:\ntan ("+n_ing17+") = "+Math.tan(angulo3));
      		 }
      		 break;
      		case 4://cosecante
      	     double n_ing18=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      	     double angulo4=n_ing18*Math.PI/180;
      	     if((n_ing18==0)||(n_ing18==360)||(n_ing18==180)||(n_ing18==-360)||(n_ing18==-180)){
      	      JOptionPane.showMessageDialog(null,"El resultado es:\ncsc ("+n_ing18+") = Indeterminado");
      	     }else{
      	      JOptionPane.showMessageDialog(null,"El resultado es:\ncsc ("+n_ing18+") = "+1/Math.sin(angulo4));
      	     }
      	     break;
      	    case 5://secante
      	     double n_ing19=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      	     double angulo5=n_ing19*Math.PI/180;
      	     if((n_ing19==90)||(n_ing19==270)||(n_ing19==-90)||(n_ing19==-270)){
      		  JOptionPane.showMessageDialog(null,"El resultado es:\nsec ("+n_ing19+") = Indeterminado");
      		 }else{
      	      JOptionPane.showMessageDialog(null,"El resultado es:\nsec ("+n_ing19+") = "+1/Math.cos(angulo5));
      		 }
      	     break;
      	    case 6://cotangente
      	     double n_ing20=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ángulo (en radianes)"));
      	     double angulo6=n_ing20*Math.PI/180;
      	     if((n_ing20==90)||(n_ing20==270)||(n_ing20==-90)||(n_ing20==-270)||(n_ing20==360)||(n_ing20==180)||(n_ing20==-360)||(n_ing20==-180)||(n_ing20==0)){
      		  JOptionPane.showMessageDialog(null,"El resultado es:\ncot ("+n_ing20+") = Indeterminado");
      		 }else{
      	      JOptionPane.showMessageDialog(null,"El resultado es:\ncot ("+n_ing20+") = "+1/Math.tan(angulo6));
      		 }
      	     break;
      		}
      		}
       //}while(numero!=12);
    }
}//PROBLEMS:                 {LOG!}                 [MATH.ROUND!]                 (DO-WHILE)                -RESULTS F. TRIGONOMÉTRICAS!-