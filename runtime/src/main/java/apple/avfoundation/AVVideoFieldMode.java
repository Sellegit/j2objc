package apple.avfoundation;


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
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Library("AVFoundation")
@Mapping("AVVideoFieldMode")
public final class AVVideoFieldMode extends ObjCEnum {
    
    @GlobalConstant("AVVideoFieldModeBoth")
    public static final long Both = 0L;
    @GlobalConstant("AVVideoFieldModeTopOnly")
    public static final long TopOnly = 1L;
    @GlobalConstant("AVVideoFieldModeBottomOnly")
    public static final long BottomOnly = 2L;
    @GlobalConstant("AVVideoFieldModeDeinterlace")
    public static final long Deinterlace = 3L;
    

}
