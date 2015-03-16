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
@Mapping("CMMetadataFormatType")
public final class CMMetadataFormatType extends ObjCEnum {
    
    @GlobalConstant("kCMMetadataFormatType_ICY")
    public static final long ICY = 1768126752L;
    @GlobalConstant("kCMMetadataFormatType_ID3")
    public static final long ID3 = 1768174368L;
    @GlobalConstant("kCMMetadataFormatType_Boxed")
    public static final long Boxed = 1835360888L;
    

}
