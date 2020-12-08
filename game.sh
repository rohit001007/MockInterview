#!/bin/bash

function play(){

echo "1.Rock,2.Paper,3.Scesor"

var$(($RANDOM%3+1))

read -p "Enter Your Chopice : "choice

while[true]
do
	if[ $var == 1 ]
	then
		if [ $choice == 1 ]
		then
			echo -ne "\n R V R = Tie"
		elif [ $choice == 2 ]
		then
			echo -ne "\n R V P = Paper Win"
		elif [ $choice == 3 ]
		then
			echo -ne "\n  R V S = Rock Win"
		fi

	elif [ $var == 2 ]
	then
		if [ $choice == 1 ]
                then
                        echo -ne "\n P V R = Paper Win"
                elif [ $choice == 2 ]
                then
                        echo -ne "\n P V P = Tie"
                elif [ $choice == 3 ]
                then
                        echo -ne "\n  P V S = Scesor Win"
                fi

	
