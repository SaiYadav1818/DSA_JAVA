import pandas as pd
import re
import matplotlib.pyplot as plt
import seaborn as sns
from wordcloud import WordCloud
from textblob import TextBlob
import zipfile
import os

# Function to extract file from zip
def extract_zip(zip_path, extract_to='.'):
    with zipfile.ZipFile(zip_path, 'r') as zip_ref:
        zip_ref.extractall(extract_to)

# Extract the zip file
zip_path = r"C:\Users\dudim\OneDrive\Desktop\java program\Desktop\python\text.txt.zip"
extract_to = r"C:\Users\dudim\OneDrive\Desktop\java program\Desktop\python"
extract_zip(zip_path, extract_to)

# Find the extracted text file
extracted_files = os.listdir(extract_to)
txt_files = [file for file in extracted_files if file.endswith('.txt')]
if not txt_files:
    raise FileNotFoundError("No text file found in the extracted contents.")
file_path = os.path.join(extract_to, txt_files[0])

# Function to read WhatsApp chat data
def read_chat(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        return file.readlines()

# Function to parse chat data
def parse_chat(lines):
    messages = []
    for line in lines:
        date_time, message = None, None
        try:
            date_time, message = line.split(' - ', 1)
        except ValueError:
            continue

        if ': ' in message:
            sender, content = message.split(': ', 1)
            messages.append([date_time, sender, content])
    return pd.DataFrame(messages, columns=['date_time', 'sender', 'message'])

# Load and parse chat data
lines = read_chat(file_path)
chat_df = parse_chat(lines)

# Convert date_time to datetime
chat_df['date_time'] = pd.to_datetime(chat_df['date_time'], format='%m/%d/%y, %I:%M %p')

# Calculate the most active person
most_active_person = chat_df['sender'].value_counts().idxmax()
message_count = chat_df['sender'].value_counts().max()
print(f'Most active person: {most_active_person} with {message_count} messages.')

# Display other analysis as per your previous script (total messages, words, timelines, etc.)

# Total number of messages
total_messages = chat_df.shape[0]
print(f'Total messages: {total_messages}')

# Total number of words
chat_df['word_count'] = chat_df['message'].apply(lambda x: len(x.split()))
total_words = chat_df['word_count'].sum()
print(f'Total words: {total_words}')

# Number of media and links shared
media_messages = chat_df[chat_df['message'] == '<Media omitted>'].shape[0]
links_shared = chat_df['message'].apply(lambda x: len(re.findall(r'http[s]?://', x))).sum()
print(f'Media messages: {media_messages}')
print(f'Links shared: {links_shared}')

# Monthly and daily timeline
chat_df['month_year'] = chat_df['date_time'].dt.to_period('M')
monthly_timeline = chat_df.groupby('month_year').size()

plt.figure(figsize=(10, 5))
monthly_timeline.plot()
plt.title('Monthly Chat Activity')
plt.xlabel('Month-Year')
plt.ylabel('Number of Messages')
plt.show()

chat_df['date'] = chat_df['date_time'].dt.date
daily_timeline = chat_df.groupby('date').size()

plt.figure(figsize=(10, 5))
daily_timeline.plot()
plt.title('Daily Chat Activity')
plt.xlabel('Date')
plt.ylabel('Number of Messages')
plt.show()

# Most busy day and month
chat_df['day_of_week'] = chat_df['date_time'].dt.day_name()
busy_day = chat_df['day_of_week'].value_counts().idxmax()
print(f'Most busy day: {busy_day}')

chat_df['month'] = chat_df['date_time'].dt.month_name()
busy_month = chat_df['month'].value_counts().idxmax()
print(f'Most busy month: {busy_month}')

# Weekly activity map
weekly_activity = chat_df['day_of_week'].value_counts()

plt.figure(figsize=(10, 5))
sns.barplot(x=weekly_activity.index, y=weekly_activity.values, palette='viridis', hue=weekly_activity.index, legend=False)
plt.title('Weekly Activity Map')
plt.xlabel('Day of the Week')
plt.ylabel('Number of Messages')
plt.show()

# Most busy users
busy_users = chat_df['sender'].value_counts()

plt.figure(figsize=(10, 5))
sns.barplot(x=busy_users.index, y=busy_users.values, palette='viridis', hue=busy_users.index, legend=False)
plt.title('Most Busy Users')
plt.xlabel('User')
plt.ylabel('Number of Messages')
plt.xticks(rotation=90)
plt.show()

# Top and common words in conversation
from collections import Counter
from wordcloud import STOPWORDS

def remove_stopwords(text):
    return ' '.join([word for word in text.split() if word.lower() not in STOPWORDS])

all_words = ' '.join(chat_df['message'])
all_words_cleaned = remove_stopwords(all_words)
word_counts = Counter(all_words_cleaned.split())

most_common_words = word_counts.most_common(10)
print(f'Most common words: {most_common_words}')

# Word Cloud
wordcloud = WordCloud(width=800, height=400, background_color='white').generate(all_words_cleaned)
plt.figure(figsize=(10, 5))
plt.imshow(wordcloud, interpolation='bilinear')
plt.axis('off')
plt.title('Word Cloud of Messages')
plt.show()

# Busiest hours analysis
chat_df['hour'] = chat_df['date_time'].dt.hour
busiest_hours = chat_df['hour'].value_counts().sort_index()

plt.figure(figsize=(10, 5))
sns.lineplot(x=busiest_hours.index, y=busiest_hours.values, marker='o')
plt.title('Busiest Hours of the Day')
plt.xlabel('Hour of the Day')
plt.ylabel('Number of Messages')
plt.xticks(range(24))
plt.grid(True)
plt.show()

# Pie chart for message distribution among users
plt.figure(figsize=(8, 8))
plt.pie(busy_users.values, labels=busy_users.index, autopct='%1.1f%%', startangle=140)
plt.title('Message Distribution Among Users')
plt.show()



