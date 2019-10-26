
public class Controller
{
  public String decimalToBinary(double num, int k_precis){
            String binary ="";
            int integr= (int) num;
            double fract = num - integr;
            while(integr > 0){
                int rem = integr % 2;
                binary += ((char)(rem+'0'));
                integr /=2;
            }
            binary = reverse(binary);
            binary +=('.');
            
            while (k_precis-- > 0){
                fract *=2;
                int fract_b = (int) fract;
                if(fract_b == 1){
                    fract -= fract_b;
                    binary += (char)(1+'0');
                }else{
                    binary += (char)(0+'0');
                }
            }
            
            return binary;
        }
        
  public String reverse(String input){
            char[] temArray = input.toCharArray();
            int lef, righ =0;
            righ= temArray.length - 1;
            
            for(lef = 0; lef < righ;lef++,righ--){
                char tem = temArray[lef];
                temArray[lef] = temArray[righ];
                temArray[righ] = tem;
            }
            return String.valueOf(temArray);
        }
        
}
