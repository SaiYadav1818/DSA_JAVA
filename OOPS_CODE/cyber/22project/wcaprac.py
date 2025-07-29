"""import re
list1="'this's is " "a cat?where you find|\?"
pattern=r"',?|\""
combined_string = ''.join(list1)
print(combined_string)
chetha=re.findall(pattern,list1)
print(chetha)"""
#pattern=  r"\d{1,2}/\d{1,2}/\d{2}, \d{1,2}:\d{2}\s*[AP]M"
#pattern = '\d{1,2}/\d{1,2}/\d{2,4},\s\d{1,2}:\d{2}\s-\s'
#dates = re.findall(pattern, data)""# if pattern matches in the data then it stores in to the dates as a list
#print(dates)
#3/11/24, 6:47
#messages = re.split(pattern, data)[1:]#sperating dates and other messeage
#print(messages)
#df = pd.DataFrame({'user_message': messages, 'message_date': dates})
#df['message_date'] = pd.to_datetime(df['message_date'], format='%d/%m/%y, %I:%M %p')
#df['message_date'] = pd.to_datetime(df['message_date'],'%d/%m/%y, %I:%M\u202f%p',errors='coerce')
#df.rename(columns={'message_date': 'date'}, inplace=True)
#df.head(4)
#print(df)"""
  # Regular expression pattern to extract dates and messages
"""import re
import pandas as pd

# Your chat transcript"""
"""chat_transcript = """
"""3/11/24, 6:47 PM - Messages to yourself are end-to-end encrypted. No one outside of this chat, not even WhatsApp, can read or listen to them. Tap to learn more.
3/11/24, 6:47 PM - Sai Yadav: .
3/11/24, 6:47 PM - Sai Yadav: Feroz Bhai Electric.vcf (file attached)
3/11/24, 6:47 PM - Sai Yadav: Kumar Panthlu.vcf (file attached)
3/11/24, 6:47 PM - Sai Yadav: DOC-20240311-WA0016. (file attached)
3/20/24, 11:20 AM - Sai Yadav: <html>
<head>
<link href="css/css-columns4.css" rel="stylesheet" text="text/css">
</head>
<body> my datsa
"""
"""
# Regular expression pattern to extract dates and messages
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, chat_transcript)

# Create DataFrame with extracted dates and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)

print(df)"""
"""
import re
import pandas as pd

# Open and read the WhatsApp chat transcript file
with open("C:\\Users\\91868\\OneDrive\\Desktop\\projectsai\\whatsappdata.txt", "r", encoding="utf-8") as f:
    data = f.read()

# Define the pattern to extract date, time, sender, and message
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, data)

# Create DataFrame with extracted dates, times, senders, and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'User_Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)

# Splitting the 'User_Message' column by ': ' into two parts
users = []
messages = []
for data in df['User_Message']:
    entry = re.split('([\w\W]+?):\s', data)
    if entry[1:]:  # user name
        users.append(entry[1])
        messages.append(" ".join(entry[2:]))
    else:
        users.append('group_notification')
        messages.append(entry[0])

df['User'] = users
df['Message'] = messages
df.drop(columns=['User_Message'], inplace=True)

# Display the DataFrame
print(df)
""""""
import re
import pandas as pd

# Read the WhatsApp chat transcript file
with open("C:\\Users\\91868\\OneDrive\\Desktop\\projectsai\\whatsappdata.txt", "r", encoding="utf-8") as f:
    data = f.read()

# Define the pattern to extract date, time, sender, and message
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, data)

# Create DataFrame with extracted dates, times, senders, and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)

# Splitting the 'Message' column by ': ' into two parts to separate user and message
users = []
messages = []
for data in df['Message']:
    entry = re.split('([\w\W]+?):\s', data)
    if entry[1:]:  # user name
        users.append(entry[1])
        messages.append(" ".join(entry[2:]))
    else:
        users.append('group_notification')
        messages.append(entry[0])

df['User'] = users
df['Message'] = messages

# Drop the original 'Message' column
df.drop(columns=['Message'], inplace=True)

# Extract additional date components
df['only_date'] = df['Datetime'].dt.date
df['year'] = df['Datetime'].dt.year
df['month_num'] = df['Datetime'].dt.month
df['month'] = df['Datetime'].dt.month_name()
df['day'] = df['Datetime'].dt.day
df['day_name'] = df['Datetime'].dt.day_name()
df['hour'] = df['Datetime'].dt.hour
df['minute'] = df['Datetime'].dt.minute

# Add a 'period' column indicating the time interval for each message
period = []
for hour in df['hour']:
    if hour == 23:
        period.append(str(hour) + "-" + str('00'))
    elif hour == 0:
        period.append(str('00') + "-" + str(hour + 1))
    else:
        period.append(str(hour) + "-" + str(hour + 1))

df['period'] = period

# Display the DataFrame
print(df.head())
""""""
import re
import pandas as pd

# Read the WhatsApp chat transcript file
with open("C:\\Users\\91868\\OneDrive\\Desktop\\projectsai\\whatsappdata.txt", "r", encoding="utf-8") as f:
    data = f.read()

# Define the pattern to extract date, time, sender, and message
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, data)

# Create DataFrame with extracted dates, times, senders, and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)

# Splitting the 'Message' column by ': ' into two parts to separate user and message
users = []
messages = []
for data in df['Message']:
    entry = re.split('([\w\W]+?):\s', data)
    if entry[1:]:  # user name
        users.append(entry[1])
        messages.append(" ".join(entry[2:]))
    else:
        users.append('group_notification')
        messages.append(entry[0])

df['User'] = users
df['Message'] = messages

# Extract additional date components
df['Month'] = df['Datetime'].dt.month_name()
df['Date'] = df['Datetime'].dt.day
df['Time'] = df['Datetime'].dt.strftime('%I:%M %p')
df['Hour'] = df['Datetime'].dt.hour
df['Minute'] = df['Datetime'].dt.minute

# Add a 'period' column indicating the time interval for each message
period = []
for hour in df['Hour']:
    if hour == 23:
        period.append(str(hour) + "-" + str('00'))
    elif hour == 0:
        period.append(str('00') + "-" + str(hour + 1))
    else:
        period.append(str(hour) + "-" + str(hour + 1))

df['Period'] = period

# Rearrange columns
df = df[['Message', 'Month', 'Date', 'Time', 'Period', 'Sender', 'User', 'Minute', 'Hour']]

# Display the DataFrame
print(df.head())
"""
import re
import pandas as pd

# Read the WhatsApp chat transcript file
with open("C:\\Users\\91868\\OneDrive\\Desktop\\projectsai\\whatsappdata.txt", "r", encoding="utf-8") as f:
    data = f.read()

# Define the pattern to extract date, time, sender, and message
pattern = r"(\d{1,2}/\d{1,2}/\d{2}), (\d{1,2}:\d{2}\s*[AP]M) - (.*?): (.*)"

# Find all occurrences of the pattern in the chat transcript
matches = re.findall(pattern, data)

# Create DataFrame with extracted dates, times, senders, and messages
df = pd.DataFrame(matches, columns=['Date', 'Time', 'Sender', 'Message'])

# Convert date and time columns to datetime objects
df['Datetime'] = pd.to_datetime(df['Date'] + ' ' + df['Time'], format='%m/%d/%y %I:%M %p')

# Drop the separate Date and Time columns
df.drop(columns=['Date', 'Time'], inplace=True)

# Splitting the 'Message' column by ': ' into two parts to separate user and message
users = []
messages = []
for data in df['Message']:
    entry = re.split('([\w\W]+?):\s', data)
    if entry[1:]:  # user name
        users.append(entry[1])
        messages.append(" ".join(entry[2:]))
    else:
        users.append('group_notification')
        messages.append(entry[0])

df['User'] = users
df['Message'] = messages

# Extract additional date components
df['Month'] = df['Datetime'].dt.month_name()
df['Date'] = df['Datetime'].dt.day
df['Time'] = df['Datetime'].dt.strftime('%I:%M %p')
df['Hour'] = df['Datetime'].dt.hour
df['Minute'] = df['Datetime'].dt.minute

# Add a 'period' column indicating the time interval for each message
period = []
for hour in df['Hour']:
    if hour == 23:
        period.append(str(hour) + "-" + str('00'))
    elif hour == 0:
        period.append(str('00') + "-" + str(hour + 1))
    else:
        period.append(str(hour) + "-" + str(hour + 1))

df['Period'] = period

# Rearrange columns
df = df[['Message', 'Month', 'Date', 'Time', 'Period', 'Sender', 'User', 'Minute', 'Hour']]

# Display the DataFrame
print(df.head())
total_messages = len(df)
print("Total number of messages:", total_messages)

