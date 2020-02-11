 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int sum = 1;
          for ( int i = 2; i <= number; i++ ) {
              sum *= i;
          }
          return sum;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          //StringBuilder acronym = new StringBuilder();
          String acronym = "";
          String[] words = phrase.split(" ");
          for (String word : words) {
            //System.out.println(word);
	    //acronym.append(word.charAt(0));
	    acronym += word.charAt(0);
	  }
	  //return acronym.toString().toUpperCase();
	  return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       * 
       * 
       */ 
      public String encrypt(String word) {
          // StringBuilder encrypt = new StringBuilder();
          String encrypt = "";
          for (int i = 0; i < word.length(); i++) {
              char letter = word.charAt(i);
              if ( letter == 'x' || letter == 'y' || letter == 'z') {
                  letter -= 26;
              }
              letter += 3;
              encrypt += letter;
          }
          return encrypt;
      }
}
