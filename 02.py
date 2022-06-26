print("*********************************")
print("Bem vindo ao jogo de Adivinhação!")
print("*********************************")

numer = 42
chute1 = input ("Digite numero:")
print ("Você digitou: ", chute1)
chute = int (chute1)

if (numer == chute):
    print ("Voce acertou")
else:
    print ("você errou")