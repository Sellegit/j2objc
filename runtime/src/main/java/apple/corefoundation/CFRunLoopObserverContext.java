package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Mapping("CFRunLoopObserverContext") @Library("CoreFoundation/CoreFoundation.h")
 class CFRunLoopObserverContext 
    extends Struct 
     {

    
    protected CFRunLoopObserverContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    @DotMapping("info")
    public native Todo getInfo();
    
    public static native CFRunLoopObserverContext copyWithversion(CFRunLoopObserverContext original, @MachineSizedSInt long version) /*-[
        original.version = version;
        return original;
    ]-*/;

    
    public static native CFRunLoopObserverContext copyWithinfo(CFRunLoopObserverContext original, Todo info) /*-[
        original.info = info;
        return original;
    ]-*/;

    
    
    
    
}
