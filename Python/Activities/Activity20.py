import pandas
dataframe=pandas.read_excel('Activity20.xlsx');
print(dataframe)
print("+++++++++++++++++++++++++++++++++++++++++++++++++++")
print("Num of rows and col",dataframe.shape)
print("++++++++++EMAIL++++++++")
print("Email col",dataframe['Email'])
print("sortFirstName",dataframe.sort_values('FirstName'))