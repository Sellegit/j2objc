package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;






@Mapping("UIPrintErrorCode")
public final class UIPrintErrorCode extends ObjCEnum {
    
    @GlobalConstant("UIPrintingNotAvailableError")
    public static final long PrintingNotAvailable = 1L;
    @GlobalConstant("UIPrintNoContentError")
    public static final long NoContent = 2L;
    @GlobalConstant("UIPrintUnknownImageFormatError")
    public static final long UnknownImageFormat = 3L;
    @GlobalConstant("UIPrintJobFailedError")
    public static final long JobFailed = 4L;
    

}
