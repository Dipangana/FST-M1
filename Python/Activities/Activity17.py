
import pandas


data = {
  "Usernames": ["Dipa", "Dipu", "Dipali","Dina"],
  "Passwords": ["password", "Dipu13", "Dipal123","Dino123"]
}


dataframe = pandas.DataFrame(data)


print(dataframe)


dataframe.to_csv("sample.csv", index=False)