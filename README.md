# FE7-Stat-Calculator

This project is made to tell you how close to or far from average your units in Fire Emblem 7: Blazing Sword are. This project takes in your data from your current playthrough of the game and tells you how your units compare to what they would be on average. This comparison includes level increments, class changing, and stat boosters.

# Getting Started

In order to use this program, you have to write the data for your units you would like to compare in the file input.txt. The first line only contains the word Normal or Hard, depending on the difficulty you are playing on. Each line after that is dedicated to one of your units. These lines are structured as you see below, with the unit's name, current class, current level, promotion level, current stats in the order of HP; Strength; Skill; Speed; Luck; Defense; and Resistance, and the number of stat boosters added in the same order of the stats as before.

Example: 
Hard
Lyn Lord 5 0 18 5 10 13 7 3 1 0 0 0 0 0 0 0

Once input.txt is filled out with the units' stats that you want to check, run java Main input.txt in the terminal and your results will be written on a separate .txt file.

# Prerequisites
All you need is java installed on your computer to run this program.

# Author
Brendan Klayman

# Aknowledgements
Serene's Forest
Fire Emblem Wiki