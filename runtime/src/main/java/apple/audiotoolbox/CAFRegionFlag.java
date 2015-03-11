package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Library("AudioToolbox")
@Mapping("CAFRegionFlag")
public final class CAFRegionFlag extends ObjCEnum {
    
    @GlobalConstant("kCAFRegionFlag_LoopEnable")
    public static final long LoopEnable = 1L;
    @GlobalConstant("kCAFRegionFlag_PlayForward")
    public static final long PlayForward = 2L;
    @GlobalConstant("kCAFRegionFlag_PlayBackward")
    public static final long PlayBackward = 4L;
    

}
