import re
import pandas as pd
f1= open("C:\\Users\\91868\\OneDrive\\Desktop\\projectsai\\whatsappdata.txt", "r", encoding="utf-8")
data=f1.read()
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, data)

# Create DataFrame with extracted dates and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)
df.head(4)
#print(df)
users = []
messages = []
for data in df['user_message']:
    entry = re.split('([\w\W]+?):\s', data)
    if entry[1:]:  # user name
        users.append(entry[1])
        messages.append(" ".join(entry[2:]))
    else:
        users.append('group_notification')
        messages.append(entry[0])

df['user'] = users
df['message'] = messages
df.drop(columns=['user_message'], inplace=True)
df['only_date'] = df['date'].dt.date
df['year'] = df['date'].dt.year
df['month_num'] = df['date'].dt.month
df['month'] = df['date'].dt.month_name()
df['day'] = df['date'].dt.day
df['day_name'] = df['date'].dt.day_name()
df['hour'] = df['date'].dt.hour
df['minute'] = df['date'].dt.minute
#add period column that shows data capture between which 24 hour format
period = []
for hour in df[['day_name', 'hour']]['hour']:
    if hour == 23:
        period.append(str(hour) + "-" + str('00'))
    elif hour == 0:
        period.append(str('00') + "-" + str(hour + 1))
    else:
        period.append(str(hour) + "-" + str(hour + 1))

df['period'] = period
df.head()
