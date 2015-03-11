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





@Library("CoreMedia")
@Mapping("CMAttachmentMode")
public final class CMAttachmentMode extends ObjCEnum {
    
    @GlobalConstant("kCMAttachmentMode_ShouldNotPropagate")
    public static final long ShouldNotPropagate = 0L;
    @GlobalConstant("kCMAttachmentMode_ShouldPropagate")
    public static final long ShouldPropagate = 1L;
    

}
