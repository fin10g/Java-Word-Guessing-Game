# Java-Word-Guessing-Game
A Simple 'Hangmanesque' word guessing game that picks a random word from a dictionary file and takes in single character inputs.

## Features
• A Java program which uses a Dictionary class and dictionary.txt file.

• The program randomly picks a word of minimum length 5 letters from the dictionary.txt.

• The user must guess the letters in the word and try to get the whole word in as few guesses as possible. (a politically incorrect person might call the game 'Hangman’)

• The program displays missing letters as ‘-’ characters and replaces them with the correct letters as they are guessed by using the StringBuilder class.

## Sample output

I have picked a secret word. Try to guess its letters!

-------

Guess> e

-e---e-

Guess> s

-e---es

Guess> r

-err-es

Guess> i

-erries

Guess> b

-erries

Guess> f

ferries

You got it in 6 guesses.
 
