class Solution {
    public String intToRoman(int number) {
        String roman="";
        int restdigit=0;
        int rest=0;
        if(number>=1000){
            int a = number/1000;
            for (int i=0; i<a; i++){
                roman= roman+ "M";
            }
            number= number%1000;
        }
        
        if(number<1000){
            
            if(number>=900){
                roman= roman+ "CM";
                number= number%900;
            }
            
            if(number>=500 && number<900){
                roman= roman+ "D";
                
                number= number%500;;
                
            }
            if(number>=400){
                roman= roman+ "CD";
                number= number%400;
            }
        }
        if(number <400 && number>=100){
                int b= number/100;
                for (int j=0; j<b; j++){
                    roman= roman+ "C";
                }
                number= number%100;
            }
        if(number<100){
            if(number>=90){
                roman= roman+ "XC";
                number=number%90;
            }
            if(number>=50){
                roman= roman+ "L";
                number= number%50; 
            }
            if(number>=40){
                roman= roman+ "XL";
                number= number%40;
            }
            if(number <40 && number>=10){
                int c= number/10;
                for (int k=0; k<c; k++){
                    roman= roman+ "X";
                }
                restdigit=number%10;
                number= restdigit;
            }
            if(number<10){
                if(number==9){
                    roman= roman+ "IX";
                }
                if(number>=5 && number <9){
                    roman= roman+ "V";
                    rest= number%5;
                    number= rest;
                }
                if(number==4){
                    roman= roman+ "IV";
                }
                if(number<4){
                    int d= number/1;
                    for (int l=0; l<d; l++){
                        roman= roman+ "I";
                    }
                }
            }
        }
        return roman;
    }
}