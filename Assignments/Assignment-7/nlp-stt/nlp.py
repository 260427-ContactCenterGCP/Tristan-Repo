# Imports the Google Cloud client library.
from google.cloud import language_v1
from pyasn1_modules.rfc7633 import Features

# Instantiates a client.
client = language_v1.LanguageServiceClient()

# CHANGE ME
texts = ["The Sandfall Interactive RPG led the ceremony with a historic 12 nominations, sweeping major categories including Best Game Direction, Best Narrative, Best Art Direction, Best Score, and Best Independent Game. This unprecedented sweep marks a significant milestone, as it is the most nominations any single game has received in the award's history.",
         "Comey surrenders over charge of threatening Trump's life in Instagram post",
         "I can't believe you've done that"]

for text in texts:

    document = language_v1.types.Document(
        content=text, type_=language_v1.types.Document.Type.PLAIN_TEXT
    )

    # Detects the sentiment of the text.
    sentiment = client.analyze_sentiment(
        request={"document": document}
    ).document_sentiment
    entities = client.analyze_entities(
        request={"document": document}
    )

    # Add in details for checking the entities, classification, and moderation results

    print(f"Text: {text}")
    print(f"Sentiment: {sentiment.score}, Magnitude: {sentiment.magnitude}")
    for entity in entities.entities:
        print(f"Entity name: {entity.name}, Type: {language_v1.Entity.Type(entity.type_).name}, Salience score : {entity.salience}")