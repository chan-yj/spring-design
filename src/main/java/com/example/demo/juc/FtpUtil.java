//package com.example.demo.juc;
//
//public class FtpUtil {
//
//    private static volatile boolean hasInit = false;
//
//    private static ObjectPool<FTPClient> ftpClientPool;
//
//
//    public static void init(ObjectPool<FTPClient> ftpClientPool) {
//        if (!hasInit) {   //1 2 3
//            synchronized (FtpUtil.class) {  //1
//                if (!hasInit) {
//                    FtpUtil.ftpClientPool = ftpClientPool;
//                    hasInit = true;
//                }
//            }
//        }
//    }
//
//}
