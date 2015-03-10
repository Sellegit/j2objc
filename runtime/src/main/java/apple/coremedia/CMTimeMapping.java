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





@Mapping("CMTimeMapping")
public class CMTimeMapping 
    extends Struct 
     {

    
    protected CMTimeMapping() {}
    
    
    @DotMapping("source")
    public native CMTimeRange getSource();
    @DotMapping("target")
    public native CMTimeRange getTarget();
    
    public static native CMTimeMapping create(CMTimeRange source, CMTimeRange target) /*-[
        CMTimeMapping __new = { .source = source, .target = target };
        return __new;
    ]-*/;
    public static native CMTimeMapping copyWithsource(CMTimeMapping original, CMTimeRange source) /*-[
        original.source = source;
        return __new;
    ]-*/;

    
    public static native CMTimeMapping copyWithtarget(CMTimeMapping original, CMTimeRange target) /*-[
        original.target = target;
        return __new;
    ]-*/;

    
}
