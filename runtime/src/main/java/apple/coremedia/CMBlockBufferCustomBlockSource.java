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


@Mapping("CMBlockBufferCustomBlockSource") @Library("CoreMedia/CoreMedia.h")
public class CMBlockBufferCustomBlockSource 
    extends Struct 
     {

    
    public static final int Version = 0;

    private CMBlockBufferCustomBlockSource() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    @DotMapping("refCon")
    public native Todo getRefCon();

    
}
