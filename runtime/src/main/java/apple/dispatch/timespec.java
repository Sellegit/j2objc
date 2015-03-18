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





@Mapping("timespec") @Library("dispatch/dispatch.h")
 class timespec 
    extends Struct 
     {

    
    private timespec() {}
    
    
    @DotMapping("tv_sec")
    public native @MachineSizedSInt long getTv_sec();
    @DotMapping("tv_nsec")
    public native @MachineSizedSInt long getTv_nsec();
    
    
}
