//nama saydova alga kusumah purwonegoro
//Expected Output
//bACcd
//Oekn

public class soal {


    public static void main(String[] args) {

        String[] input = {"Oke", "One"};



        System.out.println(soal(input));
    }

    public static String soal(String[] input){
        String castinput = String.join("",input);
        char [] allChar = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
                'Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
                'q','r','s','t','u','v','w','x','y','z'};
        int [] value = new int[52];
        char [] inputChar= castinput.toCharArray();
        StringBuilder hasil= new StringBuilder();
        int sum=0;
        for (int i =0; i<inputChar.length ;i++){

            for (int j =0; j<allChar.length;j++){
                if (inputChar[i]==allChar[j]){
                    value[j]++;
                    break;
                }
            }
        }

            for (int i =0; i<allChar.length;i++){
                if (value[i] !=0){
                    hasil.append(allChar[i]);
                }
            }

    return hasil.toString();
    }
}

