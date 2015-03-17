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





@Library("AudioToolbox/AudioToolbox.h")
@Mapping("CAFFileHeader")
public final class CAFFileHeader extends ObjCEnum {
    
    @GlobalConstant("kCAF_FileType")
    public static final long Type = 1667327590L;
    @GlobalConstant("kCAF_FileVersion_Initial")
    public static final long Version_Initial = 1L;
    

}
