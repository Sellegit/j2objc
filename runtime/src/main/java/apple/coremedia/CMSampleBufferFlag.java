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


@Library("CoreMedia/CoreMedia.h")
@Mapping("CMSampleBufferFlag")
public final class CMSampleBufferFlag extends ObjCEnum {
    
    @GlobalConstant("kCMSampleBufferFlag_AudioBufferList_Assure16ByteAlignment")
    public static final long AudioBufferList_Assure16ByteAlignment = 1L;


}
