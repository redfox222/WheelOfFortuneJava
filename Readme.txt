
*********************************      Git Information      *****************************************
you can click the clone or download button on the right and click open in desktop to add the file to your desktop.

When you use git you have to commit your changes when you are finished making changes.

click the changes tab at the top of git then add a description to the change and click commit changes at the bottom.

********************************     Project Requirements      *************************************
Wheel of Fortune

*Participating teams must create a WOF game to meet the following parameters: *

Allow user to set number of players and number of puzzles to be solved per game
Give user the option to start a Standard WOF Game or Exit
Players can Spin the wheel for a cash prize
Players can Solve the puzzle to win the game
Player winnings are carried over from puzzle to puzzle
Displays each player’s game winnings at the end of the game
Players:

Must be identified by name
Have a game cash balance
Have a round cash balance
Can lose a turn
Can be bankrupted
Puzzle:

Made up of 5 Categories

On the Map
Event
Movie Title
Before & After
What Are You Doing?
Each Category must have 5 Puzzles Phrases

These Categories must be randomly selected for each Game depending on the number of puzzles to be solved per game
Corresponding Puzzles for each Category must also be randomly selected
Each Puzzle Phrase will be hidden with “*” for each character and separated with where appropriate. No special characters such as: ! - & , ? etc.
Game:

Each Player will be shown Puzzle #, Category, and Phrase to be solved.
Each Player will be given the choice to Spin the Wheel or Solve the Puzzle each round.
If Player chooses to Spin, spin will be generated based on the Wheel Parameters.
The Spin can generate a cash prize, a Bankrupt or a Loose Turn.
If Player gets a Bankrupt then Player’s round cash balance becomes $0 and Looses Turn.
If Player gets a Loose Turn then Player loses turn and round cash balance remains.
If Player gets cash prize then Player is allowed to guess a letter.
If the letter matches in the Puzzle Phrase then Player wins cash prize times number of letters matched. Show the new round balance and the current state of the Puzzle Phrase.
If Player guesses a letter that has already been guessed then Player loses turn.
If Player guesses a letter not in the Puzzle Phrase then Player loses turn.
If Player chooses to Solve the Puzzle then Player gets one chance to solve or loses turn.
If Player solution matches Puzzle Phrase then Player wins and that Puzzle Round ends and next Puzzle Round begins if more than one puzzle was chosen at start of game.
If Player wins then all Player Round Balances are reset to 0. Winning Player game balance is carried forward until the end of the game.
At the end of each Puzzle Round, the first player is rotated to the end of the line and the next player is moved up to the first position.
At the end of the Game, display each Player’s game balance.
Standard Wheel Parameters

Contains 12 slots
1 slot is designated for Bankrupt
1 slot is designated for Loose Turn
Each remain 10 slots will start with a base of 500 and will add a random value of 50, 100, 200, or 400
Min value is 550 and Max value is 900
Spin the Wheel will randomly select one of these 12 slots
