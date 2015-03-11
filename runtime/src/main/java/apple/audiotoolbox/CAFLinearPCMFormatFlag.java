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
@Mapping("CAFLinearPCMFormatFlag")
public final class CAFLinearPCMFormatFlag extends ObjCEnum {
    
    @GlobalConstant("kCAFLinearPCMFormatFlagIsFloat")
    public static final long Float = 1L;
    @GlobalConstant("kCAFLinearPCMFormatFlagIsLittleEndian")
    public static final long LittleEndian = 2L;
    

}
