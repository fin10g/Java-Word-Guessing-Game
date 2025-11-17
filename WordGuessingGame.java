import java.security.SecureRandom;
import java.util.Scanner;

public class WordGuessingGame {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		Dictionary dict = new Dictionary("dictionary.txt");
		
		int numWords = dict.GetNumWords();
		if (numWords>0) {
			System.out.printf("\nI have picked a secret word. Try to guess its letters!\n");
			SecureRandom sr = new SecureRandom();
            String hidden = "";
            char dash = '-';
            StringBuilder word = new StringBuilder();
            int idx = 0;
			
            while(hidden.length()<5) {
				idx = sr.nextInt(numWords);
                hidden = dict.GetWordAt(idx);     
			}
            int counter = 0;
        
             //System.out.printf("\n%d\n", hidden.length());

            for (int j=0; j < hidden.length(); j++){
                word.append(dash);
            }
             System.out.printf("\n%s\n",word.toString());
             String builtWord = word.toString();
            //while(guess != -1){
            //while(counter<hidden.length()){
            while(!hidden.equals(builtWord)){
                //System.out.printf("\n%s\n", hidden);
                System.out.print("\nGuess> ");
                char guess = input.next().charAt(0);
                        for (int i=0; i < hidden.length(); i++){
                            char h = hidden.charAt(i);
                            char c = '-';
                                if (guess==h) {
                                    c = h;
                                     word.setCharAt(i, c);
                                } 
                            }    
                System.out.printf("\n%s\n",word.toString());
                counter ++;
                builtWord = word.toString(); 
                
            }
            System.out.printf("\nYou got it in %d guesses.\n", counter);
            
        }
		else{
			System.out.printf("\nFailed to load dictionary!");
        }
	}
} 
