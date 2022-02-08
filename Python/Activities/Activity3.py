player1=input("Enter pl1 name")
player2=input("Enter pl2 name")

pl1_choose=input("Choose rock, paper or scissors?")
pl2_choose=input("Choose rock, paper or scissors?")

if(pl1_choose==pl2_choose):
    print("its a tie")

elif (pl1_choose=="rock" and pl2_choose=="scissors" ):
    print("Rock wins")
elif (pl1_choose=="rock" and pl2_choose=="paper" ):
    print("Rock wins")
elif (pl1_choose=="scissors" and pl2_choose=="rock" ):
    print("Rock wins")
elif (pl1_choose=="scissors" and pl2_choose=="paper" ):
    print("scissors wins")
elif (pl1_choose=="paper" and pl2_choose=="rock" ):
    print("Rock wins")
elif (pl1_choose=="paper" and pl2_choose=="scissors" ):
    print("scissors wins")

else:
    print("Invalid data")

