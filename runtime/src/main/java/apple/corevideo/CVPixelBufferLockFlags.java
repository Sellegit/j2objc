package apple.corevideo;


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
import apple.coremedia.*;


@Library("CoreVideo/CoreVideo.h")
@Mapping("CVPixelBufferLockFlags")
public final class CVPixelBufferLockFlags extends ObjCEnum {
    
    @GlobalConstant("kCVPixelBufferLock_ReadOnly")
    public static final long ReadOnly = 1L;


}
