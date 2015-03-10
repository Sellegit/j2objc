package apple.coremedia;


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
import apple.foundation.*;
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;





@Mapping("CMBlockBufferCustomBlockSource")
public class CMBlockBufferCustomBlockSource 
    extends Struct 
     {

    
    public static final int Version = 0;
    
    protected CMBlockBufferCustomBlockSource() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("refCon")
    public native Todo getRefCon();
    
    public static native CMBlockBufferCustomBlockSource copyWithversion(CMBlockBufferCustomBlockSource original, int version) /*-[
        original.version = version;
        return __new;
    ]-*/;

    
    
    
    public static native CMBlockBufferCustomBlockSource copyWithrefCon(CMBlockBufferCustomBlockSource original, Todo refCon) /*-[
        original.refCon = refCon;
        return __new;
    ]-*/;

    
}
