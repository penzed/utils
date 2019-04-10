package com.pinux.utils.audio;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncoderProgressListener;
import it.sauronsoftware.jave.EncodingAttributes;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

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
 * @ClassName WavToMp3Encoder
 * @Description TODO 继承Encoder重写processErrorOutput方法
 * @Author pinux
 * @Date 19-3-12 上午9:01
 * @Version 1.0
 */
public class WavToMp3Encoder extends Encoder {

    @Override
    protected void processErrorOutput(EncodingAttributes attributes, BufferedReader errorReader, File source, EncoderProgressListener listener) throws EncoderException, IOException {

        try {
            String line;
            while ((line = errorReader.readLine()) != null) {
            }
        } catch (Exception exp) {
        }
    }
}