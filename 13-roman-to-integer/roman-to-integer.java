class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = romanToInt(s);
        System.out.print(s+" = "+ans);
    }
    public static int romanToInt(String s) {
        int temp = 0;
        for(int i = 0 ; i < s.length(); i++){
            int repetation = i;

            char first = s.charAt(i);
            char second = 0;
            if(i < s.length()-1){
                second = s.charAt(i+1);
            }
            if(first == 'I' && second == 'V'){
                temp += 4;
                repetation++;
            } else if(first == 'I' && second == 'X'){
                temp +=9;
                repetation++;
            } else if(first == 'X' && second == 'L'){
                temp +=40;
                repetation++;
            }else if(first == 'X' && second == 'C'){
                temp +=90;
                repetation++;
            } else if(first == 'C' && second == 'D'){
                temp +=400;
                repetation++;
            } else if(first == 'C' && second == 'M'){
                temp +=900;
                repetation++;
            }else if(first == 'I'){
                temp +=1;   
            } else if(first == 'V'){
                temp +=5;   
            } else if(first == 'X'){
                temp +=10;   
            } else if(first == 'L'){
                temp +=50;   
            } else if(first == 'C'){
                temp +=100;   
            } else if(first == 'D'){
                temp +=500;   
            } else if(first == 'M'){
                temp +=1000;   
            }
            i = repetation;
        }
        return temp;
    }
}