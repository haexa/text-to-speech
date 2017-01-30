import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.audio.JavaClipAudioPlayer;
import com.sun.speech.freetts.en.us.CMULexicon;
import com.sun.speech.freetts.lexicon.Lexicon;

/**
 * Created by Vin on 30/01/2017.
 */
public class TextToSpeech {
    public static void voice(String text){
        /**
         * @param: speechString
         * @action: pronounces the string
         * */

        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("kevin16");
        voice.allocate();
        voice.speak(text);
    }
}
