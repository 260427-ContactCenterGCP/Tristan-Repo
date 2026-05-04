/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.texttospeech;

// [START tts_quickstart]
// Imports the Google Cloud client library
import com.google.cloud.texttospeech.v1.AudioConfig;
import com.google.cloud.texttospeech.v1.AudioEncoding;
import com.google.cloud.texttospeech.v1.SsmlVoiceGender;
import com.google.cloud.texttospeech.v1.SynthesisInput;
import com.google.cloud.texttospeech.v1.SynthesizeSpeechResponse;
import com.google.cloud.texttospeech.v1.TextToSpeechClient;
import com.google.cloud.texttospeech.v1.VoiceSelectionParams;
import com.google.protobuf.ByteString;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Google Cloud TextToSpeech API sample application. Example usage: mvn package exec:java
 * -Dexec.mainClass='com.example.texttospeech.QuickstartSample'
 */
public class QuickstartSample {

  /** Demonstrates using the Text-to-Speech API. */
  public static void main(String... args) throws Exception {

    String textInput = "Make a bear character in D&D 3.5\n" +
            "DM laughs\n" +
            "\n" +
            "Make bear a rogue, put every point I can into disguise\n" +
            "Prestige class as a spy to get more disguise\n" +
            "\n" +
            "DM says I can't speak english\n" +
            "\n" +
            "Max out bluff\n" +
            "\n" +
            "By growling and gesturing, I can fake speaking a language I don't speak (english)\n" +
            "\n" +
            "use money to hire a butler NPC\n" +
            "Give him magical item to let him speak bear\n" +
            "\n" +
            "\"GROWWWWWL\"\n" +
            "“An excellent suggestion, Mister Bearington. We really should ask the group to investigate the Black Marsh\"\n" +
            "\n" +
            "Over the course of the game, be knighted as Sir Bearington\n" +
            "Queen holds a dinner in my honor.\n" +
            "\n" +
            "A guest becomes the first man to ever make a perception check that can beat my disguise\n" +
            "Shouts out loud\n" +
            "\n" +
            "“HEY, THAT GUY'S NOT A GUY, HE'S JUST A BEAR!”\n" +
            "\n" +
            "Man is escorted out of the castle while the guards apologize profusely for the indignity\n" +
            "We're so sorry, Sir Bearington, very sorry for this man’s behavior”\n" +
            "\n" +
            "\"ROAR\" *shrug*";
    // Instantiates a client
    try (TextToSpeechClient textToSpeechClient = TextToSpeechClient.create()) {
      // Set the text input to be synthesized
      SynthesisInput input = SynthesisInput.newBuilder().setText(textInput).build();

      // Build the voice request, select the language code ("en-US") and the ssml voice gender
      // ("neutral")
      VoiceSelectionParams voice =
          VoiceSelectionParams.newBuilder()
              .setLanguageCode("en-US")
              .setSsmlGender(SsmlVoiceGender.MALE)
              .build();

      // Select the type of audio file you want returned
      AudioConfig audioConfig =
          AudioConfig.newBuilder().setAudioEncoding(AudioEncoding.MP3).build();

      // Perform the text-to-speech request on the text input with the selected voice parameters and
      // audio file type
      SynthesizeSpeechResponse response =
          textToSpeechClient.synthesizeSpeech(input, voice, audioConfig);

      // Get the audio contents from the response
      ByteString audioContents = response.getAudioContent();

      // Write the response to the output file.
      try (OutputStream out = new FileOutputStream("output.mp3")) {
        out.write(audioContents.toByteArray());
        System.out.println("Audio content written to file \"output.mp3\"");
      }
    }
  }
}
// [END tts_quickstart]
