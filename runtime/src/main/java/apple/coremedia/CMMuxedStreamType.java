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
@Mapping("CMMuxedStreamType")
public final class CMMuxedStreamType extends ObjCEnum {
    
    @GlobalConstant("kCMMuxedStreamType_MPEG1System")
    public static final long MPEG1System = 1836069235L;
    @GlobalConstant("kCMMuxedStreamType_MPEG2Transport")
    public static final long MPEG2Transport = 1836069492L;
    @GlobalConstant("kCMMuxedStreamType_MPEG2Program")
    public static final long MPEG2Program = 1836069488L;
    @GlobalConstant("kCMMuxedStreamType_DV")
    public static final long DV = 1685463072L;
    

}
