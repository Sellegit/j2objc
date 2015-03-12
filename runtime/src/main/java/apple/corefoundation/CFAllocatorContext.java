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





@Mapping("CFAllocatorContext")
public class CFAllocatorContext 
    extends Struct 
     {

    
    protected CFAllocatorContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    @DotMapping("info")
    public native Todo getInfo();
    
    public static native CFAllocatorContext copyWithversion(CFAllocatorContext original, @MachineSizedSInt long version) /*-[
        original.version = version;
        return original;
    ]-*/;

    
    public static native CFAllocatorContext copyWithinfo(CFAllocatorContext original, Todo info) /*-[
        original.info = info;
        return original;
    ]-*/;

    
    
    
    
    
    
    
    
}
