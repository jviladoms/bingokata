# Reactive Programming Bingo Kata

## What Bingo is?

Bingo is a game of chance in which each player matches numbers printed in different arrangements on 3x5 cards which the numbers the game host (caller) draws at random, marking the selected numbers with tiles. The cards contain 15 numbers from 1 to 90 disposed in 3 lines of 9 numbers.

The first prize of Bingo is when one of the card that is playing the game mark 9 numbers in the same line. In this case the player says LINE!

The second and last prize is when a card gets all numbers. In this case the player says BINGO! and this card wins the game.

### Rules

 - The cards have to be created before the game starts.
 
 - When the game starts, the balls have to appear every 2 seconds. When a ball with prize is shown, it has to be detected and has to know the winner card and the prize.
 
 - If some error happens with the balls extraction the next ball has to be a ball with number 99
 
### Reactive Documentation

https://projectreactor.io/docs/core/release/reference/

#### Reactive case studies

https://github.com/etorres/reactor-101

