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
import apple.metal.*;





@Library("CoreVideo")
@Mapping("CVAttachmentMode")
public final class CVAttachmentMode extends ObjCEnum {
    
    @GlobalConstant("kCVAttachmentMode_ShouldNotPropagate")
    public static final long NotPropagate = 0L;
    @GlobalConstant("kCVAttachmentMode_ShouldPropagate")
    public static final long Propagate = 1L;
    

}
