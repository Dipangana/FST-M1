
user1 = input("Player1? ")
user2 = input("Player2? ")


while True:
    
    user1 = input(user1 + ", do you want to choose rock, paper or scissors? ")
    
    
    user2 = input(user2 + ", do you want to choose rock, paper or scissors? ")
    
    
    if user1 == user2:
        print("It's a tie!")
    elif user1 == 'rock':
        if user2== 'scissors':
            print("Rock wins!")
        else:
            print("Paper wins!")
    elif user1 == 'scissors':
        if user2 == 'paper':
            print("Scissors win!")
        else:
            print("Rock wins!")
    elif user1 == 'paper':
        if user2 == 'rock':
            print("Paper wins!")
        else:
            print("Scissors win!")
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")

    
    repeat = input("Do you want to play another round? Yes/No: ")
    
    
    if(repeat == "yes"):
        pass
    
    elif(repeat == "no"):
        raise SystemExit
    
    else:
        print("You entered an invalid option. Exiting now.")
        raise SystemExit