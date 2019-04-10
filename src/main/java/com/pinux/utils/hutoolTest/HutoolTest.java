package com.pinux.utils.hutoolTest;

import cn.hutool.system.SystemUtil;

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
 * @ClassName HutoolTest
 * @Description TODO
 * @Author pinux
 * @Date 19-4-10 下午3:23
 * @Version 1.0
 */
public class HutoolTest {

    public static void main(String[] args) {
        try {


            SystemUtil.getRuntimeInfo();



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}