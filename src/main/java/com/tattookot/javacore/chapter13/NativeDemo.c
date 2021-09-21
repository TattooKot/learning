#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_main_java_com_tattookot_javacore_chapter13_NativeDemo_test{

jclass cls;
jfieldID fid;
jint i;

printf("Start from c type file \n");
cls = (*env)->GetObjectClass(env, obj);
fld = (*env)->GetFieldID(env, cls, "i", "I");

if(i == 0){
printf("Cant get field id");
return;
}

i = (*env)->GetIntField(env, obj, fid);
printf("i = %d\n", i);
(*env)->setIntField(env, obj, fid, 2*i);
printf("class c end \n");



}