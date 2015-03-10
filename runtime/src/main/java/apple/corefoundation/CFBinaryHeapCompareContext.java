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





@Mapping("CFBinaryHeapCompareContext")
public class CFBinaryHeapCompareContext 
    extends Struct 
     {

    
    protected CFBinaryHeapCompareContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    @DotMapping("info")
    public native Todo getInfo();
    
    public static native CFBinaryHeapCompareContext copyWithversion(CFBinaryHeapCompareContext original, @MachineSizedSInt long version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    public static native CFBinaryHeapCompareContext copyWithinfo(CFBinaryHeapCompareContext original, Todo info) /*-[
        original.info = info;
        return __new;
    ]-*/;

    
    
    
    
}
