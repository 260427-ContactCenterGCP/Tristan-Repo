# Natural Language Processing 

Text: The Sandfall Interactive RPG led the ceremony with a historic 12 nominations, sweeping major categories including Best Game Direction, Best Narrative, Best Art Direction, Best Score, and Best Independent Game. This unprecedented sweep marks a significant milestone, as it is the most nominations any single game has received in the award's history.

Sentiment: 0.800000011920929, Magnitude: 1.600000023841858

Entity name: Sandfall Interactive RPG, Type: ORGANIZATION, Salience score : 0.24870675802230835

Entity name: ceremony, Type: EVENT, Salience score : 0.2059853971004486

Entity name: nominations, Type: OTHER, Salience score : 0.09417759627103806

Entity name: categories, Type: OTHER, Salience score : 0.0831870436668396

Entity name: sweep, Type: PERSON, Salience score : 0.0607234351336956

Entity name: Score, Type: OTHER, Salience score : 0.05754457041621208

Entity name: Narrative, Type: PERSON, Salience score : 0.056860167533159256

Entity name: Best Independent Game, Type: OTHER, Salience score : 0.03930169343948364

Entity name: Best Art Direction, Type: OTHER, Salience score : 0.03907466307282448

Entity name: nominations, Type: OTHER, Salience score : 0.02819022536277771

Entity name: Best Game Direction, Type: OTHER, Salience score : 0.025877824053168297

Entity name: game, Type: WORK_OF_ART, Salience score : 0.024210147559642792

Entity name: history, Type: OTHER, Salience score : 0.013638610020279884

Entity name: award, Type: OTHER, Salience score : 0.013638610020279884

Entity name: milestone, Type: OTHER, Salience score : 0.008883269503712654

Entity name: 12, Type: NUMBER, Salience score : 0.0

---

Text: Comey surrenders over charge of threatening Trump's life in Instagram post

Sentiment: -0.699999988079071, Magnitude: 0.699999988079071

Entity name: Comey, Type: PERSON, Salience score : 0.3921843469142914

Entity name: charge, Type: OTHER, Salience score : 0.26562875509262085

Entity name: Trump, Type: PERSON, Salience score : 0.11421164870262146

Entity name: post, Type: OTHER, Salience score : 0.09424467384815216

Entity name: Instagram, Type: OTHER, Salience score : 0.08003459870815277

Entity name: life, Type: OTHER, Salience score : 0.05369597673416138

---

Text: I can't believe you've done that

Sentiment: -0.20000000298023224, Magnitude: 0.20000000298023224

# Speech To Text

Transcript 1: we're doing my recordings so that it's saved in a wall format but let's still say Sandra to see if it can
Confidence 1: 88.86%

Transcript 1:  properly
Confidence 1: 96.30%

Transcript 1:  parse that word
Confidence 1: 97.34%

Transcript 2: all right we're going to see if this is going to be able to recognize my voice as I have a northern lion video playing in the background
Confidence 2: 95.64%

# Text To Speech
## Plain Text Version
<p> 
Make a bear character in D&D 3.5
<br/>DM laughs
</p>

Make bear a rogue, put every point I can into disguise<br/>
Prestige class as a spy to get more disguise

DM says I can't speak english

Max out bluff

By growling and gesturing, I can fake speaking a language I don't speak (english)

use money to hire a butler NPC<br/>
Give him magical item to let him speak bear

"GROWWWWWL"<br/>
“An excellent suggestion, Mister Bearington. We really should ask the group to investigate the Black Marsh"

Over the course of the game, be knighted as Sir Bearington<br/>
Queen holds a dinner in my honor.

A guest becomes the first man to ever make a perception check that can beat my disguise<br/>
Shouts out loud

“HEY, THAT GUY'S NOT A GUY, HE'S JUST A BEAR!”

Man is escorted out of the castle while the guards apologize profusely for the indignity<br/>
We're so sorry, Sir Bearington, very sorry for this man’s behavior”

"ROAR" *shrug*

## SMML Version
```HTML
<speak>
  <p>Make a bear character in D and D 3.5.</p>
  <p>DM laughs.</p>

  <p>Make bear a rogue. Put every point I can into disguise.</p>
  <p>Prestige class as a spy to get more disguise.</p>

  <p>DM says I can't speak English.</p>
  <p>Max out bluff.</p>

  <p>By growling and gesturing, I can fake speaking a language I don't speak. English.</p>

  <p>Use money to hire a butler NPC.</p>
  <p>Give him magical item to let him speak bear.</p>

  <p>
    <prosody rate="x-slow" pitch="-1st" volume="x-loud"><phoneme alphabet="ipa" ph="ɡɹaʊːːːl">GROWWWWWL</phoneme></prosody>
  </p>

  <prosody rate="85%" pitch="+2st" volume="loud">
    <emphasis level="strong">An excellent suggestion,</emphasis> Mister Bearington.
    We really should ask the group to investigate the Black Marsh.
  </prosody>


  <p>Over the course of the game, be knighted as Sir Bearington.</p>
  <p>Queen holds a dinner in my honor.</p>

  <p>A guest becomes the first man to ever make a perception check that can beat my disguise.</p>
  <p>Shouts out loud.</p>

  <p>
    <emphasis level="strong"><s>“Hey! That guy's not a guy! He's just a bear!”</s></emphasis>
  </p>

  <p>
    <s>Man is escorted out of the castle while the guards apologize profusely for the indignity.</s>
    <s>“We're so sorry, Sir Bearington.</s>
    <s>Very sorry for this man’s behavior.”</s>
  </p>

  <p>
    <prosody rate="x-slow" pitch="-2st" volume="x-loud"><phoneme alphabet="ipa" ph="ʀɑːːːːʁ">ROAR</phoneme></prosody>
    <break time="500ms"/>
    <emphasis level="moderate">shrug.</emphasis>
  </p>
</speak>
```