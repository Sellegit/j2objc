package apple.dispatch;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;





@Mapping("timespec")
 class timespec 
    extends Struct 
     {

    
    protected timespec() {}
    
    
    @DotMapping("tv_sec")
    public native @MachineSizedSInt long getTv_sec();
    @DotMapping("tv_nsec")
    public native @MachineSizedSInt long getTv_nsec();
    
    public static native timespec create(@MachineSizedSInt long tv_sec, @MachineSizedSInt long tv_nsec) /*-[
        timespec __new = { .tv_sec = tv_sec, .tv_nsec = tv_nsec };
        return __new;
    ]-*/;
    public static native timespec copyWithtv_sec(timespec original, @MachineSizedSInt long tv_sec) /*-[
        original.tv_sec = tv_sec;
        return __new;
    ]-*/;

    
    public static native timespec copyWithtv_nsec(timespec original, @MachineSizedSInt long tv_nsec) /*-[
        original.tv_nsec = tv_nsec;
        return __new;
    ]-*/;

    
}
