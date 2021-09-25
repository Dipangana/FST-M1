
import pandas
from pandas import ExcelWriter


data = {
	'FirstName':["Sati", "Shiva", "Laxman","Gauri","Ganesh"],
	'LastName':["Pith", "Mahadev", "Ram","Parvati","Kartik"],
	'Email':["sati@example.com", "Shiva@example.com", "laxman@example.com","g@example.com","ga@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830","1234567890","2345234510"]
}


dataframe = pandas.DataFrame(data)


print(dataframe)


writer = ExcelWriter('excelexample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)


writer.save()