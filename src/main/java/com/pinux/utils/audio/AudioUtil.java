package com.pinux.utils.audio;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.AudioUtils;
import it.sauronsoftware.jave.EncodingAttributes;

import java.io.File;

/**
 * * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @ClassName AudioUtil
 * @Description TODO
 * @Author pinux
 * @Date 19-3-28 上午2:07
 * @Version 1.0
 */
public class AudioUtil {

    /**
     * @return
     * @Author pinux
     * @Description amr转MP3,wav
     * @Date 上午2:22 19-3-28
     * @Param
     **/
    public static void amrToMp3() {
        File source = new File("/resources/aa.amr");
        File target = new File("/resources/testAudio.mp3");
        AudioUtils.amrToMp3(source, target);
        //AudioUtils.amrToWav(source,target);
    }

    public static File transform(String sourceName, String destFileName) throws Exception {
        File source = new File(sourceName);
        File target = new File(destFileName);

        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("pcm_alaw"); //ffmpeg编码
        audio.setBitRate(new Integer(64000));//设置比特率
        audio.setChannels(new Integer(1));  //1 mono 单声道 2 stereo 立体声
        audio.setSamplingRate(new Integer(8000));///设置节录率

        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("wav");//设置转码后的格式，这里是MP3转WAV，所有是WAV
        attrs.setAudioAttributes(audio);

        WavToMp3Encoder encoder = new WavToMp3Encoder();//继承Encoder重写processErrorOutput方法,否则Linux下会出现jave.EncoderException: Stream mapping错误

        encoder.encode(source, target, attrs);

        return target;
    }

    public static void main(String[] args) {
        try {
            transform("/resources/125.mp3", "/resources/target.wav");
            //amrToMp3();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}