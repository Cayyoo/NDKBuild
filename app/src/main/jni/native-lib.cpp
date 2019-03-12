//
// Created by Administrator on 2019/3/12.
//

#include "com_example_ndkbuild_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_example_ndkbuild_MainActivity_stringFromJNI
        (JNIEnv *env, jobject) {
    return env->NewStringUTF("Hello from C++");
}